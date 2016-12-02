package com.hwaggLee.qdyx.nsanban.manager;

import org.springframework.stereotype.Repository;

import com.base.model.BaseManager;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJIncomeStatementsBanks;

@Repository("managercwsjincomestatementsbanks")
public class ManagerCWSJIncomeStatementsBanks extends BaseManager<ModelCWSJIncomeStatementsBanks>{

	@Override
	public Class<ModelCWSJIncomeStatementsBanks> getModelClass() {
		return ModelCWSJIncomeStatementsBanks.class;
	}

}

