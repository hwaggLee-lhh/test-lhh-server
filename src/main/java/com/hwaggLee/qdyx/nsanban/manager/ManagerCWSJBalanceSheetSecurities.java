package com.hwaggLee.qdyx.nsanban.manager;

import org.springframework.stereotype.Repository;

import com.base.model.BaseManager;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJBalanceSheetSecurities;

@Repository("managercwsjbalancesheetsecurities")
public class ManagerCWSJBalanceSheetSecurities extends BaseManager<ModelCWSJBalanceSheetSecurities>{

	@Override
	public Class<ModelCWSJBalanceSheetSecurities> getModelClass() {
		return ModelCWSJBalanceSheetSecurities.class;
	}


}

