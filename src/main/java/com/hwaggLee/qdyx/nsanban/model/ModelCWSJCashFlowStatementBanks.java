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
@Table(name="cas_commercial_banks")
public class ModelCWSJCashFlowStatementBanks extends BaseModel{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="paymentableGenerator")
	@GenericGenerator(name="paymentableGenerator",strategy="uuid")
	@Column(name="idStr")
	private String idStr;
	@Column(name="cas_ID")
	private String cas_ID;
	@Column(name="KHCKHTYJQTJRJGCFKXJZengJiaE")
	private BigDecimal KHCKHTYJQTJRJGCFKXJZengJiaE;
	@Column(name="KHCKJZengJiaE")
	private BigDecimal KHCKJZengJiaE;
	@Column(name="TYJQTJRJGCFKXJZengJiaE")
	private BigDecimal TYJQTJRJGCFKXJZengJiaE;
	@Column(name="CFZYYHHTYKXJQTJRJGJJianShaoE")
	private BigDecimal CFZYYHHTYKXJQTJRJGJJianShaoE;
	@Column(name="CFZYYHKXJJianShaoE")
	private BigDecimal CFZYYHKXJJianShaoE;
	@Column(name="CFTYJQTJRJGKXJJianShaoE")
	private BigDecimal CFTYJQTJRJGKXJJianShaoE;
	@Column(name="CRZJJMCHGJRZCKJZengJiaE")
	private BigDecimal CRZJJMCHGJRZCKJZengJiaE;
	@Column(name="MCHGJRZCKJZengJiaE")
	private BigDecimal MCHGJRZCKJZengJiaE;
	@Column(name="CCZJJMRFSJRZCJJianShaoE")
	private BigDecimal CCZJJMRFSJRZCJJianShaoE;
	@Column(name="CCZJJJianShaoE")
	private BigDecimal CCZJJJianShaoE;
	@Column(name="MRFSJRZCJJianShaoE")
	private BigDecimal MRFSJRZCJJianShaoE;
	@Column(name="CKZJingE")
	private BigDecimal CKZJingE;
	@Column(name="JYXJRFZJZengJiaE")
	private BigDecimal JYXJRFZJZengJiaE;
	@Column(name="SQDLXSXFJYJDXianJin")
	private BigDecimal SQDLXSXFJYJDXianJin;
	@Column(name="SQLXDXianJin")
	private BigDecimal SQLXDXianJin;
	@Column(name="SQSXFJYJDXianJin")
	private BigDecimal SQSXFJYJDXianJin;
	@Column(name="CZDZZCSDDXianJin")
	private BigDecimal CZDZZCSDDXianJin;
	@Column(name="SHDYYYQNDHXDDaiKuan")
	private BigDecimal SHDYYYQNDHXDDaiKuan;
	@Column(name="SDDQTYJYHDYGDXianJin")
	private BigDecimal SDDQTYJYHDYGDXianJin;
	@Column(name="CFZYYHHTYJQTJRJGKXJZengJiaE")
	private BigDecimal CFZYYHHTYJQTJRJGKXJZengJiaE;
	@Column(name="CFZYYHKXJZengJiaE")
	private BigDecimal CFZYYHKXJZengJiaE;
	@Column(name="CFTYJQTJRJGKXJZengJiaE")
	private BigDecimal CFTYJQTJRJGKXJZengJiaE;
	@Column(name="TYJQTJRJGCFKJSJingE")
	private BigDecimal TYJQTJRJGCFKJSJingE;
	@Column(name="YFXCKZJJianShaoE")
	private BigDecimal YFXCKZJJianShaoE;
	@Column(name="CCZJJMRFSJRZCJZengJiaE")
	private BigDecimal CCZJJMRFSJRZCJZengJiaE;
	@Column(name="CCZJJZengJiaE")
	private BigDecimal CCZJJZengJiaE;
	@Column(name="MRFSJRZCJZengJiaE")
	private BigDecimal MRFSJRZCJZengJiaE;
	@Column(name="CRZJJMCHGJRZCKJJianShaoE")
	private BigDecimal CRZJJMCHGJRZCKJJianShaoE;
	@Column(name="CRZJJJianShaoE")
	private BigDecimal CRZJJJianShaoE;
	@Column(name="MCHGJRZCJJianShaoE")
	private BigDecimal MCHGJRZCJJianShaoE;
	@Column(name="JYXJRZCJZengJiaE")
	private BigDecimal JYXJRZCJZengJiaE;
	@Column(name="ZFLXDXianJin")
	private BigDecimal ZFLXDXianJin;
	@Column(name="ZFSXFJYJDXianJin")
	private BigDecimal ZFSXFJYJDXianJin;
	@Column(name="GMRZZPZCZFDXianJin")
	private BigDecimal GMRZZPZCZFDXianJin;
	@Column(name="YSZKJZengJiaE")
	private BigDecimal YSZKJZengJiaE;
	@Column(name="ZFQTYJYHDYGDXianJin")
	private BigDecimal ZFQTYJYHDYGDXianJin;
	@Column(name="FDGLHLRSSDDXianJin")
	private BigDecimal FDGLHLRSSDDXianJin;
	@Column(name="TZZFDXianJin")
	private BigDecimal TZZFDXianJin;
	@Column(name="FXCJZSSDDXianJin")
	private BigDecimal FXCJZSSDDXianJin;
	@Column(name="FXQTZQSSDDXianJin")
	private BigDecimal FXQTZQSSDDXianJin;
	@Column(name="FXCunKuanZheng")
	private BigDecimal FXCunKuanZheng;
	@Column(name="ZJGBSSDDXianJin")
	private BigDecimal ZJGBSSDDXianJin;
	@Column(name="GFFXZFDFeiYong")
	private BigDecimal GFFXZFDFeiYong;
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
	public void setKHCKHTYJQTJRJGCFKXJZengJiaE(BigDecimal KHCKHTYJQTJRJGCFKXJZengJiaE){
		this.KHCKHTYJQTJRJGCFKXJZengJiaE=KHCKHTYJQTJRJGCFKXJZengJiaE;
	}
	public BigDecimal getKHCKHTYJQTJRJGCFKXJZengJiaE(){
		return KHCKHTYJQTJRJGCFKXJZengJiaE;
	}
	public void setKHCKJZengJiaE(BigDecimal KHCKJZengJiaE){
		this.KHCKJZengJiaE=KHCKJZengJiaE;
	}
	public BigDecimal getKHCKJZengJiaE(){
		return KHCKJZengJiaE;
	}
	public void setTYJQTJRJGCFKXJZengJiaE(BigDecimal TYJQTJRJGCFKXJZengJiaE){
		this.TYJQTJRJGCFKXJZengJiaE=TYJQTJRJGCFKXJZengJiaE;
	}
	public BigDecimal getTYJQTJRJGCFKXJZengJiaE(){
		return TYJQTJRJGCFKXJZengJiaE;
	}
	public void setCFZYYHHTYKXJQTJRJGJJianShaoE(BigDecimal CFZYYHHTYKXJQTJRJGJJianShaoE){
		this.CFZYYHHTYKXJQTJRJGJJianShaoE=CFZYYHHTYKXJQTJRJGJJianShaoE;
	}
	public BigDecimal getCFZYYHHTYKXJQTJRJGJJianShaoE(){
		return CFZYYHHTYKXJQTJRJGJJianShaoE;
	}
	public void setCFZYYHKXJJianShaoE(BigDecimal CFZYYHKXJJianShaoE){
		this.CFZYYHKXJJianShaoE=CFZYYHKXJJianShaoE;
	}
	public BigDecimal getCFZYYHKXJJianShaoE(){
		return CFZYYHKXJJianShaoE;
	}
	public void setCFTYJQTJRJGKXJJianShaoE(BigDecimal CFTYJQTJRJGKXJJianShaoE){
		this.CFTYJQTJRJGKXJJianShaoE=CFTYJQTJRJGKXJJianShaoE;
	}
	public BigDecimal getCFTYJQTJRJGKXJJianShaoE(){
		return CFTYJQTJRJGKXJJianShaoE;
	}
	public void setCRZJJMCHGJRZCKJZengJiaE(BigDecimal CRZJJMCHGJRZCKJZengJiaE){
		this.CRZJJMCHGJRZCKJZengJiaE=CRZJJMCHGJRZCKJZengJiaE;
	}
	public BigDecimal getCRZJJMCHGJRZCKJZengJiaE(){
		return CRZJJMCHGJRZCKJZengJiaE;
	}
	public void setMCHGJRZCKJZengJiaE(BigDecimal MCHGJRZCKJZengJiaE){
		this.MCHGJRZCKJZengJiaE=MCHGJRZCKJZengJiaE;
	}
	public BigDecimal getMCHGJRZCKJZengJiaE(){
		return MCHGJRZCKJZengJiaE;
	}
	public void setCCZJJMRFSJRZCJJianShaoE(BigDecimal CCZJJMRFSJRZCJJianShaoE){
		this.CCZJJMRFSJRZCJJianShaoE=CCZJJMRFSJRZCJJianShaoE;
	}
	public BigDecimal getCCZJJMRFSJRZCJJianShaoE(){
		return CCZJJMRFSJRZCJJianShaoE;
	}
	public void setCCZJJJianShaoE(BigDecimal CCZJJJianShaoE){
		this.CCZJJJianShaoE=CCZJJJianShaoE;
	}
	public BigDecimal getCCZJJJianShaoE(){
		return CCZJJJianShaoE;
	}
	public void setMRFSJRZCJJianShaoE(BigDecimal MRFSJRZCJJianShaoE){
		this.MRFSJRZCJJianShaoE=MRFSJRZCJJianShaoE;
	}
	public BigDecimal getMRFSJRZCJJianShaoE(){
		return MRFSJRZCJJianShaoE;
	}
	public void setCKZJingE(BigDecimal CKZJingE){
		this.CKZJingE=CKZJingE;
	}
	public BigDecimal getCKZJingE(){
		return CKZJingE;
	}
	public void setJYXJRFZJZengJiaE(BigDecimal JYXJRFZJZengJiaE){
		this.JYXJRFZJZengJiaE=JYXJRFZJZengJiaE;
	}
	public BigDecimal getJYXJRFZJZengJiaE(){
		return JYXJRFZJZengJiaE;
	}
	public void setSQDLXSXFJYJDXianJin(BigDecimal SQDLXSXFJYJDXianJin){
		this.SQDLXSXFJYJDXianJin=SQDLXSXFJYJDXianJin;
	}
	public BigDecimal getSQDLXSXFJYJDXianJin(){
		return SQDLXSXFJYJDXianJin;
	}
	public void setSQLXDXianJin(BigDecimal SQLXDXianJin){
		this.SQLXDXianJin=SQLXDXianJin;
	}
	public BigDecimal getSQLXDXianJin(){
		return SQLXDXianJin;
	}
	public void setSQSXFJYJDXianJin(BigDecimal SQSXFJYJDXianJin){
		this.SQSXFJYJDXianJin=SQSXFJYJDXianJin;
	}
	public BigDecimal getSQSXFJYJDXianJin(){
		return SQSXFJYJDXianJin;
	}
	public void setCZDZZCSDDXianJin(BigDecimal CZDZZCSDDXianJin){
		this.CZDZZCSDDXianJin=CZDZZCSDDXianJin;
	}
	public BigDecimal getCZDZZCSDDXianJin(){
		return CZDZZCSDDXianJin;
	}
	public void setSHDYYYQNDHXDDaiKuan(BigDecimal SHDYYYQNDHXDDaiKuan){
		this.SHDYYYQNDHXDDaiKuan=SHDYYYQNDHXDDaiKuan;
	}
	public BigDecimal getSHDYYYQNDHXDDaiKuan(){
		return SHDYYYQNDHXDDaiKuan;
	}
	public void setSDDQTYJYHDYGDXianJin(BigDecimal SDDQTYJYHDYGDXianJin){
		this.SDDQTYJYHDYGDXianJin=SDDQTYJYHDYGDXianJin;
	}
	public BigDecimal getSDDQTYJYHDYGDXianJin(){
		return SDDQTYJYHDYGDXianJin;
	}
	public void setCFZYYHHTYJQTJRJGKXJZengJiaE(BigDecimal CFZYYHHTYJQTJRJGKXJZengJiaE){
		this.CFZYYHHTYJQTJRJGKXJZengJiaE=CFZYYHHTYJQTJRJGKXJZengJiaE;
	}
	public BigDecimal getCFZYYHHTYJQTJRJGKXJZengJiaE(){
		return CFZYYHHTYJQTJRJGKXJZengJiaE;
	}
	public void setCFZYYHKXJZengJiaE(BigDecimal CFZYYHKXJZengJiaE){
		this.CFZYYHKXJZengJiaE=CFZYYHKXJZengJiaE;
	}
	public BigDecimal getCFZYYHKXJZengJiaE(){
		return CFZYYHKXJZengJiaE;
	}
	public void setCFTYJQTJRJGKXJZengJiaE(BigDecimal CFTYJQTJRJGKXJZengJiaE){
		this.CFTYJQTJRJGKXJZengJiaE=CFTYJQTJRJGKXJZengJiaE;
	}
	public BigDecimal getCFTYJQTJRJGKXJZengJiaE(){
		return CFTYJQTJRJGKXJZengJiaE;
	}
	public void setTYJQTJRJGCFKJSJingE(BigDecimal TYJQTJRJGCFKJSJingE){
		this.TYJQTJRJGCFKJSJingE=TYJQTJRJGCFKJSJingE;
	}
	public BigDecimal getTYJQTJRJGCFKJSJingE(){
		return TYJQTJRJGCFKJSJingE;
	}
	public void setYFXCKZJJianShaoE(BigDecimal YFXCKZJJianShaoE){
		this.YFXCKZJJianShaoE=YFXCKZJJianShaoE;
	}
	public BigDecimal getYFXCKZJJianShaoE(){
		return YFXCKZJJianShaoE;
	}
	public void setCCZJJMRFSJRZCJZengJiaE(BigDecimal CCZJJMRFSJRZCJZengJiaE){
		this.CCZJJMRFSJRZCJZengJiaE=CCZJJMRFSJRZCJZengJiaE;
	}
	public BigDecimal getCCZJJMRFSJRZCJZengJiaE(){
		return CCZJJMRFSJRZCJZengJiaE;
	}
	public void setCCZJJZengJiaE(BigDecimal CCZJJZengJiaE){
		this.CCZJJZengJiaE=CCZJJZengJiaE;
	}
	public BigDecimal getCCZJJZengJiaE(){
		return CCZJJZengJiaE;
	}
	public void setMRFSJRZCJZengJiaE(BigDecimal MRFSJRZCJZengJiaE){
		this.MRFSJRZCJZengJiaE=MRFSJRZCJZengJiaE;
	}
	public BigDecimal getMRFSJRZCJZengJiaE(){
		return MRFSJRZCJZengJiaE;
	}
	public void setCRZJJMCHGJRZCKJJianShaoE(BigDecimal CRZJJMCHGJRZCKJJianShaoE){
		this.CRZJJMCHGJRZCKJJianShaoE=CRZJJMCHGJRZCKJJianShaoE;
	}
	public BigDecimal getCRZJJMCHGJRZCKJJianShaoE(){
		return CRZJJMCHGJRZCKJJianShaoE;
	}
	public void setCRZJJJianShaoE(BigDecimal CRZJJJianShaoE){
		this.CRZJJJianShaoE=CRZJJJianShaoE;
	}
	public BigDecimal getCRZJJJianShaoE(){
		return CRZJJJianShaoE;
	}
	public void setMCHGJRZCJJianShaoE(BigDecimal MCHGJRZCJJianShaoE){
		this.MCHGJRZCJJianShaoE=MCHGJRZCJJianShaoE;
	}
	public BigDecimal getMCHGJRZCJJianShaoE(){
		return MCHGJRZCJJianShaoE;
	}
	public void setJYXJRZCJZengJiaE(BigDecimal JYXJRZCJZengJiaE){
		this.JYXJRZCJZengJiaE=JYXJRZCJZengJiaE;
	}
	public BigDecimal getJYXJRZCJZengJiaE(){
		return JYXJRZCJZengJiaE;
	}
	public void setZFLXDXianJin(BigDecimal ZFLXDXianJin){
		this.ZFLXDXianJin=ZFLXDXianJin;
	}
	public BigDecimal getZFLXDXianJin(){
		return ZFLXDXianJin;
	}
	public void setZFSXFJYJDXianJin(BigDecimal ZFSXFJYJDXianJin){
		this.ZFSXFJYJDXianJin=ZFSXFJYJDXianJin;
	}
	public BigDecimal getZFSXFJYJDXianJin(){
		return ZFSXFJYJDXianJin;
	}
	public void setGMRZZPZCZFDXianJin(BigDecimal GMRZZPZCZFDXianJin){
		this.GMRZZPZCZFDXianJin=GMRZZPZCZFDXianJin;
	}
	public BigDecimal getGMRZZPZCZFDXianJin(){
		return GMRZZPZCZFDXianJin;
	}
	public void setYSZKJZengJiaE(BigDecimal YSZKJZengJiaE){
		this.YSZKJZengJiaE=YSZKJZengJiaE;
	}
	public BigDecimal getYSZKJZengJiaE(){
		return YSZKJZengJiaE;
	}
	public void setZFQTYJYHDYGDXianJin(BigDecimal ZFQTYJYHDYGDXianJin){
		this.ZFQTYJYHDYGDXianJin=ZFQTYJYHDYGDXianJin;
	}
	public BigDecimal getZFQTYJYHDYGDXianJin(){
		return ZFQTYJYHDYGDXianJin;
	}
	public void setFDGLHLRSSDDXianJin(BigDecimal FDGLHLRSSDDXianJin){
		this.FDGLHLRSSDDXianJin=FDGLHLRSSDDXianJin;
	}
	public BigDecimal getFDGLHLRSSDDXianJin(){
		return FDGLHLRSSDDXianJin;
	}
	public void setTZZFDXianJin(BigDecimal TZZFDXianJin){
		this.TZZFDXianJin=TZZFDXianJin;
	}
	public BigDecimal getTZZFDXianJin(){
		return TZZFDXianJin;
	}
	public void setFXCJZSSDDXianJin(BigDecimal FXCJZSSDDXianJin){
		this.FXCJZSSDDXianJin=FXCJZSSDDXianJin;
	}
	public BigDecimal getFXCJZSSDDXianJin(){
		return FXCJZSSDDXianJin;
	}
	public void setFXQTZQSSDDXianJin(BigDecimal FXQTZQSSDDXianJin){
		this.FXQTZQSSDDXianJin=FXQTZQSSDDXianJin;
	}
	public BigDecimal getFXQTZQSSDDXianJin(){
		return FXQTZQSSDDXianJin;
	}
	public void setFXCunKuanZheng(BigDecimal FXCunKuanZheng){
		this.FXCunKuanZheng=FXCunKuanZheng;
	}
	public BigDecimal getFXCunKuanZheng(){
		return FXCunKuanZheng;
	}
	public void setZJGBSSDDXianJin(BigDecimal ZJGBSSDDXianJin){
		this.ZJGBSSDDXianJin=ZJGBSSDDXianJin;
	}
	public BigDecimal getZJGBSSDDXianJin(){
		return ZJGBSSDDXianJin;
	}
	public void setGFFXZFDFeiYong(BigDecimal GFFXZFDFeiYong){
		this.GFFXZFDFeiYong=GFFXZFDFeiYong;
	}
	public BigDecimal getGFFXZFDFeiYong(){
		return GFFXZFDFeiYong;
	}
}

