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
@Table(name = "bal_commercial_banks")
public class ModelCWSJBalanceSheetBanks extends BaseModel {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name = "idStr")
	private String idStr;
	@Column(name = "bal_IDStr")
	private String bal_IDStr;
	@Column(name = "XJCFZYHKuanXiang")
	private BigDecimal XJCFZYHKuanXiang;
	@Column(name = "CFTYKuanXiang")
	private BigDecimal CFTYKuanXiang;
	@Column(name = "GuiJinShu")
	private BigDecimal GuiJinShu;
	@Column(name = "ChaiChuZiJin")
	private BigDecimal ChaiChuZiJin;
	@Column(name = "YGYJZJLQBDJRDQSYDJRZiChan")
	private BigDecimal YGYJZJLQBDJRDQSYDJRZiChan;
	@Column(name = "ZDYGYJZJLQBDJRDQSYDJRZiChan")
	private BigDecimal ZDYGYJZJLQBDJRDQSYDJRZiChan;
	@Column(name = "YSJRZiChan")
	private BigDecimal YSJRZiChan;
	@Column(name = "YSKXLTouZi")
	private BigDecimal YSKXLTouZi;
	@Column(name = "DZGSDTouZi")
	private BigDecimal DZGSDTouZi;
	@Column(name = "DLYHHYQYDTouZi")
	private BigDecimal DLYHHYQYDTouZi;
	@Column(name = "DCLDZZiChan")
	private BigDecimal DCLDZZiChan;
	@Column(name = "JDZZCJZZhunBei")
	private BigDecimal JDZZCJZZhunBei;
	@Column(name = "DCLDZZCJingZhi")
	private BigDecimal DCLDZZCJingZhi;
	@Column(name = "QiTaZiChan")
	private BigDecimal QiTaZiChan;
	@Column(name = "YGYJZJLQBDJRDQSYDJRFuZhai")
	private BigDecimal YGYJZJLQBDJRDQSYDJRFuZhai;
	@Column(name = "ZDYGYJZJLQBDJRDQSYDJRFuZhai")
	private BigDecimal ZDYGYJZJLQBDJRDQSYDJRFuZhai;
	@Column(name = "YSJRFuZhai")
	private BigDecimal YSJRFuZhai;
	@Column(name = "XiShouCunKuan")
	private BigDecimal XiShouCunKuan;
	@Column(name = "HuiChuHuiKuan")
	private BigDecimal HuiChuHuiKuan;
	@Column(name = "CKZJYFPiaoJu")
	private BigDecimal CKZJYFPiaoJu;
	@Column(name = "CunKuanZheng")
	private BigDecimal CunKuanZheng;
	@Column(name = "QiTaFuZhai")
	private BigDecimal QiTaFuZhai;
	@Column(name = "QZTZCGChuBei")
	private BigDecimal QZTZCGChuBei;
	@Column(name = "TaoQiChuBei")
	private BigDecimal TaoQiChuBei;

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

	public void setXJCFZYHKuanXiang(BigDecimal XJCFZYHKuanXiang) {
		this.XJCFZYHKuanXiang = XJCFZYHKuanXiang;
	}

	public BigDecimal getXJCFZYHKuanXiang() {
		return XJCFZYHKuanXiang;
	}

	public void setCFTYKuanXiang(BigDecimal CFTYKuanXiang) {
		this.CFTYKuanXiang = CFTYKuanXiang;
	}

	public BigDecimal getCFTYKuanXiang() {
		return CFTYKuanXiang;
	}

	public void setGuiJinShu(BigDecimal GuiJinShu) {
		this.GuiJinShu = GuiJinShu;
	}

	public BigDecimal getGuiJinShu() {
		return GuiJinShu;
	}

	public void setChaiChuZiJin(BigDecimal ChaiChuZiJin) {
		this.ChaiChuZiJin = ChaiChuZiJin;
	}

	public BigDecimal getChaiChuZiJin() {
		return ChaiChuZiJin;
	}

	public void setYGYJZJLQBDJRDQSYDJRZiChan(
			BigDecimal YGYJZJLQBDJRDQSYDJRZiChan) {
		this.YGYJZJLQBDJRDQSYDJRZiChan = YGYJZJLQBDJRDQSYDJRZiChan;
	}

	public BigDecimal getYGYJZJLQBDJRDQSYDJRZiChan() {
		return YGYJZJLQBDJRDQSYDJRZiChan;
	}

	public void setZDYGYJZJLQBDJRDQSYDJRZiChan(
			BigDecimal ZDYGYJZJLQBDJRDQSYDJRZiChan) {
		this.ZDYGYJZJLQBDJRDQSYDJRZiChan = ZDYGYJZJLQBDJRDQSYDJRZiChan;
	}

	public BigDecimal getZDYGYJZJLQBDJRDQSYDJRZiChan() {
		return ZDYGYJZJLQBDJRDQSYDJRZiChan;
	}

	public void setYSJRZiChan(BigDecimal YSJRZiChan) {
		this.YSJRZiChan = YSJRZiChan;
	}

	public BigDecimal getYSJRZiChan() {
		return YSJRZiChan;
	}

	public void setYSKXLTouZi(BigDecimal YSKXLTouZi) {
		this.YSKXLTouZi = YSKXLTouZi;
	}

	public BigDecimal getYSKXLTouZi() {
		return YSKXLTouZi;
	}

	public void setDZGSDTouZi(BigDecimal DZGSDTouZi) {
		this.DZGSDTouZi = DZGSDTouZi;
	}

	public BigDecimal getDZGSDTouZi() {
		return DZGSDTouZi;
	}

	public void setDLYHHYQYDTouZi(BigDecimal DLYHHYQYDTouZi) {
		this.DLYHHYQYDTouZi = DLYHHYQYDTouZi;
	}

	public BigDecimal getDLYHHYQYDTouZi() {
		return DLYHHYQYDTouZi;
	}

	public void setDCLDZZiChan(BigDecimal DCLDZZiChan) {
		this.DCLDZZiChan = DCLDZZiChan;
	}

	public BigDecimal getDCLDZZiChan() {
		return DCLDZZiChan;
	}

	public void setJDZZCJZZhunBei(BigDecimal JDZZCJZZhunBei) {
		this.JDZZCJZZhunBei = JDZZCJZZhunBei;
	}

	public BigDecimal getJDZZCJZZhunBei() {
		return JDZZCJZZhunBei;
	}

	public void setDCLDZZCJingZhi(BigDecimal DCLDZZCJingZhi) {
		this.DCLDZZCJingZhi = DCLDZZCJingZhi;
	}

	public BigDecimal getDCLDZZCJingZhi() {
		return DCLDZZCJingZhi;
	}

	public void setQiTaZiChan(BigDecimal QiTaZiChan) {
		this.QiTaZiChan = QiTaZiChan;
	}

	public BigDecimal getQiTaZiChan() {
		return QiTaZiChan;
	}

	public void setYGYJZJLQBDJRDQSYDJRFuZhai(
			BigDecimal YGYJZJLQBDJRDQSYDJRFuZhai) {
		this.YGYJZJLQBDJRDQSYDJRFuZhai = YGYJZJLQBDJRDQSYDJRFuZhai;
	}

	public BigDecimal getYGYJZJLQBDJRDQSYDJRFuZhai() {
		return YGYJZJLQBDJRDQSYDJRFuZhai;
	}

	public void setZDYGYJZJLQBDJRDQSYDJRFuZhai(
			BigDecimal ZDYGYJZJLQBDJRDQSYDJRFuZhai) {
		this.ZDYGYJZJLQBDJRDQSYDJRFuZhai = ZDYGYJZJLQBDJRDQSYDJRFuZhai;
	}

	public BigDecimal getZDYGYJZJLQBDJRDQSYDJRFuZhai() {
		return ZDYGYJZJLQBDJRDQSYDJRFuZhai;
	}

	public void setYSJRFuZhai(BigDecimal YSJRFuZhai) {
		this.YSJRFuZhai = YSJRFuZhai;
	}

	public BigDecimal getYSJRFuZhai() {
		return YSJRFuZhai;
	}

	public void setXiShouCunKuan(BigDecimal XiShouCunKuan) {
		this.XiShouCunKuan = XiShouCunKuan;
	}

	public BigDecimal getXiShouCunKuan() {
		return XiShouCunKuan;
	}

	public void setHuiChuHuiKuan(BigDecimal HuiChuHuiKuan) {
		this.HuiChuHuiKuan = HuiChuHuiKuan;
	}

	public BigDecimal getHuiChuHuiKuan() {
		return HuiChuHuiKuan;
	}

	public void setCKZJYFPiaoJu(BigDecimal CKZJYFPiaoJu) {
		this.CKZJYFPiaoJu = CKZJYFPiaoJu;
	}

	public BigDecimal getCKZJYFPiaoJu() {
		return CKZJYFPiaoJu;
	}

	public void setCunKuanZheng(BigDecimal CunKuanZheng) {
		this.CunKuanZheng = CunKuanZheng;
	}

	public BigDecimal getCunKuanZheng() {
		return CunKuanZheng;
	}

	public void setQiTaFuZhai(BigDecimal QiTaFuZhai) {
		this.QiTaFuZhai = QiTaFuZhai;
	}

	public BigDecimal getQiTaFuZhai() {
		return QiTaFuZhai;
	}

	public void setQZTZCGChuBei(BigDecimal QZTZCGChuBei) {
		this.QZTZCGChuBei = QZTZCGChuBei;
	}

	public BigDecimal getQZTZCGChuBei() {
		return QZTZCGChuBei;
	}

	public void setTaoQiChuBei(BigDecimal TaoQiChuBei) {
		this.TaoQiChuBei = TaoQiChuBei;
	}

	public BigDecimal getTaoQiChuBei() {
		return TaoQiChuBei;
	}
}
