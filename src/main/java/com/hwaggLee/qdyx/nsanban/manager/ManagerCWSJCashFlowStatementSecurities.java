package com.hwaggLee.qdyx.nsanban.manager;

import org.springframework.stereotype.Repository;

import com.base.model.BaseManager;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJCashFlowStatementSecurities;

@Repository("managercwsjcashflowstatementsecurities")
public class ManagerCWSJCashFlowStatementSecurities extends BaseManager<ModelCWSJCashFlowStatementSecurities>{

	@Override
	public Class<ModelCWSJCashFlowStatementSecurities> getModelClass() {
		return ModelCWSJCashFlowStatementSecurities.class;
	}

}

