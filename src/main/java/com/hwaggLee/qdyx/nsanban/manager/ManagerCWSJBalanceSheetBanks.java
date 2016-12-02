package com.hwaggLee.qdyx.nsanban.manager;

import org.springframework.stereotype.Repository;

import com.base.model.BaseManager;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJBalanceSheetBanks;

@Repository("managercwsjbalancesheetbanks")
public class ManagerCWSJBalanceSheetBanks extends BaseManager<ModelCWSJBalanceSheetBanks>{

	@Override
	public Class<ModelCWSJBalanceSheetBanks> getModelClass() {
		return ModelCWSJBalanceSheetBanks.class;
	}


}

