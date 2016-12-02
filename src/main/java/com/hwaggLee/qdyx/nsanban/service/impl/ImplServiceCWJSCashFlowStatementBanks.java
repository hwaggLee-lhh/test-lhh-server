package com.hwaggLee.qdyx.nsanban.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.base.model.BaseManager;
import com.base.service.impl.BaseServiceImpl;
import com.hwaggLee.qdyx.nsanban.manager.ManagerCWSJCashFlowStatementBanks;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJCashFlowStatementBanks;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJCashFlowStatementBanks;

@Service("implservicecwjscashflowstatementbanks")
public class ImplServiceCWJSCashFlowStatementBanks extends BaseServiceImpl<ModelCWSJCashFlowStatementBanks> implements ServiceCWSJCashFlowStatementBanks{

	@Resource
	private ManagerCWSJCashFlowStatementBanks managercwsjcashflowstatementbanks;

	@Override
	protected BaseManager<ModelCWSJCashFlowStatementBanks> getBaseManager() {
		return managercwsjcashflowstatementbanks;
	}


}

