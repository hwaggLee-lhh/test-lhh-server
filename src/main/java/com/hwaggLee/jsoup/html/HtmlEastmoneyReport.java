package com.hwaggLee.jsoup.html;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.hwaggLee.jdbc.UtilsJDBC;
import com.hwaggLee.jsoup.model.NewsInfo;

/**
 * @author huage
 *
 */
class HtmlEastmoneyReport extends HtmlBase{
	private static final Logger logger = Logger.getLogger(HtmlEastmoneyReport.class);
	
	public static void main(String[] args) throws Exception{
		HtmlEastmoneyReport base = new HtmlEastmoneyReport();
		//base.readHtml();
		base.readHtml1();
	}
	
	
	
	/**
	 * 只查询标题中含有"新三板"字样的，才读取
	 * @param outtime
	 * @return
	 * @throws Exception
	 */
	public List<NewsInfo> readHtml()throws Exception{
		logger.info("start sohu newsinfo data.....");
		List<NewsInfo> list_newsinfo = new ArrayList<NewsInfo>();
		String username = "root";
		String password = "hp64123456";
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://61.152.154.49:3306/nsanban_test";
		UtilsJDBC jdbc = new UtilsJDBC(username, password, driver, url);
		String sql = "select * from temp_stockcode ";
		List<Map<String, Object>> list = jdbc.findModeResult(sql, null);
		if( list!= null && !list.isEmpty()){
			String htmlurl = "http://data.eastmoney.com/Notice/NoticeStock.aspx";
			boolean flag = false;
			for (Map<String, Object> map : list) {
				//if( (map.get("eastmoney_gkzrsms_url")!=null && StringUtils.isNotBlank(map.get("eastmoney_gkzrsms_url").toString())) ) continue;
				if( (map.get("isreq")!=null && StringUtils.isNotBlank(map.get("isreq").toString())) ) continue;
				int pn = 1 ;
				int type = 0 ;
				flag = true;
				String str = null;
				while (flag ) {
					str = recur(htmlurl, map.get("stockCode").toString(), map.get("stockName").toString(), type,pn);
					if( "-1".equals(str)){
						pn = pn+1;
					}else{
						flag = false;
					}
					//防止东财网禁止访问
					Thread.sleep(1000*1);
				}
				if(StringUtils.isNotBlank(str)){
					map.put("eastmoney_gkzrsms_url", str);
					str = "update temp_stockcode set eastmoney_gkzrsms_url = '"+str+"' where stockCode = '"+map.get("stockCode").toString()+"';";
					System.out.println(str);
					jdbc.updateByPreparedStatement(sql, null);
				}else{
					System.out.println(map.get("stockCode")+":"+str);
				}
			}
		}
		logger.info("end sohu newsinfo data.....total "+list_newsinfo.size()+"");
		return list_newsinfo;
	}
	
	public String recur(String htmlurl,String stockCode,String stockName,int type ,int pn){
		htmlurl = htmlurl+"?type="+type+"&stockCode="+stockCode+"&pn="+pn;
		//htmlurl = "http://data.eastmoney.com/notice/"+stockCode+".html";
		Document doc = super.getDocumentOnce(htmlurl);
		if( doc == null ) return null;
		Elements eleClassCont = doc.getElementsByAttributeValue("class", "cont");
		if( eleClassCont == null || eleClassCont.isEmpty())return null;
		Elements eleAs = eleClassCont.get(0).getElementsByTag("a");
		if( eleAs == null || eleAs.isEmpty())return null;
		for (Element e : eleAs) {
			if( e.html().contains(stockName+":公开转让说明书") && !e.html().contains("(更正公告)")){
				return "http://data.eastmoney.com"+e.attr("href");
			}
		}
		return "-1";
	}
	

	
	public List<NewsInfo> readHtml1()throws Exception{
		logger.info("start sohu newsinfo data.....");
		List<NewsInfo> list_newsinfo = new ArrayList<NewsInfo>();
		String username = "root";
		String password = "hp64123456";
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/abcde";
		UtilsJDBC jdbc = new UtilsJDBC(username, password, driver, url);
		String sql = "select * from temp_stockcode t where isreq is null and ylssws is null; ";
		List<Map<String, Object>> list = jdbc.findModeResult(sql, null);
		if( list!= null && !list.isEmpty()){
			for (Map<String, Object> map : list) {
				if( map.get("isreq")!=null && ("1".equals( map.get("isreq").toString()) || "2".equals( map.get("isreq").toString())) || "3".equals( map.get("isreq").toString()))continue;
				String eastmoney_gkzrsms_url = map.get("eastmoney_gkzrsms_url") == null ? null :  map.get("eastmoney_gkzrsms_url").toString();
				if( StringUtils.isBlank(eastmoney_gkzrsms_url))continue;
				Document doc = super.getDocumentOnce(eastmoney_gkzrsms_url);
				if( doc == null )continue;
				Elements elePres = doc.getElementsByTag("pre");
				if( elePres == null || elePres.isEmpty() )continue;
				Element eletext = elePres.get(0);
				String[] string = eletext.html().split("\r");
				boolean start = false;
				String abc = "";
				for (String s : string) {
					if(StringUtils.isBlank(s))continue;
					if( s.contains("项目负责人") || s.contains("项目小组负责人") || s.contains("项目组负责人")){
						if( s.contains("项目负责人")){
							s = s.substring(s.indexOf("项目负责人")+5);
						}else if(s.contains("项目小组负责人")){
							s = s.substring(s.indexOf("项目小组负责人")+7);
						}else if(s.contains("项目组负责人")){
							s = s.substring(s.indexOf("项目组负责人")+6);
						}
						s=s.replace("：", "").trim();
						if( StringUtils.isNotBlank(s)/*&& (map.get("tjgazbqszz") == null ||StringUtils.isBlank(map.get("tjgazbqszz").toString()))*/){
							map.put("tjgazbqszz", s);
							//System.out.println("组长="+s);
							start = true;
						}
						continue;
					}
					if( start ){
						if( s.contains("项目小组成员")|| s.contains("项目组成员")|| s.contains("项目经办人")|| s.contains("项目小组其他成员")|| s.contains("项目组其他成员")|| s.contains("项目人员")){
							if( s.contains("项目小组成员")){
								s = s.substring(s.indexOf("项目小组成员")+6);
							}else if(s.contains("项目组成员")){
								s = s.substring(s.indexOf("项目组成员")+5);
							}else if(s.contains("项目经办人")){
								s = s.substring(s.indexOf("项目经办人")+5);
							}else if(s.contains("项目小组其他成员")){
								s = s.substring(s.indexOf("项目小组其他成员")+8);
							}else if(s.contains("项目组其他成员")){
								s = s.substring(s.indexOf("项目组其他成员")+7);
							}else if(s.contains("项目人员")){
								s = s.substring(s.indexOf("项目人员")+4);
							}
							//s = new String(s.getBytes("ISO-8859-1"),"utf-8");
							s=s.replace("：", "").trim();
							if( StringUtils.isNotBlank(s)/*&& (map.get("tjgazbqszy") == null ||StringUtils.isBlank(map.get("tjgazbqszy").toString()))*/){
								map.put("tjgazbqszy", s);
								//System.out.println("组员="+s);
							}
						}else if( s.contains("名称") && StringUtils.isNotBlank(abc)){
							s = s.substring(s.indexOf("名称")+2);
							s = s.replace("：", "").trim();
							if( "a".equals(abc) /*&& (map.get("ylssws") == null ||StringUtils.isBlank(map.get("ylssws").toString()))*/){
								map.put("ylssws", s);
								abc =""; 
								//System.out.println("律师事务所="+s);
							}else if( "b".equals(abc) /*&& (map.get("ysjjg") == null ||StringUtils.isBlank(map.get("ysjjg").toString()))*/){
								map.put("ysjjg", s);
								abc ="";
								//System.out.println("会计师事务所="+s);
							}else if( "c".equals(abc) /*&& (map.get("pgjg") == null ||StringUtils.isBlank(map.get("pgjg").toString())) */){
								map.put("pgjg", s);
								abc ="";
								//System.out.println("资产评估机构="+s);
							}
						}else if( s.contains("机构名称")&& StringUtils.isNotBlank(abc)){
							s = s.substring(s.indexOf("机构名称")+4);
							s = s.replace("：", "").trim();
							if( "a".equals(abc) /*&& (map.get("ylssws") == null ||StringUtils.isBlank(map.get("ylssws").toString()))*/){
								map.put("ylssws", s);
								//System.out.println("律师事务所="+s);
							}else if( "b".equals(abc) /*&& (map.get("ysjjg") == null ||StringUtils.isBlank(map.get("ysjjg").toString()))*/){
								map.put("ysjjg", s);
								//System.out.println("会计师事务所="+s);
							}else if( "c".equals(abc) /*&& (map.get("pgjg") == null ||StringUtils.isBlank(map.get("pgjg").toString())) */){
								map.put("pgjg", s);
								//System.out.println("资产评估机构="+s);
							}
						}else if( s.contains("律师事务所")|| s.contains("律师事务所")){
							if( s.contains("律师事务所")){
								s = s.substring(s.indexOf("律师事务所")+5);
							}else if(s.contains("律师事务所")){
								s = s.substring(s.indexOf("律师事务所")+5);
							}
							s=s.replace("：", "").trim();
							if( StringUtils.isNotBlank(s)/*&& (map.get("ylssws") == null ||StringUtils.isBlank(map.get("ylssws").toString()))*/){
								map.put("ylssws", s);
								//System.out.println("律师事务所="+s);
							}
							abc = "a";
						}else if( s.contains("经办律师") || s.contains("签字律师")){
							if( s.contains("经办律师")){
								s = s.substring(s.indexOf("经办律师")+4);
							}else if( s.contains("签字律师")){
								s = s.substring(s.indexOf("签字律师")+4);
							}
							s=s.replace("：", "").trim();
							if( StringUtils.isNotBlank(s) /*&& (map.get("ylsswsjbr") == null ||StringUtils.isBlank(map.get("ylsswsjbr").toString()))*/){
								map.put("ylsswsjbr", s);
								//System.out.println("经办律师="+s);
							}
						}else if( s.contains("会计师事务所")){
							if( s.contains("会计师事务所")){
								s = s.substring(s.indexOf("会计师事务所")+6);
							}
							s=s.replace("：", "").trim();
							if( StringUtils.isNotBlank(s)/* && (map.get("ysjjg") == null ||StringUtils.isBlank(map.get("ysjjg").toString()) )*/){
								map.put("ysjjg", s);
								//System.out.println("会计师事务所="+s);
							}
							abc = "b";
						}else if( s.contains("经办注册会计师")|| s.contains("经办会计师")|| s.contains("签字会计师")){
							if( s.contains("经办注册会计师")){
								s = s.substring(s.indexOf("经办注册会计师")+7);
							}else if(s.contains("经办会计师")){
								s = s.substring(s.indexOf("经办会计师")+5);
							}else if( s.contains("签字会计师")){
								s = s.substring(s.indexOf("签字会计师")+5);
							}
							s = s.replace("：", "").trim();
							if( StringUtils.isNotBlank(s)/*&& (map.get("ysjjgjbr") == null ||StringUtils.isBlank(map.get("ysjjgjbr").toString()))*/){
								map.put("ysjjgjbr", s);
								//System.out.println("经办会计师="+s);
							}
						}else if( s.contains("资产评估机构")|| s.contains("评估公司")){
							if( s.contains("资产评估机构")){
								s = s.substring(s.indexOf("资产评估机构")+6);
							}else if( s.contains("评估公司")){
								s = s.substring(s.indexOf("评估公司")+4);
							}
							s = s.replace("：", "").trim();
							if( StringUtils.isNotBlank(s)/*&& (map.get("pgjg") == null ||StringUtils.isBlank(map.get("pgjg").toString()))*/){
								map.put("pgjg", s);
								//System.out.println("资产评估机构="+s);
							}
							abc = "c";
						}else if( s.contains("经办评估师")|| s.contains("经办注册评估师")|| s.contains("签字资产评估师")|| s.contains("经办资产评估师")){
							if( s.contains("经办评估师")){
								s = s.substring(s.indexOf("经办评估师")+5);
							}else if(s.contains("经办注册评估师")){
								s = s.substring(s.indexOf("经办注册评估师")+7);
							}else if(s.contains("签字资产评估师")){
								s = s.substring(s.indexOf("签字资产评估师")+7);
							}else if(s.contains("经办资产评估师")){
								s = s.substring(s.indexOf("经办资产评估师")+7);
							}
							s = s.replace("：", "").trim();
							if( StringUtils.isNotBlank(s)/*&& (map.get("pgjgjbr") == null ||StringUtils.isBlank(map.get("pgjgjbr").toString()))*/){
								map.put("pgjgjbr", s);
								//System.out.println("经办评估师="+s);
							}
							break;
						}
					}
				}
				
				StringBuilder sb = new StringBuilder();
				sb.append(" update temp_stockcode set stockName='"+map.get("stockName")+"' ");
				/*if( map.get("tjgazbqszz")!=null && StringUtils.isNotBlank(map.get("tjgazbqszz").toString())){
					sb.append(" ,tjgazbqszz='"+map.get("tjgazbqszz")+"' ");
				}
				if( map.get("tjgazbqszy")!=null && StringUtils.isNotBlank(map.get("tjgazbqszy").toString())){
					sb.append(" ,tjgazbqszy='"+map.get("tjgazbqszy")+"' ");
				}*/
				/*if( map.get("lssws")!=null && StringUtils.isNotBlank(map.get("lssws").toString())){
					sb.append(" ,lssws='"+map.get("lssws")+"' ");
				}*/
				if( map.get("ylssws")!=null && StringUtils.isNotBlank(map.get("ylssws").toString())){
					sb.append(" ,ylssws='"+map.get("ylssws")+"' ");
				}
				if( map.get("ylsswsjbr")!=null && StringUtils.isNotBlank(map.get("ylsswsjbr").toString())){
					sb.append(" ,ylsswsjbr='"+map.get("ylsswsjbr")+"' ");
				}
				/*if( map.get("sjjg")!=null && StringUtils.isNotBlank(map.get("sjjg").toString())){
					sb.append(" ,sjjg='"+map.get("sjjg")+"' ");
				}*/
				if( map.get("ysjjg")!=null && StringUtils.isNotBlank(map.get("ysjjg").toString())){
					sb.append(" ,ysjjg='"+map.get("ysjjg")+"' ");
				}
				if( map.get("ysjjgjbr")!=null && StringUtils.isNotBlank(map.get("ysjjgjbr").toString())){
					sb.append(" ,ysjjgjbr='"+map.get("ysjjgjbr")+"' ");
				}
				if( map.get("pgjg")!=null && StringUtils.isNotBlank(map.get("pgjg").toString())){
					sb.append(" ,pgjg='"+map.get("pgjg")+"' ");
				}
				if( map.get("pgjgjbr")!=null && StringUtils.isNotBlank(map.get("pgjgjbr").toString())){
					sb.append(" ,pgjgjbr='"+map.get("pgjgjbr")+"' ");
				}
				//sb.append(" ,eastmoney_gkzrsms_url'"+map.get("eastmoney_gkzrsms_url")+"' ");
				sb.append(",isreq='1' where stockCode = '"+map.get("stockCode")+"';");
				System.out.println(sb.toString());
				//防止东财网禁止访问
				//Thread.sleep(1000*1);
				break;
			}
		}
		logger.info("end sohu newsinfo data.....total "+list_newsinfo.size()+"");
		return list_newsinfo;
	}


	@Override
	public String getUrl() {
		return "http://data.eastmoney.com/notice/20151210/2Wvl2YQFEFpF6P.html";
	}
	

}
