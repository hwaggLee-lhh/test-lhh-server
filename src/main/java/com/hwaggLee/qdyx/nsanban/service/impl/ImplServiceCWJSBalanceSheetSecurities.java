package com.hwaggLee.qdyx.nsanban.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.base.model.BaseManager;
import com.base.service.impl.BaseServiceImpl;
import com.hwaggLee.qdyx.nsanban.manager.ManagerCWSJBalanceSheetSecurities;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJBalanceSheetSecurities;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJBalanceSheetSecurities;

@Service("implservicecwjsbalancesheetsecurities")
public class ImplServiceCWJSBalanceSheetSecurities extends BaseServiceImpl<ModelCWSJBalanceSheetSecurities> implements ServiceCWSJBalanceSheetSecurities{

	@Resource
	private ManagerCWSJBalanceSheetSecurities managercwsjbalancesheetsecurities;

	@Override
	protected BaseManager<ModelCWSJBalanceSheetSecurities> getBaseManager() {
		return managercwsjbalancesheetsecurities;
	}



}

