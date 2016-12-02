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
import com.hwaggLee.qdyx.nsanban.manager.ManagerCWSJCashFlowStatement;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJCashFlowStatement;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJCashFlowStatement;

@Service("implservicecwjscashflowstatement")
public class ImplServiceCWJSCashFlowStatement extends BaseServiceImpl<ModelCWSJCashFlowStatement> implements ServiceCWSJCashFlowStatement{

	@Resource
	private ManagerCWSJCashFlowStatement managercwsjcashflowstatement;

	protected BaseManager<ModelCWSJCashFlowStatement> getBaseManager() {
		return managercwsjcashflowstatement;
	}


	public Page<ModelCWSJCashFlowStatement> findPage(ModelCWSJCashFlowStatement example,
			PageParam pageParam) {
		return managercwsjcashflowstatement.findPage(example, pageParam);
	}

	@Override
	public ModelCWSJCashFlowStatement save(ModelCWSJCashFlowStatement c) {
		if( c == null )return null;
		if( c.getEndDate() == null ){
			throw new BaseException("存在没有报告期的数据");
		}
		ModelCWSJCashFlowStatement cs = this.managercwsjcashflowstatement.findByStockCodeAndEndDate(c.getStockCode(), c.getEndDate());
		if( cs == null ){
			this.managercwsjcashflowstatement.save(c);
			return c;
		}else{
			String idStr = cs.getIdStr();
			ModelUtils.transferValue(c, cs);
			cs.setIdStr(idStr);
			this.managercwsjcashflowstatement.update(cs);
			return cs;
		}
	}
	@Override
	public void saves(List<ModelCWSJCashFlowStatement> list) {
		if( list == null || list.isEmpty()) return;
		for (ModelCWSJCashFlowStatement c : list) {
			this.save(c);
			System.out.println(c.getStockCode());
		}
	}


}

