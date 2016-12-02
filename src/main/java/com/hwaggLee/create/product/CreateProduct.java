package com.hwaggLee.create.product;

import java.io.File;

import org.apache.commons.io.FileUtils;

public abstract class CreateProduct {
	
	protected String product_name = "Test1111"; 
	protected final String product_label = "{huage_product_name}"; 

	public CreateProduct(String productname) {
		this.product_name = productname;
	}
	
	public abstract void createProduct(String product_path)throws Exception;
	public abstract void start(String product_path)throws Exception;
	
	public void createAndWriteFile(File file,String toString) throws Exception{
		//历史遗留的东西替换
		toString = toString.replace("Test1111", product_label).replace("Test111", product_label).replace("tsportal_yxt", product_label);
		FileUtils.writeStringToFile(file, toString.replace(product_label, product_name));
	}

	public void createAndWriteFile2(File file,String toString) throws Exception{
		//历史遗留的东西替换
		toString = toString.replace("Test1111", product_label).replace("Test111", product_label).replace("tsportal_yxt", product_label);
		FileUtils.writeStringToFile(file, toString.replace(product_name, product_label));
	}
}
