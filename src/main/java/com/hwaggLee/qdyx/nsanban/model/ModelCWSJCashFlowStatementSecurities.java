package com.hwaggLee.qdyx.nsanban.model;

	import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.base.model.BaseModel;

@Entity
@Table(name="cas_securities_company")
public class ModelCWSJCashFlowStatementSecurities extends BaseModel{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="paymentableGenerator")
	@GenericGenerator(name="paymentableGenerator",strategy="uuid")
	@Column(name="idStr")
	private String idStr;
	@Column(name="cas_ID")
	private String cas_ID;
	@Column(name="GMCZHFXQTJRGJJZengJiaE")
	private BigDecimal GMCZHFXQTJRGJJZengJiaE;
	@Column(name="CXZQSDDXJJingE")
	private BigDecimal CXZQSDDXJJingE;
	@Column(name="DLMMZQSDDXJJingE")
	private BigDecimal DLMMZQSDDXJJingE;
	@Column(name="MRFSJRZCSDDXianJin")
	private BigDecimal MRFSJRZCSDDXianJin;
	@Column(name="DLCXZQSDDXJJingE")
	private BigDecimal DLCXZQSDDXJJingE;
	@Column(name="KHJYJSZJZengJia")
	private BigDecimal KHJYJSZJZengJia;
	@Column(name="ZJTZJYZCZengJia")
	private BigDecimal ZJTZJYZCZengJia;
	@Column(name="MRFSJRZCZFDXJJingE")
	private BigDecimal MRFSJRZCZFDXJJingE;
	@Column(name="CZJYXJRZCDJJShaoE")
	private BigDecimal CZJYXJRZCDJJShaoE;
	@Column(name="GMCZHFXQTJRGJJianShaoE")
	private BigDecimal GMCZHFXQTJRGJJianShaoE;
	@Column(name="CRZJJJianShaoE")
	private BigDecimal CRZJJJianShaoE;
	@Column(name="KHJYJSZJJianShao")
	private BigDecimal KHJYJSZJJianShao;
	@Column(name="ZJTZJYZJJianShao")
	private BigDecimal ZJTZJYZJJianShao;
	@Column(name="CCZJJZengJiaE")
	private BigDecimal CCZJJZengJiaE;
	@Column(name="HGYWZJZengJiaE")
	private BigDecimal HGYWZJZengJiaE;
	@Column(name="DLMMZQZFDXJJingE")
	private BigDecimal DLMMZQZFDXJJingE;
	@Column(name="CZKGCSJRZJJZengJiaE")
	private BigDecimal CZKGCSJRZJJZengJiaE;
	@Column(name="TZZFDXianJin")
	private BigDecimal TZZFDXianJin;
	@Column(name="CZKGCSJRZCJJianShaoE")
	private BigDecimal CZKGCSJRZCJJianShaoE;
	public void setIdStr(String idStr){
		this.idStr=idStr;
	}
	public String getIdStr(){
		return idStr;
	}
	public void setCas_ID(String cas_ID){
		this.cas_ID=cas_ID;
	}
	public String getCas_ID(){
		return cas_ID;
	}
	public void setGMCZHFXQTJRGJJZengJiaE(BigDecimal GMCZHFXQTJRGJJZengJiaE){
		this.GMCZHFXQTJRGJJZengJiaE=GMCZHFXQTJRGJJZengJiaE;
	}
	public BigDecimal getGMCZHFXQTJRGJJZengJiaE(){
		return GMCZHFXQTJRGJJZengJiaE;
	}
	public void setCXZQSDDXJJingE(BigDecimal CXZQSDDXJJingE){
		this.CXZQSDDXJJingE=CXZQSDDXJJingE;
	}
	public BigDecimal getCXZQSDDXJJingE(){
		return CXZQSDDXJJingE;
	}
	public void setDLMMZQSDDXJJingE(BigDecimal DLMMZQSDDXJJingE){
		this.DLMMZQSDDXJJingE=DLMMZQSDDXJJingE;
	}
	public BigDecimal getDLMMZQSDDXJJingE(){
		return DLMMZQSDDXJJingE;
	}
	public void setMRFSJRZCSDDXianJin(BigDecimal MRFSJRZCSDDXianJin){
		this.MRFSJRZCSDDXianJin=MRFSJRZCSDDXianJin;
	}
	public BigDecimal getMRFSJRZCSDDXianJin(){
		return MRFSJRZCSDDXianJin;
	}
	public void setDLCXZQSDDXJJingE(BigDecimal DLCXZQSDDXJJingE){
		this.DLCXZQSDDXJJingE=DLCXZQSDDXJJingE;
	}
	public BigDecimal getDLCXZQSDDXJJingE(){
		return DLCXZQSDDXJJingE;
	}
	public void setKHJYJSZJZengJia(BigDecimal KHJYJSZJZengJia){
		this.KHJYJSZJZengJia=KHJYJSZJZengJia;
	}
	public BigDecimal getKHJYJSZJZengJia(){
		return KHJYJSZJZengJia;
	}
	public void setZJTZJYZCZengJia(BigDecimal ZJTZJYZCZengJia){
		this.ZJTZJYZCZengJia=ZJTZJYZCZengJia;
	}
	public BigDecimal getZJTZJYZCZengJia(){
		return ZJTZJYZCZengJia;
	}
	public void setMRFSJRZCZFDXJJingE(BigDecimal MRFSJRZCZFDXJJingE){
		this.MRFSJRZCZFDXJJingE=MRFSJRZCZFDXJJingE;
	}
	public BigDecimal getMRFSJRZCZFDXJJingE(){
		return MRFSJRZCZFDXJJingE;
	}
	public void setCZJYXJRZCDJJShaoE(BigDecimal CZJYXJRZCDJJShaoE){
		this.CZJYXJRZCDJJShaoE=CZJYXJRZCDJJShaoE;
	}
	public BigDecimal getCZJYXJRZCDJJShaoE(){
		return CZJYXJRZCDJJShaoE;
	}
	public void setGMCZHFXQTJRGJJianShaoE(BigDecimal GMCZHFXQTJRGJJianShaoE){
		this.GMCZHFXQTJRGJJianShaoE=GMCZHFXQTJRGJJianShaoE;
	}
	public BigDecimal getGMCZHFXQTJRGJJianShaoE(){
		return GMCZHFXQTJRGJJianShaoE;
	}
	public void setCRZJJJianShaoE(BigDecimal CRZJJJianShaoE){
		this.CRZJJJianShaoE=CRZJJJianShaoE;
	}
	public BigDecimal getCRZJJJianShaoE(){
		return CRZJJJianShaoE;
	}
	public void setKHJYJSZJJianShao(BigDecimal KHJYJSZJJianShao){
		this.KHJYJSZJJianShao=KHJYJSZJJianShao;
	}
	public BigDecimal getKHJYJSZJJianShao(){
		return KHJYJSZJJianShao;
	}
	public void setZJTZJYZJJianShao(BigDecimal ZJTZJYZJJianShao){
		this.ZJTZJYZJJianShao=ZJTZJYZJJianShao;
	}
	public BigDecimal getZJTZJYZJJianShao(){
		return ZJTZJYZJJianShao;
	}
	public void setCCZJJZengJiaE(BigDecimal CCZJJZengJiaE){
		this.CCZJJZengJiaE=CCZJJZengJiaE;
	}
	public BigDecimal getCCZJJZengJiaE(){
		return CCZJJZengJiaE;
	}
	public void setHGYWZJZengJiaE(BigDecimal HGYWZJZengJiaE){
		this.HGYWZJZengJiaE=HGYWZJZengJiaE;
	}
	public BigDecimal getHGYWZJZengJiaE(){
		return HGYWZJZengJiaE;
	}
	public void setDLMMZQZFDXJJingE(BigDecimal DLMMZQZFDXJJingE){
		this.DLMMZQZFDXJJingE=DLMMZQZFDXJJingE;
	}
	public BigDecimal getDLMMZQZFDXJJingE(){
		return DLMMZQZFDXJJingE;
	}
	public void setCZKGCSJRZJJZengJiaE(BigDecimal CZKGCSJRZJJZengJiaE){
		this.CZKGCSJRZJJZengJiaE=CZKGCSJRZJJZengJiaE;
	}
	public BigDecimal getCZKGCSJRZJJZengJiaE(){
		return CZKGCSJRZJJZengJiaE;
	}
	public void setTZZFDXianJin(BigDecimal TZZFDXianJin){
		this.TZZFDXianJin=TZZFDXianJin;
	}
	public BigDecimal getTZZFDXianJin(){
		return TZZFDXianJin;
	}
	public void setCZKGCSJRZCJJianShaoE(BigDecimal CZKGCSJRZCJJianShaoE){
		this.CZKGCSJRZCJJianShaoE=CZKGCSJRZCJJianShaoE;
	}
	public BigDecimal getCZKGCSJRZCJJianShaoE(){
		return CZKGCSJRZCJJianShaoE;
	}
}

