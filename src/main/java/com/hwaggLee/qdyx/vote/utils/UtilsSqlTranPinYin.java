package com.hwaggLee.qdyx.vote.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hwaggLee.jdbc.UtilsJDBC;
import com.net.sourcefore.pingyin4j.utils.UtilsChineseToEnglish;

/**
 * 将sql中表字段增加拼音字段
 * @author huage
 *
 */
public class UtilsSqlTranPinYin {
	public static void main(String[] args) throws Exception{
		tranPinYin();
		
		
	}
	
	public static void tranPinYin() throws Exception{
		String username = "root";
		String password = "hp64123456";
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://61.152.154.49:3306/vote";
		UtilsJDBC jdbc = new UtilsJDBC(username, password, driver, url);
		/*String sql = "select * from v_finalist_mrket_mker ";
		List<Map<String, Object>> list = jdbc.findModeResult(sql, null);
		if( list!= null && !list.isEmpty()){
			System.out.println(" v_finalist_mrket_mker start..");
			List<String> listInsertSql = new ArrayList<String>();
			for (Map<String, Object> map : list) {
				if( map  == null || map.isEmpty() )continue;
				Object value = map.get("m_name");
				String py = UtilsChineseToEnglish.getPinYinHeadChar(value.toString());
				StringBuilder sb = new StringBuilder();
				sb.append(" update v_finalist_mrket_mker set m_pinyin = '"+py + "' where idstr='"+map.get("idstr")+"'");
				listInsertSql.add(sb.toString());
			}
			for (String string : listInsertSql) {
				jdbc.updateByPreparedStatement(string, null);
			}
			System.out.println(" v_finalist_mrket_mker success. end..");
		}*/
		/*String sql = "select * from v_finalist_accounting_firm ";
		List<Map<String, Object>> list = jdbc.findModeResult(sql, null);
		if( list!= null && !list.isEmpty()){
			System.out.println(" v_finalist_accounting_firm start..");
			List<String> listInsertSql = new ArrayList<String>();
			for (Map<String, Object> map : list) {
				if( map  == null || map.isEmpty() )continue;
				Object value = map.get("af_name");
				String py = UtilsChineseToEnglish.getPinYinHeadChar(value.toString());
				StringBuilder sb = new StringBuilder();
				sb.append(" update v_finalist_accounting_firm set af_pinyin = '"+py + "' where idstr='"+map.get("idstr")+"'");
				listInsertSql.add(sb.toString());
			}
			for (String string : listInsertSql) {
				jdbc.updateByPreparedStatement(string, null);
			}
			System.out.println(" v_finalist_accounting_firm success. end..");
		}*/
		/*String sql = "select * from v_finalist_boffin ";
		List<Map<String, Object>> list = jdbc.findModeResult(sql, null);
		if( list!= null && !list.isEmpty()){
			System.out.println(" v_finalist_boffin start..");
			List<String> listInsertSql = new ArrayList<String>();
			for (Map<String, Object> map : list) {
				if( map  == null || map.isEmpty() )continue;
				Object value = map.get("b_name");
				String py = UtilsChineseToEnglish.getPinYinHeadChar(value.toString());
				StringBuilder sb = new StringBuilder();
				sb.append(" update v_finalist_boffin set b_pinyin = '"+py + "' where idstr='"+map.get("idstr")+"'");
				listInsertSql.add(sb.toString());
			}
			for (String string : listInsertSql) {
				jdbc.updateByPreparedStatement(string, null);
			}
			System.out.println(" v_finalist_boffin success. end..");
		}*/
		/*String sql = "select * from v_finalist_law_firm ";
		List<Map<String, Object>> list = jdbc.findModeResult(sql, null);
		if( list!= null && !list.isEmpty()){
			System.out.println(" v_finalist_law_firm start..");
			List<String> listInsertSql = new ArrayList<String>();
			for (Map<String, Object> map : list) {
				if( map  == null || map.isEmpty() )continue;
				Object value = map.get("lf_name");
				String py = UtilsChineseToEnglish.getPinYinHeadChar(value.toString());
				StringBuilder sb = new StringBuilder();
				sb.append(" update v_finalist_law_firm set lf_pinyin = '"+py + "' where idstr='"+map.get("idstr")+"'");
				listInsertSql.add(sb.toString());
			}
			for (String string : listInsertSql) {
				jdbc.updateByPreparedStatement(string, null);
			}
			System.out.println(" v_finalist_law_firm success. end..");
		}*/
		String sql = "select * from v_finalist_research_institute ";
		List<Map<String, Object>> list = jdbc.findModeResult(sql, null);
		if( list!= null && !list.isEmpty()){
			System.out.println(" v_finalist_research_institute start..");
			List<String> listInsertSql = new ArrayList<String>();
			for (Map<String, Object> map : list) {
				if( map  == null || map.isEmpty() )continue;
				Object value = map.get("ri_name");
				String py = UtilsChineseToEnglish.getPinYinHeadChar(value.toString());
				StringBuilder sb = new StringBuilder();
				sb.append(" update v_finalist_research_institute set ri_pinyin = '"+py + "' where idstr='"+map.get("idstr")+"'");
				listInsertSql.add(sb.toString());
			}
			for (String string : listInsertSql) {
				jdbc.updateByPreparedStatement(string, null);
			}
			System.out.println(" v_finalist_research_institute success. end..");
		}
	}

}
