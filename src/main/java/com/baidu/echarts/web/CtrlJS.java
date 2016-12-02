package com.baidu.echarts.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.base.utils.CtrlUtils;
import com.base.web.CtrlBase;


@Controller
@RequestMapping("baidu/echarts/js")
public class CtrlJS extends CtrlBase  {
	private static final String PATH = "baidu";


	/**
	 * index
	 * @param req
	 * @param res
	 * @return
	 */
	@RequestMapping("index")
    public void index(HttpServletRequest req, HttpServletResponse res) {
		Map<String,Object> map = new HashMap<String, Object>();
		System.out.println("来了");
		map.put("success",true);
		map.put("msg", "laile ");
		CtrlUtils.putJSON(map, res);
    } 
	

	/**
	 * 进入相关页面
	 * @param req
	 * @param res
	 * @return
	 */
	@RequestMapping(value="/view/{path}/{pagename}/{type}", method = {RequestMethod.GET})
    public ModelAndView view(HttpServletRequest req, HttpServletResponse res,
    		@PathVariable(value="path") String path,
    		@PathVariable(value="pagename") String pagename,
    		@PathVariable(value="type") String type) {
		Map<String,Object> map = new HashMap<String, Object>();
		
		map.put("success",true);
		map.put("msg", "coming...");
		return CtrlUtils.getModelAndView(PATH+"/"+path, pagename,map);
    }

}
