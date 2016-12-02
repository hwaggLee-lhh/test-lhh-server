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
@Table(name="inc_securities_company")
public class ModelCWSJIncomeStatementsSecurities extends BaseModel{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="paymentableGenerator")
	@GenericGenerator(name="paymentableGenerator",strategy="uuid")
	@Column(name="idStr")
	private String idStr;
	@Column(name="inc_IDStr")
	private String inc_IDStr;
	@Column(name="LXJingShouRu")
	private BigDecimal LXJingShouRu;
	@Column(name="SXFJYJJingShouRu")
	private BigDecimal SXFJYJJingShouRu;
	@Column(name="YYSRQTXiangMu")
	private BigDecimal YYSRQTXiangMu;
	@Column(name="YYSRPHXiangMu")
	private BigDecimal YYSRPHXiangMu;
	@Column(name="YYZhiChu")
	private BigDecimal YYZhiChu;
	@Column(name="YWJGuanLiFei")
	private BigDecimal YWJGuanLiFei;
	@Column(name="YWZCQTXiangMu")
	private BigDecimal YWZCQTXiangMu;
	@Column(name="YYZCPHXiangMu")
	private BigDecimal YYZCPHXiangMu;
	@Column(name="LRZEPHXiangMu")
	private BigDecimal LRZEPHXiangMu;
	@Column(name="SDSFeiYong")
	private BigDecimal SDSFeiYong;
	public void setIdStr(String idStr){
		this.idStr=idStr;
	}
	public String getIdStr(){
		return idStr;
	}
	public void setInc_IDStr(String inc_IDStr){
		this.inc_IDStr=inc_IDStr;
	}
	public String getInc_IDStr(){
		return inc_IDStr;
	}
	public void setLXJingShouRu(BigDecimal LXJingShouRu){
		this.LXJingShouRu=LXJingShouRu;
	}
	public BigDecimal getLXJingShouRu(){
		return LXJingShouRu;
	}
	public void setSXFJYJJingShouRu(BigDecimal SXFJYJJingShouRu){
		this.SXFJYJJingShouRu=SXFJYJJingShouRu;
	}
	public BigDecimal getSXFJYJJingShouRu(){
		return SXFJYJJingShouRu;
	}
	public void setYYSRQTXiangMu(BigDecimal YYSRQTXiangMu){
		this.YYSRQTXiangMu=YYSRQTXiangMu;
	}
	public BigDecimal getYYSRQTXiangMu(){
		return YYSRQTXiangMu;
	}
	public void setYYSRPHXiangMu(BigDecimal YYSRPHXiangMu){
		this.YYSRPHXiangMu=YYSRPHXiangMu;
	}
	public BigDecimal getYYSRPHXiangMu(){
		return YYSRPHXiangMu;
	}
	public void setYYZhiChu(BigDecimal YYZhiChu){
		this.YYZhiChu=YYZhiChu;
	}
	public BigDecimal getYYZhiChu(){
		return YYZhiChu;
	}
	public void setYWJGuanLiFei(BigDecimal YWJGuanLiFei){
		this.YWJGuanLiFei=YWJGuanLiFei;
	}
	public BigDecimal getYWJGuanLiFei(){
		return YWJGuanLiFei;
	}
	public void setYWZCQTXiangMu(BigDecimal YWZCQTXiangMu){
		this.YWZCQTXiangMu=YWZCQTXiangMu;
	}
	public BigDecimal getYWZCQTXiangMu(){
		return YWZCQTXiangMu;
	}
	public void setYYZCPHXiangMu(BigDecimal YYZCPHXiangMu){
		this.YYZCPHXiangMu=YYZCPHXiangMu;
	}
	public BigDecimal getYYZCPHXiangMu(){
		return YYZCPHXiangMu;
	}
	public void setLRZEPHXiangMu(BigDecimal LRZEPHXiangMu){
		this.LRZEPHXiangMu=LRZEPHXiangMu;
	}
	public BigDecimal getLRZEPHXiangMu(){
		return LRZEPHXiangMu;
	}
	public void setSDSFeiYong(BigDecimal SDSFeiYong){
		this.SDSFeiYong=SDSFeiYong;
	}
	public BigDecimal getSDSFeiYong(){
		return SDSFeiYong;
	}
}

