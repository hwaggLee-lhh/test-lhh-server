package com.hwaggLee.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * 将viso导出的vsd转化成mysql的脚本
 * @author huage
 *
 */
public class UtilsVisoToMysql {

    public static void main(String[] args) {  
        String res = importResume();  
        String[] ress = res.split("\n");  
          
        List<List<String>> list = splitIt(ress);  
        List<String> sqls = createSQL(list);  
          
        for (String s : sqls) {  
            System.out.println(s);  
        }  
    }  
      
    //读取visio  
    public static String importResume(){  
        String name = "Z:\\zzz\\03物流管理系统\\02数据库\\Database Design-20130425.vsd";  
        try {  
            FileInputStream fis = new FileInputStream(new File(name));  
            
            /*VisioTextExtractor vi = new VisioTextExtractor(fis);  
            return vi.getText();  */
            return null;
        } catch (Exception e) {  
            e.printStackTrace();  
            return null;  
        }  
    }  
      
    //分隔visio  
    public static List<List<String>> splitIt(String[] strs){  
        boolean flag = false;  
        List<String> item = null;  
        List<List<String>> res = new ArrayList<List<String>>();  
        int ii = 0;  
        for (int i = 0; i < strs.length; i++) {  
            if(strs[i] == null || strs[i].equals("")){  
                continue;  
            }else if(strs[i].charAt(0) == 't'){  
                flag = true;  
                if(ii++ != 0){  
                    String sss = item.get(item.size()-1);  
                    item.set(item.size()-1, sss.substring(0,sss.length()-1));  
                    res.add(item);  
                }  
                item = new ArrayList<String>();  
            }  
              
            if(flag){  
                item.add(strs[i]);  
            }  
              
            if(i == strs.length-1){  
                String sss = item.get(item.size()-1);  
                item.set(item.size()-1, sss.substring(0,sss.length()-1));  
                res.add(item);  
            }  
        }  
          
          
        return res;  
    }  
      
    //读取数据类型  
    public static List<String> readTypes(){  
        try {  
            List<String> list = FileUtils.readLines(new File("Z:\\1.txt"));    
            return list;  
        } catch (Exception e) {  
            // TODO: handle exception  
            e.printStackTrace();  
            return null;  
        }  
    }  
      
    //读取注释  
    public static List<String> readComments(){  
        try {  
            List<String> list = FileUtils.readLines(new File("Z:\\2.txt"));    
            return list;  
        } catch (Exception e) {  
            // TODO: handle exception  
            e.printStackTrace();  
            return null;  
        }  
    }  
      
    //组装sql  
    public static List<String> createSQL(List<List<String>> list){  
        List<String> res = new ArrayList<String>();  
        List<String> types = readTypes();  
        List<String> comments = readComments();  
          
        int j = 0;  
        for(List<String> ll : list){  
            StringBuilder sb = new StringBuilder();  
            int i = 0;  
            for(String ss : ll){  
                if(i++ == 0){  
                    sb.append("create table "+ss.substring(0,ss.length()-1)+" (");  
                }else{  
                    sb.append(ss.substring(2,ss.length()).trim()+" "+types.get(j)+" comment '"+comments.get(j++)+"'");  
                    if(i != ll.size()){  
                        sb.append(",");  
                    }  
                }  
            }  
            sb.append(");");  
            res.add(sb.toString());  
        }  
          
        return res;  
    }  
}
