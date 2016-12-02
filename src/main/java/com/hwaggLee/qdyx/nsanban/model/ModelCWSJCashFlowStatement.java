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
@Table(name="cash_flow_statement")
public class ModelCWSJCashFlowStatement extends BaseModel{

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
	@Column(name="dataCompiledDate")
	private Date dataCompiledDate;
	@Column(name="XSSPTGLWSDDXianJin")
	private BigDecimal XSSPTGLWSDDXianJin;
	@Column(name="KHCKHTYCFKXJZengJiaE")
	private BigDecimal KHCKHTYCFKXJZengJiaE;
	@Column(name="XZYYHYKJZengJiaE")
	private BigDecimal XZYYHYKJZengJiaE;
	@Column(name="XQTJRJGCRZJJZengJiaE")
	private BigDecimal XQTJRJGCRZJJZengJiaE;
	@Column(name="SDYBXHTBFQDDXianJin")
	private BigDecimal SDYBXHTBFQDDXianJin;
	@Column(name="SDZBXYWXJJingE")
	private BigDecimal SDZBXYWXJJingE;
	@Column(name="BHCJJTZKJZengJiaE")
	private BigDecimal BHCJJTZKJZengJiaE;
	@Column(name="CZJYXJRZCJZengJiaE")
	private BigDecimal CZJYXJRZCJZengJiaE;
	@Column(name="SQLXSXFJYJDXianJin")
	private BigDecimal SQLXSXFJYJDXianJin;
	@Column(name="CRZJJZengJiaE")
	private BigDecimal CRZJJZengJiaE;
	@Column(name="HGYWZJJZengJiaE")
	private BigDecimal HGYWZJJZengJiaE;
	@Column(name="SDDSFFanHuan")
	private BigDecimal SDDSFFanHuan;
	@Column(name="SDDQTYJYHDYGDXianJin")
	private BigDecimal SDDQTYJYHDYGDXianJin;
	@Column(name="JYHDXJLRQTXiangMu")
	private BigDecimal JYHDXJLRQTXiangMu;
	@Column(name="JYHDXJLRPingHengXiangMu")
	private BigDecimal JYHDXJLRPingHengXiangMu;
	@Column(name="JYHDXJLRXiaoJi")
	private BigDecimal JYHDXJLRXiaoJi;
	@Column(name="GMSPJSLWZFDXianJin")
	private BigDecimal GMSPJSLWZFDXianJin;
	@Column(name="KHDKJDKJZengJiaE")
	private BigDecimal KHDKJDKJZengJiaE;
	@Column(name="CFZYYHHTYKXJZengJiaE")
	private BigDecimal CFZYYHHTYKXJZengJiaE;
	@Column(name="ZFYBXHTPFKXDXianJin")
	private BigDecimal ZFYBXHTPFKXDXianJin;
	@Column(name="ZFLXSXFJYJDXianJin")
	private BigDecimal ZFLXSXFJYJDXianJin;
	@Column(name="ZFBDHLDXianJin")
	private BigDecimal ZFBDHLDXianJin;
	@Column(name="ZFGZGJYWZGZFDXianJin")
	private BigDecimal ZFGZGJYWZGZFDXianJin;
	@Column(name="ZFDGXFeiYong")
	private BigDecimal ZFDGXFeiYong;
	@Column(name="ZFDQTYJYHDNGYGDXianJin")
	private BigDecimal ZFDQTYJYHDNGYGDXianJin;
	@Column(name="YYHDXJHCQTXiangMu")
	private BigDecimal YYHDXJHCQTXiangMu;
	@Column(name="JYHDXJLCPingHengXiangMu")
	private BigDecimal JYHDXJLCPingHengXiangMu;
	@Column(name="JYHDXJLCXiaoJi")
	private BigDecimal JYHDXJLCXiaoJi;
	@Column(name="JYHDCSDXJLLJEQTXiangMu")
	private BigDecimal JYHDCSDXJLLJEQTXiangMu;
	@Column(name="JYHDCSDXJLLJEPHXiangMu")
	private BigDecimal JYHDCSDXJLLJEPHXiangMu;
	@Column(name="JYHDCSDXJLLJingE")
	private BigDecimal JYHDCSDXJLLJingE;
	@Column(name="SHTZSQDDXianJin")
	private BigDecimal SHTZSQDDXianJin;
	@Column(name="QDTZSYSDDXianJin")
	private BigDecimal QDTZSYSDDXianJin;
	@Column(name="CZGDZCWXZCHQTCQZCSHSDXianJin")
	private BigDecimal CZGDZCWXZCHQTCQZCSHSDXianJin;
	@Column(name="CZZGSJQTYEDWSDDXJJingE")
	private BigDecimal CZZGSJQTYEDWSDDXJJingE;
	@Column(name="SDDQTYTZHDYGDXianJin")
	private BigDecimal SDDQTYTZHDYGDXianJin;
	@Column(name="SSZYHDQCKSSDDXianJin")
	private BigDecimal SSZYHDQCKSSDDXianJin;
	@Column(name="TZHDXJLRQTXiangMu")
	private BigDecimal TZHDXJLRQTXiangMu;
	@Column(name="TZHDXJLRPHXiangMu")
	private BigDecimal TZHDXJLRPHXiangMu;
	@Column(name="TZHDXJLRXiaoJi")
	private BigDecimal TZHDXJLRXiaoJi;
	@Column(name="GJGDWXHQTCQZCSZFDXianJin")
	private BigDecimal GJGDWXHQTCQZCSZFDXianJin;
	@Column(name="TZSZFDXianJin")
	private BigDecimal TZSZFDXianJin;
	@Column(name="ZYDKJZengJiaE")
	private BigDecimal ZYDKJZengJiaE;
	@Column(name="QDZGSJQTYYDWZFDXJJingE")
	private BigDecimal QDZGSJQTYYDWZFDXJJingE;
	@Column(name="ZFDQTYTZHDYGDXianJin")
	private BigDecimal ZFDQTYTZHDYGDXianJin;
	@Column(name="ZJZYHDYCKSZFDXianJin")
	private BigDecimal ZJZYHDYCKSZFDXianJin;
	@Column(name="TZHDXJLCQTXiangMu")
	private BigDecimal TZHDXJLCQTXiangMu;
	@Column(name="TZHDXJLCPHXiangMu")
	private BigDecimal TZHDXJLCPHXiangMu;
	@Column(name="TZHDXJLCXiaoJi")
	private BigDecimal TZHDXJLCXiaoJi;
	@Column(name="TZHDCSDXJLLJEQTXiangMu")
	private BigDecimal TZHDCSDXJLLJEQTXiangMu;
	@Column(name="TZHDCSDXJLLJEPHXiangMu")
	private BigDecimal TZHDCSDXJLLJEPHXiangMu;
	@Column(name="TZHDCSDXJLLJingE")
	private BigDecimal TZHDCSDXJLLJingE;
	@Column(name="XSTZSDDXianJin")
	private BigDecimal XSTZSDDXianJin;
	@Column(name="ZGSXISSGDTZSDDXianJin")
	private BigDecimal ZGSXISSGDTZSDDXianJin;
	@Column(name="QDJKSDDXianJin")
	private BigDecimal QDJKSDDXianJin;
	@Column(name="FXZQSDDXianJin")
	private BigDecimal FXZQSDDXianJin;
	@Column(name="SDQTYCZHDYGDXianJin")
	private BigDecimal SDQTYCZHDYGDXianJin;
	@Column(name="CZHDXJLRQTXiangMu")
	private BigDecimal CZHDXJLRQTXiangMu;
	@Column(name="CZHDXJLRPHXiangMu")
	private BigDecimal CZHDXJLRPHXiangMu;
	@Column(name="CZHDXJLRXiaoJi")
	private BigDecimal CZHDXJLRXiaoJi;
	@Column(name="CHZWZFDXianJin")
	private BigDecimal CHZWZFDXianJin;
	@Column(name="FPGLLRHCFLXSZFDXianJin")
	private BigDecimal FPGLLRHCFLXSZFDXianJin;
	@Column(name="ZGSZFGSSGDDLiRun")
	private BigDecimal ZGSZFGSSGDDLiRun;
	@Column(name="ZFQTYCZHDYGDXianJin")
	private BigDecimal ZFQTYCZHDYGDXianJin;
	@Column(name="CZHDXJLCQTXiangMu")
	private BigDecimal CZHDXJLCQTXiangMu;
	@Column(name="CZHDXJLCPHXiangMu")
	private BigDecimal CZHDXJLCPHXiangMu;
	@Column(name="CZHDXJLCXiaoJi")
	private BigDecimal CZHDXJLCXiaoJi;
	@Column(name="CZHDCSDXJLLJEQTXiangMu")
	private BigDecimal CZHDCSDXJLLJEQTXiangMu;
	@Column(name="CZHDCSDXJLLJEPHXiangMu")
	private BigDecimal CZHDCSDXJLLJEPHXiangMu;
	@Column(name="CZHDCSDXJLLJingE")
	private BigDecimal CZHDCSDXJLLJingE;
	@Column(name="TSCLBSBPXJJingE")
	private BigDecimal TSCLBSBPXJJingE;
	@Column(name="TSCLGSBTXJJingE")
	private BigDecimal TSCLGSBTXJJingE;
	@Column(name="HLBDDXJJXJDJWDYingXiang")
	private BigDecimal HLBDDXJJXJDJWDYingXiang;
	@Column(name="XJJXJDJWZJEQTXiangMu")
	private BigDecimal XJJXJDJWZJEQTXiangMu;
	@Column(name="XJJXJDJWJZJEPHXiangMu")
	private BigDecimal XJJXJDJWJZJEPHXiangMu;
	@Column(name="XJJXJDJWJZengJiaE")
	private BigDecimal XJJXJDJWJZengJiaE;
	@Column(name="QCXJJXJDJWYuE")
	private BigDecimal QCXJJXJDJWYuE;
	@Column(name="QMXJJXJDJWYEQTXiangMu")
	private BigDecimal QMXJJXJDJWYEQTXiangMu;
	@Column(name="QMXJJXJDJWYEPHXiangMu")
	private BigDecimal QMXJJXJDJWYEPHXiangMu;
	@Column(name="QMXJJXJDJWYuE")
	private BigDecimal QMXJJXJDJWYuE;
	@Column(name="endDate")
	private Date endDate;
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
	public void setDataCompiledDate(Date dataCompiledDate){
		this.dataCompiledDate=dataCompiledDate;
	}
	public Date getDataCompiledDate(){
		return dataCompiledDate;
	}
	public void setXSSPTGLWSDDXianJin(BigDecimal XSSPTGLWSDDXianJin){
		this.XSSPTGLWSDDXianJin=XSSPTGLWSDDXianJin;
	}
	public BigDecimal getXSSPTGLWSDDXianJin(){
		return XSSPTGLWSDDXianJin;
	}
	public void setKHCKHTYCFKXJZengJiaE(BigDecimal KHCKHTYCFKXJZengJiaE){
		this.KHCKHTYCFKXJZengJiaE=KHCKHTYCFKXJZengJiaE;
	}
	public BigDecimal getKHCKHTYCFKXJZengJiaE(){
		return KHCKHTYCFKXJZengJiaE;
	}
	public void setXZYYHYKJZengJiaE(BigDecimal XZYYHYKJZengJiaE){
		this.XZYYHYKJZengJiaE=XZYYHYKJZengJiaE;
	}
	public BigDecimal getXZYYHYKJZengJiaE(){
		return XZYYHYKJZengJiaE;
	}
	public void setXQTJRJGCRZJJZengJiaE(BigDecimal XQTJRJGCRZJJZengJiaE){
		this.XQTJRJGCRZJJZengJiaE=XQTJRJGCRZJJZengJiaE;
	}
	public BigDecimal getXQTJRJGCRZJJZengJiaE(){
		return XQTJRJGCRZJJZengJiaE;
	}
	public void setSDYBXHTBFQDDXianJin(BigDecimal SDYBXHTBFQDDXianJin){
		this.SDYBXHTBFQDDXianJin=SDYBXHTBFQDDXianJin;
	}
	public BigDecimal getSDYBXHTBFQDDXianJin(){
		return SDYBXHTBFQDDXianJin;
	}
	public void setSDZBXYWXJJingE(BigDecimal SDZBXYWXJJingE){
		this.SDZBXYWXJJingE=SDZBXYWXJJingE;
	}
	public BigDecimal getSDZBXYWXJJingE(){
		return SDZBXYWXJJingE;
	}
	public void setBHCJJTZKJZengJiaE(BigDecimal BHCJJTZKJZengJiaE){
		this.BHCJJTZKJZengJiaE=BHCJJTZKJZengJiaE;
	}
	public BigDecimal getBHCJJTZKJZengJiaE(){
		return BHCJJTZKJZengJiaE;
	}
	public void setCZJYXJRZCJZengJiaE(BigDecimal CZJYXJRZCJZengJiaE){
		this.CZJYXJRZCJZengJiaE=CZJYXJRZCJZengJiaE;
	}
	public BigDecimal getCZJYXJRZCJZengJiaE(){
		return CZJYXJRZCJZengJiaE;
	}
	public void setSQLXSXFJYJDXianJin(BigDecimal SQLXSXFJYJDXianJin){
		this.SQLXSXFJYJDXianJin=SQLXSXFJYJDXianJin;
	}
	public BigDecimal getSQLXSXFJYJDXianJin(){
		return SQLXSXFJYJDXianJin;
	}
	public void setCRZJJZengJiaE(BigDecimal CRZJJZengJiaE){
		this.CRZJJZengJiaE=CRZJJZengJiaE;
	}
	public BigDecimal getCRZJJZengJiaE(){
		return CRZJJZengJiaE;
	}
	public void setHGYWZJJZengJiaE(BigDecimal HGYWZJJZengJiaE){
		this.HGYWZJJZengJiaE=HGYWZJJZengJiaE;
	}
	public BigDecimal getHGYWZJJZengJiaE(){
		return HGYWZJJZengJiaE;
	}
	public void setSDDSFFanHuan(BigDecimal SDDSFFanHuan){
		this.SDDSFFanHuan=SDDSFFanHuan;
	}
	public BigDecimal getSDDSFFanHuan(){
		return SDDSFFanHuan;
	}
	public void setSDDQTYJYHDYGDXianJin(BigDecimal SDDQTYJYHDYGDXianJin){
		this.SDDQTYJYHDYGDXianJin=SDDQTYJYHDYGDXianJin;
	}
	public BigDecimal getSDDQTYJYHDYGDXianJin(){
		return SDDQTYJYHDYGDXianJin;
	}
	public void setJYHDXJLRQTXiangMu(BigDecimal JYHDXJLRQTXiangMu){
		this.JYHDXJLRQTXiangMu=JYHDXJLRQTXiangMu;
	}
	public BigDecimal getJYHDXJLRQTXiangMu(){
		return JYHDXJLRQTXiangMu;
	}
	public void setJYHDXJLRPingHengXiangMu(BigDecimal JYHDXJLRPingHengXiangMu){
		this.JYHDXJLRPingHengXiangMu=JYHDXJLRPingHengXiangMu;
	}
	public BigDecimal getJYHDXJLRPingHengXiangMu(){
		return JYHDXJLRPingHengXiangMu;
	}
	public void setJYHDXJLRXiaoJi(BigDecimal JYHDXJLRXiaoJi){
		this.JYHDXJLRXiaoJi=JYHDXJLRXiaoJi;
	}
	public BigDecimal getJYHDXJLRXiaoJi(){
		return JYHDXJLRXiaoJi;
	}
	public void setGMSPJSLWZFDXianJin(BigDecimal GMSPJSLWZFDXianJin){
		this.GMSPJSLWZFDXianJin=GMSPJSLWZFDXianJin;
	}
	public BigDecimal getGMSPJSLWZFDXianJin(){
		return GMSPJSLWZFDXianJin;
	}
	public void setKHDKJDKJZengJiaE(BigDecimal KHDKJDKJZengJiaE){
		this.KHDKJDKJZengJiaE=KHDKJDKJZengJiaE;
	}
	public BigDecimal getKHDKJDKJZengJiaE(){
		return KHDKJDKJZengJiaE;
	}
	public void setCFZYYHHTYKXJZengJiaE(BigDecimal CFZYYHHTYKXJZengJiaE){
		this.CFZYYHHTYKXJZengJiaE=CFZYYHHTYKXJZengJiaE;
	}
	public BigDecimal getCFZYYHHTYKXJZengJiaE(){
		return CFZYYHHTYKXJZengJiaE;
	}
	public void setZFYBXHTPFKXDXianJin(BigDecimal ZFYBXHTPFKXDXianJin){
		this.ZFYBXHTPFKXDXianJin=ZFYBXHTPFKXDXianJin;
	}
	public BigDecimal getZFYBXHTPFKXDXianJin(){
		return ZFYBXHTPFKXDXianJin;
	}
	public void setZFLXSXFJYJDXianJin(BigDecimal ZFLXSXFJYJDXianJin){
		this.ZFLXSXFJYJDXianJin=ZFLXSXFJYJDXianJin;
	}
	public BigDecimal getZFLXSXFJYJDXianJin(){
		return ZFLXSXFJYJDXianJin;
	}
	public void setZFBDHLDXianJin(BigDecimal ZFBDHLDXianJin){
		this.ZFBDHLDXianJin=ZFBDHLDXianJin;
	}
	public BigDecimal getZFBDHLDXianJin(){
		return ZFBDHLDXianJin;
	}
	public void setZFGZGJYWZGZFDXianJin(BigDecimal ZFGZGJYWZGZFDXianJin){
		this.ZFGZGJYWZGZFDXianJin=ZFGZGJYWZGZFDXianJin;
	}
	public BigDecimal getZFGZGJYWZGZFDXianJin(){
		return ZFGZGJYWZGZFDXianJin;
	}
	public void setZFDGXFeiYong(BigDecimal ZFDGXFeiYong){
		this.ZFDGXFeiYong=ZFDGXFeiYong;
	}
	public BigDecimal getZFDGXFeiYong(){
		return ZFDGXFeiYong;
	}
	public void setZFDQTYJYHDNGYGDXianJin(BigDecimal ZFDQTYJYHDNGYGDXianJin){
		this.ZFDQTYJYHDNGYGDXianJin=ZFDQTYJYHDNGYGDXianJin;
	}
	public BigDecimal getZFDQTYJYHDNGYGDXianJin(){
		return ZFDQTYJYHDNGYGDXianJin;
	}
	public void setYYHDXJHCQTXiangMu(BigDecimal YYHDXJHCQTXiangMu){
		this.YYHDXJHCQTXiangMu=YYHDXJHCQTXiangMu;
	}
	public BigDecimal getYYHDXJHCQTXiangMu(){
		return YYHDXJHCQTXiangMu;
	}
	public void setJYHDXJLCPingHengXiangMu(BigDecimal JYHDXJLCPingHengXiangMu){
		this.JYHDXJLCPingHengXiangMu=JYHDXJLCPingHengXiangMu;
	}
	public BigDecimal getJYHDXJLCPingHengXiangMu(){
		return JYHDXJLCPingHengXiangMu;
	}
	public void setJYHDXJLCXiaoJi(BigDecimal JYHDXJLCXiaoJi){
		this.JYHDXJLCXiaoJi=JYHDXJLCXiaoJi;
	}
	public BigDecimal getJYHDXJLCXiaoJi(){
		return JYHDXJLCXiaoJi;
	}
	public void setJYHDCSDXJLLJEQTXiangMu(BigDecimal JYHDCSDXJLLJEQTXiangMu){
		this.JYHDCSDXJLLJEQTXiangMu=JYHDCSDXJLLJEQTXiangMu;
	}
	public BigDecimal getJYHDCSDXJLLJEQTXiangMu(){
		return JYHDCSDXJLLJEQTXiangMu;
	}
	public void setJYHDCSDXJLLJEPHXiangMu(BigDecimal JYHDCSDXJLLJEPHXiangMu){
		this.JYHDCSDXJLLJEPHXiangMu=JYHDCSDXJLLJEPHXiangMu;
	}
	public BigDecimal getJYHDCSDXJLLJEPHXiangMu(){
		return JYHDCSDXJLLJEPHXiangMu;
	}
	public void setJYHDCSDXJLLJingE(BigDecimal JYHDCSDXJLLJingE){
		this.JYHDCSDXJLLJingE=JYHDCSDXJLLJingE;
	}
	public BigDecimal getJYHDCSDXJLLJingE(){
		return JYHDCSDXJLLJingE;
	}
	public void setSHTZSQDDXianJin(BigDecimal SHTZSQDDXianJin){
		this.SHTZSQDDXianJin=SHTZSQDDXianJin;
	}
	public BigDecimal getSHTZSQDDXianJin(){
		return SHTZSQDDXianJin;
	}
	public void setQDTZSYSDDXianJin(BigDecimal QDTZSYSDDXianJin){
		this.QDTZSYSDDXianJin=QDTZSYSDDXianJin;
	}
	public BigDecimal getQDTZSYSDDXianJin(){
		return QDTZSYSDDXianJin;
	}
	public void setCZGDZCWXZCHQTCQZCSHSDXianJin(BigDecimal CZGDZCWXZCHQTCQZCSHSDXianJin){
		this.CZGDZCWXZCHQTCQZCSHSDXianJin=CZGDZCWXZCHQTCQZCSHSDXianJin;
	}
	public BigDecimal getCZGDZCWXZCHQTCQZCSHSDXianJin(){
		return CZGDZCWXZCHQTCQZCSHSDXianJin;
	}
	public void setCZZGSJQTYEDWSDDXJJingE(BigDecimal CZZGSJQTYEDWSDDXJJingE){
		this.CZZGSJQTYEDWSDDXJJingE=CZZGSJQTYEDWSDDXJJingE;
	}
	public BigDecimal getCZZGSJQTYEDWSDDXJJingE(){
		return CZZGSJQTYEDWSDDXJJingE;
	}
	public void setSDDQTYTZHDYGDXianJin(BigDecimal SDDQTYTZHDYGDXianJin){
		this.SDDQTYTZHDYGDXianJin=SDDQTYTZHDYGDXianJin;
	}
	public BigDecimal getSDDQTYTZHDYGDXianJin(){
		return SDDQTYTZHDYGDXianJin;
	}
	public void setSSZYHDQCKSSDDXianJin(BigDecimal SSZYHDQCKSSDDXianJin){
		this.SSZYHDQCKSSDDXianJin=SSZYHDQCKSSDDXianJin;
	}
	public BigDecimal getSSZYHDQCKSSDDXianJin(){
		return SSZYHDQCKSSDDXianJin;
	}
	public void setTZHDXJLRQTXiangMu(BigDecimal TZHDXJLRQTXiangMu){
		this.TZHDXJLRQTXiangMu=TZHDXJLRQTXiangMu;
	}
	public BigDecimal getTZHDXJLRQTXiangMu(){
		return TZHDXJLRQTXiangMu;
	}
	public void setTZHDXJLRPHXiangMu(BigDecimal TZHDXJLRPHXiangMu){
		this.TZHDXJLRPHXiangMu=TZHDXJLRPHXiangMu;
	}
	public BigDecimal getTZHDXJLRPHXiangMu(){
		return TZHDXJLRPHXiangMu;
	}
	public void setTZHDXJLRXiaoJi(BigDecimal TZHDXJLRXiaoJi){
		this.TZHDXJLRXiaoJi=TZHDXJLRXiaoJi;
	}
	public BigDecimal getTZHDXJLRXiaoJi(){
		return TZHDXJLRXiaoJi;
	}
	public void setGJGDWXHQTCQZCSZFDXianJin(BigDecimal GJGDWXHQTCQZCSZFDXianJin){
		this.GJGDWXHQTCQZCSZFDXianJin=GJGDWXHQTCQZCSZFDXianJin;
	}
	public BigDecimal getGJGDWXHQTCQZCSZFDXianJin(){
		return GJGDWXHQTCQZCSZFDXianJin;
	}
	public void setTZSZFDXianJin(BigDecimal TZSZFDXianJin){
		this.TZSZFDXianJin=TZSZFDXianJin;
	}
	public BigDecimal getTZSZFDXianJin(){
		return TZSZFDXianJin;
	}
	public void setZYDKJZengJiaE(BigDecimal ZYDKJZengJiaE){
		this.ZYDKJZengJiaE=ZYDKJZengJiaE;
	}
	public BigDecimal getZYDKJZengJiaE(){
		return ZYDKJZengJiaE;
	}
	public void setQDZGSJQTYYDWZFDXJJingE(BigDecimal QDZGSJQTYYDWZFDXJJingE){
		this.QDZGSJQTYYDWZFDXJJingE=QDZGSJQTYYDWZFDXJJingE;
	}
	public BigDecimal getQDZGSJQTYYDWZFDXJJingE(){
		return QDZGSJQTYYDWZFDXJJingE;
	}
	public void setZFDQTYTZHDYGDXianJin(BigDecimal ZFDQTYTZHDYGDXianJin){
		this.ZFDQTYTZHDYGDXianJin=ZFDQTYTZHDYGDXianJin;
	}
	public BigDecimal getZFDQTYTZHDYGDXianJin(){
		return ZFDQTYTZHDYGDXianJin;
	}
	public void setZJZYHDYCKSZFDXianJin(BigDecimal ZJZYHDYCKSZFDXianJin){
		this.ZJZYHDYCKSZFDXianJin=ZJZYHDYCKSZFDXianJin;
	}
	public BigDecimal getZJZYHDYCKSZFDXianJin(){
		return ZJZYHDYCKSZFDXianJin;
	}
	public void setTZHDXJLCQTXiangMu(BigDecimal TZHDXJLCQTXiangMu){
		this.TZHDXJLCQTXiangMu=TZHDXJLCQTXiangMu;
	}
	public BigDecimal getTZHDXJLCQTXiangMu(){
		return TZHDXJLCQTXiangMu;
	}
	public void setTZHDXJLCPHXiangMu(BigDecimal TZHDXJLCPHXiangMu){
		this.TZHDXJLCPHXiangMu=TZHDXJLCPHXiangMu;
	}
	public BigDecimal getTZHDXJLCPHXiangMu(){
		return TZHDXJLCPHXiangMu;
	}
	public void setTZHDXJLCXiaoJi(BigDecimal TZHDXJLCXiaoJi){
		this.TZHDXJLCXiaoJi=TZHDXJLCXiaoJi;
	}
	public BigDecimal getTZHDXJLCXiaoJi(){
		return TZHDXJLCXiaoJi;
	}
	public void setTZHDCSDXJLLJEQTXiangMu(BigDecimal TZHDCSDXJLLJEQTXiangMu){
		this.TZHDCSDXJLLJEQTXiangMu=TZHDCSDXJLLJEQTXiangMu;
	}
	public BigDecimal getTZHDCSDXJLLJEQTXiangMu(){
		return TZHDCSDXJLLJEQTXiangMu;
	}
	public void setTZHDCSDXJLLJEPHXiangMu(BigDecimal TZHDCSDXJLLJEPHXiangMu){
		this.TZHDCSDXJLLJEPHXiangMu=TZHDCSDXJLLJEPHXiangMu;
	}
	public BigDecimal getTZHDCSDXJLLJEPHXiangMu(){
		return TZHDCSDXJLLJEPHXiangMu;
	}
	public void setTZHDCSDXJLLJingE(BigDecimal TZHDCSDXJLLJingE){
		this.TZHDCSDXJLLJingE=TZHDCSDXJLLJingE;
	}
	public BigDecimal getTZHDCSDXJLLJingE(){
		return TZHDCSDXJLLJingE;
	}
	public void setXSTZSDDXianJin(BigDecimal XSTZSDDXianJin){
		this.XSTZSDDXianJin=XSTZSDDXianJin;
	}
	public BigDecimal getXSTZSDDXianJin(){
		return XSTZSDDXianJin;
	}
	public void setZGSXISSGDTZSDDXianJin(BigDecimal ZGSXISSGDTZSDDXianJin){
		this.ZGSXISSGDTZSDDXianJin=ZGSXISSGDTZSDDXianJin;
	}
	public BigDecimal getZGSXISSGDTZSDDXianJin(){
		return ZGSXISSGDTZSDDXianJin;
	}
	public void setQDJKSDDXianJin(BigDecimal QDJKSDDXianJin){
		this.QDJKSDDXianJin=QDJKSDDXianJin;
	}
	public BigDecimal getQDJKSDDXianJin(){
		return QDJKSDDXianJin;
	}
	public void setFXZQSDDXianJin(BigDecimal FXZQSDDXianJin){
		this.FXZQSDDXianJin=FXZQSDDXianJin;
	}
	public BigDecimal getFXZQSDDXianJin(){
		return FXZQSDDXianJin;
	}
	public void setSDQTYCZHDYGDXianJin(BigDecimal SDQTYCZHDYGDXianJin){
		this.SDQTYCZHDYGDXianJin=SDQTYCZHDYGDXianJin;
	}
	public BigDecimal getSDQTYCZHDYGDXianJin(){
		return SDQTYCZHDYGDXianJin;
	}
	public void setCZHDXJLRQTXiangMu(BigDecimal CZHDXJLRQTXiangMu){
		this.CZHDXJLRQTXiangMu=CZHDXJLRQTXiangMu;
	}
	public BigDecimal getCZHDXJLRQTXiangMu(){
		return CZHDXJLRQTXiangMu;
	}
	public void setCZHDXJLRPHXiangMu(BigDecimal CZHDXJLRPHXiangMu){
		this.CZHDXJLRPHXiangMu=CZHDXJLRPHXiangMu;
	}
	public BigDecimal getCZHDXJLRPHXiangMu(){
		return CZHDXJLRPHXiangMu;
	}
	public void setCZHDXJLRXiaoJi(BigDecimal CZHDXJLRXiaoJi){
		this.CZHDXJLRXiaoJi=CZHDXJLRXiaoJi;
	}
	public BigDecimal getCZHDXJLRXiaoJi(){
		return CZHDXJLRXiaoJi;
	}
	public void setCHZWZFDXianJin(BigDecimal CHZWZFDXianJin){
		this.CHZWZFDXianJin=CHZWZFDXianJin;
	}
	public BigDecimal getCHZWZFDXianJin(){
		return CHZWZFDXianJin;
	}
	public void setFPGLLRHCFLXSZFDXianJin(BigDecimal FPGLLRHCFLXSZFDXianJin){
		this.FPGLLRHCFLXSZFDXianJin=FPGLLRHCFLXSZFDXianJin;
	}
	public BigDecimal getFPGLLRHCFLXSZFDXianJin(){
		return FPGLLRHCFLXSZFDXianJin;
	}
	public void setZGSZFGSSGDDLiRun(BigDecimal ZGSZFGSSGDDLiRun){
		this.ZGSZFGSSGDDLiRun=ZGSZFGSSGDDLiRun;
	}
	public BigDecimal getZGSZFGSSGDDLiRun(){
		return ZGSZFGSSGDDLiRun;
	}
	public void setZFQTYCZHDYGDXianJin(BigDecimal ZFQTYCZHDYGDXianJin){
		this.ZFQTYCZHDYGDXianJin=ZFQTYCZHDYGDXianJin;
	}
	public BigDecimal getZFQTYCZHDYGDXianJin(){
		return ZFQTYCZHDYGDXianJin;
	}
	public void setCZHDXJLCQTXiangMu(BigDecimal CZHDXJLCQTXiangMu){
		this.CZHDXJLCQTXiangMu=CZHDXJLCQTXiangMu;
	}
	public BigDecimal getCZHDXJLCQTXiangMu(){
		return CZHDXJLCQTXiangMu;
	}
	public void setCZHDXJLCPHXiangMu(BigDecimal CZHDXJLCPHXiangMu){
		this.CZHDXJLCPHXiangMu=CZHDXJLCPHXiangMu;
	}
	public BigDecimal getCZHDXJLCPHXiangMu(){
		return CZHDXJLCPHXiangMu;
	}
	public void setCZHDXJLCXiaoJi(BigDecimal CZHDXJLCXiaoJi){
		this.CZHDXJLCXiaoJi=CZHDXJLCXiaoJi;
	}
	public BigDecimal getCZHDXJLCXiaoJi(){
		return CZHDXJLCXiaoJi;
	}
	public void setCZHDCSDXJLLJEQTXiangMu(BigDecimal CZHDCSDXJLLJEQTXiangMu){
		this.CZHDCSDXJLLJEQTXiangMu=CZHDCSDXJLLJEQTXiangMu;
	}
	public BigDecimal getCZHDCSDXJLLJEQTXiangMu(){
		return CZHDCSDXJLLJEQTXiangMu;
	}
	public void setCZHDCSDXJLLJEPHXiangMu(BigDecimal CZHDCSDXJLLJEPHXiangMu){
		this.CZHDCSDXJLLJEPHXiangMu=CZHDCSDXJLLJEPHXiangMu;
	}
	public BigDecimal getCZHDCSDXJLLJEPHXiangMu(){
		return CZHDCSDXJLLJEPHXiangMu;
	}
	public void setCZHDCSDXJLLJingE(BigDecimal CZHDCSDXJLLJingE){
		this.CZHDCSDXJLLJingE=CZHDCSDXJLLJingE;
	}
	public BigDecimal getCZHDCSDXJLLJingE(){
		return CZHDCSDXJLLJingE;
	}
	public void setTSCLBSBPXJJingE(BigDecimal TSCLBSBPXJJingE){
		this.TSCLBSBPXJJingE=TSCLBSBPXJJingE;
	}
	public BigDecimal getTSCLBSBPXJJingE(){
		return TSCLBSBPXJJingE;
	}
	public void setTSCLGSBTXJJingE(BigDecimal TSCLGSBTXJJingE){
		this.TSCLGSBTXJJingE=TSCLGSBTXJJingE;
	}
	public BigDecimal getTSCLGSBTXJJingE(){
		return TSCLGSBTXJJingE;
	}
	public void setHLBDDXJJXJDJWDYingXiang(BigDecimal HLBDDXJJXJDJWDYingXiang){
		this.HLBDDXJJXJDJWDYingXiang=HLBDDXJJXJDJWDYingXiang;
	}
	public BigDecimal getHLBDDXJJXJDJWDYingXiang(){
		return HLBDDXJJXJDJWDYingXiang;
	}
	public void setXJJXJDJWZJEQTXiangMu(BigDecimal XJJXJDJWZJEQTXiangMu){
		this.XJJXJDJWZJEQTXiangMu=XJJXJDJWZJEQTXiangMu;
	}
	public BigDecimal getXJJXJDJWZJEQTXiangMu(){
		return XJJXJDJWZJEQTXiangMu;
	}
	public void setXJJXJDJWJZJEPHXiangMu(BigDecimal XJJXJDJWJZJEPHXiangMu){
		this.XJJXJDJWJZJEPHXiangMu=XJJXJDJWJZJEPHXiangMu;
	}
	public BigDecimal getXJJXJDJWJZJEPHXiangMu(){
		return XJJXJDJWJZJEPHXiangMu;
	}
	public void setXJJXJDJWJZengJiaE(BigDecimal XJJXJDJWJZengJiaE){
		this.XJJXJDJWJZengJiaE=XJJXJDJWJZengJiaE;
	}
	public BigDecimal getXJJXJDJWJZengJiaE(){
		return XJJXJDJWJZengJiaE;
	}
	public void setQCXJJXJDJWYuE(BigDecimal QCXJJXJDJWYuE){
		this.QCXJJXJDJWYuE=QCXJJXJDJWYuE;
	}
	public BigDecimal getQCXJJXJDJWYuE(){
		return QCXJJXJDJWYuE;
	}
	public void setQMXJJXJDJWYEQTXiangMu(BigDecimal QMXJJXJDJWYEQTXiangMu){
		this.QMXJJXJDJWYEQTXiangMu=QMXJJXJDJWYEQTXiangMu;
	}
	public BigDecimal getQMXJJXJDJWYEQTXiangMu(){
		return QMXJJXJDJWYEQTXiangMu;
	}
	public void setQMXJJXJDJWYEPHXiangMu(BigDecimal QMXJJXJDJWYEPHXiangMu){
		this.QMXJJXJDJWYEPHXiangMu=QMXJJXJDJWYEPHXiangMu;
	}
	public BigDecimal getQMXJJXJDJWYEPHXiangMu(){
		return QMXJJXJDJWYEPHXiangMu;
	}
	public void setQMXJJXJDJWYuE(BigDecimal QMXJJXJDJWYuE){
		this.QMXJJXJDJWYuE=QMXJJXJDJWYuE;
	}
	public BigDecimal getQMXJJXJDJWYuE(){
		return QMXJJXJDJWYuE;
	}
	public void setEndDate(Date endDate){
		this.endDate=endDate;
	}
	public Date getEndDate(){
		return endDate;
	}
}

