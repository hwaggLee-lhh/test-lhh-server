package com.org.apache.poi.xssf;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 网excel写入图片
 * 其中xssf针对office2007(含xml)以后 的版本,hssf针对2007以前的版本
 * @author huage
 *
 */
public class StartPoiExcelWriterImg {
	public static void main(String[] args) {  
        FileOutputStream fileOut = null;     
        BufferedImage bufferImg = null;     
       //先把读进来的图片放到一个ByteArrayOutputStream中，以便产生ByteArray    
       try {  
           ByteArrayOutputStream byteArrayOut = new ByteArrayOutputStream();     
           bufferImg = ImageIO.read(new File("C:\\Users\\huage\\Desktop\\121231\\1466685286772.jpg"));     
           ImageIO.write(bufferImg, "jpg", byteArrayOut);  
             
           XSSFWorkbook wb = new XSSFWorkbook();     
           XSSFSheet sheet1 = wb.createSheet("Sheet1");    
           //XSSFSheet sheet1 = wb.getSheet("Sheet1");
           //画图的顶级管理器，一个sheet只能获取一个（一定要注意这点）  
           XSSFDrawing patriarch = sheet1.createDrawingPatriarch();     
           //anchor主要用于设置图片的属性  
           XSSFClientAnchor anchor = new XSSFClientAnchor(0, 0, 255, 255,(short) 1, 1, (short) 5, 8);     
           anchor.setAnchorType(3);     
           //插入图片    
           patriarch.createPicture(anchor, wb.addPicture(byteArrayOut.toByteArray(), XSSFWorkbook.PICTURE_TYPE_JPEG));   
           fileOut = new FileOutputStream("C:\\Users\\huage\\Desktop\\121231\\11111.xlsx");     
           // 写入excel文件     
           wb.write(fileOut);
           System.out.println("----Excle文件已生成------");  
       } catch (Exception e) {  
           e.printStackTrace();  
       }finally{  
           if(fileOut != null){  
                try {  
                   fileOut.close();  
               } catch (IOException e) {  
                   e.printStackTrace();  
               }  
           }  
       }  
   }  
}
