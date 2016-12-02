package com.hwaggLee.create.product;

import java.io.File;

import com.base.model.BaseException;
import com.base.utils.UtilsFile;


/**
 * 指定项目名称生成项目
 * @author huage
 *
 */
public class StartCreateMavenProduct extends CreateProduct{
	
	public StartCreateMavenProduct(String productname){
		super(productname);
	}


	public static void main(String[] args) throws Exception{
		String product_name = "tsportal_yxt1";
		String product_path = "D:\\Workspace\\eclipse\\eclipse-birt-2.2.0\\workspace\\";
		StartCreateMavenProduct p = new StartCreateMavenProduct(product_name);
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
		sb12.append("  </dependencies>").append("\r\n");
		sb12.append("  <build>").append("\r\n");
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
		//create resources
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\resources
		File file16 = new File(product_path+product_name+"\\src\\main\\resources");
		if( !file16.exists()){
			file16.mkdirs();
		}
		//create webapp
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\webapp
		File file17 = new File(product_path+product_name+"\\src\\main\\webapp");
		if( !file17.exists()){
			file17.mkdirs();
		}
		//create index.jsp
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\webapp\index.jsp
		File file18 = UtilsFile.findOrCreateFile(product_path+product_name+"\\src\\main\\webapp\\index.jsp");
		StringBuilder sb18 = new StringBuilder();
		sb18.append("<html>").append("\r\n");
		sb18.append("<body>").append("\r\n");
		sb18.append("<h2>Hello World!</h2>").append("\r\n");
		sb18.append("</body>").append("\r\n");
		sb18.append("</html>").append("\r\n");
		createAndWriteFile(file18, sb18.toString());

		//create WEB-INF
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\webapp\WEB-INF
		File file19 = new File(product_path+product_name+"\\src\\main\\webapp\\WEB-INF");
		if( !file19.exists()){
			file19.mkdirs();
		}
		//create web.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\main\webapp\WEB-INF\web.xml
		File file20 = UtilsFile.findOrCreateFile(product_path+product_name+"\\src\\main\\webapp\\WEB-INF\\web.xml");
		StringBuilder sb20 = new StringBuilder();
		sb20.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Copyright 2000-2007 Sun Microsystems, Inc. All rights reserved.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("The contents of this file are subject to the terms of either the GNU").append("\r\n");
		sb20.append("General Public License Version 2 only (\"GPL\") or the Common Development").append("\r\n");
		sb20.append("and Distribution License(\"CDDL\") (collectively, the \"License\").  You").append("\r\n");
		sb20.append("may not use this file except in compliance with the License. You can obtain").append("\r\n");
		sb20.append("a copy of the License at https://glassfish.dev.java.net/public/CDDL+GPL.html").append("\r\n");
		sb20.append("or glassfish/bootstrap/legal/LICENSE.txt.  See the License for the specific").append("\r\n");
		sb20.append("language governing permissions and limitations under the License.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("When distributing the software, include this License Header Notice in each").append("\r\n");
		sb20.append("file and include the License file at glassfish/bootstrap/legal/LICENSE.txt.").append("\r\n");
		sb20.append("Sun designates this particular file as subject to the \"Classpath\" exception").append("\r\n");
		sb20.append("as provided by Sun in the GPL Version 2 section of the License file that").append("\r\n");
		sb20.append("accompanied this code.  If applicable, add the following below the License").append("\r\n");
		sb20.append("Header, with the fields enclosed by brackets [] replaced by your own").append("\r\n");
		sb20.append("identifying information: \"Portions Copyrighted [year]").append("\r\n");
		sb20.append("[name of copyright owner]\"").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Contributor(s):").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("If you wish your version of this file to be governed by only the CDDL or").append("\r\n");
		sb20.append("only the GPL Version 2, indicate your decision by adding \"[Contributor]").append("\r\n");
		sb20.append("elects to include this software in this distribution under the [CDDL or GPL").append("\r\n");
		sb20.append("Version 2] license.\"  If you don't indicate a single choice of license, a").append("\r\n");
		sb20.append("recipient has the option to distribute your version of this file under").append("\r\n");
		sb20.append("either the CDDL, the GPL Version 2 or to extend the choice of license to").append("\r\n");
		sb20.append("its licensees as provided above.  However, if you add GPL Version 2 code").append("\r\n");
		sb20.append("and therefore, elected the GPL Version 2 license, then the option applies").append("\r\n");
		sb20.append("only if the new code is made subject to such option by the copyright").append("\r\n");
		sb20.append("holder.").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("This is the XML DTD for the Servlet 2.3 deployment descriptor.").append("\r\n");
		sb20.append("All Servlet 2.3 deployment descriptors must include a DOCTYPE").append("\r\n");
		sb20.append("of the following form:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("  <!DOCTYPE web-app PUBLIC").append("\r\n");
		sb20.append("	\"-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN\"").append("\r\n");
		sb20.append("	\"http://java.sun.com/dtd/web-app_2_3.dtd\">").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The following conventions apply to all J2EE deployment descriptor").append("\r\n");
		sb20.append("elements unless indicated otherwise.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("- In elements that contain PCDATA, leading and trailing whitespace").append("\r\n");
		sb20.append("  in the data may be ignored.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("- In elements whose value is an \"enumerated type\", the value is").append("\r\n");
		sb20.append("  case sensitive.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("- In elements that specify a pathname to a file within the same").append("\r\n");
		sb20.append("  JAR file, relative filenames (i.e., those not starting with \"/\")").append("\r\n");
		sb20.append("  are considered relative to the root of the JAR file's namespace.").append("\r\n");
		sb20.append("  Absolute filenames (i.e., those starting with \"/\") also specify").append("\r\n");
		sb20.append("  names in the root of the JAR file's namespace.  In general, relative").append("\r\n");
		sb20.append("  names are preferred.  The exception is .war files where absolute").append("\r\n");
		sb20.append("  names are preferred for consistency with the servlet API.").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The web-app element is the root of the deployment descriptor for").append("\r\n");
		sb20.append("a web application.").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The auth-constraint element indicates the user roles that should").append("\r\n");
		sb20.append("be permitted access to this resource collection. The role-name").append("\r\n");
		sb20.append("used here must either correspond to the role-name of one of the").append("\r\n");
		sb20.append("security-role elements defined for this web application, or be").append("\r\n");
		sb20.append("the specially reserved role-name \"*\" that is a compact syntax for").append("\r\n");
		sb20.append("indicating all roles in the web application. If both \"*\" and").append("\r\n");
		sb20.append("rolenames appear, the container interprets this as all roles.").append("\r\n");
		sb20.append("If no roles are defined, no user is allowed access to the portion of").append("\r\n");
		sb20.append("the web application described by the containing security-constraint.").append("\r\n");
		sb20.append("The container matches role names case sensitively when determining").append("\r\n");
		sb20.append("access.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: security-constraint").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The auth-method element is used to configure the authentication").append("\r\n");
		sb20.append("mechanism for the web application. As a prerequisite to gaining access to any web resources which are protected by an authorization").append("\r\n");
		sb20.append("constraint, a user must have authenticated using the configured").append("\r\n");
		sb20.append("mechanism. Legal values for this element are \"BASIC\", \"DIGEST\",").append("\r\n");
		sb20.append("\"FORM\", or \"CLIENT-CERT\".").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: login-config").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The context-param element contains the declaration of a web").append("\r\n");
		sb20.append("application's servlet context initialization parameters.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The description element is used to provide text describing the parent").append("\r\n");
		sb20.append("element.  The description element should include any information that").append("\r\n");
		sb20.append("the web application war file producer wants to provide to the consumer of").append("\r\n");
		sb20.append("the web application war file (i.e., to the Deployer). Typically, the tools").append("\r\n");
		sb20.append("used by the web application war file consumer will display the description").append("\r\n");
		sb20.append("when processing the parent element that contains the description.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: auth-constraint, context-param, ejb-local-ref, ejb-ref,").append("\r\n");
		sb20.append("env-entry, filter, init-param, resource-env-ref, resource-ref, run-as,").append("\r\n");
		sb20.append("security-role, security-role-ref, servlet, user-data-constraint,").append("\r\n");
		sb20.append("web-app, web-resource-collection").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The display-name element contains a short name that is intended to be").append("\r\n");
		sb20.append("displayed by tools.  The display name need not be unique.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: filter, security-constraint, servlet, web-app").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Example:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("<display-name>Employee Self Service</display-name>").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The distributable element, by its presence in a web application").append("\r\n");
		sb20.append("deployment descriptor, indicates that this web application is").append("\r\n");
		sb20.append("programmed appropriately to be deployed into a distributed servlet").append("\r\n");
		sb20.append("container").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The ejb-link element is used in the ejb-ref or ejb-local-ref").append("\r\n");
		sb20.append("elements to specify that an EJB reference is linked to an").append("\r\n");
		sb20.append("enterprise bean.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("The name in the ejb-link element is composed of a").append("\r\n");
		sb20.append("path name specifying the ejb-jar containing the referenced enterprise").append("\r\n");
		sb20.append("bean with the ejb-name of the target bean appended and separated from").append("\r\n");
		sb20.append("the path name by \"#\".  The path name is relative to the war file").append("\r\n");
		sb20.append("containing the web application that is referencing the enterprise bean.").append("\r\n");
		sb20.append("This allows multiple enterprise beans with the same ejb-name to be").append("\r\n");
		sb20.append("uniquely identified.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: ejb-local-ref, ejb-ref").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Examples:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("	<ejb-link>EmployeeRecord</ejb-link>").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("	<ejb-link>../products/product.jar#ProductEJB</ejb-link>").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The ejb-local-ref element is used for the declaration of a reference to").append("\r\n");
		sb20.append("an enterprise bean's local home. The declaration consists of:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("	- an optional description").append("\r\n");
		sb20.append("	- the EJB reference name used in the code of the web application").append("\r\n");
		sb20.append("	  that's referencing the enterprise bean").append("\r\n");
		sb20.append("	- the expected type of the referenced enterprise bean").append("\r\n");
		sb20.append("	- the expected local home and local interfaces of the referenced").append("\r\n");
		sb20.append("	  enterprise bean").append("\r\n");
		sb20.append("	- optional ejb-link information, used to specify the referenced").append("\r\n");
		sb20.append("	  enterprise bean").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The ejb-ref element is used for the declaration of a reference to").append("\r\n");
		sb20.append("an enterprise bean's home. The declaration consists of:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("	- an optional description").append("\r\n");
		sb20.append("	- the EJB reference name used in the code of").append("\r\n");
		sb20.append("	  the web application that's referencing the enterprise bean").append("\r\n");
		sb20.append("	- the expected type of the referenced enterprise bean").append("\r\n");
		sb20.append("	- the expected home and remote interfaces of the referenced").append("\r\n");
		sb20.append("	  enterprise bean").append("\r\n");
		sb20.append("	- optional ejb-link information, used to specify the referenced").append("\r\n");
		sb20.append("	  enterprise bean").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The ejb-ref-name element contains the name of an EJB reference. The").append("\r\n");
		sb20.append("EJB reference is an entry in the web application's environment and is").append("\r\n");
		sb20.append("relative to the java:comp/env context.  The name must be unique").append("\r\n");
		sb20.append("within the web application.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("It is recommended that name is prefixed with \"ejb/\".").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: ejb-local-ref, ejb-ref").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Example:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("<ejb-ref-name>ejb/Payroll</ejb-ref-name>").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The ejb-ref-type element contains the expected type of the").append("\r\n");
		sb20.append("referenced enterprise bean.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("The ejb-ref-type element must be one of the following:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("	<ejb-ref-type>Entity</ejb-ref-type>").append("\r\n");
		sb20.append("	<ejb-ref-type>Session</ejb-ref-type>").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: ejb-local-ref, ejb-ref").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The env-entry element contains the declaration of a web application's").append("\r\n");
		sb20.append("environment entry. The declaration consists of an optional").append("\r\n");
		sb20.append("description, the name of the environment entry, and an optional").append("\r\n");
		sb20.append("value.  If a value is not specified, one must be supplied").append("\r\n");
		sb20.append("during deployment.").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The env-entry-name element contains the name of a web applications's").append("\r\n");
		sb20.append("environment entry.  The name is a JNDI name relative to the").append("\r\n");
		sb20.append("java:comp/env context.  The name must be unique within a web application.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Example:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("<env-entry-name>minAmount</env-entry-name>").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: env-entry").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The env-entry-type element contains the fully-qualified Java type of").append("\r\n");
		sb20.append("the environment entry value that is expected by the web application's").append("\r\n");
		sb20.append("code.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("The following are the legal values of env-entry-type:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("	java.lang.Boolean").append("\r\n");
		sb20.append("	java.lang.Byte").append("\r\n");
		sb20.append("	java.lang.Character").append("\r\n");
		sb20.append("	java.lang.String").append("\r\n");
		sb20.append("	java.lang.Short").append("\r\n");
		sb20.append("	java.lang.Integer").append("\r\n");
		sb20.append("	java.lang.Long").append("\r\n");
		sb20.append("	java.lang.Float").append("\r\n");
		sb20.append("	java.lang.Double").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: env-entry").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The env-entry-value element contains the value of a web application's").append("\r\n");
		sb20.append("environment entry. The value must be a String that is valid for the").append("\r\n");
		sb20.append("constructor of the specified type that takes a single String").append("\r\n");
		sb20.append("parameter, or for java.lang.Character, a single character.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Example:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("<env-entry-value>100.00</env-entry-value>").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: env-entry").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The error-code contains an HTTP error code, ex: 404").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: error-page").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The error-page element contains a mapping between an error code").append("\r\n");
		sb20.append("or exception type to the path of a resource in the web application").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The exception type contains a fully qualified class name of a").append("\r\n");
		sb20.append("Java exception type.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: error-page").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The extension element contains a string describing an").append("\r\n");
		sb20.append("extension. example: \"txt\"").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: mime-mapping").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("Declares a filter in the web application. The filter is mapped to").append("\r\n");
		sb20.append("either a servlet or a URL pattern in the filter-mapping element, using").append("\r\n");
		sb20.append("the filter-name value to reference. Filters can access the").append("\r\n");
		sb20.append("initialization parameters declared in the deployment descriptor at").append("\r\n");
		sb20.append("runtime via the FilterConfig interface.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The fully qualified classname of the filter.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: filter").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("Declaration of the filter mappings in this web application. The").append("\r\n");
		sb20.append("container uses the filter-mapping declarations to decide which filters").append("\r\n");
		sb20.append("to apply to a request, and in what order. The container matches the").append("\r\n");
		sb20.append("request URI to a Servlet in the normal way. To determine which filters").append("\r\n");
		sb20.append("to apply it matches filter-mapping declarations either on servlet-name,").append("\r\n");
		sb20.append("or on url-pattern for each filter-mapping element, depending on which").append("\r\n");
		sb20.append("style is used. The order in which filters are invoked is the order in").append("\r\n");
		sb20.append("which filter-mapping declarations that match a request URI for a").append("\r\n");
		sb20.append("servlet appear in the list of filter-mapping elements.The filter-name").append("\r\n");
		sb20.append("value must be the value of the <filter-name> sub-elements of one of the").append("\r\n");
		sb20.append("<filter> declarations in the deployment descriptor.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The logical name of the filter. This name is used to map the filter.").append("\r\n");
		sb20.append("Each filter name is unique within the web application.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: filter, filter-mapping").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The form-error-page element defines the location in the web app").append("\r\n");
		sb20.append("where the error page that is displayed when login is not successful").append("\r\n");
		sb20.append("can be found. The path begins with a leading / and is interpreted").append("\r\n");
		sb20.append("relative to the root of the WAR.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: form-login-config").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The form-login-config element specifies the login and error pages").append("\r\n");
		sb20.append("that should be used in form based login. If form based authentication").append("\r\n");
		sb20.append("is not used, these elements are ignored.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: login-config").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The form-login-page element defines the location in the web app").append("\r\n");
		sb20.append("where the page that can be used for login can be found. The path").append("\r\n");
		sb20.append("begins with a leading / and is interpreted relative to the root of the WAR.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: form-login-config").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The home element contains the fully-qualified name of the enterprise").append("\r\n");
		sb20.append("bean's home interface.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: ejb-ref").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Example:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("<home>com.aardvark.payroll.PayrollHome</home>").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The http-method contains an HTTP method (GET | POST |...).").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-resource-collection").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The icon element contains small-icon and large-icon elements that").append("\r\n");
		sb20.append("specify the file names for small and a large GIF or JPEG icon images").append("\r\n");
		sb20.append("used to represent the parent element in a GUI tool.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: filter, servlet, web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The init-param element contains a name/value pair as an").append("\r\n");
		sb20.append("initialization param of the servlet").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: filter, servlet").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The jsp-file element contains the full path to a JSP file within").append("\r\n");
		sb20.append("the web application beginning with a `/'.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: servlet").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The large-icon element contains the name of a file").append("\r\n");
		sb20.append("containing a large (32 x 32) icon image. The file").append("\r\n");
		sb20.append("name is a relative path within the web application's").append("\r\n");
		sb20.append("war file.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("The image may be either in the JPEG or GIF format.").append("\r\n");
		sb20.append("The icon can be used by tools.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: icon").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Example:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("<large-icon>employee-service-icon32x32.jpg</large-icon>").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The listener element indicates the deployment properties for a web").append("\r\n");
		sb20.append("application listener bean.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The listener-class element declares a class in the application must be").append("\r\n");
		sb20.append("registered as a web application listener bean. The value is the fully qualified classname of the listener class.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: listener").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The load-on-startup element indicates that this servlet should be").append("\r\n");
		sb20.append("loaded (instantiated and have its init() called) on the startup").append("\r\n");
		sb20.append("of the web application. The optional contents of").append("\r\n");
		sb20.append("these element must be an integer indicating the order in which").append("\r\n");
		sb20.append("the servlet should be loaded. If the value is a negative integer,").append("\r\n");
		sb20.append("or the element is not present, the container is free to load the").append("\r\n");
		sb20.append("servlet whenever it chooses. If the value is a positive integer").append("\r\n");
		sb20.append("or 0, the container must load and initialize the servlet as the").append("\r\n");
		sb20.append("application is deployed. The container must guarantee that").append("\r\n");
		sb20.append("servlets marked with lower integers are loaded before servlets").append("\r\n");
		sb20.append("marked with higher integers. The container may choose the order").append("\r\n");
		sb20.append("of loading of servlets with the same load-on-start-up value.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: servlet").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("The local element contains the fully-qualified name of the").append("\r\n");
		sb20.append("enterprise bean's local interface.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: ejb-local-ref").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("The local-home element contains the fully-qualified name of the").append("\r\n");
		sb20.append("enterprise bean's local home interface.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: ejb-local-ref").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The location element contains the location of the resource in the web").append("\r\n");
		sb20.append("application relative to the root of the web application. The value of").append("\r\n");
		sb20.append("the location must have a leading `/'.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: error-page").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The login-config element is used to configure the authentication").append("\r\n");
		sb20.append("method that should be used, the realm name that should be used for").append("\r\n");
		sb20.append("this application, and the attributes that are needed by the form login").append("\r\n");
		sb20.append("mechanism.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The mime-mapping element defines a mapping between an extension").append("\r\n");
		sb20.append("and a mime type.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The mime-type element contains a defined mime type. example:").append("\r\n");
		sb20.append("\"text/plain\"").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: mime-mapping").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The param-name element contains the name of a parameter. Each parameter").append("\r\n");
		sb20.append("name must be unique in the web application.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: context-param, init-param").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The param-value element contains the value of a parameter.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: context-param, init-param").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The realm name element specifies the realm name to use in HTTP").append("\r\n");
		sb20.append("Basic authorization.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: login-config").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The remote element contains the fully-qualified name of the enterprise").append("\r\n");
		sb20.append("bean's remote interface.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: ejb-ref").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Example:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("<remote>com.wombat.empl.EmployeeService</remote>").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The res-auth element specifies whether the web application code signs").append("\r\n");
		sb20.append("on programmatically to the resource manager, or whether the Container").append("\r\n");
		sb20.append("will sign on to the resource manager on behalf of the web application. In the").append("\r\n");
		sb20.append("latter case, the Container uses information that is supplied by the").append("\r\n");
		sb20.append("Deployer.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("The value of this element must be one of the two following:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("	<res-auth>Application</res-auth>").append("\r\n");
		sb20.append("	<res-auth>Container</res-auth>").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: resource-ref").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The res-ref-name element specifies the name of a resource manager").append("\r\n");
		sb20.append("connection factory reference.  The name is a JNDI name relative to the").append("\r\n");
		sb20.append("java:comp/env context.  The name must be unique within a web application.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: resource-ref").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The res-sharing-scope element specifies whether connections obtained").append("\r\n");
		sb20.append("through the given resource manager connection factory reference can be").append("\r\n");
		sb20.append("shared. The value of this element, if specified, must be one of the").append("\r\n");
		sb20.append("two following:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("	<res-sharing-scope>Shareable</res-sharing-scope>").append("\r\n");
		sb20.append("	<res-sharing-scope>Unshareable</res-sharing-scope>").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("The default value is Shareable.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: resource-ref").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The res-type element specifies the type of the data source. The type").append("\r\n");
		sb20.append("is specified by the fully qualified Java language class or interface").append("\r\n");
		sb20.append("expected to be implemented by the data source.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: resource-ref").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The resource-env-ref element contains a declaration of a web application's").append("\r\n");
		sb20.append("reference to an administered object associated with a resource").append("\r\n");
		sb20.append("in the web application's environment.  It consists of an optional").append("\r\n");
		sb20.append("description, the resource environment reference name, and an").append("\r\n");
		sb20.append("indication of the resource environment reference type expected by").append("\r\n");
		sb20.append("the web application code.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Example:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("<resource-env-ref>").append("\r\n");
		sb20.append("    <resource-env-ref-name>jms/StockQueue</resource-env-ref-name>").append("\r\n");
		sb20.append("    <resource-env-ref-type>javax.jms.Queue</resource-env-ref-type>").append("\r\n");
		sb20.append("</resource-env-ref>").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The resource-env-ref-name element specifies the name of a resource").append("\r\n");
		sb20.append("environment reference; its value is the environment entry name used in").append("\r\n");
		sb20.append("the web application code.  The name is a JNDI name relative to the").append("\r\n");
		sb20.append("java:comp/env context and must be unique within a web application.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: resource-env-ref").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The resource-env-ref-type element specifies the type of a resource").append("\r\n");
		sb20.append("environment reference.  It is the fully qualified name of a Java").append("\r\n");
		sb20.append("language class or interface.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: resource-env-ref").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The resource-ref element contains a declaration of a web application's").append("\r\n");
		sb20.append("reference to an external resource. It consists of an optional").append("\r\n");
		sb20.append("description, the resource manager connection factory reference name,").append("\r\n");
		sb20.append("the indication of the resource manager connection factory type").append("\r\n");
		sb20.append("expected by the web application code, the type of authentication").append("\r\n");
		sb20.append("(Application or Container), and an optional specification of the").append("\r\n");
		sb20.append("shareability of connections obtained from the resource (Shareable or").append("\r\n");
		sb20.append("Unshareable).").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Example:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("    <resource-ref>").append("\r\n");
		sb20.append("	<res-ref-name>jdbc/EmployeeAppDB</res-ref-name>").append("\r\n");
		sb20.append("	<res-type>javax.sql.DataSource</res-type>").append("\r\n");
		sb20.append("	<res-auth>Container</res-auth>").append("\r\n");
		sb20.append("	<res-sharing-scope>Shareable</res-sharing-scope>").append("\r\n");
		sb20.append("    </resource-ref>").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The role-link element is a reference to a defined security role. The").append("\r\n");
		sb20.append("role-link element must contain the name of one of the security roles").append("\r\n");
		sb20.append("defined in the security-role elements.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: security-role-ref").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The role-name element contains the name of a security role.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("The name must conform to the lexical rules for an NMTOKEN.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: auth-constraint, run-as, security-role, security-role-ref").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The run-as element specifies the run-as identity to be used for the").append("\r\n");
		sb20.append("execution of the web application. It contains an optional description, and").append("\r\n");
		sb20.append("the name of a security role.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: servlet").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The security-constraint element is used to associate security").append("\r\n");
		sb20.append("constraints with one or more web resource collections").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The security-role element contains the definition of a security").append("\r\n");
		sb20.append("role. The definition consists of an optional description of the").append("\r\n");
		sb20.append("security role, and the security role name.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Example:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("    <security-role>").append("\r\n");
		sb20.append("	<description>").append("\r\n");
		sb20.append("	    This role includes all employees who are authorized").append("\r\n");
		sb20.append("	    to access the employee service application.").append("\r\n");
		sb20.append("	</description>").append("\r\n");
		sb20.append("	<role-name>employee</role-name>").append("\r\n");
		sb20.append("    </security-role>").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The security-role-ref element contains the declaration of a security").append("\r\n");
		sb20.append("role reference in the web application's code. The declaration consists").append("\r\n");
		sb20.append("of an optional description, the security role name used in the code,").append("\r\n");
		sb20.append("and an optional link to a security role. If the security role is not").append("\r\n");
		sb20.append("specified, the Deployer must choose an appropriate security role.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("The value of the role-name element must be the String used as the").append("\r\n");
		sb20.append("parameter to the EJBContext.isCallerInRole(String roleName) method").append("\r\n");
		sb20.append("or the HttpServletRequest.isUserInRole(String role) method.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: servlet").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The servlet element contains the declarative data of a").append("\r\n");
		sb20.append("servlet. If a jsp-file is specified and the load-on-startup element is").append("\r\n");
		sb20.append("present, then the JSP should be precompiled and loaded.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The servlet-class element contains the fully qualified class name").append("\r\n");
		sb20.append("of the servlet.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: servlet").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The servlet-mapping element defines a mapping between a servlet").append("\r\n");
		sb20.append("and a url pattern").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The servlet-name element contains the canonical name of the").append("\r\n");
		sb20.append("servlet. Each servlet name is unique within the web application.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: filter-mapping, servlet, servlet-mapping").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The session-config element defines the session parameters for").append("\r\n");
		sb20.append("this web application.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The session-timeout element defines the default session timeout").append("\r\n");
		sb20.append("interval for all sessions created in this web application. The").append("\r\n");
		sb20.append("specified timeout must be expressed in a whole number of minutes.").append("\r\n");
		sb20.append("If the timeout is 0 or less, the container ensures the default").append("\r\n");
		sb20.append("behaviour of sessions is never to time out.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: session-config").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The small-icon element contains the name of a file").append("\r\n");
		sb20.append("containing a small (16 x 16) icon image. The file").append("\r\n");
		sb20.append("name is a relative path within the web application's").append("\r\n");
		sb20.append("war file.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("The image may be either in the JPEG or GIF format.").append("\r\n");
		sb20.append("The icon can be used by tools.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: icon").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Example:").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("<small-icon>employee-service-icon16x16.jpg</small-icon>").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The taglib element is used to describe a JSP tag library.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("the taglib-location element contains the location (as a resource").append("\r\n");
		sb20.append("relative to the root of the web application) where to find the Tag").append("\r\n");
		sb20.append("Libary Description file for the tag library.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: taglib").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The taglib-uri element describes a URI, relative to the location").append("\r\n");
		sb20.append("of the web.xml document, identifying a Tag Library used in the Web").append("\r\n");
		sb20.append("Application.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: taglib").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The transport-guarantee element specifies that the communication").append("\r\n");
		sb20.append("between client and server should be NONE, INTEGRAL, or").append("\r\n");
		sb20.append("CONFIDENTIAL. NONE means that the application does not require any").append("\r\n");
		sb20.append("transport guarantees. A value of INTEGRAL means that the application").append("\r\n");
		sb20.append("requires that the data sent between the client and server be sent in").append("\r\n");
		sb20.append("such a way that it can't be changed in transit. CONFIDENTIAL means").append("\r\n");
		sb20.append("that the application requires that the data be transmitted in a").append("\r\n");
		sb20.append("fashion that prevents other entities from observing the contents of").append("\r\n");
		sb20.append("the transmission. In most cases, the presence of the INTEGRAL or").append("\r\n");
		sb20.append("CONFIDENTIAL flag will indicate that the use of SSL is required.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: user-data-constraint").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The url-pattern element contains the url pattern of the mapping. Must").append("\r\n");
		sb20.append("follow the rules specified in Section 11.2 of the Servlet API").append("\r\n");
		sb20.append("Specification.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: filter-mapping, servlet-mapping, web-resource-collection").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The user-data-constraint element is used to indicate how data").append("\r\n");
		sb20.append("communicated between the client and container should be protected.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: security-constraint").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The web-resource-collection element is used to identify a subset").append("\r\n");
		sb20.append("of the resources and HTTP methods on those resources within a web").append("\r\n");
		sb20.append("application to which a security constraint applies. If no HTTP methods").append("\r\n");
		sb20.append("are specified, then the security constraint applies to all HTTP").append("\r\n");
		sb20.append("methods.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: security-constraint").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The web-resource-name contains the name of this web resource").append("\r\n");
		sb20.append("collection.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-resource-collection").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The welcome-file element contains file name to use as a default").append("\r\n");
		sb20.append("welcome file, such as index.html").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: welcome-file-list").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The welcome-file-list contains an ordered list of welcome files").append("\r\n");
		sb20.append("elements.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Used in: web-app").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<!--").append("\r\n");
		sb20.append("The ID mechanism is to allow tools that produce additional deployment").append("\r\n");
		sb20.append("information (i.e., information beyond the standard deployment").append("\r\n");
		sb20.append("descriptor information) to store the non-standard information in a").append("\r\n");
		sb20.append("separate file, and easily refer from these tool-specific files to the").append("\r\n");
		sb20.append("information in the standard deployment descriptor.").append("\r\n");
		sb20.append("").append("\r\n");
		sb20.append("Tools are not allowed to add the non-standard information into the").append("\r\n");
		sb20.append("standard deployment descriptor.").append("\r\n");
		sb20.append("-->").append("\r\n");
		sb20.append("<web-app xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:web=\"http://xmlns.jcp.org/xml/ns/javaee\" xsi:schemaLocation=\"http://xmlns.jcp.org/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd\">").append("\r\n");
		sb20.append("  <display-name>Archetype Created Web Application</display-name>").append("\r\n");
		sb20.append("</web-app>").append("\r\n");
		createAndWriteFile(file20, sb20.toString());

		//create test
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\test
		File file21 = new File(product_path+product_name+"\\src\\test");
		if( !file21.exists()){
			file21.mkdirs();
		}
		//create java
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\src\test\java
		File file22 = new File(product_path+product_name+"\\src\\test\\java");
		if( !file22.exists()){
			file22.mkdirs();
		}
		//create target
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target
		File file23 = new File(product_path+product_name+"\\target");
		if( !file23.exists()){
			file23.mkdirs();
		}
		//create classes
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\classes
		File file24 = new File(product_path+product_name+"\\target\\classes");
		if( !file24.exists()){
			file24.mkdirs();
		}
		//create m2e-wtp
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp
		File file25 = new File(product_path+product_name+"\\target\\m2e-wtp");
		if( !file25.exists()){
			file25.mkdirs();
		}
		//create web-resources
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources
		File file26 = new File(product_path+product_name+"\\target\\m2e-wtp\\web-resources");
		if( !file26.exists()){
			file26.mkdirs();
		}
		//create META-INF
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF
		File file27 = new File(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF");
		if( !file27.exists()){
			file27.mkdirs();
		}
		//create MANIFEST.MF
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\MANIFEST.MF
		File file28 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\MANIFEST.MF");
		StringBuilder sb28 = new StringBuilder();
		sb28.append("Manifest-Version: 1.0").append("\r\n");
		sb28.append("Build-Jdk: 1.7.0_51").append("\r\n");
		sb28.append("Built-By: huage").append("\r\n");
		sb28.append("Created-By: Maven Integration for Eclipse").append("\r\n");
		sb28.append("").append("\r\n");
		createAndWriteFile(file28, sb28.toString());

		//create maven
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\maven
		File file29 = new File(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\maven");
		if( !file29.exists()){
			file29.mkdirs();
		}
		//create com
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\maven\com
		File file30 = new File(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\maven\\com");
		if( !file30.exists()){
			file30.mkdirs();
		}
		//create {huage_product_name}
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\maven\com\{huage_product_name}
		File file31 = new File(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\maven\\com\\{huage_product_name}");
		if( !file31.exists()){
			file31.mkdirs();
		}
		//create pom.properties
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\maven\com\{huage_product_name}\pom.properties
		File file32 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\maven\\com\\{huage_product_name}\\pom.properties");
		StringBuilder sb32 = new StringBuilder();
		sb32.append("#Generated by Maven Integration for Eclipse").append("\r\n");
		sb32.append("#Wed May 18 14:37:44 CST 2016").append("\r\n");
		sb32.append("version=0.0.1-SNAPSHOT").append("\r\n");
		sb32.append("groupId=com").append("\r\n");
		sb32.append("m2e.projectName={huage_product_name}").append("\r\n");
		sb32.append("m2e.projectLocation=D\\:\\Workspace\\eclipse\\eclipse-birt-2.2.0\\workspace\\{huage_product_name}").append("\r\n");
		sb32.append("artifactId={huage_product_name}").append("\r\n");
		createAndWriteFile(file32, sb32.toString());

		//create pom.xml
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\m2e-wtp\web-resources\META-INF\maven\com\{huage_product_name}\pom.xml
		File file33 = UtilsFile.findOrCreateFile(product_path+product_name+"\\target\\m2e-wtp\\web-resources\\META-INF\\maven\\com\\{huage_product_name}\\pom.xml");
		StringBuilder sb33 = new StringBuilder();
		sb33.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"").append("\r\n");
		sb33.append("  xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd\">").append("\r\n");
		sb33.append("  <modelVersion>4.0.0</modelVersion>").append("\r\n");
		sb33.append("  <groupId>com</groupId>").append("\r\n");
		sb33.append("  <artifactId>{huage_product_name}</artifactId>").append("\r\n");
		sb33.append("  <packaging>war</packaging>").append("\r\n");
		sb33.append("  <version>0.0.1-SNAPSHOT</version>").append("\r\n");
		sb33.append("  <name>{huage_product_name} Maven Webapp</name>").append("\r\n");
		sb33.append("  <url>http://maven.apache.org</url>").append("\r\n");
		sb33.append("  <dependencies>").append("\r\n");
		sb33.append("    <dependency>").append("\r\n");
		sb33.append("      <groupId>junit</groupId>").append("\r\n");
		sb33.append("      <artifactId>junit</artifactId>").append("\r\n");
		sb33.append("      <version>3.8.1</version>").append("\r\n");
		sb33.append("      <scope>test</scope>").append("\r\n");
		sb33.append("    </dependency>").append("\r\n");
		sb33.append("  </dependencies>").append("\r\n");
		sb33.append("  <build>").append("\r\n");
		sb33.append("    <finalName>{huage_product_name}</finalName>").append("\r\n");
		sb33.append("  </build>").append("\r\n");
		sb33.append("</project>").append("\r\n");
		createAndWriteFile(file33, sb33.toString());

		//create test-classes
		//path D:\Workspace\eclipse\eclipse-birt-2.2.0\workspace\{huage_product_name}\target\test-classes
		File file34 = new File(product_path+product_name+"\\target\\test-classes");
		if( !file34.exists()){
			file34.mkdirs();
		}
	}
	
}