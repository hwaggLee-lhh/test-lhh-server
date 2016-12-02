package com.hwaggLee.qdyx.nsanban.manager;

import org.springframework.stereotype.Repository;

import com.base.model.BaseManager;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJCashFlowStatementBanks;

@Repository("managercwsjcashflowstatementbanks")
public class ManagerCWSJCashFlowStatementBanks extends BaseManager<ModelCWSJCashFlowStatementBanks>{

	@Override
	public Class<ModelCWSJCashFlowStatementBanks> getModelClass() {
		return ModelCWSJCashFlowStatementBanks.class;
	}

}

