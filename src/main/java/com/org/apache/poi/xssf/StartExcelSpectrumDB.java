package com.org.apache.poi.xssf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.base.utils.DateTimeUtils;
import com.hwaggLee.jdbc.UtilsJDBC;

/**
 * 
 * 中科院spectrum项目数据库脚本生成
 * @author huage
 *
 */
public class StartExcelSpectrumDB {

	public static void main(String[] args) {
		dbsql();
		//dbtabledata();
	}
	
	public static void dbsql(){
		String username = "root";
		String password = "hp64123456";
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://192.168.0.114:3306/zg_spectrumdb";
		UtilsJDBC jdbc = new UtilsJDBC(username, password, driver, url);
		String sql = "select * from zg_tablecolumninfo ";
		List<Map<String, Object>> listResult = null;
		try {
			listResult = jdbc.findModeResult(sql, null);
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		if( listResult == null ||listResult.isEmpty() )return;
		
		Map<String,List<Map<String,Object>>> map = new HashMap<String, List<Map<String,Object>>>();
		for (Map<String, Object> m : listResult) {
			String trablename = m.get("tablename").toString();
			List<Map<String,Object>> list = map.get(trablename);
			if( list == null ){
				list = new ArrayList<Map<String,Object>>();
				map.put(trablename, list);
			}
			list.add(m);
		}
		
		StringBuilder sb = new StringBuilder();
		for (String tablename : map.keySet()) {
			List<Map<String,Object>> list = map.get(tablename);
			if(list == null || list.isEmpty() )continue;
			//System.out.println(sheetname+":"+list.size());
			
			sb.append("-- ----------------------------\n");
			sb.append("-- Table structure for "+tablename+"\n");
			sb.append("-- ----------------------------\n");
			sb.append("DROP TABLE IF EXISTS "+tablename+";\n");
			sb.append("CREATE TABLE "+tablename+" (\n");
			Object tablelabel = "";
			for (int i = 0; i < list.size(); i++) {
				Map<String,Object> m = list.get(i);
				sb.append("\t`"+transformString2(m.get("columnname"))+"`");
				sb.append(" "+sqlType2JavaType(m.get("columntype")));
				sb.append(" "+primarykey(m.get("checktype")));
				sb.append(" "+defualtNull(m.get("dufaultnull")));
				sb.append(" COMMENT "+transformString(m.get("columnlabel"))+"");
				if( list.size()<=(i+1)){
					sb.append("\n");
					continue;
				}else{
					sb.append(",\n");
				}
				tablelabel = m.get("tablelabel");
			}
			sb.append(") ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='"+tablelabel+"';");
			sb.append("\n\n");
		}
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C:\\Users\\huage\\Desktop\\o\\zg_sql.txt")));
			writer.write(sb.toString().substring(0, sb.length()-1));
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(map.size());
		
	
	}
	
	public static void dbtabledata(){

		String path = "C:\\Users\\huage\\Desktop\\o\\数据库设计V4.4.xlsx";
		Map<String,List<Map<Integer,Object>>> map = null;
		try {
			map = UtilsExcelReader.process(new FileInputStream(new File(path)));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		if( map == null )return;
		int j = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(" INSERT INTO zg_tablecolumninfo ");
		sb.append("(idStr,tablename,tablelabel,columnname,columnlabel,columntype,dufaultnull,checktype,descontent,insertTime,updateTime)");
		sb.append("\nvalues");
		for (String sheetname : map.keySet()) {
			List<Map<Integer,Object>> list = map.get(sheetname);
			if(list == null || list.isEmpty() )continue;
			//System.out.println(sheetname+":"+list.size());
			Map<Integer,Object> m = list.get(0);
			if(m == null || m.isEmpty() )continue;
			Object name_cn = m.get(1);
			Object name_us = m.get(3);
			if( name_us == null ){
				name_us = m.get(4);
			}
			if( name_us == null ){
				name_us = m.get(5);
			}
			String mdate = DateTimeUtils.date2StrDate(new Date(), DateTimeUtils.FORMAT_yyyy_MM_dd_HH_mm_ss);
			for (int i = 2; i < list.size(); i++) {
				m = list.get(i);
				if( m.get(0) == null || StringUtils.isBlank(m.get(0).toString())) continue;
				sb.append(" \n ");
				sb.append("(");
				sb.append(j++);
				sb.append(",'"+name_us+"'");
				sb.append(",'"+name_cn+"'");

				
				sb.append(","+transformString(m.get(1)));
				sb.append(","+transformString(m.get(0)));
				sb.append(","+transformString(m.get(3)));
				if(m.size()>6 ){
					sb.append(","+transformString(m.get(5)));
					sb.append(","+transformString(m.get(6)));
				}else{
					sb.append(","+transformString(m.get(4)));
					sb.append(","+transformString(m.get(5)));
				}
				sb.append(","+transformString(m.get(2)));
				sb.append(","+transformString(mdate));
				sb.append(","+transformString(mdate));
				sb.append("),");
			}
			System.out.println(name_cn+"="+name_us);
		}
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("C:\\Users\\huage\\Desktop\\o\\zg_tablecomun.txt")));
			writer.write(sb.toString().substring(0, sb.length()-1)+";");
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(map.size()+"="+j);
		
	
	}

	private static String sqlType2JavaType(Object ob ) {
		String sqlType = ob == null ?"varchar(200)":ob.toString().trim();
		if("INTEGER".equalsIgnoreCase(sqlType)){
			return "int";
		}else if("VARCHAR（1024）".equalsIgnoreCase(sqlType)){
			return "varchar(1024)";
		}else if("DATATIME".equalsIgnoreCase(sqlType)){
			return "datetime";
		}else if("VARCHAR2(1000)".equalsIgnoreCase(sqlType)){
			return "varchar(1024)";
		}else if(sqlType.equalsIgnoreCase("CHAR")){
			return "varchar(64)";
		}else if(sqlType.startsWith("CHAR")){
			sqlType = sqlType.replace("CHAR", "").replace("(", "").replace(")","").replace("（", "").replace("）", "").trim();
			return "varchar("+sqlType+")";
		}else if("DOUBLE".equalsIgnoreCase(sqlType)){
			return "decimal(30,6)";
		}
		return sqlType.trim();
	}
	
	private static String defualtNull(Object ob){
		if( ob == null )return " NULL ";
		if( "非空".equals(ob.toString().trim())){
			return " NOT NULL ";
		}
		return " NULL ";
	}
	
	private static String transformString(Object ob){
		if( ob ==  null || StringUtils.isBlank(ob.toString()) ) return null;
		return "'"+ob.toString().trim()+"'";
	}
	private static String transformString2(Object ob){
		if( ob ==  null || StringUtils.isBlank(ob.toString()) ) return null;
		return ""+ob.toString().trim()+"";
	}
	
	private static String primarykey(Object ob){
		if( ob ==  null || StringUtils.isBlank(ob.toString()) ) return "";
		if( "PK".equalsIgnoreCase(ob.toString().trim())){
			return " PRIMARY KEY ";
		}
		return " ";
	}
}
