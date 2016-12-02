package com.hwaggLee.qdyx.nsanban.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.base.model.BaseManager;
import com.base.service.impl.BaseServiceImpl;
import com.hwaggLee.qdyx.nsanban.manager.ManagerCWSJIncomeStatementsSecurities;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJIncomeStatementsSecurities;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJIncomeStatementsSecurities;

@Service("implservicecwjsincomestatementssecurities")
public class ImplServiceCWJSIncomeStatementsSecurities extends BaseServiceImpl<ModelCWSJIncomeStatementsSecurities> implements ServiceCWSJIncomeStatementsSecurities{

	@Resource
	private ManagerCWSJIncomeStatementsSecurities managercwsjincomestatementssecurities;

	@Override
	protected BaseManager<ModelCWSJIncomeStatementsSecurities> getBaseManager() {
		return managercwsjincomestatementssecurities;
	}


}

