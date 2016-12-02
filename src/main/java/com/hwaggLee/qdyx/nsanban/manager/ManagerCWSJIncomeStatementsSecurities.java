package com.hwaggLee.qdyx.nsanban.manager;

import org.springframework.stereotype.Repository;

import com.base.model.BaseManager;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJIncomeStatementsSecurities;

@Repository("managercwsjincomestatementssecurities")
public class ManagerCWSJIncomeStatementsSecurities extends BaseManager<ModelCWSJIncomeStatementsSecurities>{

	@Override
	public Class<ModelCWSJIncomeStatementsSecurities> getModelClass() {
		return ModelCWSJIncomeStatementsSecurities.class;
	}


}

