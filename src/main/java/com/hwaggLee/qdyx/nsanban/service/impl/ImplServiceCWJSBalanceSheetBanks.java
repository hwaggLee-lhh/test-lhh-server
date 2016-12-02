package com.hwaggLee.qdyx.nsanban.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.base.model.BaseManager;
import com.base.service.impl.BaseServiceImpl;
import com.hwaggLee.qdyx.nsanban.manager.ManagerCWSJBalanceSheetBanks;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJBalanceSheetBanks;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJBalanceSheetBanks;

@Service("implservicecwjsbalancesheetbanks")
public class ImplServiceCWJSBalanceSheetBanks extends BaseServiceImpl<ModelCWSJBalanceSheetBanks> implements ServiceCWSJBalanceSheetBanks{

	@Resource
	private ManagerCWSJBalanceSheetBanks managercwsjbalancesheetbanks;

	@Override
	protected BaseManager<ModelCWSJBalanceSheetBanks> getBaseManager() {
		return managercwsjbalancesheetbanks;
	}



}

