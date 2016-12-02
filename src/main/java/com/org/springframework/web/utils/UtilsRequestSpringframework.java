package com.org.springframework.web.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.base.model.ModelFileInfo;

/**
 * 
 * @author huage
 *
 */
public class UtilsRequestSpringframework {
	
	/**
	 * Multipart控件上传文件读取流
	 * @param req
	 * @return
	 */
	public static Map<String,ModelFileInfo> readUploadFile(HttpServletRequest req){
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) req;
		Map<String, MultipartFile> mapMultipartFile = multipartRequest.getFileMap();
		if( mapMultipartFile == null || mapMultipartFile.isEmpty()) return null;
		Map<String,ModelFileInfo> map = new HashMap<String, ModelFileInfo>();
		for (String reqkey : mapMultipartFile.keySet()) {
			MultipartFile multipartFile = mapMultipartFile.get(reqkey);
			if( multipartFile == null )continue;
			try {
				ModelFileInfo info = new ModelFileInfo();
				info.setKey(reqkey);
				info.setName(multipartFile.getOriginalFilename().substring(0,multipartFile.getOriginalFilename().lastIndexOf(".")));
				info.setSuffix(multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf(".")));
				info.setFilename(UUID.randomUUID().toString().replace("-", "") + info.getSuffix());
				info.setInputStream(multipartFile.getInputStream());
				info.setFilePath(multipartFile.getOriginalFilename());
				map.put(reqkey, info);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return map;
	}

	/**
	 * Multipart控件上传图片读取流
	 * @param req
	 * @return
	 */
	public static Map<String,Object> readUploadImg(HttpServletRequest req,String imgName){
		Map<String,Object> map = new HashMap<String, Object>();
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) req;
		MultipartFile multipartFile = multipartRequest.getFile(imgName);
		if(multipartFile==null ) {
			map.put("success", false);
			map.put("error", "上传读取不到图片。");
		}else{
			String suffix = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf("."));
			String filename =  UUID.randomUUID().toString().replace("-", "") + suffix;
			if ((filename.indexOf(".gif")<=0) && (filename.indexOf(".jpg")<=0) && (filename.indexOf(".png")<=0) && (filename.indexOf(".bmp")<=0)){
				map.put("success", false);
				map.put("error", "你上传的文件格式不正确！上传格式有(.gif、.jpg、.png、.bmp)");
			}else{
				try {
					map.put("img", multipartFile.getInputStream());
					map.put("filename", filename);
					map.put("success",true);
					map.put("content", "读取成功");
				} catch (IOException e) {
					e.printStackTrace();
					map.put("success",false);
					map.put("error", "读取异常"+e.getMessage());
				}
			}
		}
	
		return map;
	}
	
}
