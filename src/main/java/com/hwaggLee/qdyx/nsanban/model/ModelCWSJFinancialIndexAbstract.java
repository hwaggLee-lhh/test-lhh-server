package com.hwaggLee.qdyx.nsanban.model;

	import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.base.model.BaseModel;

@Entity
@Table(name="financial_index_abstract")
public class ModelCWSJFinancialIndexAbstract extends BaseModel{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="paymentableGenerator")
	@GenericGenerator(name="paymentableGenerator",strategy="uuid")
	@Column(name="idStr")
	private String idStr;
	@Column(name="stockCode")
	private String stockCode;
	@Column(name="stockName")
	private String stockName;
	@Column(name="grossMargin")
	private BigDecimal grossMargin;
	@Column(name="netWorth")
	private BigDecimal netWorth;
	@Column(name="jbmgsy")
	private BigDecimal jbmgsy;
	@Column(name="netWorthYields")
	private BigDecimal netWorthYields;
	@Column(name="businessIncomeGrowthRate")
	private BigDecimal businessIncomeGrowthRate;
	@Column(name="netProfitGrowthRate")
	private BigDecimal netProfitGrowthRate;
	@Column(name="shareholdersNetProfit")
	private BigDecimal shareholdersNetProfit;
	@Column(name="worthDebtRatio")
	private BigDecimal worthDebtRatio;
	@Column(name="currentRatio")
	private BigDecimal currentRatio;
	@Column(name="dataCompiledDate")
	private Date dataCompiledDate;
	@Column(name="endDate")
	private Date endDate;
	public void setIdStr(String idStr){
		this.idStr=idStr;
	}
	public String getIdStr(){
		return idStr;
	}
	public void setStockCode(String stockCode){
		this.stockCode=stockCode;
	}
	public String getStockCode(){
		return stockCode;
	}
	public void setStockName(String stockName){
		this.stockName=stockName;
	}
	public String getStockName(){
		return stockName;
	}
	public void setGrossMargin(BigDecimal grossMargin){
		this.grossMargin=grossMargin;
	}
	public BigDecimal getGrossMargin(){
		return grossMargin;
	}
	public void setNetWorth(BigDecimal netWorth){
		this.netWorth=netWorth;
	}
	public BigDecimal getNetWorth(){
		return netWorth;
	}
	public void setNetWorthYields(BigDecimal netWorthYields){
		this.netWorthYields=netWorthYields;
	}
	public BigDecimal getNetWorthYields(){
		return netWorthYields;
	}
	public void setBusinessIncomeGrowthRate(BigDecimal businessIncomeGrowthRate){
		this.businessIncomeGrowthRate=businessIncomeGrowthRate;
	}
	public BigDecimal getBusinessIncomeGrowthRate(){
		return businessIncomeGrowthRate;
	}
	public void setNetProfitGrowthRate(BigDecimal netProfitGrowthRate){
		this.netProfitGrowthRate=netProfitGrowthRate;
	}
	public BigDecimal getNetProfitGrowthRate(){
		return netProfitGrowthRate;
	}
	public void setShareholdersNetProfit(BigDecimal shareholdersNetProfit){
		this.shareholdersNetProfit=shareholdersNetProfit;
	}
	public BigDecimal getShareholdersNetProfit(){
		return shareholdersNetProfit;
	}
	public void setWorthDebtRatio(BigDecimal worthDebtRatio){
		this.worthDebtRatio=worthDebtRatio;
	}
	public BigDecimal getWorthDebtRatio(){
		return worthDebtRatio;
	}
	public void setCurrentRatio(BigDecimal currentRatio){
		this.currentRatio=currentRatio;
	}
	public BigDecimal getCurrentRatio(){
		return currentRatio;
	}
	public void setDataCompiledDate(Date dataCompiledDate){
		this.dataCompiledDate=dataCompiledDate;
	}
	public Date getDataCompiledDate(){
		return dataCompiledDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public BigDecimal getJbmgsy() {
		return jbmgsy;
	}
	public void setJbmgsy(BigDecimal jbmgsy) {
		this.jbmgsy = jbmgsy;
	}
	
}

