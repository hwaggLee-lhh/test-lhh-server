package com.hwaggLee.qdyx.nsanban.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.base.model.Page;
import com.base.model.PageParam;
import com.base.utils.CtrlUtils;
import com.base.utils.EditorUtils;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJBalanceSheet;


@Controller
@RequestMapping("qdyx/nsanban/find")
public class CtrlFind extends CtrlServiceNsanban  {
	private static final String PATH = "hwaggLee//qdyx/nsanban";


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
		Page<ModelCWSJBalanceSheet> page = null;
		
		switch(type.toUpperCase()){
		case "BALANCESHEET":
			ModelCWSJBalanceSheet example = new ModelCWSJBalanceSheet();
			EditorUtils.convertObj(req, example);
			PageParam pageParam = CtrlUtils.getPageParam(req);
			page = super.implservicecwjsbalancesheet.findPage(example,pageParam);
			break;
		default:
			
			break;
		}
		map.put("success",true);
		map.put("msg", "laile");
		map.put("page", page);
		return CtrlUtils.getModelAndView(PATH+"/"+path, pagename,map);
    }
}
