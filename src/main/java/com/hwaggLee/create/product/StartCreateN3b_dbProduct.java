package com.hwaggLee.create.product;

import java.io.*;

import com.base.model.*;
import com.base.utils.*;


public class StartCreateN3b_dbProduct extends CreateProduct{


	public StartCreateN3b_dbProduct(String productname) {
		super(productname);
	}


	public static void main(String[] args) throws Exception{
		String product_name = "productname";
		String product_path = "D:\\Workspace\\eclipse\\eclipse-birt-2.2.0\\workspace\\";
		CreateProduct p = new StartCreateN3b_dbProduct(product_name);
		p.createProduct( product_path);
		p.start( product_path);
		System.out.println("完成");
	}


	public void createProduct(String product_path)throws Exception{
		File file = new File(product_path+product_name);
		if( file.exists()){
			throw new BaseException("项目名称已存在");
		}else{
			file.mkdirs();
		}
	}


	public void start(String product_path)throws Exception{
		//create {huage_product_name}
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}
		File file0 = new File(product_path+product_name+"");
		if( !file0.exists()){
			file0.mkdirs();
		}
		//create .classpath
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\.classpath
		File file1 = UtilsFile.findOrCreateFile(product_path+product_name+"\\.classpath");
		StringBuilder sb1 = new StringBuilder();
		sb1.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\r\n");
		sb1.append("<classpath>").append("\r\n");
		sb1.append("	<classpathentry kind=\"src\" output=\"target/classes\" path=\"src/main/java\">").append("\r\n");
		sb1.append("		<attributes>").append("\r\n");
		sb1.append("			<attribute name=\"optional\" value=\"true\"/>").append("\r\n");
		sb1.append("			<attribute name=\"maven.pomderived\" value=\"true\"/>").append("\r\n");
		sb1.append("		</attributes>").append("\r\n");
		sb1.append("	</classpathentry>").append("\r\n");
		sb1.append("	<classpathentry excluding=\"**\" kind=\"src\" output=\"target/classes\" path=\"src/main/resources\">").append("\r\n");
		sb1.append("		<attributes>").append("\r\n");
		sb1.append("			<attribute name=\"maven.pomderived\" value=\"true\"/>").append("\r\n");
		sb1.append("		</attributes>").append("\r\n");
		sb1.append("	</classpathentry>").append("\r\n");
		sb1.append("	<classpathentry kind=\"src\" output=\"target/test-classes\" path=\"src/test/java\">").append("\r\n");
		sb1.append("		<attributes>").append("\r\n");
		sb1.append("			<attribute name=\"optional\" value=\"true\"/>").append("\r\n");
		sb1.append("			<attribute name=\"maven.pomderived\" value=\"true\"/>").append("\r\n");
		sb1.append("		</attributes>").append("\r\n");
		sb1.append("	</classpathentry>").append("\r\n");
		sb1.append("	<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER\">").append("\r\n");
		sb1.append("		<attributes>").append("\r\n");
		sb1.append("			<attribute name=\"maven.pomderived\" value=\"true\"/>").append("\r\n");
		sb1.append("		</attributes>").append("\r\n");
		sb1.append("	</classpathentry>").append("\r\n");
		sb1.append("	<classpathentry kind=\"con\" path=\"org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER\">").append("\r\n");
		sb1.append("		<attributes>").append("\r\n");
		sb1.append("			<attribute name=\"maven.pomderived\" value=\"true\"/>").append("\r\n");
		sb1.append("			<attribute name=\"org.eclipse.jst.component.dependency\" value=\"/WEB-INF/lib\"/>").append("\r\n");
		sb1.append("		</attributes>").append("\r\n");
		sb1.append("	</classpathentry>").append("\r\n");
		sb1.append("	<classpathentry kind=\"output\" path=\"target/classes\"/>").append("\r\n");
		sb1.append("</classpath>").append("\r\n");
		createAndWriteFile(file1, sb1.toString());

		//create .project
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\.project
		File file2 = UtilsFile.findOrCreateFile(product_path+product_name+"\\.project");
		StringBuilder sb2 = new StringBuilder();
		sb2.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\r\n");
		sb2.append("<projectDescription>").append("\r\n");
		sb2.append("	<name>{huage_product_name}</name>").append("\r\n");
		sb2.append("	<comment></comment>").append("\r\n");
		sb2.append("	<projects>").append("\r\n");
		sb2.append("	</projects>").append("\r\n");
		sb2.append("	<buildSpec>").append("\r\n");
		sb2.append("		<buildCommand>").append("\r\n");
		sb2.append("			<name>org.eclipse.jdt.core.javabuilder</name>").append("\r\n");
		sb2.append("			<arguments>").append("\r\n");
		sb2.append("			</arguments>").append("\r\n");
		sb2.append("		</buildCommand>").append("\r\n");
		sb2.append("		<buildCommand>").append("\r\n");
		sb2.append("			<name>org.eclipse.wst.common.project.facet.core.builder</name>").append("\r\n");
		sb2.append("			<arguments>").append("\r\n");
		sb2.append("			</arguments>").append("\r\n");
		sb2.append("		</buildCommand>").append("\r\n");
		sb2.append("		<buildCommand>").append("\r\n");
		sb2.append("			<name>org.eclipse.m2e.core.maven2Builder</name>").append("\r\n");
		sb2.append("			<arguments>").append("\r\n");
		sb2.append("			</arguments>").append("\r\n");
		sb2.append("		</buildCommand>").append("\r\n");
		sb2.append("		<buildCommand>").append("\r\n");
		sb2.append("			<name>org.eclipse.wst.validation.validationbuilder</name>").append("\r\n");
		sb2.append("			<arguments>").append("\r\n");
		sb2.append("			</arguments>").append("\r\n");
		sb2.append("		</buildCommand>").append("\r\n");
		sb2.append("	</buildSpec>").append("\r\n");
		sb2.append("	<natures>").append("\r\n");
		sb2.append("		<nature>org.eclipse.jem.workbench.JavaEMFNature</nature>").append("\r\n");
		sb2.append("		<nature>org.eclipse.wst.common.modulecore.ModuleCoreNature</nature>").append("\r\n");
		sb2.append("		<nature>org.eclipse.jdt.core.javanature</nature>").append("\r\n");
		sb2.append("		<nature>org.eclipse.m2e.core.maven2Nature</nature>").append("\r\n");
		sb2.append("		<nature>org.eclipse.wst.common.project.facet.core.nature</nature>").append("\r\n");
		sb2.append("	</natures>").append("\r\n");
		sb2.append("</projectDescription>").append("\r\n");
		createAndWriteFile(file2, sb2.toString());

		//create .settings
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\.settings
		File file3 = new File(product_path+product_name+"\\.settings");
		if( !file3.exists()){
			file3.mkdirs();
		}
		//create .jsdtscope
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\.settings\.jsdtscope
		File file4 = UtilsFile.findOrCreateFile(product_path+product_name+"\\.settings\\.jsdtscope");
		StringBuilder sb4 = new StringBuilder();
		sb4.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\r\n");
		sb4.append("<classpath>").append("\r\n");
		sb4.append("	<classpathentry kind=\"src\" path=\"src/main/webapp\"/>").append("\r\n");
		sb4.append("	<classpathentry kind=\"src\" path=\"target/m2e-wtp/web-resources\"/>").append("\r\n");
		sb4.append("	<classpathentry kind=\"con\" path=\"org.eclipse.wst.jsdt.launching.JRE_CONTAINER\"/>").append("\r\n");
		sb4.append("	<classpathentry kind=\"con\" path=\"org.eclipse.wst.jsdt.launching.WebProject\">").append("\r\n");
		sb4.append("		<attributes>").append("\r\n");
		sb4.append("			<attribute name=\"hide\" value=\"true\"/>").append("\r\n");
		sb4.append("		</attributes>").append("\r\n");
		sb4.append("	</classpathentry>").append("\r\n");
		sb4.append("	<classpathentry kind=\"con\" path=\"org.eclipse.wst.jsdt.launching.baseBrowserLibrary\"/>").append("\r\n");
		sb4.append("	<classpathentry kind=\"output\" path=\"\"/>").append("\r\n");
		sb4.append("</classpath>").append("\r\n");
		createAndWriteFile(file4, sb4.toString());

		//create org.eclipse.jdt.core.prefs
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\.settings\org.eclipse.jdt.core.prefs
		File file5 = UtilsFile.findOrCreateFile(product_path+product_name+"\\.settings\\org.eclipse.jdt.core.prefs");
		StringBuilder sb5 = new StringBuilder();
		sb5.append("eclipse.preferences.version=1").append("\r\n");
		sb5.append("org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled").append("\r\n");
		sb5.append("org.eclipse.jdt.core.compiler.codegen.methodParameters=do not generate").append("\r\n");
		sb5.append("org.eclipse.jdt.core.compiler.codegen.targetPlatform=1.7").append("\r\n");
		sb5.append("org.eclipse.jdt.core.compiler.codegen.unusedLocal=preserve").append("\r\n");
		sb5.append("org.eclipse.jdt.core.compiler.compliance=1.7").append("\r\n");
		sb5.append("org.eclipse.jdt.core.compiler.debug.lineNumber=generate").append("\r\n");
		sb5.append("org.eclipse.jdt.core.compiler.debug.localVariable=generate").append("\r\n");
		sb5.append("org.eclipse.jdt.core.compiler.debug.sourceFile=generate").append("\r\n");
		sb5.append("org.eclipse.jdt.core.compiler.problem.assertIdentifier=error").append("\r\n");
		sb5.append("org.eclipse.jdt.core.compiler.problem.enumIdentifier=error").append("\r\n");
		sb5.append("org.eclipse.jdt.core.compiler.problem.forbiddenReference=warning").append("\r\n");
		sb5.append("org.eclipse.jdt.core.compiler.source=1.7").append("\r\n");
		createAndWriteFile(file5, sb5.toString());

		//create org.eclipse.m2e.core.prefs
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\.settings\org.eclipse.m2e.core.prefs
		File file6 = UtilsFile.findOrCreateFile(product_path+product_name+"\\.settings\\org.eclipse.m2e.core.prefs");
		StringBuilder sb6 = new StringBuilder();
		sb6.append("activeProfiles=").append("\r\n");
		sb6.append("eclipse.preferences.version=1").append("\r\n");
		sb6.append("resolveWorkspaceProjects=true").append("\r\n");
		sb6.append("version=1").append("\r\n");
		createAndWriteFile(file6, sb6.toString());

		//create org.eclipse.wst.common.component
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\.settings\org.eclipse.wst.common.component
		File file7 = UtilsFile.findOrCreateFile(product_path+product_name+"\\.settings\\org.eclipse.wst.common.component");
		StringBuilder sb7 = new StringBuilder();
		sb7.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?><project-modules id=\"moduleCoreId\" project-version=\"1.5.0\">").append("\r\n");
		sb7.append("    <wb-module deploy-name=\"{huage_product_name}\">").append("\r\n");
		sb7.append("        <wb-resource deploy-path=\"/\" source-path=\"/target/m2e-wtp/web-resources\"/>").append("\r\n");
		sb7.append("        <wb-resource deploy-path=\"/\" source-path=\"/src/main/webapp\" tag=\"defaultRootSource\"/>").append("\r\n");
		sb7.append("        <wb-resource deploy-path=\"/WEB-INF/classes\" source-path=\"/src/main/java\"/>").append("\r\n");
		sb7.append("        <wb-resource deploy-path=\"/WEB-INF/classes\" source-path=\"/src/main/resources\"/>").append("\r\n");
		sb7.append("        <wb-resource deploy-path=\"/WEB-INF/classes\" source-path=\"/src/test/java\"/>").append("\r\n");
		sb7.append("        <property name=\"java-output-path\" value=\"/{huage_product_name}/target/classes\"/>").append("\r\n");
		sb7.append("        <property name=\"context-root\" value=\"{huage_product_name}\"/>").append("\r\n");
		sb7.append("    </wb-module>").append("\r\n");
		sb7.append("</project-modules>").append("\r\n");
		createAndWriteFile(file7, sb7.toString());

		//create org.eclipse.wst.common.project.facet.core.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\.settings\org.eclipse.wst.common.project.facet.core.xml
		File file8 = UtilsFile.findOrCreateFile(product_path+product_name+"\\.settings\\org.eclipse.wst.common.project.facet.core.xml");
		StringBuilder sb8 = new StringBuilder();
		sb8.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\r\n");
		sb8.append("<faceted-project>").append("\r\n");
		sb8.append("  <fixed facet=\"wst.jsdt.web\"/>").append("\r\n");
		sb8.append("  <installed facet=\"java\" version=\"1.7\"/>").append("\r\n");
		sb8.append("  <installed facet=\"jst.web\" version=\"2.5\"/>").append("\r\n");
		sb8.append("  <installed facet=\"wst.jsdt.web\" version=\"1.0\"/>").append("\r\n");
		sb8.append("</faceted-project>").append("\r\n");
		createAndWriteFile(file8, sb8.toString());

		//create org.eclipse.wst.jsdt.ui.superType.container
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\.settings\org.eclipse.wst.jsdt.ui.superType.container
		File file9 = UtilsFile.findOrCreateFile(product_path+product_name+"\\.settings\\org.eclipse.wst.jsdt.ui.superType.container");
		StringBuilder sb9 = new StringBuilder();
		sb9.append("org.eclipse.wst.jsdt.launching.baseBrowserLibrary").append("\r\n");
		createAndWriteFile(file9, sb9.toString());

		//create org.eclipse.wst.jsdt.ui.superType.name
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\.settings\org.eclipse.wst.jsdt.ui.superType.name
		File file10 = UtilsFile.findOrCreateFile(product_path+product_name+"\\.settings\\org.eclipse.wst.jsdt.ui.superType.name");
		StringBuilder sb10 = new StringBuilder();
		sb10.append("Window").append("\r\n");
		createAndWriteFile(file10, sb10.toString());

		//create org.eclipse.wst.validation.prefs
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\.settings\org.eclipse.wst.validation.prefs
		File file11 = UtilsFile.findOrCreateFile(product_path+product_name+"\\.settings\\org.eclipse.wst.validation.prefs");
		StringBuilder sb11 = new StringBuilder();
		sb11.append("disabled=06target").append("\r\n");
		sb11.append("eclipse.preferences.version=1").append("\r\n");
		createAndWriteFile(file11, sb11.toString());

		//create pom.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\pom.xml
		File file12 = UtilsFile.findOrCreateFile(product_path+product_name+"\\pom.xml");
		StringBuilder sb12 = new StringBuilder();
		sb12.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"").append("\r\n");
		sb12.append("  xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd\">").append("\r\n");
		sb12.append("  <modelVersion>4.0.0</modelVersion>").append("\r\n");
		sb12.append("  <groupId>com</groupId>").append("\r\n");
		sb12.append("  <artifactId>{huage_product_name}</artifactId>").append("\r\n");
		sb12.append("  <packaging>war</packaging>").append("\r\n");
		sb12.append("  <version>0.0.1-SNAPSHOT</version>").append("\r\n");
		sb12.append("  <name>{huage_product_name} Maven Webapp</name>").append("\r\n");
		sb12.append("  <url>http://maven.apache.org</url>").append("\r\n");
		sb12.append("  <dependencies>").append("\r\n");
		sb12.append("    <dependency>").append("\r\n");
		sb12.append("      <groupId>junit</groupId>").append("\r\n");
		sb12.append("      <artifactId>junit</artifactId>").append("\r\n");
		sb12.append("      <version>3.8.1</version>").append("\r\n");
		sb12.append("      <scope>test</scope>").append("\r\n");
		sb12.append("    </dependency>").append("\r\n");
		sb12.append("    ").append("\r\n");
		sb12.append("    <dependency>").append("\r\n");
		sb12.append("    	<groupId>org.freemarker</groupId>").append("\r\n");
		sb12.append("    	<artifactId>freemarker</artifactId>").append("\r\n");
		sb12.append("    	<version>2.3.20</version>").append("\r\n");
		sb12.append("    </dependency>").append("\r\n");
		sb12.append("    ").append("\r\n");
		sb12.append("    <dependency>").append("\r\n");
		sb12.append("		<groupId>javax.servlet</groupId>").append("\r\n");
		sb12.append("		<artifactId>servlet-api</artifactId>").append("\r\n");
		sb12.append("		<version>2.5</version>").append("\r\n");
		sb12.append("		<scope>provided</scope>").append("\r\n");
		sb12.append("	</dependency>").append("\r\n");
		sb12.append("	<dependency>").append("\r\n");
		sb12.append("		<groupId>commons-httpclient</groupId>").append("\r\n");
		sb12.append("		<artifactId>commons-httpclient</artifactId>").append("\r\n");
		sb12.append("		<version>3.1</version>").append("\r\n");
		sb12.append("	</dependency>").append("\r\n");
		sb12.append("	").append("\r\n");
		sb12.append("	<dependency>").append("\r\n");
		sb12.append("		<groupId>org.apache.httpcomponents</groupId>").append("\r\n");
		sb12.append("		<artifactId>httpclient</artifactId>").append("\r\n");
		sb12.append("		<version>4.4</version>").append("\r\n");
		sb12.append("	</dependency>").append("\r\n");
		sb12.append("	").append("\r\n");
		sb12.append("  </dependencies>").append("\r\n");
		sb12.append("  <build>").append("\r\n");
		sb12.append("	  <plugins>").append("\r\n");
		sb12.append("	       <plugin>").append("\r\n");
		sb12.append("	           <groupId>org.apache.maven.plugins</groupId>").append("\r\n");
		sb12.append("	           <artifactId>maven-surefire-plugin</artifactId>").append("\r\n");
		sb12.append("	           <configuration>").append("\r\n");
		sb12.append("	               <skip>true</skip>").append("\r\n");
		sb12.append("	           </configuration>").append("\r\n");
		sb12.append("	       </plugin>").append("\r\n");
		sb12.append("	   </plugins>").append("\r\n");
		sb12.append("    <finalName>{huage_product_name}</finalName>").append("\r\n");
		sb12.append("  </build>").append("\r\n");
		sb12.append("</project>").append("\r\n");
		createAndWriteFile(file12, sb12.toString());

		//create src
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src
		File file13 = new File(product_path+product_name+"\\src");
		if( !file13.exists()){
			file13.mkdirs();
		}
		//create main
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main
		File file14 = new File(product_path+product_name+"\\src\\main");
		if( !file14.exists()){
			file14.mkdirs();
		}
		//create java
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\java
		File file15 = new File(product_path+product_name+"\\src\\main\\java");
		if( !file15.exists()){
			file15.mkdirs();
		}
		//create com
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\java\com
		File file16 = new File(product_path+product_name+"\\src\\main\\java\\com");
		if( !file16.exists()){
			file16.mkdirs();
		}
		//create qinghuainvest
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\java\com\qinghuainvest
		File file17 = new File(product_path+product_name+"\\src\\main\\java\\com\\qinghuainvest");
		if( !file17.exists()){
			file17.mkdirs();
		}
		//create resources
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\resources
		File file18 = new File(product_path+product_name+"\\src\\main\\resources");
		if( !file18.exists()){
			file18.mkdirs();
		}
		//create ehcache.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\resources\ehcache.xml
		File file19 = UtilsFile.findOrCreateFile(product_path+product_name+"\\src\\main\\resources\\ehcache.xml");
		StringBuilder sb19 = new StringBuilder();
		sb19.append("<ehcache>").append("\r\n");
		sb19.append("").append("\r\n");
		sb19.append("	<!-- Sets the path to the directory where cache .data files are created.").append("\r\n");
		sb19.append("").append("\r\n");
		sb19.append("			 If the path is a Java System Property it is replaced by").append("\r\n");
		sb19.append("			 its value in the running VM.").append("\r\n");
		sb19.append("").append("\r\n");
		sb19.append("			 The following properties are translated:").append("\r\n");
		sb19.append("			 user.home - User's home directory").append("\r\n");
		sb19.append("			 user.dir - User's current working directory").append("\r\n");
		sb19.append("			 java.io.tmpdir - Default temp file path -->").append("\r\n");
		sb19.append("	<diskStore path=\"user.dir\"/>").append("\r\n");
		sb19.append("").append("\r\n");
		sb19.append("").append("\r\n");
		sb19.append("	<!--Default Cache configuration. These will applied to caches programmatically created through").append("\r\n");
		sb19.append("			the CacheManager.").append("\r\n");
		sb19.append("").append("\r\n");
		sb19.append("			The following attributes are required:").append("\r\n");
		sb19.append("").append("\r\n");
		sb19.append("			maxElementsInMemory            - Sets the maximum number of objects that will be created in memory").append("\r\n");
		sb19.append("			eternal                        - Sets whether elements are eternal. If eternal,  timeouts are ignored and the").append("\r\n");
		sb19.append("											 element is never expired.").append("\r\n");
		sb19.append("			overflowToDisk                 - Sets whether elements can overflow to disk when the in-memory cache").append("\r\n");
		sb19.append("											 has reached the maxInMemory limit.").append("\r\n");
		sb19.append("").append("\r\n");
		sb19.append("			The following attributes are optional:").append("\r\n");
		sb19.append("			timeToIdleSeconds              - Sets the time to idle for an element before it expires.").append("\r\n");
		sb19.append("											 i.e. The maximum amount of time between accesses before an element expires").append("\r\n");
		sb19.append("											 Is only used if the element is not eternal.").append("\r\n");
		sb19.append("											 Optional attribute. A value of 0 means that an Element can idle for infinity.").append("\r\n");
		sb19.append("											 The default value is 0.").append("\r\n");
		sb19.append("			timeToLiveSeconds              - Sets the time to live for an element before it expires.").append("\r\n");
		sb19.append("											 i.e. The maximum time between creation time and when an element expires.").append("\r\n");
		sb19.append("											 Is only used if the element is not eternal.").append("\r\n");
		sb19.append("											 Optional attribute. A value of 0 means that and Element can live for infinity.").append("\r\n");
		sb19.append("											 The default value is 0.").append("\r\n");
		sb19.append("			diskPersistent                 - Whether the disk store persists between restarts of the Virtual Machine.").append("\r\n");
		sb19.append("											 The default value is false.").append("\r\n");
		sb19.append("			diskExpiryThreadIntervalSeconds- The number of seconds between runs of the disk expiry thread. The default value").append("\r\n");
		sb19.append("											 is 120 seconds.").append("\r\n");
		sb19.append("			-->").append("\r\n");
		sb19.append("").append("\r\n");
		sb19.append("	<defaultCache").append("\r\n");
		sb19.append("			maxElementsInMemory=\"10000\"").append("\r\n");
		sb19.append("			eternal=\"false\"").append("\r\n");
		sb19.append("			overflowToDisk=\"false\"").append("\r\n");
		sb19.append("			timeToIdleSeconds=\"0\"").append("\r\n");
		sb19.append("			timeToLiveSeconds=\"0\"/>").append("\r\n");
		sb19.append("	").append("\r\n");
		sb19.append("</ehcache>").append("\r\n");
		createAndWriteFile(file19, sb19.toString());

		//create jdbc.properties
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\resources\jdbc.properties
		File file20 = UtilsFile.findOrCreateFile(product_path+product_name+"\\src\\main\\resources\\jdbc.properties");
		StringBuilder sb20 = new StringBuilder();
		sb20.append("#mysql").append("\r\n");
		sb20.append("hibernate.dialect=org.hibernate.dialect.MySQLDialect").append("\r\n");
		sb20.append("hibernate.connection.driver_class=com.mysql.jdbc.Driver").append("\r\n");
		sb20.append("hibernate.db.connection.url=jdbc:mysql://127.0.0.1:3306/qdjt_jydb1?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull").append("\r\n");
		sb20.append("hibernate.db.connection.username=root").append("\r\n");
		sb20.append("hibernate.db.connection.password=hp64123456").append("\r\n");
		sb20.append("").append("\r\n");
		createAndWriteFile(file20, sb20.toString());

		//create log4j.properties
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\resources\log4j.properties
		File file21 = UtilsFile.findOrCreateFile(product_path+product_name+"\\src\\main\\resources\\log4j.properties");
		StringBuilder sb21 = new StringBuilder();
		sb21.append("log4j.rootLogger=ERROR,DAY_ROLLING_FILE,stdout").append("\r\n");
		sb21.append("### direct log messages to stdout ###").append("\r\n");
		sb21.append("log4j.appender.stdout=org.apache.log4j.ConsoleAppender").append("\r\n");
		sb21.append("log4j.appender.stdout.layout=org.apache.log4j.PatternLayout").append("\r\n");
		sb21.append("#log4j.appender.stdout.layout.ConversionPattern=%-d{HH:mm:ss} %-5p [%c{1}] %M (line:%L) %m%n").append("\r\n");
		sb21.append("log4j.appender.stdout.layout.ConversionPattern=%d %p [%c:%L] - %m%n").append("\r\n");
		sb21.append("").append("\r\n");
		sb21.append("log4j.logger.org.hibernate.type=INFO").append("\r\n");
		sb21.append("log4j.logger.java.sql=DEBUG").append("\r\n");
		sb21.append("log4j.logger.com.qinghuainvest=INFO").append("\r\n");
		sb21.append("log4j.logger.org.hibernate=ERROR").append("\r\n");
		sb21.append("log4j.logger.org.springframework=INFO").append("\r\n");
		sb21.append("").append("\r\n");
		sb21.append("########################").append("\r\n");
		sb21.append("# Rolling File").append("\r\n");
		sb21.append("########################").append("\r\n");
		sb21.append("log4j.appender.ROLLING_FILE=org.apache.log4j.RollingFileAppender").append("\r\n");
		sb21.append("log4j.appender.ROLLING_FILE.Threshold=DEBUG").append("\r\n");
		sb21.append("log4j.appender.ROLLING_FILE.File=broker.log").append("\r\n");
		sb21.append("log4j.appender.ROLLING_FILE.Append=true").append("\r\n");
		sb21.append("log4j.appender.ROLLING_FILE.MaxFileSize=10240KB").append("\r\n");
		sb21.append("log4j.appender.ROLLING_FILE.MaxBackupIndex=20").append("\r\n");
		sb21.append("log4j.appender.ROLLING_FILE.layout=org.apache.log4j.PatternLayout").append("\r\n");
		sb21.append("log4j.appender.ROLLING_FILE.layout.ConversionPattern=[%d %t %c] %m%n").append("\r\n");
		sb21.append("").append("\r\n");
		sb21.append("########################").append("\r\n");
		sb21.append("# Daily Rolling File \u65E5\u5FD7\u8F93\u51FA\u5230\u6587\u4EF6\uFF0C${catalina.home}\u53EF\u4EE5\u7528\u5176\u4ED6\u8DEF\u5F84\u4EE3\u66FF").append("\r\n");
		sb21.append("########################").append("\r\n");
		sb21.append("log4j.appender.DAY_ROLLING_FILE=org.apache.log4j.DailyRollingFileAppender").append("\r\n");
		sb21.append("log4j.appender.DAY_ROLLING_FILE.File=${catalina.home}/logs/{huage_product_name}").append("\r\n");
		sb21.append("#websphere ").append("\r\n");
		sb21.append("##log4j.appender.DAY_ROLLING_FILE.File=${SERVER_LOG_ROOT}/logs/lhh-utils").append("\r\n");
		sb21.append("log4j.appender.DAY_ROLLING_FILE.DatePattern='_'yyyy-MM-dd'.log'").append("\r\n");
		sb21.append("log4j.appender.DAY_ROLLING_FILE.layout=org.apache.log4j.PatternLayout").append("\r\n");
		sb21.append("log4j.appender.DAY_ROLLING_FILE.layout.ConversionPattern=%d{HH:mm:ss} %-5p [%C] (%F:%L) - %m%n").append("\r\n");
		createAndWriteFile(file21, sb21.toString());

		//create spring-component.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\resources\spring-component.xml
		File file22 = UtilsFile.findOrCreateFile(product_path+product_name+"\\src\\main\\resources\\spring-component.xml");
		StringBuilder sb22 = new StringBuilder();
		sb22.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\r\n");
		sb22.append("<beans xmlns=\"http://www.springframework.org/schema/beans\"").append("\r\n");
		sb22.append("	xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:context=\"http://www.springframework.org/schema/context\"").append("\r\n");
		sb22.append("	xmlns:task=\"http://www.springframework.org/schema/task\"").append("\r\n");
		sb22.append("	xsi:schemaLocation=\"http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.2.xsd").append("\r\n");
		sb22.append("			http://www.springframework.org/schema/task http://www.springframework.org/schema/task/spring-task-3.2.xsd").append("\r\n");
		sb22.append("            http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.2.xsd\">").append("\r\n");
		sb22.append("	<context:component-scan base-package=\"com.qinghuainvest.*\" />").append("\r\n");
		sb22.append("	<task:annotation-driven />").append("\r\n");
		sb22.append("</beans>").append("\r\n");
		createAndWriteFile(file22, sb22.toString());

		//create spring-context.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\resources\spring-context.xml
		File file23 = UtilsFile.findOrCreateFile(product_path+product_name+"\\src\\main\\resources\\spring-context.xml");
		StringBuilder sb23 = new StringBuilder();
		sb23.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\r\n");
		sb23.append("<!DOCTYPE beans PUBLIC \"-//SPRING//DTD BEAN//EN\" \"http://www.springframework.org/dtd/spring-beans.dtd\">").append("\r\n");
		sb23.append("<beans default-autowire=\"byName\" default-lazy-init=\"true\">").append("\r\n");
		sb23.append("    <import resource=\"classpath:spring-hibernate-db.xml\"/> ").append("\r\n");
		sb23.append("    <import resource=\"classpath:spring-component.xml\"/> ").append("\r\n");
		sb23.append("</beans>").append("\r\n");
		createAndWriteFile(file23, sb23.toString());

		//create spring-hibernate-db.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\resources\spring-hibernate-db.xml
		File file24 = UtilsFile.findOrCreateFile(product_path+product_name+"\\src\\main\\resources\\spring-hibernate-db.xml");
		StringBuilder sb24 = new StringBuilder();
		sb24.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\r\n");
		sb24.append("").append("\r\n");
		sb24.append("<beans default-autowire=\"byName\"").append("\r\n");
		sb24.append("    xmlns=\"http://www.springframework.org/schema/beans\"").append("\r\n");
		sb24.append("    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"").append("\r\n");
		sb24.append("    xmlns:aop=\"http://www.springframework.org/schema/aop\"").append("\r\n");
		sb24.append("    xmlns:tx=\"http://www.springframework.org/schema/tx\"").append("\r\n");
		sb24.append("    xmlns:context=\"http://www.springframework.org/schema/context\" ").append("\r\n");
		sb24.append("    xsi:schemaLocation=\" ").append("\r\n");
		sb24.append("    http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.2.xsd").append("\r\n");
		sb24.append("    http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx-3.2.xsd ").append("\r\n");
		sb24.append("    http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-3.2.xsd ").append("\r\n");
		sb24.append("    http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.2.xsd\">").append("\r\n");
		sb24.append("	<bean id=\"propertyConfigure\" class=\"com.qinghuainvest.cmndd.placeholder.EncryptPropertyPlaceholderConfigurer\">").append("\r\n");
		sb24.append("		<property name=\"locations\">").append("\r\n");
		sb24.append("			<list>").append("\r\n");
		sb24.append("				<value>classpath:jdbc.properties</value>").append("\r\n");
		sb24.append("			</list>").append("\r\n");
		sb24.append("		</property>").append("\r\n");
		sb24.append("		<!-- 需解密的属性列表 -->").append("\r\n");
		sb24.append("		<property name=\"encryptPropNames\" value=\"\"/>").append("\r\n");
		sb24.append("	</bean>").append("\r\n");
		sb24.append("	").append("\r\n");
		sb24.append("	<bean id=\"dataSourceDB\" class=\"com.mchange.v2.c3p0.ComboPooledDataSource\" destroy-method=\"close\">").append("\r\n");
		sb24.append("		<property name=\"driverClass\" value=\"${hibernate.connection.driver_class}\"/>").append("\r\n");
		sb24.append("		<property name=\"jdbcUrl\" value=\"${hibernate.db.connection.url}\"/>").append("\r\n");
		sb24.append("		<property name=\"user\" value=\"${hibernate.db.connection.username}\"/>").append("\r\n");
		sb24.append("		<property name=\"password\" value=\"${hibernate.db.connection.password}\"/>").append("\r\n");
		sb24.append("		<property name=\"minPoolSize\" value=\"1\"/>").append("\r\n");
		sb24.append("		<!-- 达到最大连接数后可以增加的连接个数  -->").append("\r\n");
		sb24.append("		<property name=\"acquireIncrement\" value=\"2\"/>").append("\r\n");
		sb24.append("		<property name=\"maxPoolSize\" value=\"3\"/>").append("\r\n");
		sb24.append("		<!-- 最大闲置时间 秒 -->").append("\r\n");
		sb24.append("		<property name=\"maxIdleTime\" value=\"600\"/>").append("\r\n");
		sb24.append("		<property name=\"maxStatements\" value=\"100\"/>").append("\r\n");
		sb24.append("		<!-- 闲置的连接测试周期 秒 -->").append("\r\n");
		sb24.append("		<property name=\"idleConnectionTestPeriod\" value=\"1200\"/>").append("\r\n");
		sb24.append("	</bean>").append("\r\n");
		sb24.append("	<bean id=\"sessionFactory\" class=\"org.springframework.orm.hibernate4.LocalSessionFactoryBean\">").append("\r\n");
		sb24.append("        <property name=\"dataSource\" ref=\"dataSourceDB\"/>").append("\r\n");
		sb24.append("        <property name=\"packagesToScan\" value=\"com.qinghuainvest.*.model\" />").append("\r\n");
		sb24.append("        <property name=\"mappingLocations\">").append("\r\n");
		sb24.append("            <list>").append("\r\n");
		sb24.append("                <value>classpath:spring-hibernate-type.xml</value>").append("\r\n");
		sb24.append("            </list>").append("\r\n");
		sb24.append("        </property>").append("\r\n");
		sb24.append("        <property name=\"hibernateProperties\">").append("\r\n");
		sb24.append("            <props>").append("\r\n");
		sb24.append("				<prop key=\"hibernate.dialect\">${hibernate.dialect}</prop>").append("\r\n");
		sb24.append("				<!--").append("\r\n");
		sb24.append("		    	<prop key=\"hibernate.hbm2ddl.auto\">true</prop> ").append("\r\n");
		sb24.append("				<prop key=\"hibernate.hbm2ddl.auto\">create</prop>").append("\r\n");
		sb24.append("				  -->").append("\r\n");
		sb24.append("				<prop key=\"hibernate.max_fetch_depth\">1</prop>").append("\r\n");
		sb24.append("				<prop key=\"hibernate.jdbc.fetch_size\">50</prop>").append("\r\n");
		sb24.append("				<prop key=\"hibernate.jdbc.batch_size\">20</prop>").append("\r\n");
		sb24.append("				<prop key=\"hibernate.jdbc.use_scrollable_resultset\">false</prop>").append("\r\n");
		sb24.append("				<prop key=\"hibernate.use_outer_join\">true</prop>").append("\r\n");
		sb24.append("				<prop key=\"hibernate.show_sql\">false</prop>").append("\r\n");
		sb24.append("				<prop key=\"hibernate.format_sql\">true</prop>").append("\r\n");
		sb24.append("				<prop key=\"hibernate.cache.use_query_cache\">true</prop>").append("\r\n");
		sb24.append("				<prop key=\"hibernate.connection.pool_size\">20</prop>").append("\r\n");
		sb24.append("				<prop key=\"hibernate.cache.region.factory_class\">org.hibernate.cache.ehcache.EhCacheRegionFactory</prop>").append("\r\n");
		sb24.append("				<prop key=\"hibernate.cache.provider_class\">net.sf.ehcache.hibernate.EhCacheProvider</prop>").append("\r\n");
		sb24.append("			</props>").append("\r\n");
		sb24.append("		</property>").append("\r\n");
		sb24.append("	</bean>").append("\r\n");
		sb24.append("	").append("\r\n");
		sb24.append("	<bean id=\"transactionManagerDB\" class=\"org.springframework.orm.hibernate4.HibernateTransactionManager\">").append("\r\n");
		sb24.append("		<property name=\"sessionFactory\" ref=\"sessionFactory\"/>").append("\r\n");
		sb24.append("	</bean>").append("\r\n");
		sb24.append("	").append("\r\n");
		sb24.append("	<bean id=\"cacheManager\"").append("\r\n");
		sb24.append("		class=\"org.springframework.cache.ehcache.EhCacheManagerFactoryBean\">").append("\r\n");
		sb24.append("		<property name=\"configLocation\">").append("\r\n");
		sb24.append("			<value>").append("\r\n");
		sb24.append("				classpath:ehcache.xml").append("\r\n");
		sb24.append("			</value>").append("\r\n");
		sb24.append("		</property>").append("\r\n");
		sb24.append("	</bean>").append("\r\n");
		sb24.append("	").append("\r\n");
		sb24.append("    <aop:config>         ").append("\r\n");
		sb24.append("        <aop:advisor pointcut=\"execution(* com.qinghuainvest.*.service.impl..*ServiceImpl.*(..))\" advice-ref=\"txAdviceDB\"/>").append("\r\n");
		sb24.append("    </aop:config>").append("\r\n");
		sb24.append("    ").append("\r\n");
		sb24.append("    <tx:advice id=\"txAdviceDB\" transaction-manager=\"transactionManagerDB\">").append("\r\n");
		sb24.append("        <tx:attributes>").append("\r\n");
		sb24.append("            <tx:method name=\"find*\" read-only=\"true\"/>").append("\r\n");
		sb24.append("            <tx:method name=\"get*\" read-only=\"true\"/>").append("\r\n");
		sb24.append("            <tx:method name=\"load*\" read-only=\"true\"/>").append("\r\n");
		sb24.append("            <tx:method name=\"query*\" read-only=\"true\"/>").append("\r\n");
		sb24.append("            <tx:method name=\"*\" rollback-for=\"Exception\"/>").append("\r\n");
		sb24.append("        </tx:attributes>").append("\r\n");
		sb24.append("    </tx:advice>").append("\r\n");
		sb24.append("    <!-- 声明式事务管理end -->").append("\r\n");
		sb24.append("</beans>").append("\r\n");
		createAndWriteFile(file24, sb24.toString());

		//create spring-mvc.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\resources\spring-mvc.xml
		File file25 = UtilsFile.findOrCreateFile(product_path+product_name+"\\src\\main\\resources\\spring-mvc.xml");
		StringBuilder sb25 = new StringBuilder();
		sb25.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\r\n");
		sb25.append("<beans xmlns=\"http://www.springframework.org/schema/beans\"").append("\r\n");
		sb25.append("	xmlns:p=\"http://www.springframework.org/schema/p\" xmlns:mvc=\"http://www.springframework.org/schema/mvc\"").append("\r\n");
		sb25.append("	xmlns:util=\"http://www.springframework.org/schema/util\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"").append("\r\n");
		sb25.append("	xmlns:context=\"http://www.springframework.org/schema/context\"").append("\r\n");
		sb25.append("	xsi:schemaLocation=\"").append("\r\n");
		sb25.append("	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.2.xsd").append("\r\n");
		sb25.append("    http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.2.xsd").append("\r\n");
		sb25.append("    http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-3.2.xsd\">").append("\r\n");
		sb25.append("	<context:component-scan base-package=\"com.qinghuainvest.*.web\" />").append("\r\n");
		sb25.append("	").append("\r\n");
		sb25.append("	 <!-- SpringMVC上传文件时，需要配置MultipartResolver处理器 --> ").append("\r\n");
		sb25.append("	 <bean id=\"multipartResolver\" class=\"org.springframework.web.multipart.commons.CommonsMultipartResolver\">").append("\r\n");
		sb25.append("	    <property name=\"defaultEncoding\" value=\"utf-8\" />").append("\r\n");
		sb25.append("	       <!-- ").append("\r\n");
		sb25.append("	       <property name=\"maxUploadSize\" value=\"10485760000\" />").append("\r\n");
		sb25.append("	       <property name=\"maxInMemorySize\" value=\"40960\" />").append("\r\n");
		sb25.append("	        -->").append("\r\n");
		sb25.append("	 </bean>").append("\r\n");
		sb25.append("	").append("\r\n");
		sb25.append("	<!-- 配置action中返回的视图配置 -->").append("\r\n");
		sb25.append("	<bean").append("\r\n");
		sb25.append("		class=\"org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver\">").append("\r\n");
		sb25.append("		<property name=\"suffix\" value=\".ftl\"></property>").append("\r\n");
		sb25.append("		<property name=\"viewClass\"").append("\r\n");
		sb25.append("			value=\"org.springframework.web.servlet.view.freemarker.FreeMarkerView\" />").append("\r\n");
		sb25.append("		<property name=\"contentType\" value=\"text/html;charset=utf-8\" />").append("\r\n");
		sb25.append("        <property name=\"requestContextAttribute\" value=\"rc\"/>").append("\r\n");
		sb25.append("		<property name=\"exposeRequestAttributes\" value=\"true\" />").append("\r\n");
		sb25.append("		<property name=\"exposeSessionAttributes\" value=\"true\" />").append("\r\n");
		sb25.append("		<property name=\"exposeSpringMacroHelpers\" value=\"true\" />").append("\r\n");
		sb25.append("	</bean>").append("\r\n");
		sb25.append("	<bean id=\"freemarkerConfigurer\"").append("\r\n");
		sb25.append("		class=\"org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer\">").append("\r\n");
		sb25.append("		<property name=\"templateLoaderPath\">").append("\r\n");
		sb25.append("			<value>/</value>").append("\r\n");
		sb25.append("		</property>").append("\r\n");
		sb25.append("	    <property name=\"freemarkerSettings\">  ").append("\r\n");
		sb25.append("	        <props>  ").append("\r\n");
		sb25.append("	            <prop key=\"defaultEncoding\">UTF-8</prop>  ").append("\r\n");
		sb25.append("	        </props>  ").append("\r\n");
		sb25.append("	    </property>  ").append("\r\n");
		sb25.append("	</bean>").append("\r\n");
		sb25.append("</beans>").append("\r\n");
		createAndWriteFile(file25, sb25.toString());

		//create webapp
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\webapp
		File file26 = new File(product_path+product_name+"\\src\\main\\webapp");
		if( !file26.exists()){
			file26.mkdirs();
		}
		//create index.jsp
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\webapp\index.jsp
		File file27 = UtilsFile.findOrCreateFile(product_path+product_name+"\\src\\main\\webapp\\index.jsp");
		StringBuilder sb27 = new StringBuilder();
		sb27.append("<html>").append("\r\n");
		sb27.append("<body>").append("\r\n");
		sb27.append("<h2>Hello World!</h2>").append("\r\n");
		sb27.append("</body>").append("\r\n");
		sb27.append("</html>").append("\r\n");
		createAndWriteFile(file27, sb27.toString());

		//create WEB-INF
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\webapp\WEB-INF
		File file28 = new File(product_path+product_name+"\\src\\main\\webapp\\WEB-INF");
		if( !file28.exists()){
			file28.mkdirs();
		}
		//create web.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\webapp\WEB-INF\web.xml
		File file29 = UtilsFile.findOrCreateFile(product_path+product_name+"\\src\\main\\webapp\\WEB-INF\\web.xml");
		StringBuilder sb29 = new StringBuilder();
		sb29.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\r\n");
		sb29.append("<web-app xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:web=\"http://xmlns.jcp.org/xml/ns/javaee\" xsi:schemaLocation=\"http://xmlns.jcp.org/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\">").append("\r\n");
		sb29.append("  <display-name>"+product_name+"</display-name>").append("\r\n");
		sb29.append("  ").append("\r\n");
		sb29.append("   <context-param>").append("\r\n");
		sb29.append("       <param-name>log4jConfigLocation</param-name>").append("\r\n");
		sb29.append("       <param-value>classpath:log4j.properties</param-value>").append("\r\n");
		sb29.append("   </context-param>").append("\r\n");
		sb29.append("   <context-param>").append("\r\n");
		sb29.append("   	   <param-name>webAppRootKey</param-name>").append("\r\n");
		sb29.append("	   <param-value>webapp."+product_name+"</param-value>").append("\r\n");
		sb29.append("   </context-param>").append("\r\n");
		sb29.append("	<listener>").append("\r\n");
		sb29.append("		<listener-class>org.springframework.web.util.Log4jConfigListener</listener-class>").append("\r\n");
		sb29.append("	</listener>").append("\r\n");
		sb29.append("	  ").append("\r\n");
		sb29.append("	<context-param>").append("\r\n");
		sb29.append("		<param-name>contextConfigLocation</param-name>").append("\r\n");
		sb29.append("		<param-value>").append("\r\n");
		sb29.append("			classpath*:spring-context.xml").append("\r\n");
		sb29.append("		</param-value>").append("\r\n");
		sb29.append("	</context-param>").append("\r\n");
		sb29.append("	<!--spring监听器的配置，用于在启动Web容器时，自动装配ApplicationContext的配置信息 -->").append("\r\n");
		sb29.append("	<listener>").append("\r\n");
		sb29.append("		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>").append("\r\n");
		sb29.append("	</listener>").append("\r\n");
		sb29.append("  ").append("\r\n");
		sb29.append("  	<!-- Spring刷新Interceptor防止内存泄漏 -->").append("\r\n");
		sb29.append("	<listener>").append("\r\n");
		sb29.append("		<listener-class>org.springframework.web.util.IntrospectorCleanupListener</listener-class>").append("\r\n");
		sb29.append("	</listener>").append("\r\n");
		sb29.append("	").append("\r\n");
		sb29.append("	<!-- spring过滤器乱码问题 -->").append("\r\n");
		sb29.append("	<filter>").append("\r\n");
		sb29.append("		<filter-name>encodingFilter</filter-name>").append("\r\n");
		sb29.append("		<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>").append("\r\n");
		sb29.append("		<init-param>").append("\r\n");
		sb29.append("			<param-name>encoding</param-name>").append("\r\n");
		sb29.append("			<param-value>UTF-8</param-value>").append("\r\n");
		sb29.append("		</init-param>").append("\r\n");
		sb29.append("		<init-param>").append("\r\n");
		sb29.append("			<param-name>forceEncoding</param-name>").append("\r\n");
		sb29.append("			<param-value>true</param-value>").append("\r\n");
		sb29.append("		</init-param>").append("\r\n");
		sb29.append("	</filter>").append("\r\n");
		sb29.append("	<filter-mapping>").append("\r\n");
		sb29.append("		<filter-name>encodingFilter</filter-name>").append("\r\n");
		sb29.append("		<url-pattern>/web/*</url-pattern>").append("\r\n");
		sb29.append("	</filter-mapping>").append("\r\n");
		sb29.append("	<filter>").append("\r\n");
		sb29.append("		<filter-name>openSessionInVieFilter</filter-name>").append("\r\n");
		sb29.append("		<filter-class>org.springframework.orm.hibernate4.support.OpenSessionInViewFilter</filter-class>").append("\r\n");
		sb29.append("	</filter>").append("\r\n");
		sb29.append("	<filter-mapping>").append("\r\n");
		sb29.append("		<filter-name>openSessionInVieFilter</filter-name>").append("\r\n");
		sb29.append("		<url-pattern>/web/*</url-pattern>").append("\r\n");
		sb29.append("	</filter-mapping> ").append("\r\n");
		sb29.append("	").append("\r\n");
		sb29.append("	").append("\r\n");
		sb29.append("	<!-- spring mvc servlet -->").append("\r\n");
		sb29.append("	<servlet>").append("\r\n");
		sb29.append("		<servlet-name>spring-mvc</servlet-name>").append("\r\n");
		sb29.append("		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>").append("\r\n");
		sb29.append("		<init-param>").append("\r\n");
		sb29.append("			<param-name>contextConfigLocation</param-name>").append("\r\n");
		sb29.append("			<param-value>classpath*:spring-mvc.xml</param-value>").append("\r\n");
		sb29.append("		</init-param>").append("\r\n");
		sb29.append("		<load-on-startup>1</load-on-startup>").append("\r\n");
		sb29.append("	</servlet>").append("\r\n");
		sb29.append("	<servlet-mapping>").append("\r\n");
		sb29.append("		<servlet-name>spring-mvc</servlet-name>").append("\r\n");
		sb29.append("		<url-pattern>/web/*</url-pattern>").append("\r\n");
		sb29.append("	</servlet-mapping>").append("\r\n");
		sb29.append("  ").append("\r\n");
		sb29.append("  	<!-- 配置session存在时间 -->").append("\r\n");
		sb29.append("	<session-config>").append("\r\n");
		sb29.append("		<session-timeout>480</session-timeout>").append("\r\n");
		sb29.append("	</session-config>").append("\r\n");
		sb29.append("  <welcome-file-list>").append("\r\n");
		sb29.append("    <welcome-file>index.jsp</welcome-file>").append("\r\n");
		sb29.append("  </welcome-file-list>").append("\r\n");
		sb29.append("  ").append("\r\n");
		sb29.append("  ").append("\r\n");
		sb29.append("  ").append("\r\n");
		sb29.append("  ").append("\r\n");
		sb29.append("  ").append("\r\n");
		sb29.append("</web-app>").append("\r\n");
		createAndWriteFile(file29, sb29.toString());

		//create test
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\test
		File file30 = new File(product_path+product_name+"\\src\\test");
		if( !file30.exists()){
			file30.mkdirs();
		}
		//create java
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\test\java
		File file31 = new File(product_path+product_name+"\\src\\test\\java");
		if( !file31.exists()){
			file31.mkdirs();
		}
		//create target
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target
		File file32 = new File(product_path+product_name+"\\target");
		if( !file32.exists()){
			file32.mkdirs();
		}
		//create classes
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\classes
		File file33 = new File(product_path+product_name+"\\target\\classes");
		if( !file33.exists()){
			file33.mkdirs();
		}
		//create com
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\classes\com
		File file34 = new File(product_path+product_name+"\\target\\classes\\com");
		if( !file34.exists()){
			file34.mkdirs();
		}
		//create qinghuainvest
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\classes\com\qinghuainvest
		File file35 = new File(product_path+product_name+"\\target\\classes\\com\\qinghuainvest");
		if( !file35.exists()){
			file35.mkdirs();
		}
		//create ehcache.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\classes\ehcache.xml
		File file36 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\classes\\ehcache.xml");
		StringBuilder sb36 = new StringBuilder();
		sb36.append("<ehcache>").append("\r\n");
		sb36.append("").append("\r\n");
		sb36.append("	<!-- Sets the path to the directory where cache .data files are created.").append("\r\n");
		sb36.append("").append("\r\n");
		sb36.append("			 If the path is a Java System Property it is replaced by").append("\r\n");
		sb36.append("			 its value in the running VM.").append("\r\n");
		sb36.append("").append("\r\n");
		sb36.append("			 The following properties are translated:").append("\r\n");
		sb36.append("			 user.home - User's home directory").append("\r\n");
		sb36.append("			 user.dir - User's current working directory").append("\r\n");
		sb36.append("			 java.io.tmpdir - Default temp file path -->").append("\r\n");
		sb36.append("	<diskStore path=\"user.dir\"/>").append("\r\n");
		sb36.append("").append("\r\n");
		sb36.append("").append("\r\n");
		sb36.append("	<!--Default Cache configuration. These will applied to caches programmatically created through").append("\r\n");
		sb36.append("			the CacheManager.").append("\r\n");
		sb36.append("").append("\r\n");
		sb36.append("			The following attributes are required:").append("\r\n");
		sb36.append("").append("\r\n");
		sb36.append("			maxElementsInMemory            - Sets the maximum number of objects that will be created in memory").append("\r\n");
		sb36.append("			eternal                        - Sets whether elements are eternal. If eternal,  timeouts are ignored and the").append("\r\n");
		sb36.append("											 element is never expired.").append("\r\n");
		sb36.append("			overflowToDisk                 - Sets whether elements can overflow to disk when the in-memory cache").append("\r\n");
		sb36.append("											 has reached the maxInMemory limit.").append("\r\n");
		sb36.append("").append("\r\n");
		sb36.append("			The following attributes are optional:").append("\r\n");
		sb36.append("			timeToIdleSeconds              - Sets the time to idle for an element before it expires.").append("\r\n");
		sb36.append("											 i.e. The maximum amount of time between accesses before an element expires").append("\r\n");
		sb36.append("											 Is only used if the element is not eternal.").append("\r\n");
		sb36.append("											 Optional attribute. A value of 0 means that an Element can idle for infinity.").append("\r\n");
		sb36.append("											 The default value is 0.").append("\r\n");
		sb36.append("			timeToLiveSeconds              - Sets the time to live for an element before it expires.").append("\r\n");
		sb36.append("											 i.e. The maximum time between creation time and when an element expires.").append("\r\n");
		sb36.append("											 Is only used if the element is not eternal.").append("\r\n");
		sb36.append("											 Optional attribute. A value of 0 means that and Element can live for infinity.").append("\r\n");
		sb36.append("											 The default value is 0.").append("\r\n");
		sb36.append("			diskPersistent                 - Whether the disk store persists between restarts of the Virtual Machine.").append("\r\n");
		sb36.append("											 The default value is false.").append("\r\n");
		sb36.append("			diskExpiryThreadIntervalSeconds- The number of seconds between runs of the disk expiry thread. The default value").append("\r\n");
		sb36.append("											 is 120 seconds.").append("\r\n");
		sb36.append("			-->").append("\r\n");
		sb36.append("").append("\r\n");
		sb36.append("	<defaultCache").append("\r\n");
		sb36.append("			maxElementsInMemory=\"10000\"").append("\r\n");
		sb36.append("			eternal=\"false\"").append("\r\n");
		sb36.append("			overflowToDisk=\"false\"").append("\r\n");
		sb36.append("			timeToIdleSeconds=\"0\"").append("\r\n");
		sb36.append("			timeToLiveSeconds=\"0\"/>").append("\r\n");
		sb36.append("	").append("\r\n");
		sb36.append("</ehcache>").append("\r\n");
		createAndWriteFile(file36, sb36.toString());

		//create jdbc.properties
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\classes\jdbc.properties
		File file37 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\classes\\jdbc.properties");
		StringBuilder sb37 = new StringBuilder();
		sb37.append("#mysql").append("\r\n");
		sb37.append("hibernate.dialect=org.hibernate.dialect.MySQLDialect").append("\r\n");
		sb37.append("hibernate.connection.driver_class=com.mysql.jdbc.Driver").append("\r\n");
		sb37.append("hibernate.db.connection.url=jdbc:mysql://127.0.0.1:3306/qdjt_jydb1?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull").append("\r\n");
		sb37.append("hibernate.db.connection.username=root").append("\r\n");
		sb37.append("hibernate.db.connection.password=hp64123456").append("\r\n");
		sb37.append("").append("\r\n");
		createAndWriteFile(file37, sb37.toString());

		//create log4j.properties
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\classes\log4j.properties
		File file38 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\classes\\log4j.properties");
		StringBuilder sb38 = new StringBuilder();
		sb38.append("log4j.rootLogger=ERROR,DAY_ROLLING_FILE,stdout").append("\r\n");
		sb38.append("### direct log messages to stdout ###").append("\r\n");
		sb38.append("log4j.appender.stdout=org.apache.log4j.ConsoleAppender").append("\r\n");
		sb38.append("log4j.appender.stdout.layout=org.apache.log4j.PatternLayout").append("\r\n");
		sb38.append("#log4j.appender.stdout.layout.ConversionPattern=%-d{HH:mm:ss} %-5p [%c{1}] %M (line:%L) %m%n").append("\r\n");
		sb38.append("log4j.appender.stdout.layout.ConversionPattern=%d %p [%c:%L] - %m%n").append("\r\n");
		sb38.append("").append("\r\n");
		sb38.append("log4j.logger.org.hibernate.type=INFO").append("\r\n");
		sb38.append("log4j.logger.java.sql=DEBUG").append("\r\n");
		sb38.append("log4j.logger.com.qinghuainvest=INFO").append("\r\n");
		sb38.append("log4j.logger.org.hibernate=ERROR").append("\r\n");
		sb38.append("log4j.logger.org.springframework=INFO").append("\r\n");
		sb38.append("").append("\r\n");
		sb38.append("########################").append("\r\n");
		sb38.append("# Rolling File").append("\r\n");
		sb38.append("########################").append("\r\n");
		sb38.append("log4j.appender.ROLLING_FILE=org.apache.log4j.RollingFileAppender").append("\r\n");
		sb38.append("log4j.appender.ROLLING_FILE.Threshold=DEBUG").append("\r\n");
		sb38.append("log4j.appender.ROLLING_FILE.File=broker.log").append("\r\n");
		sb38.append("log4j.appender.ROLLING_FILE.Append=true").append("\r\n");
		sb38.append("log4j.appender.ROLLING_FILE.MaxFileSize=10240KB").append("\r\n");
		sb38.append("log4j.appender.ROLLING_FILE.MaxBackupIndex=20").append("\r\n");
		sb38.append("log4j.appender.ROLLING_FILE.layout=org.apache.log4j.PatternLayout").append("\r\n");
		sb38.append("log4j.appender.ROLLING_FILE.layout.ConversionPattern=[%d %t %c] %m%n").append("\r\n");
		sb38.append("").append("\r\n");
		sb38.append("########################").append("\r\n");
		sb38.append("# Daily Rolling File \u65E5\u5FD7\u8F93\u51FA\u5230\u6587\u4EF6\uFF0C${catalina.home}\u53EF\u4EE5\u7528\u5176\u4ED6\u8DEF\u5F84\u4EE3\u66FF").append("\r\n");
		sb38.append("########################").append("\r\n");
		sb38.append("log4j.appender.DAY_ROLLING_FILE=org.apache.log4j.DailyRollingFileAppender").append("\r\n");
		sb38.append("log4j.appender.DAY_ROLLING_FILE.File=${catalina.home}/logs/{huage_product_name}").append("\r\n");
		sb38.append("#websphere ").append("\r\n");
		sb38.append("##log4j.appender.DAY_ROLLING_FILE.File=${SERVER_LOG_ROOT}/logs/lhh-utils").append("\r\n");
		sb38.append("log4j.appender.DAY_ROLLING_FILE.DatePattern='_'yyyy-MM-dd'.log'").append("\r\n");
		sb38.append("log4j.appender.DAY_ROLLING_FILE.layout=org.apache.log4j.PatternLayout").append("\r\n");
		sb38.append("log4j.appender.DAY_ROLLING_FILE.layout.ConversionPattern=%d{HH:mm:ss} %-5p [%C] (%F:%L) - %m%n").append("\r\n");
		createAndWriteFile(file38, sb38.toString());

		//create spring-component.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\classes\spring-component.xml
		File file39 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\classes\\spring-component.xml");
		StringBuilder sb39 = new StringBuilder();
		sb39.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\r\n");
		sb39.append("<beans xmlns=\"http://www.springframework.org/schema/beans\"").append("\r\n");
		sb39.append("	xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:context=\"http://www.springframework.org/schema/context\"").append("\r\n");
		sb39.append("	xmlns:task=\"http://www.springframework.org/schema/task\"").append("\r\n");
		sb39.append("	xsi:schemaLocation=\"http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.2.xsd").append("\r\n");
		sb39.append("			http://www.springframework.org/schema/task http://www.springframework.org/schema/task/spring-task-3.2.xsd").append("\r\n");
		sb39.append("            http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.2.xsd\">").append("\r\n");
		sb39.append("	<context:component-scan base-package=\"com.qinghuainvest.*\" />").append("\r\n");
		sb39.append("	<task:annotation-driven />").append("\r\n");
		sb39.append("</beans>").append("\r\n");
		createAndWriteFile(file39, sb39.toString());

		//create spring-context.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\classes\spring-context.xml
		File file40 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\classes\\spring-context.xml");
		StringBuilder sb40 = new StringBuilder();
		sb40.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\r\n");
		sb40.append("<!DOCTYPE beans PUBLIC \"-//SPRING//DTD BEAN//EN\" \"http://www.springframework.org/dtd/spring-beans.dtd\">").append("\r\n");
		sb40.append("<beans default-autowire=\"byName\" default-lazy-init=\"true\">").append("\r\n");
		sb40.append("    <import resource=\"classpath:spring-hibernate-db.xml\"/> ").append("\r\n");
		sb40.append("    <import resource=\"classpath:spring-component.xml\"/> ").append("\r\n");
		sb40.append("</beans>").append("\r\n");
		createAndWriteFile(file40, sb40.toString());

		//create spring-hibernate-db.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\classes\spring-hibernate-db.xml
		File file41 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\classes\\spring-hibernate-db.xml");
		StringBuilder sb41 = new StringBuilder();
		sb41.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\r\n");
		sb41.append("").append("\r\n");
		sb41.append("<beans default-autowire=\"byName\"").append("\r\n");
		sb41.append("    xmlns=\"http://www.springframework.org/schema/beans\"").append("\r\n");
		sb41.append("    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"").append("\r\n");
		sb41.append("    xmlns:aop=\"http://www.springframework.org/schema/aop\"").append("\r\n");
		sb41.append("    xmlns:tx=\"http://www.springframework.org/schema/tx\"").append("\r\n");
		sb41.append("    xmlns:context=\"http://www.springframework.org/schema/context\" ").append("\r\n");
		sb41.append("    xsi:schemaLocation=\" ").append("\r\n");
		sb41.append("    http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.2.xsd").append("\r\n");
		sb41.append("    http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx-3.2.xsd ").append("\r\n");
		sb41.append("    http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-3.2.xsd ").append("\r\n");
		sb41.append("    http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.2.xsd\">").append("\r\n");
		sb41.append("	<bean id=\"propertyConfigure\" class=\"com.qinghuainvest.cmndd.placeholder.EncryptPropertyPlaceholderConfigurer\">").append("\r\n");
		sb41.append("		<property name=\"locations\">").append("\r\n");
		sb41.append("			<list>").append("\r\n");
		sb41.append("				<value>classpath:jdbc.properties</value>").append("\r\n");
		sb41.append("			</list>").append("\r\n");
		sb41.append("		</property>").append("\r\n");
		sb41.append("		<!-- 需解密的属性列表 -->").append("\r\n");
		sb41.append("		<property name=\"encryptPropNames\" value=\"\"/>").append("\r\n");
		sb41.append("	</bean>").append("\r\n");
		sb41.append("	").append("\r\n");
		sb41.append("	<bean id=\"dataSourceDB\" class=\"com.mchange.v2.c3p0.ComboPooledDataSource\" destroy-method=\"close\">").append("\r\n");
		sb41.append("		<property name=\"driverClass\" value=\"${hibernate.connection.driver_class}\"/>").append("\r\n");
		sb41.append("		<property name=\"jdbcUrl\" value=\"${hibernate.db.connection.url}\"/>").append("\r\n");
		sb41.append("		<property name=\"user\" value=\"${hibernate.db.connection.username}\"/>").append("\r\n");
		sb41.append("		<property name=\"password\" value=\"${hibernate.db.connection.password}\"/>").append("\r\n");
		sb41.append("		<property name=\"minPoolSize\" value=\"1\"/>").append("\r\n");
		sb41.append("		<!-- 达到最大连接数后可以增加的连接个数  -->").append("\r\n");
		sb41.append("		<property name=\"acquireIncrement\" value=\"2\"/>").append("\r\n");
		sb41.append("		<property name=\"maxPoolSize\" value=\"3\"/>").append("\r\n");
		sb41.append("		<!-- 最大闲置时间 秒 -->").append("\r\n");
		sb41.append("		<property name=\"maxIdleTime\" value=\"600\"/>").append("\r\n");
		sb41.append("		<property name=\"maxStatements\" value=\"100\"/>").append("\r\n");
		sb41.append("		<!-- 闲置的连接测试周期 秒 -->").append("\r\n");
		sb41.append("		<property name=\"idleConnectionTestPeriod\" value=\"1200\"/>").append("\r\n");
		sb41.append("	</bean>").append("\r\n");
		sb41.append("	<bean id=\"sessionFactory\" class=\"org.springframework.orm.hibernate4.LocalSessionFactoryBean\">").append("\r\n");
		sb41.append("        <property name=\"dataSource\" ref=\"dataSourceDB\"/>").append("\r\n");
		sb41.append("        <property name=\"packagesToScan\" value=\"com.qinghuainvest.*.model\" />").append("\r\n");
		sb41.append("        <property name=\"mappingLocations\">").append("\r\n");
		sb41.append("            <list>").append("\r\n");
		sb41.append("                <value>classpath:spring-hibernate-type.xml</value>").append("\r\n");
		sb41.append("            </list>").append("\r\n");
		sb41.append("        </property>").append("\r\n");
		sb41.append("        <property name=\"hibernateProperties\">").append("\r\n");
		sb41.append("            <props>").append("\r\n");
		sb41.append("				<prop key=\"hibernate.dialect\">${hibernate.dialect}</prop>").append("\r\n");
		sb41.append("				<!--").append("\r\n");
		sb41.append("		    	<prop key=\"hibernate.hbm2ddl.auto\">true</prop> ").append("\r\n");
		sb41.append("				<prop key=\"hibernate.hbm2ddl.auto\">create</prop>").append("\r\n");
		sb41.append("				  -->").append("\r\n");
		sb41.append("				<prop key=\"hibernate.max_fetch_depth\">1</prop>").append("\r\n");
		sb41.append("				<prop key=\"hibernate.jdbc.fetch_size\">50</prop>").append("\r\n");
		sb41.append("				<prop key=\"hibernate.jdbc.batch_size\">20</prop>").append("\r\n");
		sb41.append("				<prop key=\"hibernate.jdbc.use_scrollable_resultset\">false</prop>").append("\r\n");
		sb41.append("				<prop key=\"hibernate.use_outer_join\">true</prop>").append("\r\n");
		sb41.append("				<prop key=\"hibernate.show_sql\">false</prop>").append("\r\n");
		sb41.append("				<prop key=\"hibernate.format_sql\">true</prop>").append("\r\n");
		sb41.append("				<prop key=\"hibernate.cache.use_query_cache\">true</prop>").append("\r\n");
		sb41.append("				<prop key=\"hibernate.connection.pool_size\">20</prop>").append("\r\n");
		sb41.append("				<prop key=\"hibernate.cache.region.factory_class\">org.hibernate.cache.ehcache.EhCacheRegionFactory</prop>").append("\r\n");
		sb41.append("				<prop key=\"hibernate.cache.provider_class\">net.sf.ehcache.hibernate.EhCacheProvider</prop>").append("\r\n");
		sb41.append("			</props>").append("\r\n");
		sb41.append("		</property>").append("\r\n");
		sb41.append("	</bean>").append("\r\n");
		sb41.append("	").append("\r\n");
		sb41.append("	<bean id=\"transactionManagerDB\" class=\"org.springframework.orm.hibernate4.HibernateTransactionManager\">").append("\r\n");
		sb41.append("		<property name=\"sessionFactory\" ref=\"sessionFactory\"/>").append("\r\n");
		sb41.append("	</bean>").append("\r\n");
		sb41.append("	").append("\r\n");
		sb41.append("	<bean id=\"cacheManager\"").append("\r\n");
		sb41.append("		class=\"org.springframework.cache.ehcache.EhCacheManagerFactoryBean\">").append("\r\n");
		sb41.append("		<property name=\"configLocation\">").append("\r\n");
		sb41.append("			<value>").append("\r\n");
		sb41.append("				classpath:ehcache.xml").append("\r\n");
		sb41.append("			</value>").append("\r\n");
		sb41.append("		</property>").append("\r\n");
		sb41.append("	</bean>").append("\r\n");
		sb41.append("	").append("\r\n");
		sb41.append("    <aop:config>         ").append("\r\n");
		sb41.append("        <aop:advisor pointcut=\"execution(* com.qinghuainvest.*.service.impl..*ServiceImpl.*(..))\" advice-ref=\"txAdviceDB\"/>").append("\r\n");
		sb41.append("    </aop:config>").append("\r\n");
		sb41.append("    ").append("\r\n");
		sb41.append("    <tx:advice id=\"txAdviceDB\" transaction-manager=\"transactionManagerDB\">").append("\r\n");
		sb41.append("        <tx:attributes>").append("\r\n");
		sb41.append("            <tx:method name=\"find*\" read-only=\"true\"/>").append("\r\n");
		sb41.append("            <tx:method name=\"get*\" read-only=\"true\"/>").append("\r\n");
		sb41.append("            <tx:method name=\"load*\" read-only=\"true\"/>").append("\r\n");
		sb41.append("            <tx:method name=\"query*\" read-only=\"true\"/>").append("\r\n");
		sb41.append("            <tx:method name=\"*\" rollback-for=\"Exception\"/>").append("\r\n");
		sb41.append("        </tx:attributes>").append("\r\n");
		sb41.append("    </tx:advice>").append("\r\n");
		sb41.append("    <!-- 声明式事务管理end -->").append("\r\n");
		sb41.append("</beans>").append("\r\n");
		createAndWriteFile(file41, sb41.toString());

		//create spring-mvc.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\classes\spring-mvc.xml
		File file42 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\classes\\spring-mvc.xml");
		StringBuilder sb42 = new StringBuilder();
		sb42.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\r\n");
		sb42.append("<beans xmlns=\"http://www.springframework.org/schema/beans\"").append("\r\n");
		sb42.append("	xmlns:p=\"http://www.springframework.org/schema/p\" xmlns:mvc=\"http://www.springframework.org/schema/mvc\"").append("\r\n");
		sb42.append("	xmlns:util=\"http://www.springframework.org/schema/util\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"").append("\r\n");
		sb42.append("	xmlns:context=\"http://www.springframework.org/schema/context\"").append("\r\n");
		sb42.append("	xsi:schemaLocation=\"").append("\r\n");
		sb42.append("	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.2.xsd").append("\r\n");
		sb42.append("    http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.2.xsd").append("\r\n");
		sb42.append("    http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-3.2.xsd\">").append("\r\n");
		sb42.append("	<context:component-scan base-package=\"com.qinghuainvest.*.web\" />").append("\r\n");
		sb42.append("	").append("\r\n");
		sb42.append("	 <!-- SpringMVC上传文件时，需要配置MultipartResolver处理器 --> ").append("\r\n");
		sb42.append("	 <bean id=\"multipartResolver\" class=\"org.springframework.web.multipart.commons.CommonsMultipartResolver\">").append("\r\n");
		sb42.append("	    <property name=\"defaultEncoding\" value=\"utf-8\" />").append("\r\n");
		sb42.append("	       <!-- ").append("\r\n");
		sb42.append("	       <property name=\"maxUploadSize\" value=\"10485760000\" />").append("\r\n");
		sb42.append("	       <property name=\"maxInMemorySize\" value=\"40960\" />").append("\r\n");
		sb42.append("	        -->").append("\r\n");
		sb42.append("	 </bean>").append("\r\n");
		sb42.append("	").append("\r\n");
		sb42.append("	<!-- 配置action中返回的视图配置 -->").append("\r\n");
		sb42.append("	<bean").append("\r\n");
		sb42.append("		class=\"org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver\">").append("\r\n");
		sb42.append("		<property name=\"suffix\" value=\".ftl\"></property>").append("\r\n");
		sb42.append("		<property name=\"viewClass\"").append("\r\n");
		sb42.append("			value=\"org.springframework.web.servlet.view.freemarker.FreeMarkerView\" />").append("\r\n");
		sb42.append("		<property name=\"contentType\" value=\"text/html;charset=utf-8\" />").append("\r\n");
		sb42.append("        <property name=\"requestContextAttribute\" value=\"rc\"/>").append("\r\n");
		sb42.append("		<property name=\"exposeRequestAttributes\" value=\"true\" />").append("\r\n");
		sb42.append("		<property name=\"exposeSessionAttributes\" value=\"true\" />").append("\r\n");
		sb42.append("		<property name=\"exposeSpringMacroHelpers\" value=\"true\" />").append("\r\n");
		sb42.append("	</bean>").append("\r\n");
		sb42.append("	<bean id=\"freemarkerConfigurer\"").append("\r\n");
		sb42.append("		class=\"org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer\">").append("\r\n");
		sb42.append("		<property name=\"templateLoaderPath\">").append("\r\n");
		sb42.append("			<value>/</value>").append("\r\n");
		sb42.append("		</property>").append("\r\n");
		sb42.append("	    <property name=\"freemarkerSettings\">  ").append("\r\n");
		sb42.append("	        <props>  ").append("\r\n");
		sb42.append("	            <prop key=\"defaultEncoding\">UTF-8</prop>  ").append("\r\n");
		sb42.append("	        </props>  ").append("\r\n");
		sb42.append("	    </property>  ").append("\r\n");
		sb42.append("	</bean>").append("\r\n");
		sb42.append("</beans>").append("\r\n");
		createAndWriteFile(file42, sb42.toString());

		//create m2e-wtp
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp
		File file43 = new File(product_path+product_name+"\\target\\m2e-wtp");
		if( !file43.exists()){
			file43.mkdirs();
		}
		//create web-resources
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources
		File file44 = new File(product_path+product_name+"\\target\\m2e-wtp\\web-resources");
		if( !file44.exists()){
			file44.mkdirs();
		}
		//create META-INF
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF
		File file45 = new File(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF");
		if( !file45.exists()){
			file45.mkdirs();
		}
		//create MANIFEST.MF
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\MANIFEST.MF
		File file46 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\MANIFEST.MF");
		StringBuilder sb46 = new StringBuilder();
		sb46.append("Manifest-Version: 1.0").append("\r\n");
		sb46.append("Build-Jdk: 1.7.0_51").append("\r\n");
		sb46.append("Built-By: huage").append("\r\n");
		sb46.append("Created-By: Maven Integration for Eclipse").append("\r\n");
		sb46.append("").append("\r\n");
		createAndWriteFile(file46, sb46.toString());

		//create maven
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\maven
		File file47 = new File(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\maven");
		if( !file47.exists()){
			file47.mkdirs();
		}
		//create com
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\maven\com
		File file48 = new File(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\maven\\com");
		if( !file48.exists()){
			file48.mkdirs();
		}
		//create {huage_product_name}
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\maven\com\{huage_product_name}
		File file49 = new File(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\maven\\com\\{huage_product_name}");
		if( !file49.exists()){
			file49.mkdirs();
		}
		//create pom.properties
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\maven\com\{huage_product_name}\pom.properties
		File file50 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\maven\\com\\{huage_product_name}\\pom.properties");
		StringBuilder sb50 = new StringBuilder();
		sb50.append("#Generated by Maven Integration for Eclipse").append("\r\n");
		sb50.append("#Sat Aug 06 16:01:18 CST 2016").append("\r\n");
		sb50.append("version=0.0.1-SNAPSHOT").append("\r\n");
		sb50.append("groupId=com").append("\r\n");
		sb50.append("m2e.projectName={huage_product_name}").append("\r\n");
		sb50.append("m2e.projectLocation=D\\:\\Workspace\\eclipse\\eclipse-birt-2.2.0\\workspace\\{huage_product_name}").append("\r\n");
		sb50.append("artifactId={huage_product_name}").append("\r\n");
		createAndWriteFile(file50, sb50.toString());

		//create pom.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\maven\com\{huage_product_name}\pom.xml
		File file51 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\maven\\com\\{huage_product_name}\\pom.xml");
		StringBuilder sb51 = new StringBuilder();
		sb51.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"").append("\r\n");
		sb51.append("  xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd\">").append("\r\n");
		sb51.append("  <modelVersion>4.0.0</modelVersion>").append("\r\n");
		sb51.append("  <groupId>com</groupId>").append("\r\n");
		sb51.append("  <artifactId>{huage_product_name}</artifactId>").append("\r\n");
		sb51.append("  <packaging>war</packaging>").append("\r\n");
		sb51.append("  <version>0.0.1-SNAPSHOT</version>").append("\r\n");
		sb51.append("  <name>{huage_product_name} Maven Webapp</name>").append("\r\n");
		sb51.append("  <url>http://maven.apache.org</url>").append("\r\n");
		sb51.append("  <dependencies>").append("\r\n");
		sb51.append("    <dependency>").append("\r\n");
		sb51.append("      <groupId>junit</groupId>").append("\r\n");
		sb51.append("      <artifactId>junit</artifactId>").append("\r\n");
		sb51.append("      <version>3.8.1</version>").append("\r\n");
		sb51.append("      <scope>test</scope>").append("\r\n");
		sb51.append("    </dependency>").append("\r\n");
		sb51.append("    ").append("\r\n");
		sb51.append("    <dependency>").append("\r\n");
		sb51.append("    	<groupId>org.freemarker</groupId>").append("\r\n");
		sb51.append("    	<artifactId>freemarker</artifactId>").append("\r\n");
		sb51.append("    	<version>2.3.20</version>").append("\r\n");
		sb51.append("    </dependency>").append("\r\n");
		sb51.append("    ").append("\r\n");
		sb51.append("    <dependency>").append("\r\n");
		sb51.append("		<groupId>javax.servlet</groupId>").append("\r\n");
		sb51.append("		<artifactId>servlet-api</artifactId>").append("\r\n");
		sb51.append("		<version>2.5</version>").append("\r\n");
		sb51.append("		<scope>provided</scope>").append("\r\n");
		sb51.append("	</dependency>").append("\r\n");
		sb51.append("	<dependency>").append("\r\n");
		sb51.append("		<groupId>commons-httpclient</groupId>").append("\r\n");
		sb51.append("		<artifactId>commons-httpclient</artifactId>").append("\r\n");
		sb51.append("		<version>3.1</version>").append("\r\n");
		sb51.append("	</dependency>").append("\r\n");
		sb51.append("	").append("\r\n");
		sb51.append("	<dependency>").append("\r\n");
		sb51.append("		<groupId>org.apache.httpcomponents</groupId>").append("\r\n");
		sb51.append("		<artifactId>httpclient</artifactId>").append("\r\n");
		sb51.append("		<version>4.4</version>").append("\r\n");
		sb51.append("	</dependency>").append("\r\n");
		sb51.append("	").append("\r\n");
		sb51.append("  </dependencies>").append("\r\n");
		sb51.append("  <build>").append("\r\n");
		sb51.append("	  <plugins>").append("\r\n");
		sb51.append("	       <plugin>").append("\r\n");
		sb51.append("	           <groupId>org.apache.maven.plugins</groupId>").append("\r\n");
		sb51.append("	           <artifactId>maven-surefire-plugin</artifactId>").append("\r\n");
		sb51.append("	           <configuration>").append("\r\n");
		sb51.append("	               <skip>true</skip>").append("\r\n");
		sb51.append("	           </configuration>").append("\r\n");
		sb51.append("	       </plugin>").append("\r\n");
		sb51.append("	   </plugins>").append("\r\n");
		sb51.append("    <finalName>{huage_product_name}</finalName>").append("\r\n");
		sb51.append("  </build>").append("\r\n");
		sb51.append("</project>").append("\r\n");
		createAndWriteFile(file51, sb51.toString());

		//create {huage_product_name}
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\maven\com\{huage_product_name}
		File file52 = new File(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\maven\\com\\{huage_product_name}");
		if( !file52.exists()){
			file52.mkdirs();
		}
		//create pom.properties
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\maven\com\{huage_product_name}\pom.properties
		File file53 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\maven\\com\\{huage_product_name}\\pom.properties");
		StringBuilder sb53 = new StringBuilder();
		sb53.append("#Generated by Maven Integration for Eclipse").append("\r\n");
		sb53.append("#Sat Aug 06 10:19:33 CST 2016").append("\r\n");
		sb53.append("version=0.0.1-SNAPSHOT").append("\r\n");
		sb53.append("groupId=com").append("\r\n");
		sb53.append("m2e.projectName={huage_product_name}").append("\r\n");
		sb53.append("m2e.projectLocation=D\\:\\Workspace\\eclipse\\eclipse-birt-2.2.0\\workspace\\{huage_product_name}").append("\r\n");
		sb53.append("artifactId={huage_product_name}").append("\r\n");
		createAndWriteFile(file53, sb53.toString());

		//create pom.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\maven\com\{huage_product_name}\pom.xml
		File file54 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\maven\\com\\{huage_product_name}\\pom.xml");
		StringBuilder sb54 = new StringBuilder();
		sb54.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"").append("\r\n");
		sb54.append("  xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd\">").append("\r\n");
		sb54.append("  <modelVersion>4.0.0</modelVersion>").append("\r\n");
		sb54.append("  <groupId>com</groupId>").append("\r\n");
		sb54.append("  <artifactId>{huage_product_name}</artifactId>").append("\r\n");
		sb54.append("  <packaging>war</packaging>").append("\r\n");
		sb54.append("  <version>0.0.1-SNAPSHOT</version>").append("\r\n");
		sb54.append("  <name>{huage_product_name} Maven Webapp</name>").append("\r\n");
		sb54.append("  <url>http://maven.apache.org</url>").append("\r\n");
		sb54.append("  <dependencies>").append("\r\n");
		sb54.append("    <dependency>").append("\r\n");
		sb54.append("      <groupId>junit</groupId>").append("\r\n");
		sb54.append("      <artifactId>junit</artifactId>").append("\r\n");
		sb54.append("      <version>3.8.1</version>").append("\r\n");
		sb54.append("      <scope>test</scope>").append("\r\n");
		sb54.append("    </dependency>").append("\r\n");
		sb54.append("    ").append("\r\n");
		sb54.append("    <dependency>").append("\r\n");
		sb54.append("    	<groupId>org.freemarker</groupId>").append("\r\n");
		sb54.append("    	<artifactId>freemarker</artifactId>").append("\r\n");
		sb54.append("    	<version>2.3.20</version>").append("\r\n");
		sb54.append("    </dependency>").append("\r\n");
		sb54.append("    ").append("\r\n");
		sb54.append("    <dependency>").append("\r\n");
		sb54.append("		<groupId>javax.servlet</groupId>").append("\r\n");
		sb54.append("		<artifactId>servlet-api</artifactId>").append("\r\n");
		sb54.append("		<version>2.5</version>").append("\r\n");
		sb54.append("		<scope>provided</scope>").append("\r\n");
		sb54.append("	</dependency>").append("\r\n");
		sb54.append("	<dependency>").append("\r\n");
		sb54.append("		<groupId>commons-httpclient</groupId>").append("\r\n");
		sb54.append("		<artifactId>commons-httpclient</artifactId>").append("\r\n");
		sb54.append("		<version>3.1</version>").append("\r\n");
		sb54.append("	</dependency>").append("\r\n");
		sb54.append("	").append("\r\n");
		sb54.append("	<dependency>").append("\r\n");
		sb54.append("		<groupId>org.apache.httpcomponents</groupId>").append("\r\n");
		sb54.append("		<artifactId>httpclient</artifactId>").append("\r\n");
		sb54.append("		<version>4.4</version>").append("\r\n");
		sb54.append("	</dependency>").append("\r\n");
		sb54.append("	").append("\r\n");
		sb54.append("  </dependencies>").append("\r\n");
		sb54.append("  <build>").append("\r\n");
		sb54.append("	  <plugins>").append("\r\n");
		sb54.append("	       <plugin>").append("\r\n");
		sb54.append("	           <groupId>org.apache.maven.plugins</groupId>").append("\r\n");
		sb54.append("	           <artifactId>maven-surefire-plugin</artifactId>").append("\r\n");
		sb54.append("	           <configuration>").append("\r\n");
		sb54.append("	               <skip>true</skip>").append("\r\n");
		sb54.append("	           </configuration>").append("\r\n");
		sb54.append("	       </plugin>").append("\r\n");
		sb54.append("	   </plugins>").append("\r\n");
		sb54.append("    <finalName>{huage_product_name}</finalName>").append("\r\n");
		sb54.append("  </build>").append("\r\n");
		sb54.append("</project>").append("\r\n");
		createAndWriteFile(file54, sb54.toString());

		//create test-classes
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\test-classes
		File file55 = new File(product_path+product_name+"\\target\\test-classes");
		if( !file55.exists()){
			file55.mkdirs();
		}
	}
}