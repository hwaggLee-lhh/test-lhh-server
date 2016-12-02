package com.hwaggLee.qdyx.nsanban.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.hwaggLee.qdyx.nsanban.model.ModelCWSJBalanceSheet;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJCashFlowStatement;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJFinancialIndex;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJFinancialIndexAbstract;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJIncomeStatements;
import com.hwaggLee.utils.UtilsDate;
import com.org.apache.poi.xssf.UtilsExcelReader;

public class StartPoiExcel_nsanban_cwsj {

	public static void main(String[] args) {
		String path= "C:\\Users\\huage\\Desktop\\财务\\待挂牌\\一般企业资产负债表_待挂牌_4.5.xlsx";
		List<Map<Integer,Object>>  list = UtilsExcelReader.processExcelMaps(path, "Sheet0");
		processExcelModelCWSJBalanceSheet(list);
	}
	
	
	/**
	 * 资产负债
	 * @param list
	 * @return
	 */
	public static List<ModelCWSJBalanceSheet> processExcelModelCWSJBalanceSheet(List<Map<Integer,Object>>  list){
		if( list == null || list.size()== 0)return null;
		ModelCWSJBalanceSheet model0 = null;
		int i = -1 ;
		List<ModelCWSJBalanceSheet> modelList = new ArrayList<ModelCWSJBalanceSheet>();
		for (Map<Integer, Object> map : list) {
			i = -1 ;
			String stockCode = map.get(++i)!=null?map.get(i).toString():null;
			String stockName = map.get(++i)!=null?map.get(i).toString():null;
			if( stockCode == null )continue;
			if( StringUtils.isBlank(stockCode) )continue;
			if( stockCode.length()<6)continue;
			stockCode = stockCode.substring(0,6);
			if( !StringUtils.isNumeric(stockCode))continue;
			model0 = new ModelCWSJBalanceSheet();
			modelList.add(model0);
			//股票代码
			model0.setStockCode(stockCode);
			//股票简称
			model0.setStockName(stockName);
			//货币资金
			model0.setHbZiJin(getBigDecimal(map.get(++i)));
			//结算备付金
			model0.setJsFuBeiJin(getBigDecimal(map.get(++i)));
			//拆出资金
			model0.setCcZiJin(getBigDecimal(map.get(++i)));
			//交易性金融资产
			model0.setJyXJRZiChan(getBigDecimal(map.get(++i)));
			//应收票据
			model0.setYsPiaoJu(getBigDecimal(map.get(++i)));
			//应收账款
			model0.setYsZhangKuan(getBigDecimal(map.get(++i)));
			//预付款项
			model0.setYfKuangXiang(getBigDecimal(map.get(++i)));
			//应收保费
			model0.setYsBaoFei(getBigDecimal(map.get(++i)));
			//应收分保账款
			model0.setYsFBZhangkuan(getBigDecimal(map.get(++i)));
			//应收分保合同准备金
			model0.setYsFBHTZhunBeiJin(getBigDecimal(map.get(++i)));
			//应收利息
			model0.setYsLiXi(getBigDecimal(map.get(++i)));
			//应收股利
			model0.setYsGuLi(getBigDecimal(map.get(++i)));
			//其他应收款
			model0.setQtYSKuan(getBigDecimal(map.get(++i)));
			//应收出口退税
			model0.setYsCKTuiShui(getBigDecimal(map.get(++i)));
			//应收补贴款
			model0.setYsBuTieKuan(getBigDecimal(map.get(++i)));
			//内部应收款
			model0.setNbYSKuan(getBigDecimal(map.get(++i)));
			//买入返售金融资产
			model0.setMrFSJRZiChan(getBigDecimal(map.get(++i)));
			//存货
			model0.setCunHuo(getBigDecimal(map.get(++i)));
			//一年内到期的非流动资产
			model0.setYnNDQDFLDFuZhai(getBigDecimal(map.get(++i)));
			//其他流动资产
			model0.setQtLDZiChan(getBigDecimal(map.get(++i)));
			//流动资产其他项目
			model0.setLdZCQTXiangMu(getBigDecimal(map.get(++i)));
			//流动资产平衡项目
			model0.setLdZCPHXiangMu(getBigDecimal(map.get(++i)));
			//流动资产合计
			model0.setLdZCHeJi(getBigDecimal(map.get(++i)));
			//发放委托贷款及垫款
			model0.setFfWTDKJDianKuan(getBigDecimal(map.get(++i)));
			//可供出售金融资产
			model0.setKgCSJRZiChan(getBigDecimal(map.get(++i)));
			//持有至到期投资
			model0.setCyZDQTouZi(getBigDecimal(map.get(++i)));
			//长期应收款
			model0.setCqYShouKuan(getBigDecimal(map.get(++i)));
			//长期股权投资
			model0.setCqGQTouZi(getBigDecimal(map.get(++i)));
			//投资性房地产
			model0.setTzXFanDiChan(getBigDecimal(map.get(++i)));
			//固定资产
			model0.setGdZiChan(getBigDecimal(map.get(++i)));
			//在建工程
			model0.setZjGongCheng(getBigDecimal(map.get(++i)));
			//工程物资
			model0.setGcWuZi(getBigDecimal(map.get(++i)));
			//固定资产清理
			model0.setGdZCQingLi(getBigDecimal(map.get(++i)));
			//生产性生物资产
			model0.setScXSWZiChan(getBigDecimal(map.get(++i)));
			//油气资产
			model0.setYqZiChan(getBigDecimal(map.get(++i)));
			//无形资产
			model0.setWxZiChan(getBigDecimal(map.get(++i)));
			//商誉
			model0.setSyZQYHeJi(getBigDecimal(map.get(++i)));
			//长期待摊费用
			model0.setCqDTFeiYong(getBigDecimal(map.get(++i)));
			//递延所得税资产
			model0.setDySDSZiChan(getBigDecimal(map.get(++i)));
			//其他非流动资产
			model0.setQtFLDZiChan(getBigDecimal(map.get(++i)));
			//非流动资产其他项目
			model0.setFlDZCQTXiangMu(getBigDecimal(map.get(++i)));
			//非流动资产平衡项目
			model0.setFlDZCPHXiangMu(getBigDecimal(map.get(++i)));
			//非流动资产合计
			model0.setFlDZCHeJi(getBigDecimal(map.get(++i)));
			//资产其他项目
			model0.setZcQTXiangMu(getBigDecimal(map.get(++i)));
			//资产平衡项目
			model0.setZcPHXiangMu(getBigDecimal(map.get(++i)));
			//资产总计
			model0.setZcZongJi(getBigDecimal(map.get(++i)));
			//短期借款
			model0.setDqJieKuan(getBigDecimal(map.get(++i)));
			//向中央银行借款
			model0.setXzYYHJieKuan(getBigDecimal(map.get(++i)));
			//吸收存款及同业存放
			model0.setXsCKJTYCunFang(getBigDecimal(map.get(++i)));
			//拆入资金
			model0.setXrZiJin(getBigDecimal(map.get(++i)));
			//交易性金融负债
			model0.setJyXJRFuZhai(getBigDecimal(map.get(++i)));
			//应付票据
			model0.setYfPiaoJu(getBigDecimal(map.get(++i)));
			//应付账款
			model0.setYfZhangKuan(getBigDecimal(map.get(++i)));
			//预收款项
			model0.setFsKuanXiang(getBigDecimal(map.get(++i)));
			//卖出回购金融资产款
			model0.setMcHGJRZiChanKuan(getBigDecimal(map.get(++i)));
			//应付手续费及佣金
			model0.setYfSXFJRongJin(getBigDecimal(map.get(++i)));
			//应交税费
			model0.setYfShuiFei(getBigDecimal(map.get(++i)));
			//应付利息
			model0.setYfLiXi(getBigDecimal(map.get(++i)));
			//应付股利
			model0.setYfGuLi(getBigDecimal(map.get(++i)));
			//应付分保账款
			model0.setYfFBZhangKuan(getBigDecimal(map.get(++i)));
			//内部应付款
			model0.setNbYingFuKuan(getBigDecimal(map.get(++i)));
			//其他应付款
			model0.setQtYingFuKuan(getBigDecimal(map.get(++i)));
			//预计流动负债
			model0.setYjLDFuKuan(getBigDecimal(map.get(++i)));
			//保险合同准备金
			model0.setBxHTZhengQuanKuan(getBigDecimal(map.get(++i)));
			//代理买卖证券款
			model0.setDlMMZhengQuanKuan(getBigDecimal(map.get(++i)));
			//代理承销证券款
			model0.setDlCXZhengQuanKuan(getBigDecimal(map.get(++i)));
			//一年内的递延收益
			model0.setYnNDDYShouYi(getBigDecimal(map.get(++i)));
			//应付短期债券
			model0.setYfDQZhaiQuan(getBigDecimal(map.get(++i)));
			//一年内到期的非流动负债
			model0.setYnNDQDFLDFuZhai(getBigDecimal(map.get(++i)));
			//其他流动负债
			model0.setQtLDFuZhai(getBigDecimal(map.get(++i)));
			//流动负债其他项目
			model0.setLdFZQTXiangMu(getBigDecimal(map.get(++i)));
			//流动负债平衡项目
			model0.setLdFZPHXiangMu(getBigDecimal(map.get(++i)));
			//流动负债合计
			model0.setLdFZHeJi(getBigDecimal(map.get(++i)));
			//长期借款
			model0.setCqJieKuan(getBigDecimal(map.get(++i)));
			//应付债券
			model0.setYfZhaiQuan(getBigDecimal(map.get(++i)));
			//优先股
			model0.setQzYouXianGu(getBigDecimal(map.get(++i)));
			//永续债
			model0.setQzYongXuZhai(getBigDecimal(map.get(++i)));
			//长期应付款
			model0.setCqYingFuKuan(getBigDecimal(map.get(++i)));
			//专项应付款
			model0.setZxYingFuKuan(getBigDecimal(map.get(++i)));
			//预计负债
			model0.setYjFuZhai(getBigDecimal(map.get(++i)));
			//递延收益
			model0.setDyShouYi(getBigDecimal(map.get(++i)));
			//递延所得税负债
			model0.setDySDSFuZhai(getBigDecimal(map.get(++i)));
			//其他非流动负债
			model0.setQtFLDFuZhai(getBigDecimal(map.get(++i)));
			//非流动负债其他项目
			model0.setFlDFZQTXiangMu(getBigDecimal(map.get(++i)));
			//非流动负债平衡项目
			model0.setFlDFZPHXiangMu(getBigDecimal(map.get(++i)));
			//非流动负债合计
			model0.setFlDFZHeJi(getBigDecimal(map.get(++i)));
			//负债其他项目
			model0.setFzQTXiangMu(getBigDecimal(map.get(++i)));
			//负债平衡项目
			model0.setFzPHXiangMu(getBigDecimal(map.get(++i)));
			//负债合计
			model0.setFzHeJi(getBigDecimal(map.get(++i)));
			//实收资本(股本)
			model0.setSsZiBen(getBigDecimal(map.get(++i)));
			//资本公积
			model0.setZbGongJi(getBigDecimal(map.get(++i)));
			//库存股
			model0.setJkCunGu(getBigDecimal(map.get(++i)));
			//专项储备
			model0.setZxChuBei(getBigDecimal(map.get(++i)));
			//盈余公积
			model0.setYyGongJi(getBigDecimal(map.get(++i)));
			//一般风险准备
			model0.setYbFXZhunBei(getBigDecimal(map.get(++i)));
			//未确定的投资损失
			model0.setWqDDTZSunShi(getBigDecimal(map.get(++i)));
			//未分配利润
			model0.setWfPLiRun(getBigDecimal(map.get(++i)));
			//拟分配现金股利
			model0.setNfPXJGuLi(getBigDecimal(map.get(++i)));
			//外币报表折算差额
			model0.setWbBBZSChaE(getBigDecimal(map.get(++i)));
			//归属于母公司股东权益其他项目
			model0.setGsYMGSGDQYQTXiangMu(getBigDecimal(map.get(++i)));
			//归属于母公司股东权益平衡项目
			model0.setGsYMGSGDQYPHXiangMu(getBigDecimal(map.get(++i)));
			//归属于母公司股东权益合计
			model0.setGsYMGSGDQYHeJi(getBigDecimal(map.get(++i)));
			//少数股东权益
			model0.setSsGDQuanYi(getBigDecimal(map.get(++i)));
			//股东权益其他项目
			model0.setGdQYQTXiangMu(getBigDecimal(map.get(++i)));
			//股东权益平衡项目
			model0.setGdQYPHXiangMu(getBigDecimal(map.get(++i)));
			//股东权益合计
			model0.setSyZQYHeJi(getBigDecimal(map.get(++i)));
			//负债和股东权益其他项目
			model0.setFzHGDQYQTXiangMu(getBigDecimal(map.get(++i)));
			//负债和股东权益平衡项目
			model0.setFzHGDQYPHXiangMu(getBigDecimal(map.get(++i)));
			//负债和股东权益合计
			model0.setFzHSYZQYHeJi(getBigDecimal(map.get(++i)));
			//其他权益工具
			model0.setQtQYGongJu(getBigDecimal(map.get(++i)));
			//永续债
			model0.setQzYongXuGu(getBigDecimal(map.get(++i)));
			//其他综合收益
			model0.setQtZHShouYi(getBigDecimal(map.get(++i)));
			//报告日期
			model0.setEndDate(getDate(map.get(++i)));
			//数据采集日期
			model0.setDataCompiledDate(new Date());
		}
		return modelList;
	}
	
	
	/**
	 * 现金流量
	 * @param list
	 * @return
	 */
	public static List<ModelCWSJCashFlowStatement> processExcelModelCWSJCashFlowStatement(List<Map<Integer,Object>>  list){
		if( list == null || list.size()== 0)return null;
		ModelCWSJCashFlowStatement model0 = null;
		int i = -1 ;
		List<ModelCWSJCashFlowStatement> modelList = new ArrayList<ModelCWSJCashFlowStatement>();
		for (Map<Integer, Object> map : list) {
			i = -1 ;
			String stockCode = map.get(++i)!=null?map.get(i).toString():null;
			String stockName = map.get(++i)!=null?map.get(i).toString():null;
			if( stockCode == null )continue;
			if( StringUtils.isBlank(stockCode) )continue;
			if( stockCode.length()<6)continue;
			stockCode = stockCode.substring(0,6);
			if( !StringUtils.isNumeric(stockCode))continue;
			model0 = new ModelCWSJCashFlowStatement();
			modelList.add(model0);
			//股票代码
			model0.setStockCode(stockCode);
			//股票简称
			model0.setStockName(stockName);
			//销售商品、提供劳务收到的现金
			model0.setXSSPTGLWSDDXianJin(getBigDecimal(map.get(++i)));
			//客户存款和同业存放款项净增加额
			model0.setKHCKHTYCFKXJZengJiaE(getBigDecimal(map.get(++i)));
			//向中央银行借款净增加额
			model0.setXZYYHYKJZengJiaE(getBigDecimal(map.get(++i)));
			//向其他金融机构拆入资金净增加额
			model0.setXQTJRJGCRZJJZengJiaE(getBigDecimal(map.get(++i)));
			//收到原保险合同保费取得的现金
			model0.setSDYBXHTBFQDDXianJin(getBigDecimal(map.get(++i)));
			//收到再保险业务现金净额
			model0.setSDZBXYWXJJingE(getBigDecimal(map.get(++i)));
			//保户储金及投资款净增加额
			model0.setBHCJJTZKJZengJiaE(getBigDecimal(map.get(++i)));
			//处置交易性金融资产净增加额
			model0.setCZJYXJRZCJZengJiaE(getBigDecimal(map.get(++i)));
			//收取利息、手续费及佣金的现金
			model0.setSQLXSXFJYJDXianJin(getBigDecimal(map.get(++i)));
			//拆入资金净增加额
			model0.setCRZJJZengJiaE(getBigDecimal(map.get(++i)));
			//回购业务资金净增加额
			model0.setHGYWZJJZengJiaE(getBigDecimal(map.get(++i)));
			//收到的税费返还
			model0.setSDDSFFanHuan(getBigDecimal(map.get(++i)));
			//收到其他与经营活动有关的现金
			model0.setSDDQTYJYHDYGDXianJin(getBigDecimal(map.get(++i)));
			//经营活动现金流入其他项目
			model0.setJYHDXJLRQTXiangMu(getBigDecimal(map.get(++i)));
			//经营活动现金流入平衡项目
			model0.setJYHDXJLRPingHengXiangMu(getBigDecimal(map.get(++i)));
			//经营活动现金流入小计
			model0.setJYHDXJLRXiaoJi(getBigDecimal(map.get(++i)));
			//购买商品、接受劳务支付的现金
			model0.setGMSPJSLWZFDXianJin(getBigDecimal(map.get(++i)));
			//客户贷款及垫款净增加额
			model0.setKHDKJDKJZengJiaE(getBigDecimal(map.get(++i)));
			//存放中央银行和同业款项净增加额
			model0.setCFZYYHHTYKXJZengJiaE(getBigDecimal(map.get(++i)));
			//支付原保险合同赔付款项的现金
			model0.setZFYBXHTPFKXDXianJin(getBigDecimal(map.get(++i)));
			//支付利息、手续费及佣金的现金
			model0.setZFLXSXFJYJDXianJin(getBigDecimal(map.get(++i)));
			//支付保单红利的现金
			model0.setZFBDHLDXianJin(getBigDecimal(map.get(++i)));
			//支付给职工以及为职工支付的现金
			model0.setZFGZGJYWZGZFDXianJin(getBigDecimal(map.get(++i)));
			//支付的各项税费
			model0.setZFDGXFeiYong(getBigDecimal(map.get(++i)));
			//支付其他与经营活动有关的现金
			model0.setZFDQTYJYHDNGYGDXianJin(getBigDecimal(map.get(++i)));
			//经营活动现金流出其他项目
			model0.setYYHDXJHCQTXiangMu(getBigDecimal(map.get(++i)));
			//经营活动现金流出平衡项目
			model0.setJYHDXJLCPingHengXiangMu(getBigDecimal(map.get(++i)));
			//经营活动现金流出小计
			model0.setJYHDXJLCXiaoJi(getBigDecimal(map.get(++i)));
			//经营活动产生的现金流量净额其他项目
			model0.setJYHDCSDXJLLJEQTXiangMu(getBigDecimal(map.get(++i)));
			//经营活动产生的现金流量净额平衡项目
			model0.setJYHDCSDXJLLJEPHXiangMu(getBigDecimal(map.get(++i)));
			//经营活动产生的现金流量净额
			model0.setJYHDCSDXJLLJingE(getBigDecimal(map.get(++i)));
			//收回投资收到的现金
			model0.setSHTZSQDDXianJin(getBigDecimal(map.get(++i)));
			//取得投资收益收到的现金
			model0.setQDTZSYSDDXianJin(getBigDecimal(map.get(++i)));
			//处置固定资产、无形资产和其他长期资产收回的现金净额
			model0.setCZGDZCWXZCHQTCQZCSHSDXianJin(getBigDecimal(map.get(++i)));
			//处置子公司及其他营业单位收到的现金净额
			model0.setCZZGSJQTYEDWSDDXJJingE(getBigDecimal(map.get(++i)));
			//收到其他与投资活动有关的现金
			model0.setSDDQTYTZHDYGDXianJin(getBigDecimal(map.get(++i)));
			//减少质押和定期存款所收到的现金
			model0.setSSZYHDQCKSSDDXianJin(getBigDecimal(map.get(++i)));
			//投资活动现金流入其他项目
			model0.setTZHDXJLRQTXiangMu(getBigDecimal(map.get(++i)));
			//投资活动现金流入平衡项目
			model0.setTZHDXJLRPHXiangMu(getBigDecimal(map.get(++i)));
			//投资活动现金流入小计
			model0.setTZHDXJLRXiaoJi(getBigDecimal(map.get(++i)));
			//购建固定资产、无形资产和其他长期资产支付的现金
			model0.setGJGDWXHQTCQZCSZFDXianJin(getBigDecimal(map.get(++i)));
			//投资支付的现金
			model0.setTZSZFDXianJin(getBigDecimal(map.get(++i)));
			//质押贷款净增加额
			model0.setZYDKJZengJiaE(getBigDecimal(map.get(++i)));
			//取得子公司及其他营业单位支付的现金净额
			model0.setQDZGSJQTYYDWZFDXJJingE(getBigDecimal(map.get(++i)));
			//支付其他与投资活动有关的现金
			model0.setZFDQTYTZHDYGDXianJin(getBigDecimal(map.get(++i)));
			//增加质押和定期存款所支付的现金
			model0.setZJZYHDYCKSZFDXianJin(getBigDecimal(map.get(++i)));
			//投资活动现金流出其他项目
			model0.setTZHDXJLCQTXiangMu(getBigDecimal(map.get(++i)));
			//投资活动现金流出平衡项目
			model0.setTZHDXJLCPHXiangMu(getBigDecimal(map.get(++i)));
			//投资活动现金流出小计
			model0.setTZHDXJLCXiaoJi(getBigDecimal(map.get(++i)));
			//投资活动产生的现金流量净额其他项目
			model0.setTZHDCSDXJLLJEQTXiangMu(getBigDecimal(map.get(++i)));
			//投资活动产生的现金流量净额平衡项目
			model0.setTZHDCSDXJLLJEPHXiangMu(getBigDecimal(map.get(++i)));
			//投资活动产生的现金流量净额
			model0.setTZHDCSDXJLLJingE(getBigDecimal(map.get(++i)));
			//吸收投资收到的现金
			model0.setXSTZSDDXianJin(getBigDecimal(map.get(++i)));
			//其中:子公司吸收少数股东投资收到的现金
			model0.setZGSXISSGDTZSDDXianJin(getBigDecimal(map.get(++i)));
			//取得借款收到的现金
			model0.setQDJKSDDXianJin(getBigDecimal(map.get(++i)));
			//发行债券收到的现金
			model0.setFXZQSDDXianJin(getBigDecimal(map.get(++i)));
			//收到其他与筹资活动有关的现金
			model0.setSDQTYCZHDYGDXianJin(getBigDecimal(map.get(++i)));
			//筹资活动现金流入其他项目
			model0.setCZHDXJLRQTXiangMu(getBigDecimal(map.get(++i)));
			//筹资活动现金流入平衡项目
			model0.setCZHDXJLRPHXiangMu(getBigDecimal(map.get(++i)));
			//筹资活动现金流入小计
			model0.setCZHDXJLRXiaoJi(getBigDecimal(map.get(++i)));
			//偿还债务支付的现金
			model0.setCHZWZFDXianJin(getBigDecimal(map.get(++i)));
			//分配股利、利润或偿付利息支付的现金
			model0.setFPGLLRHCFLXSZFDXianJin(getBigDecimal(map.get(++i)));
			//子公司支付给少数股东的股利、利润
			model0.setZGSZFGSSGDDLiRun(getBigDecimal(map.get(++i)));
			//支付其他与筹资活动有关的现金
			model0.setZFQTYCZHDYGDXianJin(getBigDecimal(map.get(++i)));
			//筹资活动现金流出其他项目
			model0.setCZHDXJLCQTXiangMu(getBigDecimal(map.get(++i)));
			//筹资活动现金流出平衡项目
			model0.setCZHDXJLCPHXiangMu(getBigDecimal(map.get(++i)));
			//筹资活动现金流出小计
			model0.setCZHDXJLCXiaoJi(getBigDecimal(map.get(++i)));
			//筹资活动产生的现金流量净额其他项目
			model0.setCZHDCSDXJLLJEQTXiangMu(getBigDecimal(map.get(++i)));
			//筹资活动产生的现金流量净额平衡项目
			model0.setCZHDCSDXJLLJEPHXiangMu(getBigDecimal(map.get(++i)));
			//筹资活动产生的现金流量净额
			model0.setCZHDCSDXJLLJingE(getBigDecimal(map.get(++i)));
			//特殊处理本身不平现金净额(excel不导)
			model0.setTSCLBSBPXJJingE(new BigDecimal(0));
			++i;
			//特殊处理本身不平现金净额(excel不导)
			model0.setTSCLGSBTXJJingE(new BigDecimal(0));
			++i;
			//汇率变动对现金及现金等价物的影响
			model0.setHLBDDXJJXJDJWDYingXiang(getBigDecimal(map.get(++i)));
			//现金及现金等价物净增加额其他项目
			model0.setXJJXJDJWZJEQTXiangMu(getBigDecimal(map.get(++i)));
			//现金及现金等价物净增加额平衡项目
			model0.setXJJXJDJWJZJEPHXiangMu(getBigDecimal(map.get(++i)));
			//现金及现金等价物净增加额
			model0.setXJJXJDJWJZengJiaE(getBigDecimal(map.get(++i)));
			//期初现金及现金等价物余额
			model0.setQCXJJXJDJWYuE(getBigDecimal(map.get(++i)));
			//期末现金及现金等价物余额其他项目
			model0.setQMXJJXJDJWYEQTXiangMu(getBigDecimal(map.get(++i)));
			//期末现金及现金等价物余额平衡项目
			model0.setQMXJJXJDJWYEPHXiangMu(getBigDecimal(map.get(++i)));
			//期末现金及现金等价物余额
			model0.setQMXJJXJDJWYuE(getBigDecimal(map.get(++i)));
			//报告日期
			model0.setEndDate(getDate(map.get(++i)));
			//数据采集日期
			model0.setDataCompiledDate(new Date());
		}
		return modelList;
	}
	
	/**
	 * 利润表
	 * @param list
	 * @return
	 */
	public static List<ModelCWSJIncomeStatements> processExcelModelCWSJIncomeStatements(List<Map<Integer,Object>>  list){
		if( list == null || list.size()== 0)return null;
		ModelCWSJIncomeStatements model0 = null;
		int i = -1 ;
		List<ModelCWSJIncomeStatements> modelList = new ArrayList<ModelCWSJIncomeStatements>();
		for (Map<Integer, Object> map : list) {
			i = -1 ;
			String stockCode = map.get(++i)!=null?map.get(i).toString():null;
			String stockName = map.get(++i)!=null?map.get(i).toString():null;
			if( stockCode == null )continue;
			if( StringUtils.isBlank(stockCode) )continue;
			if( stockCode.length()<6)continue;
			stockCode = stockCode.substring(0,6);
			if( !StringUtils.isNumeric(stockCode))continue;
			model0 = new ModelCWSJIncomeStatements();
			modelList.add(model0);
			//股票代码
			model0.setStockCode(stockCode);
			//股票简称
			model0.setStockName(stockName);
			//营业总收入
			model0.setYingYeZongShouRu(getBigDecimal(map.get(++i)));
			//营业收入
			model0.setYingYeShouRu(getBigDecimal(map.get(++i)));
			//利息收入
			model0.setLiXiShouRu(getBigDecimal(map.get(++i)));
			//已赚保费
			model0.setYiZhunBaoFei(getBigDecimal(map.get(++i)));
			//手续费及佣金收入
			model0.setSsfJYJShouRu(getBigDecimal(map.get(++i)));
			//其他业务收入
			model0.setQtyWShouRu(getBigDecimal(map.get(++i)));
			//营业总收入其他项目
			model0.setYszSRQTXiangMu(getBigDecimal(map.get(++i)));
			//营业总成本
			model0.setYyzChengBen(getBigDecimal(map.get(++i)));
			//营业成本
			model0.setYingYeCheng(getBigDecimal(map.get(++i)));
			//利息支出
			model0.setLiXiZhiChu(getBigDecimal(map.get(++i)));
			//手续费及佣金支出
			model0.setSsfJYJZhiChu(getBigDecimal(map.get(++i)));
			//研发费用
			model0.setYffeiYong(getBigDecimal(map.get(++i)));
			//退保金
			model0.setTuiBaoJin(getBigDecimal(map.get(++i)));
			//赔付支出净额
			model0.setPeiFuZhiChuJinE(getBigDecimal(map.get(++i)));
			//提取保险合同准备金净额
			model0.setTqbXHEZBJJinE(getBigDecimal(map.get(++i)));
			//保单红利支出
			model0.setBdHLZhiChu(getBigDecimal(map.get(++i)));
			//分保费用
			model0.setFbFeiYong(getBigDecimal(map.get(++i)));
			//其他业务成本
			model0.setQtYWChengBen(getBigDecimal(map.get(++i)));
			//营业税金及附加
			model0.setYySJJFuJia(getBigDecimal(map.get(++i)));
			//销售费用
			model0.setXiaoShouFeiYong(getBigDecimal(map.get(++i)));
			//财务费用
			model0.setCaiWuFeiYong(getBigDecimal(map.get(++i)));
			//资产减值损失
			model0.setZiChanJianZhiSunShi(getBigDecimal(map.get(++i)));
			//营业总成本其他项目
			model0.setYyZCBQTXiangMu(getBigDecimal(map.get(++i)));
			//公允价值变动收益
			model0.setGyJZBDShouYi(getBigDecimal(map.get(++i)));
			//投资收益
			model0.setTouZiShouYi(getBigDecimal(map.get(++i)));
			//对联营企业和合营企业的投资收益
			model0.setDlYQYHYQYDTZShouYi(getBigDecimal(map.get(++i)));
			//汇兑收益
			model0.setHuiZongShouYi(getBigDecimal(map.get(++i)));
			//营业利润其他项目
			model0.setYyLRQTXiangMu(getBigDecimal(map.get(++i)));
			//营业利润平衡项目
			model0.setLlLRPHXiangMu(getBigDecimal(map.get(++i)));
			//营业利润
			model0.setYyLiRun(getBigDecimal(map.get(++i)));
			//营业外收入
			model0.setYyWShouRu(getBigDecimal(map.get(++i)));
			//非流动资产处置净损失
			model0.setFlDZCCZJinSunShi(getBigDecimal(map.get(++i)));
			//影响利润总额的其他项目
			model0.setYxLRZEDQTXiangMu(getBigDecimal(map.get(++i)));
			//利润总额
			model0.setLrZongE(getBigDecimal(map.get(++i)));
			//所得税
			model0.setSuoDeShui(getBigDecimal(map.get(++i)));
			//未确认投资损失
			model0.setWqDTZShouShi(getBigDecimal(map.get(++i)));
			//影响净利润的其他项目
			model0.setYxJLRDQTXiangMu(getBigDecimal(map.get(++i)));
			//净利润
			model0.setJingLiRun(getBigDecimal(map.get(++i)));
			//被合并方在合并前实现利润
			model0.setBhBFZHBQSXLiRun(getBigDecimal(map.get(++i)));
			//归属于母公司股东的净利润
			model0.setGsYMGSGDDJinLiRun(getBigDecimal(map.get(++i)));
			//少数股东损益
			model0.setSsGDSunYi(getBigDecimal(map.get(++i)));
			//净利润其他项目
			model0.setJlRQTXiangMu(getBigDecimal(map.get(++i)));
			//净利润差额(合计平衡项目)
			model0.setJlRChaE(getBigDecimal(map.get(++i)));
			//(一)基本每股收益
			model0.setJbMGShouYi(getBigDecimal(map.get(++i)));
			//(二)稀释每股收益
			model0.setXsMGShouYi(getBigDecimal(map.get(++i)));
			//其他综合收益
			model0.setQtZHShouYi(getBigDecimal(map.get(++i)));
			//归属于母公司股东的其他综合收益
			model0.setGsYMGSGDDQTZHShouYi(getBigDecimal(map.get(++i)));
			//综合收益总额
			model0.setZhShouYiZongE(getBigDecimal(map.get(++i)));
			//归属于母公司所有者的综合收益总额
			model0.setGsYMGSSYZDZHSYZongE(getBigDecimal(map.get(++i)));
			//管理费用
			model0.setGlFeiYong(getBigDecimal(map.get(++i)));
			//归属于少数股东的综合收益总额
			model0.setGsYSSGDDZHSYZongE(getBigDecimal(map.get(++i)));
			//报告日期
			model0.setEndDate(getDate(map.get(++i)));
			//数据采集日期
			model0.setDataCompiledDate(new Date());
		}
		return modelList;
	}
	/**
	 * 财务指标
	 * @param list
	 * @return
	 */
	public static List<ModelCWSJFinancialIndex> processExcelModelCWSJFinancialIndex(List<Map<Integer,Object>>  list){
		if( list == null || list.size()== 0)return null;
		ModelCWSJFinancialIndex model0 = null;
		int i = -1 ;
		List<ModelCWSJFinancialIndex> modelList = new ArrayList<ModelCWSJFinancialIndex>();
		for (Map<Integer, Object> map : list) {
			i = -1 ;
			String stockCode = map.get(++i)!=null?map.get(i).toString():null;
			String stockName = map.get(++i)!=null?map.get(i).toString():null;
			if( stockCode == null )continue;
			if( StringUtils.isBlank(stockCode) )continue;
			if( stockCode.length()<6)continue;
			stockCode = stockCode.substring(0,6);
			if( !StringUtils.isNumeric(stockCode))continue;
			model0 = new ModelCWSJFinancialIndex();
			modelList.add(model0);
			//股票代码
			model0.setStockCode(stockCode);
			//股票简称
			model0.setStockName(stockName);
			//每股收益EPS(基本)
			model0.setYLNLMGJBSY(getBigDecimal(map.get(++i)));
			//每股收益EPS(稀释)
			model0.setYLNLMGXSSY(getBigDecimal(map.get(++i)));
			//每股净资产BPS
			model0.setYLNLMGJZC(getBigDecimal(map.get(++i)));
			//净资产收益率ROE(加权)
			model0.setYLNLJZCSYLROE(getBigDecimal(map.get(++i)));
			//销售净利率
			model0.setYLNLXSJLL(getBigDecimal(map.get(++i)));
			//盈利能力：销售毛利率
			model0.setYLNLXSMLL(getBigDecimal(map.get(++i)));
			//盈利能力：扣除非经常性损益的净利率/净利润
			model0.setYLNLKCFJCXSYDJLRCJLR(getBigDecimal(map.get(++i)));
			//盈利能力：销售变现比率(choise查询不到此数据，暂时使用  “经营活动产生的现金流量净额/营业收入”  代替)
			model0.setXSBXBL(getBigDecimal(map.get(++i)));
			
			
			//营运能力：存货周转天数
			model0.setYYNLCHZZTS(getBigDecimal(map.get(++i)));
			//营运能力：应收账款周转天数
			model0.setYYNLYSZKZZTS(getBigDecimal(map.get(++i)));
			//营运能力：存货周转率
			model0.setYYNLCHZZL(getBigDecimal(map.get(++i)));
			//营运能力：应收账款周转率
			model0.setYYNLYSZKZZL(getBigDecimal(map.get(++i)));
			//偿债能力：资产负债率
			model0.setCZNLZCFZL(getBigDecimal(map.get(++i)));
			//偿债能力：权益乘数
			model0.setCZNLQYCS(getBigDecimal(map.get(++i)));
			//偿债能力：流动比率
			model0.setCZNLLDBL(getBigDecimal(map.get(++i)));
			//偿债能力：速动比率
			model0.setCZNLSDBL(getBigDecimal(map.get(++i)));
			//偿债能力：息税折旧摊销前利润/总负债
			model0.setCZNLXSZJTXQLRCZFZ(getBigDecimal(map.get(++i)));
			//偿债能力：经营活动产生的现金净流量/流动负债
			model0.setCZNLJYHDCSDXJJLLCLDFZ(getBigDecimal(map.get(++i)));
			//偿债能力：利息保障倍数
			model0.setCZNLLXBZBS(getBigDecimal(map.get(++i)));
			//成长能力：基本每股收益同比增长率
			model0.setCZNLJBMGSYTBZZL(getBigDecimal(map.get(++i)));
			//成长能力：稀释每股收益率同比增长率
			model0.setCZNLXSMGSSTBZZL(getBigDecimal(map.get(++i)));
			//成长能力：营业总收入同比增长率
			model0.setCZNLYYZSRTBZZL(getBigDecimal(map.get(++i)));
			//成长能力：营业利润同比增长率
			model0.setCZNLYYLRTBZZL(getBigDecimal(map.get(++i)));
			//成长能力：净利润同比增长率
			model0.setCZNLJLRTBZZL(getBigDecimal(map.get(++i)));
			//成长能力：归属于挂牌公司股东的净利润同比增长率
			model0.setCZNLGSYGPGSGDDJLRTBZZL(getBigDecimal(map.get(++i)));
			//成长能力：经营活动产生的现金流量同比增长率
			model0.setCZNLJYHDCSDXJLLTBZZL(getBigDecimal(map.get(++i)));
			//报告日期
			model0.setEndDate(getDate(map.get(++i)));
			//数据采集日期
			model0.setDataCompiledDate(new Date());
			i++;
			//盈利能力：净资产收益率ROE(扣除加权)
			model0.setYLNLJZCSLYROWKCJQ(getBigDecimal(map.get(++i)));
			
			
		}
		return modelList;
	}
	/**
	 * 财务指标摘要
	 * @param list
	 * @return
	 */
	public static List<ModelCWSJFinancialIndexAbstract> processExcelModelCWSJFinancialIndexAbstract(List<Map<Integer,Object>>  list){
		if( list == null || list.size()== 0)return null;
		ModelCWSJFinancialIndexAbstract model0 = null;
		ModelCWSJFinancialIndexAbstract model1 = null;
		ModelCWSJFinancialIndexAbstract model2 = null;
		int i = -1 ;
		List<ModelCWSJFinancialIndexAbstract> modelList = new ArrayList<ModelCWSJFinancialIndexAbstract>();
		for (Map<Integer, Object> map : list) {
			i = -1 ;
			String stockCode = map.get(++i)!=null?map.get(i).toString():null;
			String stockName = map.get(++i)!=null?map.get(i).toString():null;
			if( stockCode == null )continue;
			if( StringUtils.isBlank(stockCode) )continue;
			if( stockCode.length()<6)continue;
			stockCode = stockCode.substring(0,6);
			if( !StringUtils.isNumeric(stockCode))continue;
			model0 = new ModelCWSJFinancialIndexAbstract();
			model1 = new ModelCWSJFinancialIndexAbstract();
			model2 = new ModelCWSJFinancialIndexAbstract();
			modelList.add(model0);
			modelList.add(model1);
			modelList.add(model2);
			//报告日期
			model0.setEndDate(UtilsDate.getStringToDate(UtilsDate.yyyy_MM_dd, "2012-12-31"));
			model1.setEndDate(UtilsDate.getStringToDate(UtilsDate.yyyy_MM_dd, "2013-12-31"));
			model2.setEndDate(UtilsDate.getStringToDate(UtilsDate.yyyy_MM_dd, "2014-12-31"));
			//数据采集日期
			model0.setDataCompiledDate(new Date());
			model1.setDataCompiledDate(new Date());
			model2.setDataCompiledDate(new Date());
			
			//股票代码
			model0.setStockCode(stockCode);
			model1.setStockCode(stockCode);
			model2.setStockCode(stockCode);
			//股票简称
			model0.setStockName(stockName);
			model1.setStockName(stockName);
			model2.setStockName(stockName);
			
		}
		return modelList;
	}
	
	private static BigDecimal getBigDecimal(Object ob ){
		if( ob == null || StringUtils.isBlank(ob.toString()) ) {
			return new BigDecimal(0);
		}
		try {
			return new BigDecimal(ob.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new BigDecimal(0);
	}

	private static Date getDate(Object ob ){
		if( ob == null || StringUtils.isBlank(ob.toString())) {
			return null;
		}
		try {
			if( ob.toString().length()>10){
				return UtilsDate.getStringToDate(UtilsDate.yyyy_MM_dd_HH_mm_ss, ob.toString());
			}else{
				return UtilsDate.getStringToDate(UtilsDate.yyyy_MM_dd, ob.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
