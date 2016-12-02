package com.hwaggLee.create;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.lang.StringUtils;

import com.base.model.BaseException;
import com.base.utils.UtilsFile;
import com.hwaggLee.create.product.CreateProduct;

/**
 * 复制项目-生产代码
 * @author huage
 * 项目中出现的{huage_product_name}将被替换为项目名称
 *
 */
public class StartCpoyMavenProduct extends CreateProduct{
	public StartCpoyMavenProduct(String productname){
		super(productname);
	}

	public static void main(String[] args) throws Exception{
		String product_name = "n3b_db";
		String product_path = "D:\\Workspace\\eclipse\\eclipse-birt-2.2.0\\workspace\\"+product_name;
		StartCpoyMavenProduct p = new StartCpoyMavenProduct(product_name);
		p.createProduct(product_path);
	}
	
	public void createProduct(String path)throws Exception{
		if(StringUtils.isBlank(product_name) || StringUtils.isBlank(path))return;
		System.out.println("开始编码...");
		File file = new File(path);
		if(!file.exists()){
			throw new BaseException("项目不存在");
		}
		Collection<File> list = FileUtils.listFilesAndDirs(file, TrueFileFilter.TRUE, TrueFileFilter.TRUE);
		if( list == null || list.isEmpty()) return;
		String className = "StartCreate"+StringUtils.capitalize(product_name)+"Product";
		StringBuilder sb = new StringBuilder();
		initClass(sb, className);
		
		int i = 0;
		for (Iterator<File> iterator = list.iterator(); iterator.hasNext();) {
			File f =  iterator.next();
			if(f == null )continue;
			/*if( !f.getName().equals("org.eclipse.wst.common.component")){
				continue;
			}*/
			if( f.isFile()){
				createFile(sb,f,product_name,file.getName(),i++,path);
			}else{
				System.out.println(f.getPath());
				createDirs(sb,f,product_name,file.getName(),i++,path);
			}
			
		}
		displayClass(sb,product_name);
		//System.out.println(sb.toString());
		String p =  StartCpoyMavenProduct.class.getResource("/").getPath();
		p = p.substring(0, p.lastIndexOf("target/classes/"))+"src\\main\\java\\com\\hwaggLee\\create\\product\\"+className+".java";
		File f = UtilsFile.findOrCreateFile(p);
		createAndWriteFile2(f, sb.toString());
		System.out.println("完成..."+p);
		System.out.println(sb.toString());
	}
	
	private void createDirs(StringBuilder sb,File file,String newName,String oldName,int i,String path)throws Exception{
		if( file == null || !file.exists()  ||StringUtils.isBlank(newName) ||StringUtils.isBlank(oldName) || sb == null )return;
		sb.append("		//create "+file.getName() ).append("\r\n");
		sb.append("		//path "+file.getPath() ).append("\r\n");
		sb.append("		File file"+i+" = new File(product_path+product_name+\""+file.getPath().replace(path, "").replace("\\", "\\\\")+"\");").append("\r\n");
		sb.append("		if( !file"+i+".exists()){").append("\r\n");
		sb.append("			file"+i+".mkdirs();").append("\r\n");
		sb.append("		}").append("\r\n");
	}
	
	
	private void createFile(StringBuilder sb,File file,String newName,String oldName,int i,String path)throws Exception{
		if( file == null || !file.exists()  ||StringUtils.isBlank(newName) ||StringUtils.isBlank(oldName) || sb == null )return;
		List<String> list = FileUtils.readLines(file);
		if(list == null )return;
		
		sb.append("		//create "+file.getName() ).append("\r\n");
		sb.append("		//path "+file.getPath() ).append("\r\n");
		sb.append("		File file"+i+" = UtilsFile.findOrCreateFile(product_path+product_name+\""+file.getPath().replace(path, "").replace("\\", "\\\\")+"\");").append("\r\n");
		
		sb.append("		StringBuilder sb"+i+" = new StringBuilder();").append("\r\n");
		for (String line : list) {
			line = line.replace("\"", "\\\"");//双引号
			line = line.replace("\\:", "\\\\:");//斜杠
			line = line.replace("\""+oldName+"\"", "\"+product_name+\"");
			sb.append("		sb"+i+".append(\""+line+"\").append(\"\\r\\n\");").append("\r\n");
		}
		sb.append("		createAndWriteFile(file"+i+", sb"+i+".toString());").append("\r\n");
		sb.append("\r\n");

		//System.out.println(str);
		
	}
	
	
	private void initClass(StringBuilder sb,String className )throws Exception{
		if( sb == null )throw new BaseException("未提供组装数据的容器");
		sb.append("package com.hwaggLee.create.product;").append("\r\n");
		sb.append("\r\n");
		sb.append("import java.io.*;").append("\r\n");
		sb.append("\r\n");
		sb.append("import com.base.model.*;").append("\r\n");
		sb.append("import com.base.utils.*;").append("\r\n");
		sb.append("\r\n");
		sb.append("\r\n");
		sb.append("public class "+className+" extends CreateProduct{").append("\r\n");
		sb.append("\r\n");
		sb.append("\r\n");
		sb.append("	public "+className+"(String productname) {").append("\r\n");
		sb.append("		super(productname);").append("\r\n");
		sb.append("	}").append("\r\n");
		sb.append("\r\n");
		sb.append("\r\n");
		sb.append("	public static void main(String[] args) throws Exception{").append("\r\n");
		sb.append("		String product_name = \"productname\";").append("\r\n");
		sb.append("		String product_path = \"D:\\\\Workspace\\\\eclipse\\\\eclipse-birt-2.2.0\\\\workspace\\\\\";").append("\r\n");
		sb.append("		CreateProduct p = new "+className+"(product_name);").append("\r\n");
		sb.append("		p.createProduct( product_path);").append("\r\n");
		sb.append("		p.start( product_path);").append("\r\n");
		sb.append("		System.out.println(\"完成\");").append("\r\n");
		sb.append("	}").append("\r\n");
		sb.append("\r\n");
		sb.append("\r\n");
		sb.append("	public void createProduct(String product_path)throws Exception{").append("\r\n");
		sb.append("		File file = new File(product_path+product_name);").append("\r\n");
		sb.append("		if( file.exists()){").append("\r\n");
		sb.append("			throw new BaseException(\"项目名称已存在\");").append("\r\n");
		sb.append("		}else{").append("\r\n");
		sb.append("			file.mkdirs();").append("\r\n");
		sb.append("		}").append("\r\n");
		sb.append("	}").append("\r\n");
		sb.append("\r\n");
		sb.append("\r\n");
		sb.append("	public void start(String product_path)throws Exception{").append("\r\n");
		
	}	

	private void displayClass(StringBuilder sb,String productname ){
		if( sb == null )throw new BaseException("未提供组装数据的容器");
		sb.append("	}").append("\r\n");
		sb.append("}");
	}


	public void start(String product_path) throws Exception {
		
		return;
	}


}
