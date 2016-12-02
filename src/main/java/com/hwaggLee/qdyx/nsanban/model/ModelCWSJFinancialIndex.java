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
@Table(name="financial_index")
public class ModelCWSJFinancialIndex extends BaseModel{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="paymentableGenerator")
	@GenericGenerator(name="paymentableGenerator",strategy="uuid")
	@Column(name="idStr")
	private String idStr;
	@Column(name="sec_ID")
	private String sec_ID;
	@Column(name="stockCode")
	private String stockCode;
	@Column(name="stockName")
	private String stockName;
	@Column(name="YLNLMGJBSY")
	private BigDecimal YLNLMGJBSY;
	@Column(name="YLNLMGXSSY")
	private BigDecimal YLNLMGXSSY;
	@Column(name="YLNLMGJZC")
	private BigDecimal YLNLMGJZC;
	@Column(name="YLNLJZCSYLROE")
	private BigDecimal YLNLJZCSYLROE;
	@Column(name="YLNLXSJLL")
	private BigDecimal YLNLXSJLL;
	@Column(name="YLNLXSMLL")
	private BigDecimal YLNLXSMLL;
	@Column(name="YLNLKCFJCXSYDJLRCJLR")
	private BigDecimal YLNLKCFJCXSYDJLRCJLR;
	@Column(name="XSBXBL")
	private BigDecimal XSBXBL;
	@Column(name="YYNLCHZZTS")
	private BigDecimal YYNLCHZZTS;
	@Column(name="YYNLYSZKZZTS")
	private BigDecimal YYNLYSZKZZTS;
	@Column(name="YYNLCHZZL")
	private BigDecimal YYNLCHZZL;
	@Column(name="YYNLYSZKZZL")
	private BigDecimal YYNLYSZKZZL;
	@Column(name="CZNLZCFZL")
	private BigDecimal CZNLZCFZL;
	@Column(name="CZNLQYCS")
	private BigDecimal CZNLQYCS;
	@Column(name="CZNLLDBL")
	private BigDecimal CZNLLDBL;
	@Column(name="CZNLSDBL")
	private BigDecimal CZNLSDBL;
	@Column(name="CZNLXSZJTXQLRCZFZ")
	private BigDecimal CZNLXSZJTXQLRCZFZ;
	@Column(name="CZNLJYHDCSDXJJLLCLDFZ")
	private BigDecimal CZNLJYHDCSDXJJLLCLDFZ;
	@Column(name="CZNLLXBZBS")
	private BigDecimal CZNLLXBZBS;
	@Column(name="CZNLJBMGSYTBZZL")
	private BigDecimal CZNLJBMGSYTBZZL;
	@Column(name="CZNLXSMGSSTBZZL")
	private BigDecimal CZNLXSMGSSTBZZL;
	@Column(name="CZNLYYZSRTBZZL")
	private BigDecimal CZNLYYZSRTBZZL;
	@Column(name="CZNLYYLRTBZZL")
	private BigDecimal CZNLYYLRTBZZL;
	@Column(name="CZNLJLRTBZZL")
	private BigDecimal CZNLJLRTBZZL;
	@Column(name="CZNLGSYGPGSGDDJLRTBZZL")
	private BigDecimal CZNLGSYGPGSGDDJLRTBZZL;
	@Column(name="CZNLJYHDCSDXJLLTBZZL")
	private BigDecimal CZNLJYHDCSDXJLLTBZZL;
	@Column(name="endDate")
	private Date endDate;
	@Column(name="dataCompiledDate")
	private Date dataCompiledDate;
	@Column(name="YLNLJZCSLYROWKCJQ")
	private BigDecimal YLNLJZCSLYROWKCJQ;
	public void setIdStr(String idStr){
		this.idStr=idStr;
	}
	public String getIdStr(){
		return idStr;
	}
	public void setSec_ID(String sec_ID){
		this.sec_ID=sec_ID;
	}
	public String getSec_ID(){
		return sec_ID;
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
	public void setYLNLMGJBSY(BigDecimal YLNLMGJBSY){
		this.YLNLMGJBSY=YLNLMGJBSY;
	}
	public BigDecimal getYLNLMGJBSY(){
		return YLNLMGJBSY;
	}
	public void setYLNLMGXSSY(BigDecimal YLNLMGXSSY){
		this.YLNLMGXSSY=YLNLMGXSSY;
	}
	public BigDecimal getYLNLMGXSSY(){
		return YLNLMGXSSY;
	}
	public void setYLNLJZCSYLROE(BigDecimal YLNLJZCSYLROE){
		this.YLNLJZCSYLROE=YLNLJZCSYLROE;
	}
	public BigDecimal getYLNLJZCSYLROE(){
		return YLNLJZCSYLROE;
	}
	public void setYLNLXSJLL(BigDecimal YLNLXSJLL){
		this.YLNLXSJLL=YLNLXSJLL;
	}
	public BigDecimal getYLNLXSJLL(){
		return YLNLXSJLL;
	}
	public void setYLNLXSMLL(BigDecimal YLNLXSMLL){
		this.YLNLXSMLL=YLNLXSMLL;
	}
	public BigDecimal getYLNLXSMLL(){
		return YLNLXSMLL;
	}
	public void setYLNLKCFJCXSYDJLRCJLR(BigDecimal YLNLKCFJCXSYDJLRCJLR){
		this.YLNLKCFJCXSYDJLRCJLR=YLNLKCFJCXSYDJLRCJLR;
	}
	public BigDecimal getYLNLKCFJCXSYDJLRCJLR(){
		return YLNLKCFJCXSYDJLRCJLR;
	}
	public void setXSBXBL(BigDecimal XSBXBL){
		this.XSBXBL=XSBXBL;
	}
	public BigDecimal getXSBXBL(){
		return XSBXBL;
	}
	public void setYYNLCHZZTS(BigDecimal YYNLCHZZTS){
		this.YYNLCHZZTS=YYNLCHZZTS;
	}
	public BigDecimal getYYNLCHZZTS(){
		return YYNLCHZZTS;
	}
	public void setYYNLYSZKZZTS(BigDecimal YYNLYSZKZZTS){
		this.YYNLYSZKZZTS=YYNLYSZKZZTS;
	}
	public BigDecimal getYYNLYSZKZZTS(){
		return YYNLYSZKZZTS;
	}
	public void setYYNLCHZZL(BigDecimal YYNLCHZZL){
		this.YYNLCHZZL=YYNLCHZZL;
	}
	public BigDecimal getYYNLCHZZL(){
		return YYNLCHZZL;
	}
	public void setYYNLYSZKZZL(BigDecimal YYNLYSZKZZL){
		this.YYNLYSZKZZL=YYNLYSZKZZL;
	}
	public BigDecimal getYYNLYSZKZZL(){
		return YYNLYSZKZZL;
	}
	public void setCZNLZCFZL(BigDecimal CZNLZCFZL){
		this.CZNLZCFZL=CZNLZCFZL;
	}
	public BigDecimal getCZNLZCFZL(){
		return CZNLZCFZL;
	}
	public void setCZNLQYCS(BigDecimal CZNLQYCS){
		this.CZNLQYCS=CZNLQYCS;
	}
	public BigDecimal getCZNLQYCS(){
		return CZNLQYCS;
	}
	public void setCZNLLDBL(BigDecimal CZNLLDBL){
		this.CZNLLDBL=CZNLLDBL;
	}
	public BigDecimal getCZNLLDBL(){
		return CZNLLDBL;
	}
	public void setCZNLSDBL(BigDecimal CZNLSDBL){
		this.CZNLSDBL=CZNLSDBL;
	}
	public BigDecimal getCZNLSDBL(){
		return CZNLSDBL;
	}
	public void setCZNLXSZJTXQLRCZFZ(BigDecimal CZNLXSZJTXQLRCZFZ){
		this.CZNLXSZJTXQLRCZFZ=CZNLXSZJTXQLRCZFZ;
	}
	public BigDecimal getCZNLXSZJTXQLRCZFZ(){
		return CZNLXSZJTXQLRCZFZ;
	}
	public void setCZNLJYHDCSDXJJLLCLDFZ(BigDecimal CZNLJYHDCSDXJJLLCLDFZ){
		this.CZNLJYHDCSDXJJLLCLDFZ=CZNLJYHDCSDXJJLLCLDFZ;
	}
	public BigDecimal getCZNLJYHDCSDXJJLLCLDFZ(){
		return CZNLJYHDCSDXJJLLCLDFZ;
	}
	public void setCZNLLXBZBS(BigDecimal CZNLLXBZBS){
		this.CZNLLXBZBS=CZNLLXBZBS;
	}
	public BigDecimal getCZNLLXBZBS(){
		return CZNLLXBZBS;
	}
	public void setCZNLJBMGSYTBZZL(BigDecimal CZNLJBMGSYTBZZL){
		this.CZNLJBMGSYTBZZL=CZNLJBMGSYTBZZL;
	}
	public BigDecimal getCZNLJBMGSYTBZZL(){
		return CZNLJBMGSYTBZZL;
	}
	public void setCZNLXSMGSSTBZZL(BigDecimal CZNLXSMGSSTBZZL){
		this.CZNLXSMGSSTBZZL=CZNLXSMGSSTBZZL;
	}
	public BigDecimal getCZNLXSMGSSTBZZL(){
		return CZNLXSMGSSTBZZL;
	}
	public void setCZNLYYZSRTBZZL(BigDecimal CZNLYYZSRTBZZL){
		this.CZNLYYZSRTBZZL=CZNLYYZSRTBZZL;
	}
	public BigDecimal getCZNLYYZSRTBZZL(){
		return CZNLYYZSRTBZZL;
	}
	public void setCZNLYYLRTBZZL(BigDecimal CZNLYYLRTBZZL){
		this.CZNLYYLRTBZZL=CZNLYYLRTBZZL;
	}
	public BigDecimal getCZNLYYLRTBZZL(){
		return CZNLYYLRTBZZL;
	}
	public void setCZNLJLRTBZZL(BigDecimal CZNLJLRTBZZL){
		this.CZNLJLRTBZZL=CZNLJLRTBZZL;
	}
	public BigDecimal getCZNLJLRTBZZL(){
		return CZNLJLRTBZZL;
	}
	public void setCZNLGSYGPGSGDDJLRTBZZL(BigDecimal CZNLGSYGPGSGDDJLRTBZZL){
		this.CZNLGSYGPGSGDDJLRTBZZL=CZNLGSYGPGSGDDJLRTBZZL;
	}
	public BigDecimal getCZNLGSYGPGSGDDJLRTBZZL(){
		return CZNLGSYGPGSGDDJLRTBZZL;
	}
	public void setCZNLJYHDCSDXJLLTBZZL(BigDecimal CZNLJYHDCSDXJLLTBZZL){
		this.CZNLJYHDCSDXJLLTBZZL=CZNLJYHDCSDXJLLTBZZL;
	}
	public BigDecimal getCZNLJYHDCSDXJLLTBZZL(){
		return CZNLJYHDCSDXJLLTBZZL;
	}
	public void setEndDate(Date endDate){
		this.endDate=endDate;
	}
	public Date getEndDate(){
		return endDate;
	}
	public void setDataCompiledDate(Date dataCompiledDate){
		this.dataCompiledDate=dataCompiledDate;
	}
	public Date getDataCompiledDate(){
		return dataCompiledDate;
	}
	public BigDecimal getYLNLMGJZC() {
		return YLNLMGJZC;
	}
	public void setYLNLMGJZC(BigDecimal yLNLMGJZC) {
		YLNLMGJZC = yLNLMGJZC;
	}
	public BigDecimal getYLNLJZCSLYROWKCJQ() {
		return YLNLJZCSLYROWKCJQ;
	}
	public void setYLNLJZCSLYROWKCJQ(BigDecimal yLNLJZCSLYROWKCJQ) {
		YLNLJZCSLYROWKCJQ = yLNLJZCSLYROWKCJQ;
	}
	
}

