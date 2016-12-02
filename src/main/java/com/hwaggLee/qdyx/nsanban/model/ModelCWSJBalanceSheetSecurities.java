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
@Table(name="bal_securities_company")
public class ModelCWSJBalanceSheetSecurities extends BaseModel{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="paymentableGenerator")
	@GenericGenerator(name="paymentableGenerator",strategy="uuid")
	@Column(name="idStr")
	private String idStr;
	@Column(name="bal_IDStr")
	private String bal_IDStr;
	@Column(name="KFZJCunKuan")
	private BigDecimal KFZJCunKuan;
	@Column(name="KHXYZJCunKuan")
	private BigDecimal KHXYZJCunKuan;
	@Column(name="KHBeiFuJin")
	private BigDecimal KHBeiFuJin;
	@Column(name="ChaiChuZiJin")
	private BigDecimal ChaiChuZiJin;
	@Column(name="RongChuZiJin")
	private BigDecimal RongChuZiJin;
	@Column(name="RongChuZhengQuan")
	private BigDecimal RongChuZhengQuan;
	@Column(name="JiaoYiXiWeiFei")
	private BigDecimal JiaoYiXiWeiFei;
	@Column(name="QiTaZiChan")
	private BigDecimal QiTaZiChan;
	@Column(name="ZiYaJieKuan")
	private BigDecimal ZiYaJieKuan;
	@Column(name="YSJRFuZhai")
	private BigDecimal YSJRFuZhai;
	@Column(name="XYJYDLMMZhengQuanKuan")
	private BigDecimal XYJYDLMMZhengQuanKuan;
	@Column(name="QiTaFuZhai")
	private BigDecimal QiTaFuZhai;
	@Column(name="JYFXZhunBei")
	private BigDecimal JYFXZhunBei;
	public void setIdStr(String idStr){
		this.idStr=idStr;
	}
	public String getIdStr(){
		return idStr;
	}
	public void setBal_IDStr(String bal_IDStr){
		this.bal_IDStr=bal_IDStr;
	}
	public String getBal_IDStr(){
		return bal_IDStr;
	}
	public void setKFZJCunKuan(BigDecimal KFZJCunKuan){
		this.KFZJCunKuan=KFZJCunKuan;
	}
	public BigDecimal getKFZJCunKuan(){
		return KFZJCunKuan;
	}
	public void setKHXYZJCunKuan(BigDecimal KHXYZJCunKuan){
		this.KHXYZJCunKuan=KHXYZJCunKuan;
	}
	public BigDecimal getKHXYZJCunKuan(){
		return KHXYZJCunKuan;
	}
	public void setKHBeiFuJin(BigDecimal KHBeiFuJin){
		this.KHBeiFuJin=KHBeiFuJin;
	}
	public BigDecimal getKHBeiFuJin(){
		return KHBeiFuJin;
	}
	public void setChaiChuZiJin(BigDecimal ChaiChuZiJin){
		this.ChaiChuZiJin=ChaiChuZiJin;
	}
	public BigDecimal getChaiChuZiJin(){
		return ChaiChuZiJin;
	}
	public void setRongChuZiJin(BigDecimal RongChuZiJin){
		this.RongChuZiJin=RongChuZiJin;
	}
	public BigDecimal getRongChuZiJin(){
		return RongChuZiJin;
	}
	public void setRongChuZhengQuan(BigDecimal RongChuZhengQuan){
		this.RongChuZhengQuan=RongChuZhengQuan;
	}
	public BigDecimal getRongChuZhengQuan(){
		return RongChuZhengQuan;
	}
	public void setJiaoYiXiWeiFei(BigDecimal JiaoYiXiWeiFei){
		this.JiaoYiXiWeiFei=JiaoYiXiWeiFei;
	}
	public BigDecimal getJiaoYiXiWeiFei(){
		return JiaoYiXiWeiFei;
	}
	public void setQiTaZiChan(BigDecimal QiTaZiChan){
		this.QiTaZiChan=QiTaZiChan;
	}
	public BigDecimal getQiTaZiChan(){
		return QiTaZiChan;
	}
	public void setZiYaJieKuan(BigDecimal ZiYaJieKuan){
		this.ZiYaJieKuan=ZiYaJieKuan;
	}
	public BigDecimal getZiYaJieKuan(){
		return ZiYaJieKuan;
	}
	public void setYSJRFuZhai(BigDecimal YSJRFuZhai){
		this.YSJRFuZhai=YSJRFuZhai;
	}
	public BigDecimal getYSJRFuZhai(){
		return YSJRFuZhai;
	}
	public void setXYJYDLMMZhengQuanKuan(BigDecimal XYJYDLMMZhengQuanKuan){
		this.XYJYDLMMZhengQuanKuan=XYJYDLMMZhengQuanKuan;
	}
	public BigDecimal getXYJYDLMMZhengQuanKuan(){
		return XYJYDLMMZhengQuanKuan;
	}
	public void setQiTaFuZhai(BigDecimal QiTaFuZhai){
		this.QiTaFuZhai=QiTaFuZhai;
	}
	public BigDecimal getQiTaFuZhai(){
		return QiTaFuZhai;
	}
	public void setJYFXZhunBei(BigDecimal JYFXZhunBei){
		this.JYFXZhunBei=JYFXZhunBei;
	}
	public BigDecimal getJYFXZhunBei(){
		return JYFXZhunBei;
	}
}

