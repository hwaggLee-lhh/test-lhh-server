package com.hwaggLee.qdyx.nsanban.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.base.model.BaseManager;
import com.base.service.impl.BaseServiceImpl;
import com.hwaggLee.qdyx.nsanban.manager.ManagerCWSJIncomeStatementsBanks;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJIncomeStatementsBanks;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJIncomeStatementsBanks;

@Service("implservicecwjsincomestatementsbanks")
public class ImplServiceCWJSIncomeStatementsBanks extends BaseServiceImpl<ModelCWSJIncomeStatementsBanks> implements ServiceCWSJIncomeStatementsBanks{

	@Resource
	private ManagerCWSJIncomeStatementsBanks managercwsjincomestatementsbanks;

	@Override
	protected BaseManager<ModelCWSJIncomeStatementsBanks> getBaseManager() {
		return managercwsjincomestatementsbanks;
	}



}

