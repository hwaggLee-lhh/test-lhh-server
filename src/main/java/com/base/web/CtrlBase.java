package com.base.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.base.utils.CtrlUtils;

/**ctrl基类
 * 提供JSONConvert对象
 */
@Controller
@RequestMapping("base")
public class CtrlBase extends CtrlService{
	public static final Logger logger = Logger.getLogger(CtrlBase.class);
	
	
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
	@RequestMapping(value="/b/view/{path}/{pagename}", method = {RequestMethod.GET})
    public ModelAndView view(HttpServletRequest req, HttpServletResponse res,
    		@PathVariable(value="path") String path,
    		@PathVariable(value="pagename") String pagename) {
		return CtrlUtils.getModelAndView(path, pagename);
    }
}
