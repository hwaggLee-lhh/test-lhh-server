package com.hwaggLee.qdyx.nsanban.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.base.model.BaseManager;
import com.base.service.impl.BaseServiceImpl;
import com.hwaggLee.qdyx.nsanban.manager.ManagerCWSJCashFlowStatementSecurities;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJCashFlowStatementSecurities;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJCashFlowStatementSecurities;

@Service("implservicecwjscashflowstatementsecurities")
public class ImplServiceCWJSCashFlowStatementSecurities extends BaseServiceImpl<ModelCWSJCashFlowStatementSecurities> implements ServiceCWSJCashFlowStatementSecurities{

	@Resource
	private ManagerCWSJCashFlowStatementSecurities managercwsjcashflowstatementsecurities;

	@Override
	protected BaseManager<ModelCWSJCashFlowStatementSecurities> getBaseManager() {
		return managercwsjcashflowstatementsecurities;
	}



}

