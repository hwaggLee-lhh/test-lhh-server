package com.hwaggLee.jsoup.html;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.hwaggLee.jdbc.UtilsJDBC;
import com.hwaggLee.jsoup.em.CollectType;
import com.hwaggLee.jsoup.model.NewsInfo;

/**
 * 测试
 * @author huage
 *
 */
class HtmlTest extends HtmlBase{
	private static final Logger logger = Logger.getLogger(HtmlTest.class);
	
	public static void main(String[] args) throws Exception{
		HtmlTest sohu = new HtmlTest();
		sohu.readHtml1();
	}
	
	
	public List<NewsInfo> readHtml1()throws Exception{
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
			Map<String, Object> map = new HashMap<String, Object>();
			String eastmoney_gkzrsms_url = "http://data.eastmoney.com/notice/20151211/2Wvl2YQyGxBd6y.html";// map.get("eastmoney_gkzrsms_url") == null ? null :  map.get("eastmoney_gkzrsms_url").toString();
			if( StringUtils.isBlank(eastmoney_gkzrsms_url))return null;
			Document doc = super.getDocumentOnce(eastmoney_gkzrsms_url);
			if( doc == null )return null;
			Elements elePres = doc.getElementsByTag("pre");
			if( elePres == null || elePres.isEmpty() )return null;
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
					if( StringUtils.isNotBlank(s)&& (map.get("tjgazbqszz") == null ||StringUtils.isBlank(map.get("tjgazbqszz").toString()))){
						map.put("tjgazbqszz", s);
						System.out.println("组长="+s);
						start = true;
					}
				}
				if( start ){
					if( s.contains("项目小组成员")|| s.contains("项目组成员")|| s.contains("项目经办人")|| s.contains("项目小组其他成员")){
						if( s.contains("项目小组成员")){
							s = s.substring(s.indexOf("项目小组成员")+6);
						}else if(s.contains("项目组成员")){
							s = s.substring(s.indexOf("项目组成员")+5);
						}else if(s.contains("项目经办人")){
							s = s.substring(s.indexOf("项目经办人")+5);
						}else if(s.contains("项目小组其他成员")){
							s = s.substring(s.indexOf("项目小组其他成员")+8);
						}
						//s = new String(s.getBytes("ISO-8859-1"),"utf-8");
						s=s.replace("：", "").trim();
						if( StringUtils.isNotBlank(s)&& (map.get("tjgazbqszy") == null ||StringUtils.isBlank(map.get("tjgazbqszy").toString()))){
							map.put("tjgazbqszy", s);
							System.out.println("组员="+s);
						}
					}else if( s.contains("名称")){
						s = s.substring(s.indexOf("名称")+2);
						s = s.replace("：", "").trim();
						if( "a".equals(abc) && (map.get("ylssws") == null ||StringUtils.isBlank(map.get("ylssws").toString()))){
							map.put("ylssws", s);
							System.out.println("律师事务所="+s);
						}else if( "b".equals(abc) && (map.get("ysjjg") == null ||StringUtils.isBlank(map.get("ysjjg").toString()))){
							map.put("ysjjg", s);
							System.out.println("会计师事务所="+s);
						}else if( "c".equals(abc) && (map.get("pgjg") == null ||StringUtils.isBlank(map.get("pgjg").toString())) ){
							map.put("pgjg", s);
							System.out.println("资产评估机构="+s);
						}
					}else if( s.contains("机构名称")){
						s = s.substring(s.indexOf("机构名称")+4);
						s = s.replace("：", "").trim();
						if( "a".equals(abc) && (map.get("ylssws") == null ||StringUtils.isBlank(map.get("ylssws").toString()))){
							map.put("ylssws", s);
							System.out.println("律师事务所="+s);
						}else if( "b".equals(abc) && (map.get("ysjjg") == null ||StringUtils.isBlank(map.get("ysjjg").toString()))){
							map.put("ysjjg", s);
							System.out.println("会计师事务所="+s);
						}else if( "c".equals(abc) && (map.get("pgjg") == null ||StringUtils.isBlank(map.get("pgjg").toString())) ){
							map.put("pgjg", s);
							System.out.println("资产评估机构="+s);
						}
					}else if( s.contains("律师事务所")|| s.contains("律师事务所")){
						if( s.contains("律师事务所")){
							s = s.substring(s.indexOf("律师事务所")+5);
						}else if(s.contains("律师事务所")){
							s = s.substring(s.indexOf("律师事务所")+5);
						}
						s=s.replace("：", "").trim();
						if( StringUtils.isNotBlank(s)&& (map.get("ylssws") == null ||StringUtils.isBlank(map.get("ylssws").toString()))){
							map.put("ylssws", s);
							System.out.println("律师事务所="+s);
						}
						abc = "a";
					}else if( s.contains("经办律师") || s.contains("签字律师")){
						if( s.contains("经办律师")){
							s = s.substring(s.indexOf("经办律师")+4);
						}else if( s.contains("签字律师")){
							s = s.substring(s.indexOf("签字律师")+4);
						}
						s=s.replace("：", "").trim();
						if( StringUtils.isNotBlank(s) && (map.get("ylsswsjbr") == null ||StringUtils.isBlank(map.get("ylsswsjbr").toString()))){
							map.put("ylsswsjbr", s);
							System.out.println("经办律师="+s);
						}
					}else if( s.contains("会计师事务所")){
						if( s.contains("会计师事务所")){
							s = s.substring(s.indexOf("会计师事务所")+6);
						}
						s=s.replace("：", "").trim();
						if( StringUtils.isNotBlank(s) && (map.get("ysjjg") == null ||StringUtils.isBlank(map.get("ysjjg").toString()) )){
							map.put("ysjjg", s);
							System.out.println("会计师事务所="+s);
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
						if( StringUtils.isNotBlank(s)&& (map.get("ysjjgjbr") == null ||StringUtils.isBlank(map.get("ysjjgjbr").toString()))){
							map.put("ysjjgjbr", s);
							System.out.println("经办会计师="+s);
						}
					}else if( s.contains("资产评估机构")){
						if( s.contains("资产评估机构")){
							s = s.substring(s.indexOf("资产评估机构")+6);
						}
						s = s.replace("：", "").trim();
						if( StringUtils.isNotBlank(s)&& (map.get("pgjg") == null ||StringUtils.isBlank(map.get("pgjg").toString()))){
							map.put("pgjg", s);
							System.out.println("资产评估机构="+s);
						}
						abc = "c";
					}else if( s.contains("经办评估师")|| s.contains("经办注册评估师")|| s.contains("签字资产评估师")){
						if( s.contains("经办评估师")){
							s = s.substring(s.indexOf("经办评估师")+5);
						}else if(s.contains("经办注册评估师")){
							s = s.substring(s.indexOf("经办注册评估师")+7);
						}else if(s.contains("签字资产评估师")){
							s = s.substring(s.indexOf("签字资产评估师")+7);
						}
						s = s.replace("：", "").trim();
						if( StringUtils.isNotBlank(s)&& (map.get("pgjgjbr") == null ||StringUtils.isBlank(map.get("pgjgjbr").toString()))){
							map.put("pgjgjbr", s);
							System.out.println("经办评估师="+s);
						}
						break;
					}
				}
			}
				
			StringBuilder sb = new StringBuilder();
			sb.append(" update temp_stockcode set 1=1 ");
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
			if( map.get("sjjg")!=null && StringUtils.isNotBlank(map.get("sjjg").toString())){
				sb.append(" ,sjjg='"+map.get("sjjg")+"' ");
			}
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
			
		}
		logger.info("end sohu newsinfo data.....total "+list_newsinfo.size()+"");
		return list_newsinfo;
	}

	
	/**
	 * 只查询标题中含有"新三板"字样的，才读取
	 * @param outtime
	 * @return
	 * @throws Exception
	 */
	public List<NewsInfo> readHtml()throws Exception{
		logger.info("start sohu newsinfo data.....");
		Document doc = super.getDocument();
		System.out.println(doc.html());
		
		return null;
	}
	



	@Override
	public String getUrl() {
		return CollectType.html_test.getUrl();
	}

}
