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
@Table(name = "balance_sheet")
public class ModelCWSJBalanceSheet extends BaseModel {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name = "idStr")
	private String idStr;
	@Column(name = "sec_ID")
	private String sec_ID;
	@Column(name = "stockCode")
	private String stockCode;
	@Column(name = "stockName")
	private String stockName;
	@Column(name = "HBZiJin")
	private BigDecimal hbZiJin;
	@Column(name = "JSFuBeiJin")
	private BigDecimal jsFuBeiJin;
	@Column(name = "CCZiJin")
	private BigDecimal ccZiJin;
	@Column(name = "JYXJRZiChan")
	private BigDecimal jyXJRZiChan;
	@Column(name = "YSPiaoJu")
	private BigDecimal ysPiaoJu;
	@Column(name = "YSZhangKuan")
	private BigDecimal ysZhangKuan;
	@Column(name = "YFKuangXiang")
	private BigDecimal yfKuangXiang;
	@Column(name = "YSBaoFei")
	private BigDecimal ysBaoFei;
	@Column(name = "YSFBZhangkuan")
	private BigDecimal ysFBZhangkuan;
	@Column(name = "YSFBHTZhunBeiJin")
	private BigDecimal ysFBHTZhunBeiJin;
	@Column(name = "YSLiXi")
	private BigDecimal ysLiXi;
	@Column(name = "YSGuLi")
	private BigDecimal ysGuLi;
	@Column(name = "QTYSKuan")
	private BigDecimal qtYSKuan;
	@Column(name = "YSCKTuiShui")
	private BigDecimal ysCKTuiShui;
	@Column(name = "YSBuTieKuan")
	private BigDecimal ysBuTieKuan;
	@Column(name = "NBYSKuan")
	private BigDecimal nbYSKuan;
	@Column(name = "MRFSJRZiChan")
	private BigDecimal mrFSJRZiChan;
	@Column(name = "CunHuo")
	private BigDecimal cunHuo;
	@Column(name = "YNNDQFLDZiChan")
	private BigDecimal ynNDQFLDZiChan;
	@Column(name = "QTLDZiChan")
	private BigDecimal qtLDZiChan;
	@Column(name = "LDZCQTXiangMu")
	private BigDecimal ldZCQTXiangMu;
	@Column(name = "LDZCPHXiangMu")
	private BigDecimal ldZCPHXiangMu;
	@Column(name = "LDZCHeJi")
	private BigDecimal ldZCHeJi;
	@Column(name = "FFWTDKJDianKuan")
	private BigDecimal ffWTDKJDianKuan;
	@Column(name = "KGCSJRZiChan")
	private BigDecimal kgCSJRZiChan;
	@Column(name = "CYZDQTouZi")
	private BigDecimal cyZDQTouZi;
	@Column(name = "CQYShouKuan")
	private BigDecimal cqYShouKuan;
	@Column(name = "CQGQTouZi")
	private BigDecimal cqGQTouZi;
	@Column(name = "TZXFanDiChan")
	private BigDecimal tzXFanDiChan;
	@Column(name = "GDZiChan")
	private BigDecimal gdZiChan;
	@Column(name = "ZJGongCheng")
	private BigDecimal zjGongCheng;
	@Column(name = "GCWuZi")
	private BigDecimal gcWuZi;
	@Column(name = "GDZCQingLi")
	private BigDecimal gdZCQingLi;
	@Column(name = "SCXSWZiChan")
	private BigDecimal scXSWZiChan;
	@Column(name = "YQZiChan")
	private BigDecimal yqZiChan;
	@Column(name = "WXZiChan")
	private BigDecimal wxZiChan;
	@Column(name = "ShangYu")
	private BigDecimal shangYu;
	@Column(name = "CQDTFeiYong")
	private BigDecimal cqDTFeiYong;
	@Column(name = "DYSDSZiChan")
	private BigDecimal dySDSZiChan;
	@Column(name = "QTFLDZiChan")
	private BigDecimal qtFLDZiChan;
	@Column(name = "FLDZCQTXiangMu")
	private BigDecimal flDZCQTXiangMu;
	@Column(name = "FLDZCPHXiangMu")
	private BigDecimal flDZCPHXiangMu;
	@Column(name = "FLDZCHeJi")
	private BigDecimal flDZCHeJi;
	@Column(name = "ZCQTXiangMu")
	private BigDecimal zcQTXiangMu;
	@Column(name = "ZCPHXiangMu")
	private BigDecimal zcPHXiangMu;
	@Column(name = "ZCZongJi")
	private BigDecimal zcZongJi;
	@Column(name = "DQJieKuan")
	private BigDecimal dqJieKuan;
	@Column(name = "XZYYHJieKuan")
	private BigDecimal xzYYHJieKuan;
	@Column(name = "XSCKJTYCunFang")
	private BigDecimal xsCKJTYCunFang;
	@Column(name = "XRZiJin")
	private BigDecimal xrZiJin;
	@Column(name = "JYXJRFuZhai")
	private BigDecimal jyXJRFuZhai;
	@Column(name = "YFPiaoJu")
	private BigDecimal yfPiaoJu;
	@Column(name = "YFZhangKuan")
	private BigDecimal yfZhangKuan;
	@Column(name = "FSKuanXiang")
	private BigDecimal fsKuanXiang;
	@Column(name = "MCHGJRZiChanKuan")
	private BigDecimal mcHGJRZiChanKuan;
	@Column(name = "YFSXFJRongJin")
	private BigDecimal yfSXFJRongJin;
	@Column(name = "YFShuiFei")
	private BigDecimal yfShuiFei;
	@Column(name = "YFLiXi")
	private BigDecimal yfLiXi;
	@Column(name = "YFGuLi")
	private BigDecimal yfGuLi;
	@Column(name = "YFFBZhangKuan")
	private BigDecimal yfFBZhangKuan;
	@Column(name = "NBYingFuKuan")
	private BigDecimal nbYingFuKuan;
	@Column(name = "QTYingFuKuan")
	private BigDecimal qtYingFuKuan;
	@Column(name = "YJLDFuKuan")
	private BigDecimal yjLDFuKuan;
	@Column(name = "BXHTZhengQuanKuan")
	private BigDecimal bxHTZhengQuanKuan;
	@Column(name = "DLMMZhengQuanKuan")
	private BigDecimal dlMMZhengQuanKuan;
	@Column(name = "DLCXZhengQuanKuan")
	private BigDecimal dlCXZhengQuanKuan;
	@Column(name = "YNNDDYShouYi")
	private BigDecimal ynNDDYShouYi;
	@Column(name = "YFDQZhaiQuan")
	private BigDecimal yfDQZhaiQuan;
	@Column(name = "YNNDQDFLDFuZhai")
	private BigDecimal ynNDQDFLDFuZhai;
	@Column(name = "QTLDFuZhai")
	private BigDecimal qtLDFuZhai;
	@Column(name = "LDFZQTXiangMu")
	private BigDecimal ldFZQTXiangMu;
	@Column(name = "LDFZPHXiangMu")
	private BigDecimal ldFZPHXiangMu;
	@Column(name = "LDFZHeJi")
	private BigDecimal ldFZHeJi;
	@Column(name = "CQJieKuan")
	private BigDecimal cqJieKuan;
	@Column(name = "YFZhaiQuan")
	private BigDecimal yfZhaiQuan;
	@Column(name = "QZYouXianGu")
	private BigDecimal qzYouXianGu;
	@Column(name = "QZYongXuZhai")
	private BigDecimal qzYongXuZhai;
	@Column(name = "CQYingFuKuan")
	private BigDecimal cqYingFuKuan;
	@Column(name = "ZXYingFuKuan")
	private BigDecimal zxYingFuKuan;
	@Column(name = "YJFuZhai")
	private BigDecimal yjFuZhai;
/*	@Column(name = "YJFLDFuZhai")
	private BigDecimal YJFLDFuZhai;*/
	@Column(name = "DYShouYi")
	private BigDecimal dyShouYi;
	@Column(name = "DYSDSFuZhai")
	private BigDecimal dySDSFuZhai;
	@Column(name = "QTFLDFuZhai")
	private BigDecimal qtFLDFuZhai;
	@Column(name = "FLDFZQTXiangMu")
	private BigDecimal flDFZQTXiangMu;
	@Column(name = "FLDFZPHXiangMu")
	private BigDecimal flDFZPHXiangMu;
	@Column(name = "FLDFZHeJi")
	private BigDecimal flDFZHeJi;
	@Column(name = "FZQTXiangMu")
	private BigDecimal fzQTXiangMu;
	@Column(name = "FZPHXiangMu")
	private BigDecimal fzPHXiangMu;
	@Column(name = "FZHeJi")
	private BigDecimal fzHeJi;
	@Column(name = "SSZiBen")
	private BigDecimal ssZiBen;
	@Column(name = "ZBGongJi")
	private BigDecimal zbGongJi;
	@Column(name = "JKCunGu")
	private BigDecimal jkCunGu;
	@Column(name = "ZXChuBei")
	private BigDecimal zxChuBei;
	@Column(name = "YYGongJi")
	private BigDecimal yyGongJi;
	@Column(name = "YBFXZhunBei")
	private BigDecimal ybFXZhunBei;
	@Column(name = "WQDDTZSunShi")
	private BigDecimal wqDDTZSunShi;
	@Column(name = "WFPLiRun")
	private BigDecimal wfPLiRun;
	@Column(name = "NFPXJGuLi")
	private BigDecimal nfPXJGuLi;
	@Column(name = "WBBBZSChaE")
	private BigDecimal wbBBZSChaE;
	@Column(name = "GSYMGSGDQYQTXiangMu")
	private BigDecimal gsYMGSGDQYQTXiangMu;
	@Column(name = "GSYMGSGDQYPHXiangMu")
	private BigDecimal gsYMGSGDQYPHXiangMu;
	@Column(name = "GSYMGSGDQYHeJi")
	private BigDecimal gsYMGSGDQYHeJi;
	@Column(name = "SSGDQuanYi")
	private BigDecimal ssGDQuanYi;
	@Column(name = "GDQYQTXiangMu")
	private BigDecimal gdQYQTXiangMu;
	@Column(name = "GDQYPHXiangMu")
	private BigDecimal gdQYPHXiangMu;
	@Column(name = "SYZQYHeJi")
	private BigDecimal syZQYHeJi;
	@Column(name = "FZHGDQYQTXiangMu")
	private BigDecimal fzHGDQYQTXiangMu;
	@Column(name = "FZHGDQYPHXiangMu")
	private BigDecimal fzHGDQYPHXiangMu;
	@Column(name = "FZHSYZQYHeJi")
	private BigDecimal fzHSYZQYHeJi;
	@Column(name = "QTQYGongJu")
	private BigDecimal qtQYGongJu;
	@Column(name = "QZYongXuGu")
	private BigDecimal qzYongXuGu;
	@Column(name = "QTZHShouYi")
	private BigDecimal qtZHShouYi;
	@Column(name = "dataCompiledDate")
	private Date dataCompiledDate;
	@Column(name = "endDate")
	private Date endDate;

	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}

	public String getIdStr() {
		return idStr;
	}

	public void setSec_ID(String sec_ID) {
		this.sec_ID = sec_ID;
	}

	public String getSec_ID() {
		return sec_ID;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getStockName() {
		return stockName;
	}

	public void setJsFuBeiJin(BigDecimal JSFuBeiJin) {
		this.jsFuBeiJin = JSFuBeiJin;
	}

	public BigDecimal getJsFuBeiJin() {
		return jsFuBeiJin;
	}

	public void setCcZiJin(BigDecimal CCZiJin) {
		this.ccZiJin = CCZiJin;
	}

	public BigDecimal getCcZiJin() {
		return ccZiJin;
	}

	public void setJyXJRZiChan(BigDecimal JYXJRZiChan) {
		this.jyXJRZiChan = JYXJRZiChan;
	}

	public BigDecimal getJyXJRZiChan() {
		return jyXJRZiChan;
	}

	public void setYsPiaoJu(BigDecimal YSPiaoJu) {
		this.ysPiaoJu = YSPiaoJu;
	}

	public BigDecimal getYSPiaoJu() {
		return ysPiaoJu;
	}

	public void setYsZhangKuan(BigDecimal YSZhangKuan) {
		this.ysZhangKuan = YSZhangKuan;
	}

	public BigDecimal getYsZhangKuan() {
		return ysZhangKuan;
	}

	public void setYfKuangXiang(BigDecimal YFKuangXiang) {
		this.yfKuangXiang = YFKuangXiang;
	}

	public BigDecimal getYfKuangXiang() {
		return yfKuangXiang;
	}

	public void setYsBaoFei(BigDecimal YSBaoFei) {
		this.ysBaoFei = YSBaoFei;
	}

	public BigDecimal getYsBaoFei() {
		return ysBaoFei;
	}

	public void setYsFBZhangkuan(BigDecimal YSFBZhangkuan) {
		this.ysFBZhangkuan = YSFBZhangkuan;
	}

	public BigDecimal getYsFBZhangkuan() {
		return ysFBZhangkuan;
	}

	public void setYsFBHTZhunBeiJin(BigDecimal YSFBHTZhunBeiJin) {
		this.ysFBHTZhunBeiJin = YSFBHTZhunBeiJin;
	}

	public BigDecimal getYsFBHTZhunBeiJin() {
		return ysFBHTZhunBeiJin;
	}

	public void setYsLiXi(BigDecimal YSLiXi) {
		this.ysLiXi = YSLiXi;
	}

	public BigDecimal getYsLiXi() {
		return ysLiXi;
	}

	public void setYsGuLi(BigDecimal YSGuLi) {
		this.ysGuLi = YSGuLi;
	}

	public BigDecimal getYsGuLi() {
		return ysGuLi;
	}

	public void setQtYSKuan(BigDecimal QTYSKuan) {
		this.qtYSKuan = QTYSKuan;
	}

	public BigDecimal getQtYSKuan() {
		return qtYSKuan;
	}

	public void setYsCKTuiShui(BigDecimal YSCKTuiShui) {
		this.ysCKTuiShui = YSCKTuiShui;
	}

	public BigDecimal getYsCKTuiShui() {
		return ysCKTuiShui;
	}

	public void setYsBuTieKuan(BigDecimal YSBuTieKuan) {
		this.ysBuTieKuan = YSBuTieKuan;
	}

	public BigDecimal getYsBuTieKuan() {
		return ysBuTieKuan;
	}

	public void setNbYSKuan(BigDecimal NBYSKuan) {
		this.nbYSKuan = NBYSKuan;
	}

	public BigDecimal getNbYSKuan() {
		return nbYSKuan;
	}

	public void setMrFSJRZiChan(BigDecimal MRFSJRZiChan) {
		this.mrFSJRZiChan = MRFSJRZiChan;
	}

	public BigDecimal getMrFSJRZiChan() {
		return mrFSJRZiChan;
	}

	public void setCunHuo(BigDecimal CunHuo) {
		this.cunHuo = CunHuo;
	}

	public BigDecimal getCunHuo() {
		return cunHuo;
	}

	public void setYnNDQFLDZiChan(BigDecimal YNNDQFLDZiChan) {
		this.ynNDQFLDZiChan = YNNDQFLDZiChan;
	}

	public BigDecimal getYnNDQFLDZiChan() {
		return ynNDQFLDZiChan;
	}

	public void setQtLDZiChan(BigDecimal QTLDZiChan) {
		this.qtLDZiChan = QTLDZiChan;
	}

	public BigDecimal getQtLDZiChan() {
		return qtLDZiChan;
	}

	public void setLdZCQTXiangMu(BigDecimal LDZCQTXiangMu) {
		this.ldZCQTXiangMu = LDZCQTXiangMu;
	}

	public BigDecimal getLdZCQTXiangMu() {
		return ldZCQTXiangMu;
	}

	public void setLdZCPHXiangMu(BigDecimal LDZCPHXiangMu) {
		this.ldZCPHXiangMu = LDZCPHXiangMu;
	}

	public BigDecimal getLdZCPHXiangMu() {
		return ldZCPHXiangMu;
	}

	public void setLdZCHeJi(BigDecimal LDZCHeJi) {
		this.ldZCHeJi = LDZCHeJi;
	}

	public BigDecimal getLdZCHeJi() {
		return ldZCHeJi;
	}

	public void setFfWTDKJDianKuan(BigDecimal FFWTDKJDianKuan) {
		this.ffWTDKJDianKuan = FFWTDKJDianKuan;
	}

	public BigDecimal getFfWTDKJDianKuan() {
		return ffWTDKJDianKuan;
	}

	public void setKgCSJRZiChan(BigDecimal KGCSJRZiChan) {
		this.kgCSJRZiChan = KGCSJRZiChan;
	}

	public BigDecimal getKgCSJRZiChan() {
		return kgCSJRZiChan;
	}

	public void setCyZDQTouZi(BigDecimal CYZDQTouZi) {
		this.cyZDQTouZi = CYZDQTouZi;
	}

	public BigDecimal getCyZDQTouZi() {
		return cyZDQTouZi;
	}

	public void setCqYShouKuan(BigDecimal CQYShouKuan) {
		this.cqYShouKuan = CQYShouKuan;
	}

	public BigDecimal getCqYShouKuan() {
		return cqYShouKuan;
	}

	public void setCqGQTouZi(BigDecimal CQGQTouZi) {
		this.cqGQTouZi = CQGQTouZi;
	}

	public BigDecimal getCqGQTouZi() {
		return cqGQTouZi;
	}

	public void setTzXFanDiChan(BigDecimal TZXFanDiChan) {
		this.tzXFanDiChan = TZXFanDiChan;
	}

	public BigDecimal getTzXFanDiChan() {
		return tzXFanDiChan;
	}

	public void setGdZiChan(BigDecimal GDZiChan) {
		this.gdZiChan = GDZiChan;
	}

	public BigDecimal getGdZiChan() {
		return gdZiChan;
	}

	public void setZjGongCheng(BigDecimal ZJGongCheng) {
		this.zjGongCheng = ZJGongCheng;
	}

	public BigDecimal getZjGongCheng() {
		return zjGongCheng;
	}

	public void setGcWuZi(BigDecimal GCWuZi) {
		this.gcWuZi = GCWuZi;
	}

	public BigDecimal getGcWuZi() {
		return gcWuZi;
	}

	public void setGdZCQingLi(BigDecimal GDZCQingLi) {
		this.gdZCQingLi = GDZCQingLi;
	}

	public BigDecimal getGdZCQingLi() {
		return gdZCQingLi;
	}

	public void setScXSWZiChan(BigDecimal SCXSWZiChan) {
		this.scXSWZiChan = SCXSWZiChan;
	}

	public BigDecimal getScXSWZiChan() {
		return scXSWZiChan;
	}

	public void setYqZiChan(BigDecimal YQZiChan) {
		this.yqZiChan = YQZiChan;
	}

	public BigDecimal getYqZiChan() {
		return yqZiChan;
	}

	public void setWxZiChan(BigDecimal WXZiChan) {
		this.wxZiChan = WXZiChan;
	}

	public BigDecimal getWxZiChan() {
		return wxZiChan;
	}

	public void setShangYu(BigDecimal ShangYu) {
		this.shangYu = ShangYu;
	}

	public BigDecimal getShangYu() {
		return shangYu;
	}

	public void setCqDTFeiYong(BigDecimal CQDTFeiYong) {
		this.cqDTFeiYong = CQDTFeiYong;
	}

	public BigDecimal getCqDTFeiYong() {
		return cqDTFeiYong;
	}

	public void setDySDSZiChan(BigDecimal DYSDSZiChan) {
		this.dySDSZiChan = DYSDSZiChan;
	}

	public BigDecimal getDySDSZiChan() {
		return dySDSZiChan;
	}

	public void setQtFLDZiChan(BigDecimal QTFLDZiChan) {
		this.qtFLDZiChan = QTFLDZiChan;
	}

	public BigDecimal getQtFLDZiChan() {
		return qtFLDZiChan;
	}

	public void setFlDZCQTXiangMu(BigDecimal FLDZCQTXiangMu) {
		this.flDZCQTXiangMu = FLDZCQTXiangMu;
	}

	public BigDecimal getFlDZCQTXiangMu() {
		return flDZCQTXiangMu;
	}

	public void setFlDZCPHXiangMu(BigDecimal FLDZCPHXiangMu) {
		this.flDZCPHXiangMu = FLDZCPHXiangMu;
	}

	public BigDecimal getFlDZCPHXiangMu() {
		return flDZCPHXiangMu;
	}

	public void setFlDZCHeJi(BigDecimal FLDZCHeJi) {
		this.flDZCHeJi = FLDZCHeJi;
	}

	public BigDecimal getFlDZCHeJi() {
		return flDZCHeJi;
	}

	public void setZcQTXiangMu(BigDecimal ZCQTXiangMu) {
		this.zcQTXiangMu = ZCQTXiangMu;
	}

	public BigDecimal getZcQTXiangMu() {
		return zcQTXiangMu;
	}

	public void setZcPHXiangMu(BigDecimal ZCPHXiangMu) {
		this.zcPHXiangMu = ZCPHXiangMu;
	}

	public BigDecimal getZcPHXiangMu() {
		return zcPHXiangMu;
	}

	public void setZcZongJi(BigDecimal ZCZongJi) {
		this.zcZongJi = ZCZongJi;
	}

	public BigDecimal getZcZongJi() {
		return zcZongJi;
	}

	public void setDqJieKuan(BigDecimal DQJieKuan) {
		this.dqJieKuan = DQJieKuan;
	}

	public BigDecimal getDqJieKuan() {
		return dqJieKuan;
	}

	public void setXzYYHJieKuan(BigDecimal XZYYHJieKuan) {
		this.xzYYHJieKuan = XZYYHJieKuan;
	}

	public BigDecimal getXzYYHJieKuan() {
		return xzYYHJieKuan;
	}

	public void setXsCKJTYCunFang(BigDecimal XSCKJTYCunFang) {
		this.xsCKJTYCunFang = XSCKJTYCunFang;
	}

	public BigDecimal getXsCKJTYCunFang() {
		return xsCKJTYCunFang;
	}

	public void setXrZiJin(BigDecimal XRZiJin) {
		this.xrZiJin = XRZiJin;
	}

	public BigDecimal getXrZiJin() {
		return xrZiJin;
	}

	public void setJyXJRFuZhai(BigDecimal JYXJRFuZhai) {
		this.jyXJRFuZhai = JYXJRFuZhai;
	}

	public BigDecimal getJyXJRFuZhai() {
		return jyXJRFuZhai;
	}

	public void setYfPiaoJu(BigDecimal YFPiaoJu) {
		this.yfPiaoJu = YFPiaoJu;
	}

	public BigDecimal getYfPiaoJu() {
		return yfPiaoJu;
	}

	public void setYfZhangKuan(BigDecimal YFZhangKuan) {
		this.yfZhangKuan = YFZhangKuan;
	}

	public BigDecimal getYfZhangKuan() {
		return yfZhangKuan;
	}

	public void setFsKuanXiang(BigDecimal FSKuanXiang) {
		this.fsKuanXiang = FSKuanXiang;
	}

	public BigDecimal getFsKuanXiang() {
		return fsKuanXiang;
	}

	public void setMcHGJRZiChanKuan(BigDecimal MCHGJRZiChanKuan) {
		this.mcHGJRZiChanKuan = MCHGJRZiChanKuan;
	}

	public BigDecimal getMcHGJRZiChanKuan() {
		return mcHGJRZiChanKuan;
	}

	public void setYfSXFJRongJin(BigDecimal YFSXFJRongJin) {
		this.yfSXFJRongJin = YFSXFJRongJin;
	}

	public BigDecimal getYfSXFJRongJin() {
		return yfSXFJRongJin;
	}

	public void setYfShuiFei(BigDecimal YFShuiFei) {
		this.yfShuiFei = YFShuiFei;
	}

	public BigDecimal getYfShuiFei() {
		return yfShuiFei;
	}

	public void setYfLiXi(BigDecimal YFLiXi) {
		this.yfLiXi = YFLiXi;
	}

	public BigDecimal getYfLiXi() {
		return yfLiXi;
	}

	public void setYfGuLi(BigDecimal YFGuLi) {
		this.yfGuLi = YFGuLi;
	}

	public BigDecimal getYfGuLi() {
		return yfGuLi;
	}

	public void setYfFBZhangKuan(BigDecimal YFFBZhangKuan) {
		this.yfFBZhangKuan = YFFBZhangKuan;
	}

	public BigDecimal getYfFBZhangKuan() {
		return yfFBZhangKuan;
	}

	public void setNbYingFuKuan(BigDecimal NBYingFuKuan) {
		this.nbYingFuKuan = NBYingFuKuan;
	}

	public BigDecimal getNbYingFuKuan() {
		return nbYingFuKuan;
	}

	public void setQtYingFuKuan(BigDecimal QTYingFuKuan) {
		this.qtYingFuKuan = QTYingFuKuan;
	}

	public BigDecimal getQtYingFuKuan() {
		return qtYingFuKuan;
	}

	public void setYjLDFuKuan(BigDecimal YJLDFuKuan) {
		this.yjLDFuKuan = YJLDFuKuan;
	}

	public BigDecimal getYjLDFuKuan() {
		return yjLDFuKuan;
	}

	public void setBxHTZhengQuanKuan(BigDecimal BXHTZhengQuanKuan) {
		this.bxHTZhengQuanKuan = BXHTZhengQuanKuan;
	}

	public BigDecimal getBxHTZhengQuanKuan() {
		return bxHTZhengQuanKuan;
	}

	public void setDlMMZhengQuanKuan(BigDecimal DLMMZhengQuanKuan) {
		this.dlMMZhengQuanKuan = DLMMZhengQuanKuan;
	}

	public BigDecimal getDlMMZhengQuanKuan() {
		return dlMMZhengQuanKuan;
	}

	public void setDlCXZhengQuanKuan(BigDecimal DLCXZhengQuanKuan) {
		this.dlCXZhengQuanKuan = DLCXZhengQuanKuan;
	}

	public BigDecimal getDlCXZhengQuanKuan() {
		return dlCXZhengQuanKuan;
	}

	public void setYnNDDYShouYi(BigDecimal YNNDDYShouYi) {
		this.ynNDDYShouYi = YNNDDYShouYi;
	}

	public BigDecimal getYnNDDYShouYi() {
		return ynNDDYShouYi;
	}

	public void setYfDQZhaiQuan(BigDecimal YFDQZhaiQuan) {
		this.yfDQZhaiQuan = YFDQZhaiQuan;
	}

	public BigDecimal getYfDQZhaiQuan() {
		return yfDQZhaiQuan;
	}

	public void setYnNDQDFLDFuZhai(BigDecimal YNNDQDFLDFuZhai) {
		this.ynNDQDFLDFuZhai = YNNDQDFLDFuZhai;
	}

	public BigDecimal getYnNDQDFLDFuZhai() {
		return ynNDQDFLDFuZhai;
	}

	public void setQtLDFuZhai(BigDecimal QTLDFuZhai) {
		this.qtLDFuZhai = QTLDFuZhai;
	}

	public BigDecimal getQtLDFuZhai() {
		return qtLDFuZhai;
	}

	public void setLdFZQTXiangMu(BigDecimal LDFZQTXiangMu) {
		this.ldFZQTXiangMu = LDFZQTXiangMu;
	}

	public BigDecimal getLdFZQTXiangMu() {
		return ldFZQTXiangMu;
	}

	public void setLdFZPHXiangMu(BigDecimal LDFZPHXiangMu) {
		this.ldFZPHXiangMu = LDFZPHXiangMu;
	}

	public BigDecimal getLdFZPHXiangMu() {
		return ldFZPHXiangMu;
	}

	public void setLdFZHeJi(BigDecimal LDFZHeJi) {
		this.ldFZHeJi = LDFZHeJi;
	}

	public BigDecimal getLdFZHeJi() {
		return ldFZHeJi;
	}

	public void setCqJieKuan(BigDecimal CQJieKuan) {
		this.cqJieKuan = CQJieKuan;
	}

	public BigDecimal getCqJieKuan() {
		return cqJieKuan;
	}

	public void setYfZhaiQuan(BigDecimal YFZhaiQuan) {
		this.yfZhaiQuan = YFZhaiQuan;
	}

	public BigDecimal getYfZhaiQuan() {
		return yfZhaiQuan;
	}

	public void setQzYouXianGu(BigDecimal QZYouXianGu) {
		this.qzYouXianGu = QZYouXianGu;
	}

	public BigDecimal getQzYouXianGu() {
		return qzYouXianGu;
	}

	public void setQzYongXuZhai(BigDecimal QZYongXuZhai) {
		this.qzYongXuZhai = QZYongXuZhai;
	}

	public BigDecimal getQzYongXuZhai() {
		return qzYongXuZhai;
	}

	public void setCqYingFuKuan(BigDecimal CQYingFuKuan) {
		this.cqYingFuKuan = CQYingFuKuan;
	}

	public BigDecimal getCqYingFuKuan() {
		return cqYingFuKuan;
	}

	public void setZxYingFuKuan(BigDecimal ZXYingFuKuan) {
		this.zxYingFuKuan = ZXYingFuKuan;
	}

	public BigDecimal getZxYingFuKuan() {
		return zxYingFuKuan;
	}

	public void setYjFuZhai(BigDecimal YJFuZhai) {
		this.yjFuZhai = YJFuZhai;
	}

	public BigDecimal getYjFuZhai() {
		return yjFuZhai;
	}


	public void setDyShouYi(BigDecimal DYShouYi) {
		this.dyShouYi = DYShouYi;
	}

	public BigDecimal getDyShouYi() {
		return dyShouYi;
	}

	public void setDySDSFuZhai(BigDecimal DYSDSFuZhai) {
		this.dySDSFuZhai = DYSDSFuZhai;
	}

	public BigDecimal getDySDSFuZhai() {
		return dySDSFuZhai;
	}

	public void setQtFLDFuZhai(BigDecimal QTFLDFuZhai) {
		this.qtFLDFuZhai = QTFLDFuZhai;
	}

	public BigDecimal getQtFLDFuZhai() {
		return qtFLDFuZhai;
	}

	public void setFlDFZQTXiangMu(BigDecimal FLDFZQTXiangMu) {
		this.flDFZQTXiangMu = FLDFZQTXiangMu;
	}

	public BigDecimal getFlDFZQTXiangMu() {
		return flDFZQTXiangMu;
	}

	public void setFlDFZPHXiangMu(BigDecimal FLDFZPHXiangMu) {
		this.flDFZPHXiangMu = FLDFZPHXiangMu;
	}

	public BigDecimal getFlDFZPHXiangMu() {
		return flDFZPHXiangMu;
	}

	public void setFlDFZHeJi(BigDecimal FLDFZHeJi) {
		this.flDFZHeJi = FLDFZHeJi;
	}

	public BigDecimal getFlDFZHeJi() {
		return flDFZHeJi;
	}

	public void setFzQTXiangMu(BigDecimal FZQTXiangMu) {
		this.fzQTXiangMu = FZQTXiangMu;
	}

	public BigDecimal getFzQTXiangMu() {
		return fzQTXiangMu;
	}

	public void setFzPHXiangMu(BigDecimal FZPHXiangMu) {
		this.fzPHXiangMu = FZPHXiangMu;
	}

	public BigDecimal getFzPHXiangMu() {
		return fzPHXiangMu;
	}

	public void setFzHeJi(BigDecimal FZHeJi) {
		this.fzHeJi = FZHeJi;
	}

	public BigDecimal getFzHeJi() {
		return fzHeJi;
	}

	public void setSsZiBen(BigDecimal SSZiBen) {
		this.ssZiBen = SSZiBen;
	}

	public BigDecimal getSsZiBen() {
		return ssZiBen;
	}

	public void setZbGongJi(BigDecimal ZBGongJi) {
		this.zbGongJi = ZBGongJi;
	}

	public BigDecimal getZbGongJi() {
		return zbGongJi;
	}

	public void setJkCunGu(BigDecimal JKCunGu) {
		this.jkCunGu = JKCunGu;
	}

	public BigDecimal getJkCunGu() {
		return jkCunGu;
	}

	public void setZxChuBei(BigDecimal ZXChuBei) {
		this.zxChuBei = ZXChuBei;
	}

	public BigDecimal getZxChuBei() {
		return zxChuBei;
	}

	public void setYyGongJi(BigDecimal YYGongJi) {
		this.yyGongJi = YYGongJi;
	}

	public BigDecimal getYyGongJi() {
		return yyGongJi;
	}

	public void setYbFXZhunBei(BigDecimal YBFXZhunBei) {
		this.ybFXZhunBei = YBFXZhunBei;
	}

	public BigDecimal getYbFXZhunBei() {
		return ybFXZhunBei;
	}

	public void setWqDDTZSunShi(BigDecimal WQDDTZSunShi) {
		this.wqDDTZSunShi = WQDDTZSunShi;
	}

	public BigDecimal getWqDDTZSunShi() {
		return wqDDTZSunShi;
	}

	public void setWfPLiRun(BigDecimal WFPLiRun) {
		this.wfPLiRun = WFPLiRun;
	}

	public BigDecimal getWfPLiRun() {
		return wfPLiRun;
	}

	public void setNfPXJGuLi(BigDecimal NFPXJGuLi) {
		this.nfPXJGuLi = NFPXJGuLi;
	}

	public BigDecimal getNfPXJGuLi() {
		return nfPXJGuLi;
	}

	public void setWbBBZSChaE(BigDecimal WBBBZSChaE) {
		this.wbBBZSChaE = WBBBZSChaE;
	}

	public BigDecimal getWbBBZSChaE() {
		return wbBBZSChaE;
	}

	public void setGsYMGSGDQYQTXiangMu(BigDecimal GSYMGSGDQYQTXiangMu) {
		this.gsYMGSGDQYQTXiangMu = GSYMGSGDQYQTXiangMu;
	}

	public BigDecimal getGsYMGSGDQYQTXiangMu() {
		return gsYMGSGDQYQTXiangMu;
	}

	public void setGsYMGSGDQYPHXiangMu(BigDecimal GSYMGSGDQYPHXiangMu) {
		this.gsYMGSGDQYPHXiangMu = GSYMGSGDQYPHXiangMu;
	}

	public BigDecimal getGsYMGSGDQYPHXiangMu() {
		return gsYMGSGDQYPHXiangMu;
	}

	public void setGsYMGSGDQYHeJi(BigDecimal GSYMGSGDQYHeJi) {
		this.gsYMGSGDQYHeJi = GSYMGSGDQYHeJi;
	}

	public BigDecimal getGsYMGSGDQYHeJi() {
		return gsYMGSGDQYHeJi;
	}

	public void setSsGDQuanYi(BigDecimal SSGDQuanYi) {
		this.ssGDQuanYi = SSGDQuanYi;
	}

	public BigDecimal getSsGDQuanYi() {
		return ssGDQuanYi;
	}

	public void setGdQYQTXiangMu(BigDecimal GDQYQTXiangMu) {
		this.gdQYQTXiangMu = GDQYQTXiangMu;
	}

	public BigDecimal getGdQYQTXiangMu() {
		return gdQYQTXiangMu;
	}

	public void setGdQYPHXiangMu(BigDecimal GDQYPHXiangMu) {
		this.gdQYPHXiangMu = GDQYPHXiangMu;
	}

	public BigDecimal getGdQYPHXiangMu() {
		return gdQYPHXiangMu;
	}

	public void setSyZQYHeJi(BigDecimal SYZQYHeJi) {
		this.syZQYHeJi = SYZQYHeJi;
	}

	public BigDecimal getSyZQYHeJi() {
		return syZQYHeJi;
	}

	public void setFzHGDQYQTXiangMu(BigDecimal FZHGDQYQTXiangMu) {
		this.fzHGDQYQTXiangMu = FZHGDQYQTXiangMu;
	}

	public BigDecimal getFzHGDQYQTXiangMu() {
		return fzHGDQYQTXiangMu;
	}

	public void setFzHGDQYPHXiangMu(BigDecimal FZHGDQYPHXiangMu) {
		this.fzHGDQYPHXiangMu = FZHGDQYPHXiangMu;
	}

	public BigDecimal getFzHGDQYPHXiangMu() {
		return fzHGDQYPHXiangMu;
	}

	public void setFzHSYZQYHeJi(BigDecimal FZHSYZQYHeJi) {
		this.fzHSYZQYHeJi = FZHSYZQYHeJi;
	}

	public BigDecimal getFzHSYZQYHeJi() {
		return fzHSYZQYHeJi;
	}

	public void setQtQYGongJu(BigDecimal QTQYGongJu) {
		this.qtQYGongJu = QTQYGongJu;
	}

	public BigDecimal getQtQYGongJu() {
		return qtQYGongJu;
	}

	public void setQzYongXuGu(BigDecimal QZYongXuGu) {
		this.qzYongXuGu = QZYongXuGu;
	}

	public BigDecimal getQzYongXuGu() {
		return qzYongXuGu;
	}

	public void setQtZHShouYi(BigDecimal QTZHShouYi) {
		this.qtZHShouYi = QTZHShouYi;
	}

	public BigDecimal getQtZHShouYi() {
		return qtZHShouYi;
	}

	public void setDataCompiledDate(Date dataCompiledDate) {
		this.dataCompiledDate = dataCompiledDate;
	}

	public Date getDataCompiledDate() {
		return dataCompiledDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public BigDecimal getHbZiJin() {
		return hbZiJin;
	}

	public void setHbZiJin(BigDecimal hBZiJin) {
		hbZiJin = hBZiJin;
	}
	
}
