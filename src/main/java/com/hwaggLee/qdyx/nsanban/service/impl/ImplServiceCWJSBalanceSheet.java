package com.hwaggLee.qdyx.nsanban.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.base.model.BaseException;
import com.base.model.BaseManager;
import com.base.model.Page;
import com.base.model.PageParam;
import com.base.service.impl.BaseServiceImpl;
import com.base.utils.ModelUtils;
import com.hwaggLee.qdyx.nsanban.manager.ManagerCWSJBalanceSheet;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJBalanceSheet;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJBalanceSheet;

@Service("implservicecwjsbalancesheet")
public class ImplServiceCWJSBalanceSheet extends BaseServiceImpl<ModelCWSJBalanceSheet> implements ServiceCWSJBalanceSheet{
	//private static Logger logger = Logger.getLogger(ImplServiceBalanceSheet.class);
			
	
	@Resource
	private ManagerCWSJBalanceSheet managercwsjbalancesheet;

	@Override
	protected BaseManager<ModelCWSJBalanceSheet> getBaseManager() {
		return managercwsjbalancesheet;
	}

	public Page<ModelCWSJBalanceSheet> findPage(ModelCWSJBalanceSheet example,
			PageParam pageParam) {
		return managercwsjbalancesheet.findPage(example, pageParam);
	}

	@Override
	public ModelCWSJBalanceSheet save(ModelCWSJBalanceSheet c) {
		if( c == null )return null;
		if( c.getEndDate() == null ){
			throw new BaseException("存在没有报告期的数据");
		}
		ModelCWSJBalanceSheet cs = this.managercwsjbalancesheet.findByStockCodeAndEndDate(c.getStockCode(), c.getEndDate());
		if( cs == null ){
			this.managercwsjbalancesheet.save(c);
			return c;
		}else{
			String idStr = cs.getIdStr();
			ModelUtils.transferValue(c, cs);
			cs.setIdStr(idStr);
			this.managercwsjbalancesheet.update(cs);
			return cs;
		}
	}
	@Override
	public void saves(List<ModelCWSJBalanceSheet> list) {
		if( list == null || list.isEmpty()) return;
		int i = 0 ;
		for (ModelCWSJBalanceSheet c : list) {
			i++;
			try {
				this.save(c);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i+":"+c.getStockCode());
		}
	}
}

