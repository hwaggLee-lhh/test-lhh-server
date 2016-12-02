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
@Table(name = "inc_commercial_banks")
public class ModelCWSJIncomeStatementsBanks extends BaseModel {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name = "idStr")
	private String idStr;
	@Column(name = "bal_IDStr")
	private String bal_IDStr;
	@Column(name = "DLMMZQYWShouRu")
	private BigDecimal DLMMZQYWShouRu;
	@Column(name = "SXFJYJJShouRu")
	private BigDecimal SXFJYJJShouRu;
	@Column(name = "ZQCXYWJShouRu")
	private BigDecimal ZQCXYWJShouRu;
	@Column(name = "STKHZZGLYWJShouRu")
	private BigDecimal STKHZZGLYWJShouRu;
	@Column(name = "CWGWJShouRu")
	private BigDecimal CWGWJShouRu;
	@Column(name = "BJYWJShouRu")
	private BigDecimal BJYWJShouRu;
	@Column(name = "JJGLYWJShouRu")
	private BigDecimal JJGLYWJShouRu;
	@Column(name = "JJXSYWJShouRu")
	private BigDecimal JJXSYWJShouRu;
	@Column(name = "ZQJJYWJShouRu")
	private BigDecimal ZQJJYWJShouRu;
	@Column(name = "SXFJYJJSRQTXiangMu")
	private BigDecimal SXFJYJJSRQTXiangMu;
	@Column(name = "LXJShouRu")
	private BigDecimal LXJShouRu;
	@Column(name = "YYSRQTXiangMu")
	private BigDecimal YYSRQTXiangMu;
	@Column(name = "YYSRPHXiangMu")
	private BigDecimal YYSRPHXiangMu;
	@Column(name = "YYZhiChu")
	private BigDecimal YYZhiChu;
	@Column(name = "YYJGLFei")
	private BigDecimal YYJGLFei;
	@Column(name = "YYZCQTXiangMu")
	private BigDecimal YYZCQTXiangMu;
	@Column(name = "YYZCPHXiangMu")
	private BigDecimal YYZCPHXiangMu;
	@Column(name = "LLZEPHXiangMu")
	private BigDecimal LLZEPHXiangMu;
	@Column(name = "SDSFeiYong")
	private BigDecimal SDSFeiYong;

	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}

	public String getIdStr() {
		return idStr;
	}

	public void setBal_IDStr(String bal_IDStr) {
		this.bal_IDStr = bal_IDStr;
	}

	public String getBal_IDStr() {
		return bal_IDStr;
	}

	public void setDLMMZQYWShouRu(BigDecimal DLMMZQYWShouRu) {
		this.DLMMZQYWShouRu = DLMMZQYWShouRu;
	}

	public BigDecimal getDLMMZQYWShouRu() {
		return DLMMZQYWShouRu;
	}

	public void setSXFJYJJShouRu(BigDecimal SXFJYJJShouRu) {
		this.SXFJYJJShouRu = SXFJYJJShouRu;
	}

	public BigDecimal getSXFJYJJShouRu() {
		return SXFJYJJShouRu;
	}

	public void setZQCXYWJShouRu(BigDecimal ZQCXYWJShouRu) {
		this.ZQCXYWJShouRu = ZQCXYWJShouRu;
	}

	public BigDecimal getZQCXYWJShouRu() {
		return ZQCXYWJShouRu;
	}

	public void setSTKHZZGLYWJShouRu(BigDecimal STKHZZGLYWJShouRu) {
		this.STKHZZGLYWJShouRu = STKHZZGLYWJShouRu;
	}

	public BigDecimal getSTKHZZGLYWJShouRu() {
		return STKHZZGLYWJShouRu;
	}

	public void setCWGWJShouRu(BigDecimal CWGWJShouRu) {
		this.CWGWJShouRu = CWGWJShouRu;
	}

	public BigDecimal getCWGWJShouRu() {
		return CWGWJShouRu;
	}

	public void setBJYWJShouRu(BigDecimal BJYWJShouRu) {
		this.BJYWJShouRu = BJYWJShouRu;
	}

	public BigDecimal getBJYWJShouRu() {
		return BJYWJShouRu;
	}

	public void setJJGLYWJShouRu(BigDecimal JJGLYWJShouRu) {
		this.JJGLYWJShouRu = JJGLYWJShouRu;
	}

	public BigDecimal getJJGLYWJShouRu() {
		return JJGLYWJShouRu;
	}

	public void setJJXSYWJShouRu(BigDecimal JJXSYWJShouRu) {
		this.JJXSYWJShouRu = JJXSYWJShouRu;
	}

	public BigDecimal getJJXSYWJShouRu() {
		return JJXSYWJShouRu;
	}

	public void setZQJJYWJShouRu(BigDecimal ZQJJYWJShouRu) {
		this.ZQJJYWJShouRu = ZQJJYWJShouRu;
	}

	public BigDecimal getZQJJYWJShouRu() {
		return ZQJJYWJShouRu;
	}

	public void setSXFJYJJSRQTXiangMu(BigDecimal SXFJYJJSRQTXiangMu) {
		this.SXFJYJJSRQTXiangMu = SXFJYJJSRQTXiangMu;
	}

	public BigDecimal getSXFJYJJSRQTXiangMu() {
		return SXFJYJJSRQTXiangMu;
	}

	public void setLXJShouRu(BigDecimal LXJShouRu) {
		this.LXJShouRu = LXJShouRu;
	}

	public BigDecimal getLXJShouRu() {
		return LXJShouRu;
	}

	public void setYYSRQTXiangMu(BigDecimal YYSRQTXiangMu) {
		this.YYSRQTXiangMu = YYSRQTXiangMu;
	}

	public BigDecimal getYYSRQTXiangMu() {
		return YYSRQTXiangMu;
	}

	public void setYYSRPHXiangMu(BigDecimal YYSRPHXiangMu) {
		this.YYSRPHXiangMu = YYSRPHXiangMu;
	}

	public BigDecimal getYYSRPHXiangMu() {
		return YYSRPHXiangMu;
	}

	public void setYYZhiChu(BigDecimal YYZhiChu) {
		this.YYZhiChu = YYZhiChu;
	}

	public BigDecimal getYYZhiChu() {
		return YYZhiChu;
	}

	public void setYYJGLFei(BigDecimal YYJGLFei) {
		this.YYJGLFei = YYJGLFei;
	}

	public BigDecimal getYYJGLFei() {
		return YYJGLFei;
	}

	public void setYYZCQTXiangMu(BigDecimal YYZCQTXiangMu) {
		this.YYZCQTXiangMu = YYZCQTXiangMu;
	}

	public BigDecimal getYYZCQTXiangMu() {
		return YYZCQTXiangMu;
	}

	public void setYYZCPHXiangMu(BigDecimal YYZCPHXiangMu) {
		this.YYZCPHXiangMu = YYZCPHXiangMu;
	}

	public BigDecimal getYYZCPHXiangMu() {
		return YYZCPHXiangMu;
	}

	public void setLLZEPHXiangMu(BigDecimal LLZEPHXiangMu) {
		this.LLZEPHXiangMu = LLZEPHXiangMu;
	}

	public BigDecimal getLLZEPHXiangMu() {
		return LLZEPHXiangMu;
	}

	public void setSDSFeiYong(BigDecimal SDSFeiYong) {
		this.SDSFeiYong = SDSFeiYong;
	}

	public BigDecimal getSDSFeiYong() {
		return SDSFeiYong;
	}
}
