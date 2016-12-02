package com.org.apache.poi.xssf;

import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * poi处理excel工具类
 * @author huage
 */
public class UtilsExcelReader {
	private static XSSFWorkbook wb;

	/**
	 * 读取excel首先需要创建wb
	 * @param path
	 * @throws Exception
	 */
	private static void createXSSFWorkbook(String path) throws Exception{
		wb = new XSSFWorkbook(path);
	}
	private static void createXSSFWorkbook(InputStream inputStream) throws Exception{
		wb = new XSSFWorkbook(inputStream);
	}

	public static List<ArrayList<Object>> processExcelLists(String path, String sheetName) {
		try {
			createXSSFWorkbook(path);
			XSSFSheet sheet = wb.getSheet(sheetName);
			if(sheet==null) return null;
			int lastRowNum = sheet.getLastRowNum()+1;
			if(lastRowNum<=0) return null;
			List<ArrayList<Object>> result = new ArrayList<ArrayList<Object>>();
			for (int i = 1; i < lastRowNum; i++) {
				XSSFRow row = sheet.getRow(i);
				if( row == null) continue;
				short lastCellNum =row.getLastCellNum();
				if(lastCellNum<=0) continue;
				ArrayList<Object> rowList = new ArrayList<Object>();
				for (int j = 0; j < lastCellNum; j++) {
					XSSFCell cell = row.getCell(j);
					if(cell==null) continue;
					Object value = null;
					switch(cell.getCellType()) {
					case XSSFCell.CELL_TYPE_BOOLEAN:
						value = cell.getBooleanCellValue();
						break;
					case XSSFCell.CELL_TYPE_NUMERIC:
						value = (int)cell.getNumericCellValue();
						break;
					case XSSFCell.CELL_TYPE_STRING:
						value = cell.getStringCellValue();
						break;
					}
					rowList.add(value);
				}
				result.add(rowList);
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 读取EXCEL的单个SHEEL数据
	 * @param path
	 * @param sheetName
	 * @return
	 */
	public static List<Map<Integer,Object>> processExcelMaps(String path, String sheetName) {
		try {
			createXSSFWorkbook(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if( wb == null ) return null;
		return process(sheetName);
	}
	
	

	/**
	 * 读取总格EXCEL中所有的SHEEL数据.返回LinkedHashMap先进先出的map数据
	 * @return
	 */
	public static Map<String,List<Map<Integer,Object>>> process(InputStream inputStream){
		try {
			createXSSFWorkbook(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(wb == null )return null;
		Map<String,List<Map<Integer,Object>>> map = new LinkedHashMap<String, List<Map<Integer,Object>>>();
		for (XSSFSheet sheet : wb) {
			if(sheet==null) continue;;
			List<Map<Integer,Object>> result = process(sheet.getSheetName());
			if( result == null )continue;
			map.put(sheet.getSheetName(), result);
		}
		return map;
	}
	
	/**
	 * 读取excel，且Excel必须大于1行数据
	 * @param sheetName
	 * @return
	 */
	private static List<Map<Integer,Object>> process(String sheetName){
		if( wb == null ) return null;
		XSSFSheet sheet = wb.getSheet(sheetName);
		if(sheet==null) return null;
		int lastRowNum = sheet.getLastRowNum()+1;
		if(lastRowNum<=0) return null;
		List<Map<Integer,Object>> result = new ArrayList<Map<Integer,Object>>();
		for (int i = 0; i < lastRowNum; i++) {
			Map<Integer,Object> rowMap = new LinkedHashMap<Integer,Object>();
			result.add(rowMap);
			XSSFRow row = sheet.getRow(i);
			if( row == null)continue;
			short lastCellNum =row.getLastCellNum();
			if(lastCellNum<=0) continue;
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				Object value = null;
				if(cell!=null){
					switch(cell.getCellType()) {
					case XSSFCell.CELL_TYPE_BOOLEAN:
						value = cell.getBooleanCellValue();
						break;
					case XSSFCell.CELL_TYPE_NUMERIC:
						short format = cell.getCellStyle().getDataFormat();  
						if (HSSFDateUtil.isCellDateFormatted(cell)) {
							Date d = cell.getDateCellValue();
							DateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							value = formater.format(d);
						}else if(format == 14 || format == 31 || format == 57 || format == 58){  
					        //日期  
							DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");  
							Date date = DateUtil.getJavaDate(cell.getNumericCellValue());  
							value = formater.format(date);  
						}else if (format == 20 || format == 32) {  
					        //时间  
							DateFormat formater = new SimpleDateFormat("HH:mm");    
							Date date = DateUtil.getJavaDate(cell.getNumericCellValue());  
							value = formater.format(date);  
					    } else{
							value = cell.getNumericCellValue();
						}
						//System.out.println(value+":"+cell.getCellStyle().getDataFormat());
						break;
					case XSSFCell.CELL_TYPE_STRING:
						value = cell.getStringCellValue();
						break;
					}
					
				}
				value = rowMap.put(j,value);
			}
		}
		return result;
	}

}
