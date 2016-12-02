package com.hwaggLee.create.product;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.StringUtils;


public class CreateBeanUtils {
	private String url = "jdbc:mysql://192.168.0.245:3306/jydb1";
	private String user = "root";
	private String pwd = "123456";
	private String tablename = "";
	private String path_maanger = "com.qinghuainvest.other.manager";
	private String path_service = "com.qinghuainvest.other.service";
	private String path_service_impl = "com.qinghuainvest.other.service.impl";
	private String path_model = "com.qinghuainvest.other.model";
	private String path_tmodel = "com.qinghuainvest.tmodel";
	private String path_base_mode = "com.qinghuainvest.cmndd.util.hibernate.BaseModel";
	private String path_base_service = "com.qinghuainvest.cmndd.util.service.BaseService";
	private String path_base_service_impl = "com.qinghuainvest.cmndd.util.service.impl.BaseServiceImpl";
	private String path_base_manager = "com.qinghuainvest.cmndd.util.hibernate.BaseManager";
	

	public static void main(String[] args) {
		CreateBeanUtils c = new CreateBeanUtils();
		Set<String> setTableName = c.getTableNameByCon(c.getConnection());
		//System.out.println(set.size());
		for (String tableName : setTableName) {
			c.tablename = tableName;
			//c.createBeanModel();
			//c.createBeanTModel();
			c.getTableNotes(c.getConnection());
			//c.createManager();
			//c.createService();
			//c.createServiceImpl();
		}
		System.out.println("生成成功！");
	}
	

	public Set<String> getTableNameByCon(Connection con) {
		Set<String> set = new HashSet<String>();
		try {
			DatabaseMetaData meta = con.getMetaData();
			ResultSet rs = meta.getTables(null, null, null,
					new String[] { "TABLE" });
			while (rs.next()) {
				set.add(rs.getString(3));
			}
			con.close();
		} catch (Exception e) {
			try {
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return set;
	}
	

	public void getTableNotes(Connection con){
		try {
			DatabaseMetaData dbmd=con.getMetaData();
		    ResultSet resultSet = dbmd.getTables(null, "%", "%", new String[] { "TABLE" });
		    while (resultSet.next()) {
		    	String tableName=resultSet.getString("TABLE_NAME");
		    	String remarkes = resultSet.getString("REMARKS");
	    		System.out.println(tableName+"="+remarkes);
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void createBeanModel() {
		Connection conn = getConnection(); // 得到数据库连接
	    //myDB为数据库名
		String strsql = "select * from " + tablename;
		PreparedStatement pstmt = null;
		ResultSetMetaData rsmd = null;
		try {
			pstmt = conn.prepareStatement(strsql);
			rsmd = pstmt.getMetaData();
			int size = rsmd.getColumnCount(); // 共有多少列
			String[] colnames = new String[size];
			String[] colTypes = new String[size];
			int[] colSizes = new int[size];
			for (int i = 0; i < rsmd.getColumnCount(); i++) {
				colnames[i] = rsmd.getColumnName(i + 1);
				colTypes[i] = rsmd.getColumnTypeName(i + 1);
				colSizes[i] = rsmd.getColumnDisplaySize(i + 1);
			}
			String content = parseModelHibernate(colnames, colTypes, colSizes);
			try {
				FileWriter fw = new FileWriter(initcapTitle(tablename,"Model.java"));
				PrintWriter pw = new PrintWriter(fw);
				pw.println(content);
				pw.flush();
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void createBeanTModel() {
		Connection conn = getConnection(); // 得到数据库连接
		//myDB为数据库名
		String strsql = "select * from " + tablename;
		PreparedStatement pstmt = null;
		ResultSetMetaData rsmd = null;
		try {
			pstmt = conn.prepareStatement(strsql);
			rsmd = pstmt.getMetaData();
			int size = rsmd.getColumnCount(); // 共有多少列
			String[] colnames = new String[size];
			String[] colTypes = new String[size];
			int[] colSizes = new int[size];
			for (int i = 0; i < rsmd.getColumnCount(); i++) {
				colnames[i] = rsmd.getColumnName(i + 1);
				colTypes[i] = rsmd.getColumnTypeName(i + 1);
				colSizes[i] = rsmd.getColumnDisplaySize(i + 1);
			}
			String content = parseTModelHibernate(colnames, colTypes, colSizes);
			try {
				FileWriter fw = new FileWriter(initcapTitle(tablename,"Model.java"));
				PrintWriter pw = new PrintWriter(fw);
				pw.println(content);
				pw.flush();
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void createManager(){
		String content = parseManager();
		try {
			FileWriter fw = new FileWriter(initcapTitle(tablename,"Manager.java"));
			PrintWriter pw = new PrintWriter(fw);
			pw.println(content);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public void createService(){
		String content = parseService();
		try {
			FileWriter fw = new FileWriter(initcapTitle(tablename, "Service.java"));
			PrintWriter pw = new PrintWriter(fw);
			pw.println(content);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void createServiceImpl(){
		String content = parseServiceImpl();
		try {
			FileWriter fw = new FileWriter(initcapTitle(tablename,"ServiceImpl.java"));
			PrintWriter pw = new PrintWriter(fw);
			pw.println(content);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 解析处理(生成实体类主体代码)
	 */
	private String parseModelHibernate(String[] colNames, String[] colTypes, int[] colSizes) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("package "+path_model+";\r\n");
		sb.append("\r\n");
		sb.append("\timport java.util.Date;\r\n");
		sb.append("\timport java.math.BigDecimal;\r\n");
		sb.append("\timport javax.persistence.Column;\r\n");
		sb.append("\timport javax.persistence.Entity;\r\n");
		sb.append("\timport javax.persistence.GeneratedValue;\r\n");
		sb.append("\timport javax.persistence.Id;\r\n");
		sb.append("\timport javax.persistence.Table;\r\n");
		sb.append("\timport org.hibernate.annotations.GenericGenerator;\r\n");
		if( StringUtils.isNotBlank(path_base_mode)){
			sb.append("\timport "+path_base_mode+";\r\n");
		}
		sb.append("\r\n");
		sb.append("@Entity\r\n");
		sb.append("@Table(name=\""+tablename+"\")\r\n");
		sb.append("public class " + initcapTitle(tablename,"Model"));
		if( StringUtils.isNotBlank(path_base_mode)){
			sb.append(" extends BaseModel");
		}
		sb.append("{\r\n");
		sb.append("\r\n");
		if( StringUtils.isNotBlank(path_base_mode)){
			sb.append("\tprivate static final long serialVersionUID = 1L;");
		}
		sb.append("\r\n");
		sb.append("\t@Id\r\n");
		sb.append("\t@GeneratedValue(generator=\"paymentableGenerator\")\r\n");
		sb.append("\t@GenericGenerator(name=\"paymentableGenerator\",strategy=\"uuid\")\r\n");
		processAllAttrs(colNames, colTypes, sb);;
		processAllMethod(colNames, colTypes, sb);;
		sb.append("}\r\n");
		return sb.toString();

	}
	
	/**
	 * 解析处理(生成实体类主体代码)
	 */
	private String parseTModelHibernate(String[] colNames, String[] colTypes, int[] colSizes) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("package "+path_tmodel+";\r\n");
		sb.append("\r\n");
		sb.append("\timport java.util.Date;\r\n");
		sb.append("\timport java.math.BigDecimal;\r\n");
		sb.append("\r\n");
		sb.append("public class " + initcapTitle(tablename,"Model"));
		sb.append("{\r\n");
		sb.append("\r\n");
		processAllTAttrs(colNames, colTypes, sb);;
		processAllMethod(colNames, colTypes, sb);;
		sb.append("}\r\n");
		return sb.toString();
		
	}
	
	private String parseManager(){
		StringBuffer sb = new StringBuffer();
		sb.append("package "+path_maanger+";\r\n");
		sb.append("\r\n");
		sb.append("import "+path_base_manager+";\r\n");
		sb.append("import org.springframework.stereotype.Repository;\r\n");
		sb.append("import "+path_model+"."+initcapTitle(tablename,"Model;\r\n"));
		sb.append("\r\n");
		sb.append("@Repository(\""+resourcetitle(initcapTitle(tablename,"Manager"))+"\")\r\n");
		sb.append("public class "+(initcapTitle(tablename,"Manager"))+" extends BaseManager<"+initcapTitle(tablename,"Model")+">{\r\n");
		sb.append("\r\n");
		sb.append("\t@Override\r\n");
		sb.append("\tpublic Class<"+initcapTitle(tablename,"Model")+"> getModelClass() {\r\n");
		sb.append("\t\treturn "+initcapTitle(tablename,"Model.class")+";\r\n");
		sb.append("\t}\r\n");
		sb.append("\r\n");
		sb.append("\r\n");
		sb.append("}\r\n");
		return sb.toString();
	}
	
	private String parseService(){
		StringBuffer sb = new StringBuffer();
		sb.append("package "+path_service+";\r\n");
		sb.append("\r\n");
		sb.append("import "+path_base_service+";\r\n");
		sb.append("import "+path_model+"."+initcapTitle(tablename,"Model;\r\n"));
		sb.append("\r\n");
		sb.append("public interface "+initcapTitle(tablename,"Service")+" extends BaseService<"+initcapTitle(tablename,"Model")+">{\r\n");
		sb.append("\r\n");
		sb.append("\r\n");
		sb.append("\r\n");
		sb.append("}\r\n");
		return sb.toString();
	}
	
	private String parseServiceImpl(){
		StringBuffer sb = new StringBuffer();
		sb.append("package "+path_service_impl+";\r\n");
		sb.append("\r\n");
		sb.append("import javax.annotation.Resource;\r\n");
		sb.append("import org.springframework.stereotype.Service;\r\n");
		sb.append("import "+path_base_manager+";\r\n");
		sb.append("import "+path_base_service_impl+";\r\n");
		sb.append("import "+path_service+"."+initcapTitle(tablename,"Service")+";\r\n");
		sb.append("import "+path_maanger+"."+initcapTitle(tablename,"Manager")+";\r\n");
		sb.append("import "+path_model+"."+initcapTitle(tablename,"Model;\r\n"));
		sb.append("\r\n");
		sb.append("@Service(\""+resourcetitle(initcapTitle(tablename,"Service"))+"\")\r\n");
		sb.append("public class "+initcapTitle(tablename,"ServiceImpl")+" extends BaseServiceImpl<"+initcapTitle(tablename,"Model")+"> implements "+initcapTitle(tablename,"Service")+"{\r\n");
		sb.append("\r\n");
		sb.append("\t@Resource\r\n");
		sb.append("\tprivate "+initcapTitle(tablename,"Manager")+" "+resourcetitle(initcapTitle(tablename,"Manager"))+";\r\n");
		sb.append("\r\n");
		sb.append("\t@Override\r\n");
		sb.append("\tprotected BaseManager<"+initcapTitle(tablename,"Model")+"> getBaseManager() {\r\n");
		sb.append("\t\treturn "+resourcetitle(initcapTitle(tablename,"Manager"))+";\r\n");
		sb.append("\t}\r\n");
		sb.append("\r\n");
		sb.append("\r\n");
		sb.append("}\r\n");
		return sb.toString();
	}


	/**
	 * 生成所有的方法
	 * 
	 * @param sb
	 */
	private void processAllMethod(String[] colNames, String[] colTypes,StringBuffer sb) {
		for (int i = 0; i < colNames.length; i++) {
			String name = null;
			if( "id".equalsIgnoreCase(colNames[i])){
				 name = "idStr";
				 sb.append("\tpublic void set" + initcap(name) + "(String " + name+ "){\r\n");
				 sb.append("\t\tthis." + name + "=Long.parseLong(" + name + ");\r\n");
				 sb.append("\t}\r\n");
				 
				 sb.append("\tpublic String get" + initcap(name) + "(){\r\n");
				 sb.append("\t\treturn " + name + "+\"\";\r\n");
				 sb.append("\t}\r\n");
			}else{
				name = colNames[i];
				sb.append("\tpublic void set" + initcap(name) + "("+ sqlType2JavaType(colTypes[i]) + " " + name+ "){\r\n");
				sb.append("\t\tthis." + name + "=" + name + ";\r\n");
				sb.append("\t}\r\n");
				
				sb.append("\tpublic " + sqlType2JavaType(colTypes[i]) + " get"+ initcap(name) + "(){\r\n");
				sb.append("\t\treturn " + name + ";\r\n");
				sb.append("\t}\r\n");
			}
			
		}
	}

	/**
	 * 解析输出属性
	 * 
	 * @return
	 */
	private void processAllAttrs(String[] colNames, String[] colTypes,StringBuffer sb) {
		for (int i = 0; i < colNames.length; i++) {
			sb.append("\t@Column(name=\"" + colNames[i] + "\")\r\n");
			String name = null;
			if( "id".equalsIgnoreCase(colNames[i])){
				 name = "idStr";
			}else{
				name = colNames[i];
			}
			sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " "+ name + ";\r\n");
		}
	}
	private void processAllTAttrs(String[] colNames, String[] colTypes,StringBuffer sb) {
		for (int i = 0; i < colNames.length; i++) {
			String name = null;
			if( "id".equalsIgnoreCase(colNames[i])){
				name = "idStr";
			}else{
				name = colNames[i];
			}
			sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " "+ name + ";\r\n");
		}
	}

	/**
	 * 把输入字符串的首字母改成大写
	 * 
	 * @param str
	 * @return
	 */
	private String initcap(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }
	
	
	/**
	 * 标题使用处理
	 * @param str
	 * @param end
	 * @return
	 */
	private String initcapTitle(String str,String end){
		StringBuffer sbf = new StringBuffer();
		String[] arr = str.split("_");
		for (String string : arr) {
			char[] ch = string.toCharArray();
	        if (ch[0] >= 'a' && ch[0] <= 'z') {
	            ch[0] = (char) (ch[0] - 32);
	        }
	        sbf.append(new String(ch));
		}
		if( StringUtils.isBlank(end)){
			end = "";
		}
		return sbf.toString()+end;
	}
	

	/**
	 * 首字母大写
	 * @param str
	 * @return
	 */
	private String resourcetitle(String str){
		char[] chars=new char[1];  
        chars[0]=str.charAt(0);  
        String temp=new String(chars);  
        return str.replaceFirst(temp,temp.toLowerCase());  
	}
	

	private String sqlType2JavaType(String sqlType) {
		if (sqlType.equalsIgnoreCase("bit")) {
			return "byte";
		} else if (sqlType.equalsIgnoreCase("tinyint")) {
			return "Integer";
		} else if (sqlType.equalsIgnoreCase("smallint")) {
			return "Integer";
		} else if (sqlType.equalsIgnoreCase("int")||sqlType.equalsIgnoreCase("Integer")) {
			return "Integer";
		} else if (sqlType.equalsIgnoreCase("bigint")) {
			return "Long";
		} else if (sqlType.equalsIgnoreCase("float")) {
			return "BigDecimal";
		} else if (sqlType.equalsIgnoreCase("decimal")
				|| sqlType.equalsIgnoreCase("numeric")
				|| sqlType.equalsIgnoreCase("real")) {
			return "BigDecimal";
		} else if (sqlType.equalsIgnoreCase("money")
				|| sqlType.equalsIgnoreCase("smallmoney")) {
			return "BigDecimal";
		} else if (sqlType.equalsIgnoreCase("varchar")
				|| sqlType.equalsIgnoreCase("char")
				|| sqlType.equalsIgnoreCase("nvarchar")
				|| sqlType.equalsIgnoreCase("nchar")) {
			return "String";
		} else if (sqlType.equalsIgnoreCase("datetime")) {
			return "Date";
		}else if (sqlType.equalsIgnoreCase("image") || sqlType.equalsIgnoreCase("longblob")|| sqlType.equalsIgnoreCase("blob")) {
			return "byte[]";
		} else if (sqlType.equalsIgnoreCase("text")) {
			return "String";
		} else if (sqlType.equalsIgnoreCase("date")) {
			return "Date";
		} else if(sqlType.equalsIgnoreCase("timestamp")){
			return "Date";
		}
		return null;
	}
}
