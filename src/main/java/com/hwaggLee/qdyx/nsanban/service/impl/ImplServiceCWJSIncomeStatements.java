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
import com.hwaggLee.qdyx.nsanban.manager.ManagerCWSJIncomeStatements;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJIncomeStatements;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJIncomeStatements;

@Service("implservicecwjsincomestatements")
public class ImplServiceCWJSIncomeStatements extends BaseServiceImpl<ModelCWSJIncomeStatements> implements ServiceCWSJIncomeStatements{

	@Resource
	private ManagerCWSJIncomeStatements managercwsjincomestatements;

	@Override
	protected BaseManager<ModelCWSJIncomeStatements> getBaseManager() {
		return managercwsjincomestatements;
	}

	public Page<ModelCWSJIncomeStatements> findPage(ModelCWSJIncomeStatements example,
			PageParam pageParam) {
		return managercwsjincomestatements.findPage(example, pageParam);
	}

	@Override
	public ModelCWSJIncomeStatements save(ModelCWSJIncomeStatements c) {
		if( c == null )return null;
		if( c.getEndDate() == null ){
			throw new BaseException("存在没有报告期的数据");
		}
		ModelCWSJIncomeStatements cs = this.managercwsjincomestatements.findByStockCodeAndEndDate(c.getStockCode(), c.getEndDate());
		if( cs == null ){
			this.managercwsjincomestatements.save(c);
			return c;
		}else{
			String idStr = cs.getIdStr();
			ModelUtils.transferValue(c, cs);
			cs.setIdStr(idStr);
			this.managercwsjincomestatements.update(cs);
			return cs;
		}
	}
	@Override
	public void saves(List<ModelCWSJIncomeStatements> list) {
		if( list == null || list.isEmpty()) return;
		for (ModelCWSJIncomeStatements c : list) {
			this.save(c);
			System.out.println(c.getStockCode());
		}
	}

}

