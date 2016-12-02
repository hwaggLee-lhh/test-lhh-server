package com.hwaggLee.create;

import com.hwaggLee.create.product.CreateProduct;
import com.hwaggLee.create.product.StartCreateN3b_dbProduct;

/**
 * 创建项目
 * @author huage
 *
 */
public class StartProduct {

	public static void main(String[] args)throws Exception {
		String product_name = "lhh-utils";
		String product_path = "D:\\Workspace\\eclipse\\eclipse-birt-2.2.0\\workspace\\";
		//CreateProduct p = new StartCreateMavenProduct(product_name);
		CreateProduct p = new StartCreateN3b_dbProduct(product_name);
		p.createProduct( product_path);
		p.start( product_path);
		System.out.println("完成");
	}
	
	
}
