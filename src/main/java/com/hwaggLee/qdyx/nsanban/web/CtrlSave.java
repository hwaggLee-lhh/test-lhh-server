package com.hwaggLee.qdyx.nsanban.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.base.model.ModelFileInfo;
import com.base.utils.CtrlUtils;
import com.hwaggLee.qdyx.nsanban.utils.StartPoiExcel_nsanban_cwsj;
import com.org.apache.poi.xssf.UtilsExcelReader;
import com.org.springframework.web.utils.UtilsRequestSpringframework;


@Controller
@RequestMapping("qdyx/nsanban/save")
public class CtrlSave extends CtrlServiceNsanban  {
	private static final String PATH = "hwaggLee//qdyx/nsanban";


	/**
	 * index
	 * @param req
	 * @param res
	 * @return
	 */
	@RequestMapping("index")
    public void index(HttpServletRequest req, HttpServletResponse res) {
		Map<String,Object> map = new HashMap<String, Object>();
		System.out.println("来了");
		map.put("success",true);
		map.put("msg", "laile ");
		CtrlUtils.putJSON(map, res);
    } 

	/**
	 * 进入相关页面
	 * @param req
	 * @param res
	 * @return
	 */
	@RequestMapping(value="/upload/{type}", method = {RequestMethod.GET})
    public void upload(HttpServletRequest req, HttpServletResponse res,
    		@PathVariable("type") String type) {
		Map<String,Object> map = new HashMap<String, Object>();
		switch(type.toUpperCase()){
		case "CWSJ-EXCEL":
			uploadCWSJEXCEL(req,map);
			break;
		default:
			upload(req, map);
			break;
		}
		CtrlUtils.putJSON(map, res);
    }
	
	private void upload(HttpServletRequest req,Map<String,Object> map){
		Map<String,ModelFileInfo> mapMutilpartFileInfo = null;
        try {
        	mapMutilpartFileInfo = UtilsRequestSpringframework.readUploadFile(req);
		} catch (Exception e) {
			e.printStackTrace();
		}
        if( mapMutilpartFileInfo != null && mapMutilpartFileInfo.size()>0){
        	for (String key : mapMutilpartFileInfo.keySet()) {
        		ModelFileInfo info = mapMutilpartFileInfo.get(key);
        		System.out.println("上传的文件"+info.getFilePath());
			}
        }
		map.put("msg", "上传成功");
		map.put("success", true);
	}
	
	/**
	 * 上传EXCEL的财务数据
	 * @param req
	 * @param map
	 */
	private void uploadCWSJEXCEL(HttpServletRequest req,Map<String,Object> map){
		String values[] = {"2015一般企业—资产负债表"};
		String types[] = {"BALANCESHEET"};
		for (int i = 0 ;i<values.length ;i++) {
			String n = values[i];
			String path= "C:\\Users\\huage\\Desktop\\2015年、半年报.20160719\\"+n+".xlsx";
			String name  ="Sheet2";
			List<Map<Integer,Object>>  list = UtilsExcelReader.processExcelMaps(path,name);
			if( list == null || list.isEmpty() ){
				map.put("msg", "未上传有效数据");
				map.put("success", false);
				return ;
			}
			//String type = req.getParameter("CWSJNAME");
			String type =types[i];
			if(StringUtils.isBlank(type)){
				map.put("msg", "未提供上传的文件的凭证");
				map.put("success", false);
				return ;
			}
			switch(type.toUpperCase()){
			case "BALANCESHEET":
				this.implservicecwjsbalancesheet.saves(StartPoiExcel_nsanban_cwsj.processExcelModelCWSJBalanceSheet(list));
				break;
			case "CASHFLOWSTATEMENT":
				this.implservicecwjscashflowstatement.saves(StartPoiExcel_nsanban_cwsj.processExcelModelCWSJCashFlowStatement(list));
				break;
			case "FINANCIALINDEX":
				this.implservicecwjsfinancialindex.saves(StartPoiExcel_nsanban_cwsj.processExcelModelCWSJFinancialIndex(list));
				break;
			case "FINANCIALINDEXABSTRACT":
				this.implservicecwjsfinancialindexabstract.saves(StartPoiExcel_nsanban_cwsj.processExcelModelCWSJFinancialIndexAbstract(list));
				break;
			case "INCOMESTATEMENTS":
				this.implservicecwjsincomestatements.saves(StartPoiExcel_nsanban_cwsj.processExcelModelCWSJIncomeStatements(list));
				break;
			default:
				break;
			}
			System.out.println("完成->"+n);
		}
		map.put("msg", "上传成功");
		map.put("success", true);
	}
	
	

	/**
	 * 基金信息
	 * @param req
	 * @param map
	 */
	private void startFund(){
		String path= "C:\\Users\\huage\\Desktop\\11111.xlsx";
		String name  ="Sheet1";
		List<Map<Integer,Object>>  list = UtilsExcelReader.processExcelMaps(path,name);
		if( list == null || list.isEmpty() ){
			return ;
		}
		
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (Map<Integer, Object> map2 : list) {
			sb.append("insert into hb_fund_copy ");
			sb.append("values ");
			sb.append("( '"+(j++)+"'");
			int i = 0;
			Object ob = null;
			ob = map2.get(i++);
			/*if( ob == null || "null".equalsIgnoreCase(ob.toString())){//A
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}*/
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//B
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//C
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//D
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//E
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//F
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//G
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//H
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//I
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//J
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//K
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//L
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//M
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//N
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//O
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//P
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//Q
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//R
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//S
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//T
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//u
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			ob = map2.get(i++);
			if( ob == null || "null".equalsIgnoreCase(ob.toString())){//v
				sb.append(",null");
			}else{
				sb.append(",'"+ob+"'");
			}
			sb.append(",null,null); \n");
		}
		//System.out.println(sb.toString());
		
		File file = new File("C:\\Users\\huage\\Desktop\\111111.txt");
		try {
			FileOutputStream out = new FileOutputStream(file);
			out.write(sb.toString().getBytes("utf-8"));
			out.flush();
			out.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		CtrlSave c = new CtrlSave();
		c.startFund();
	}
}
