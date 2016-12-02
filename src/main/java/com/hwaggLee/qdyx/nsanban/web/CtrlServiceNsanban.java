package com.hwaggLee.qdyx.nsanban.web;

import javax.annotation.Resource;

import com.base.service.BaseService;
import com.base.web.CtrlBase;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJBalanceSheet;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJBalanceSheetBanks;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJBalanceSheetSecurities;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJCashFlowStatement;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJCashFlowStatementBanks;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJCashFlowStatementSecurities;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJFinancialIndex;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJFinancialIndexAbstract;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJIncomeStatements;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJIncomeStatementsBanks;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJIncomeStatementsSecurities;


/**
 * 接口注入类
 * @author huage
 *
 */
public class CtrlServiceNsanban extends CtrlBase {
	@Resource
	protected ServiceCWSJBalanceSheet implservicecwjsbalancesheet;
	@Resource
	protected ServiceCWSJBalanceSheetBanks implservicecwjsbalancesheetbanks;
	@Resource
	protected ServiceCWSJBalanceSheetSecurities implservicecwjsbalancesheetsecurities;
	@Resource
	protected ServiceCWSJCashFlowStatement implservicecwjscashflowstatement;
	@Resource
	protected ServiceCWSJCashFlowStatementBanks implservicecwjscashflowstatementbanks;
	@Resource
	protected ServiceCWSJCashFlowStatementSecurities implservicecwjscashflowstatementsecurities;
	@Resource
	protected ServiceCWSJFinancialIndex implservicecwjsfinancialindex;
	@Resource
	protected ServiceCWSJFinancialIndexAbstract implservicecwjsfinancialindexabstract;
	@Resource
	protected ServiceCWSJIncomeStatements implservicecwjsincomestatements;
	@Resource
	protected ServiceCWSJIncomeStatementsBanks implservicecwjsincomestatementsbanks;
	@Resource
	protected ServiceCWSJIncomeStatementsSecurities implservicecwjsincomestatementssecurities;
	
	protected BaseService<?> getService(String type){
		if(type == null)return null;
		BaseService<?> service = null;
		switch(type.toUpperCase()){
		case "BALANCESHEET":
			service = this.implservicecwjsbalancesheet;
			break;
		default:
			
			break;
		}
		return service ;
	}
	
	
}
