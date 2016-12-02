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
@Table(name="income_statements")
public class ModelCWSJIncomeStatements extends BaseModel{

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
	@Column(name="YingYeZongShouRu")
	private BigDecimal yingYeZongShouRu;
	@Column(name="YingYeShouRu")
	private BigDecimal yingYeShouRu;
	@Column(name="LiXiShouRu")
	private BigDecimal liXiShouRu;
	@Column(name="YiZhunBaoFei")
	private BigDecimal yiZhunBaoFei;
	@Column(name="SSFJYJShouRu")
	private BigDecimal ssfJYJShouRu;
	@Column(name="QTYWShouRu")
	private BigDecimal qtyWShouRu;
	@Column(name="YSZSRQTXiangMu")
	private BigDecimal yszSRQTXiangMu;
	@Column(name="YYZChengBen")
	private BigDecimal yyzChengBen;
	@Column(name="YingYeCheng")
	private BigDecimal yingYeCheng;
	@Column(name="LiXiZhiChu")
	private BigDecimal liXiZhiChu;
	@Column(name="SSFJYJZhiChu")
	private BigDecimal ssfJYJZhiChu;
	@Column(name="YFFeiYong")
	private BigDecimal yffeiYong;
	@Column(name="TuiBaoJin")
	private BigDecimal tuiBaoJin;
	@Column(name="PeiFuZhiChuJinE")
	private BigDecimal peiFuZhiChuJinE;
	@Column(name="TQBXHEZBJJinE")
	private BigDecimal tqbXHEZBJJinE;
	@Column(name="BDHLZhiChu")
	private BigDecimal bdHLZhiChu;
	@Column(name="FBFeiYong")
	private BigDecimal fbFeiYong;
	@Column(name="QTYWChengBen")
	private BigDecimal qtYWChengBen;
	@Column(name="YYSJJFuJia")
	private BigDecimal yySJJFuJia;
	@Column(name="XiaoShouFeiYong")
	private BigDecimal xiaoShouFeiYong;
	@Column(name="CaiWuFeiYong")
	private BigDecimal caiWuFeiYong;
	@Column(name="ZiChanJianZhiSunShi")
	private BigDecimal ziChanJianZhiSunShi;
	@Column(name="YYZCBQTXiangMu")
	private BigDecimal yyZCBQTXiangMu;
	@Column(name="GYJZBDShouYi")
	private BigDecimal gyJZBDShouYi;
	@Column(name="TouZiShouYi")
	private BigDecimal touZiShouYi;
	@Column(name="DLYQYHYQYDTZShouYi")
	private BigDecimal dlYQYHYQYDTZShouYi;
	@Column(name="HuiZongShouYi")
	private BigDecimal huiZongShouYi;
	@Column(name="YYLRQTXiangMu")
	private BigDecimal yyLRQTXiangMu;
	@Column(name="YYLRPHXiangMu")
	private BigDecimal llLRPHXiangMu;
	@Column(name="YYLiRun")
	private BigDecimal yyLiRun;
	@Column(name="YYWShouRu")
	private BigDecimal yyWShouRu;
	@Column(name="FLDZCCZJinSunShi")
	private BigDecimal flDZCCZJinSunShi;
	@Column(name="YXLRZEDQTXiangMu")
	private BigDecimal yxLRZEDQTXiangMu;
	@Column(name="LRZongE")
	private BigDecimal lrZongE;
	@Column(name="SuoDeShui")
	private BigDecimal suoDeShui;
	@Column(name="WQDTZShouShi")
	private BigDecimal wqDTZShouShi;
	@Column(name="YXJLRDQTXiangMu")
	private BigDecimal yxJLRDQTXiangMu;
	@Column(name="JingLiRun")
	private BigDecimal jingLiRun;
	@Column(name="BHBFZHBQSXLiRun")
	private BigDecimal bhBFZHBQSXLiRun;
	@Column(name="GSYMGSGDDJinLiRun")
	private BigDecimal gsYMGSGDDJinLiRun;
	@Column(name="SSGDSunYi")
	private BigDecimal ssGDSunYi;
	@Column(name="JLRQTXiangMu")
	private BigDecimal jlRQTXiangMu;
	@Column(name="JLRChaE")
	private BigDecimal jlRChaE;
	@Column(name="JBMGShouYi")
	private BigDecimal jbMGShouYi;
	@Column(name="XSMGShouYi")
	private BigDecimal xsMGShouYi;
	@Column(name="QTZHShouYi")
	private BigDecimal qtZHShouYi;
	@Column(name="GSYMGSGDDQTZHShouYi")
	private BigDecimal gsYMGSGDDQTZHShouYi;
	@Column(name="ZHShouYiZongE")
	private BigDecimal zhShouYiZongE;
	@Column(name="GSYMGSSYZDZHSYZongE")
	private BigDecimal gsYMGSSYZDZHSYZongE;
	@Column(name="GSYSSGDDZHSYZongE")
	private BigDecimal gsYSSGDDZHSYZongE;
	@Column(name="GLFeiYong")
	private BigDecimal glFeiYong;
	@Column(name="dataCompiledDate")
	private Date dataCompiledDate;
	@Column(name="endDate")
	private Date endDate;
	
	public String getIdStr() {
		return idStr;
	}
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}
	public String getSec_ID() {
		return sec_ID;
	}
	public void setSec_ID(String sec_ID) {
		this.sec_ID = sec_ID;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public BigDecimal getYingYeZongShouRu() {
		return yingYeZongShouRu;
	}
	public void setYingYeZongShouRu(BigDecimal yingYeZongShouRu) {
		this.yingYeZongShouRu = yingYeZongShouRu;
	}
	public BigDecimal getYingYeShouRu() {
		return yingYeShouRu;
	}
	public void setYingYeShouRu(BigDecimal yingYeShouRu) {
		this.yingYeShouRu = yingYeShouRu;
	}
	public BigDecimal getLiXiShouRu() {
		return liXiShouRu;
	}
	public void setLiXiShouRu(BigDecimal liXiShouRu) {
		this.liXiShouRu = liXiShouRu;
	}
	public BigDecimal getYiZhunBaoFei() {
		return yiZhunBaoFei;
	}
	public void setYiZhunBaoFei(BigDecimal yiZhunBaoFei) {
		this.yiZhunBaoFei = yiZhunBaoFei;
	}
	public BigDecimal getSsfJYJShouRu() {
		return ssfJYJShouRu;
	}
	public void setSsfJYJShouRu(BigDecimal ssfJYJShouRu) {
		this.ssfJYJShouRu = ssfJYJShouRu;
	}
	public BigDecimal getQtyWShouRu() {
		return qtyWShouRu;
	}
	public void setQtyWShouRu(BigDecimal qtyWShouRu) {
		this.qtyWShouRu = qtyWShouRu;
	}
	public BigDecimal getYszSRQTXiangMu() {
		return yszSRQTXiangMu;
	}
	public void setYszSRQTXiangMu(BigDecimal yszSRQTXiangMu) {
		this.yszSRQTXiangMu = yszSRQTXiangMu;
	}
	public BigDecimal getYyzChengBen() {
		return yyzChengBen;
	}
	public void setYyzChengBen(BigDecimal yyzChengBen) {
		this.yyzChengBen = yyzChengBen;
	}
	public BigDecimal getYingYeCheng() {
		return yingYeCheng;
	}
	public void setYingYeCheng(BigDecimal yingYeCheng) {
		this.yingYeCheng = yingYeCheng;
	}
	public BigDecimal getLiXiZhiChu() {
		return liXiZhiChu;
	}
	public void setLiXiZhiChu(BigDecimal liXiZhiChu) {
		this.liXiZhiChu = liXiZhiChu;
	}
	public BigDecimal getSsfJYJZhiChu() {
		return ssfJYJZhiChu;
	}
	public void setSsfJYJZhiChu(BigDecimal ssfJYJZhiChu) {
		this.ssfJYJZhiChu = ssfJYJZhiChu;
	}
	public BigDecimal getYffeiYong() {
		return yffeiYong;
	}
	public void setYffeiYong(BigDecimal yffeiYong) {
		this.yffeiYong = yffeiYong;
	}
	public BigDecimal getTuiBaoJin() {
		return tuiBaoJin;
	}
	public void setTuiBaoJin(BigDecimal tuiBaoJin) {
		this.tuiBaoJin = tuiBaoJin;
	}
	public BigDecimal getPeiFuZhiChuJinE() {
		return peiFuZhiChuJinE;
	}
	public void setPeiFuZhiChuJinE(BigDecimal peiFuZhiChuJinE) {
		this.peiFuZhiChuJinE = peiFuZhiChuJinE;
	}
	public BigDecimal getTqbXHEZBJJinE() {
		return tqbXHEZBJJinE;
	}
	public void setTqbXHEZBJJinE(BigDecimal tqbXHEZBJJinE) {
		this.tqbXHEZBJJinE = tqbXHEZBJJinE;
	}
	public BigDecimal getBdHLZhiChu() {
		return bdHLZhiChu;
	}
	public void setBdHLZhiChu(BigDecimal bdHLZhiChu) {
		this.bdHLZhiChu = bdHLZhiChu;
	}
	public BigDecimal getFbFeiYong() {
		return fbFeiYong;
	}
	public void setFbFeiYong(BigDecimal fbFeiYong) {
		this.fbFeiYong = fbFeiYong;
	}
	public BigDecimal getQtYWChengBen() {
		return qtYWChengBen;
	}
	public void setQtYWChengBen(BigDecimal qtYWChengBen) {
		this.qtYWChengBen = qtYWChengBen;
	}
	public BigDecimal getYySJJFuJia() {
		return yySJJFuJia;
	}
	public void setYySJJFuJia(BigDecimal yySJJFuJia) {
		this.yySJJFuJia = yySJJFuJia;
	}
	public BigDecimal getXiaoShouFeiYong() {
		return xiaoShouFeiYong;
	}
	public void setXiaoShouFeiYong(BigDecimal xiaoShouFeiYong) {
		this.xiaoShouFeiYong = xiaoShouFeiYong;
	}
	public BigDecimal getCaiWuFeiYong() {
		return caiWuFeiYong;
	}
	public void setCaiWuFeiYong(BigDecimal caiWuFeiYong) {
		this.caiWuFeiYong = caiWuFeiYong;
	}
	public BigDecimal getZiChanJianZhiSunShi() {
		return ziChanJianZhiSunShi;
	}
	public void setZiChanJianZhiSunShi(BigDecimal ziChanJianZhiSunShi) {
		this.ziChanJianZhiSunShi = ziChanJianZhiSunShi;
	}
	public BigDecimal getYyZCBQTXiangMu() {
		return yyZCBQTXiangMu;
	}
	public void setYyZCBQTXiangMu(BigDecimal yyZCBQTXiangMu) {
		this.yyZCBQTXiangMu = yyZCBQTXiangMu;
	}
	public BigDecimal getGyJZBDShouYi() {
		return gyJZBDShouYi;
	}
	public void setGyJZBDShouYi(BigDecimal gyJZBDShouYi) {
		this.gyJZBDShouYi = gyJZBDShouYi;
	}
	public BigDecimal getTouZiShouYi() {
		return touZiShouYi;
	}
	public void setTouZiShouYi(BigDecimal touZiShouYi) {
		this.touZiShouYi = touZiShouYi;
	}
	public BigDecimal getDlYQYHYQYDTZShouYi() {
		return dlYQYHYQYDTZShouYi;
	}
	public void setDlYQYHYQYDTZShouYi(BigDecimal dlYQYHYQYDTZShouYi) {
		this.dlYQYHYQYDTZShouYi = dlYQYHYQYDTZShouYi;
	}
	public BigDecimal getHuiZongShouYi() {
		return huiZongShouYi;
	}
	public void setHuiZongShouYi(BigDecimal huiZongShouYi) {
		this.huiZongShouYi = huiZongShouYi;
	}
	public BigDecimal getYyLRQTXiangMu() {
		return yyLRQTXiangMu;
	}
	public void setYyLRQTXiangMu(BigDecimal yyLRQTXiangMu) {
		this.yyLRQTXiangMu = yyLRQTXiangMu;
	}
	public BigDecimal getLlLRPHXiangMu() {
		return llLRPHXiangMu;
	}
	public void setLlLRPHXiangMu(BigDecimal llLRPHXiangMu) {
		this.llLRPHXiangMu = llLRPHXiangMu;
	}
	public BigDecimal getYyLiRun() {
		return yyLiRun;
	}
	public void setYyLiRun(BigDecimal yyLiRun) {
		this.yyLiRun = yyLiRun;
	}
	public BigDecimal getYyWShouRu() {
		return yyWShouRu;
	}
	public void setYyWShouRu(BigDecimal yyWShouRu) {
		this.yyWShouRu = yyWShouRu;
	}
	public BigDecimal getFlDZCCZJinSunShi() {
		return flDZCCZJinSunShi;
	}
	public void setFlDZCCZJinSunShi(BigDecimal flDZCCZJinSunShi) {
		this.flDZCCZJinSunShi = flDZCCZJinSunShi;
	}
	public BigDecimal getYxLRZEDQTXiangMu() {
		return yxLRZEDQTXiangMu;
	}
	public void setYxLRZEDQTXiangMu(BigDecimal yxLRZEDQTXiangMu) {
		this.yxLRZEDQTXiangMu = yxLRZEDQTXiangMu;
	}
	public BigDecimal getLrZongE() {
		return lrZongE;
	}
	public void setLrZongE(BigDecimal lrZongE) {
		this.lrZongE = lrZongE;
	}
	public BigDecimal getSuoDeShui() {
		return suoDeShui;
	}
	public void setSuoDeShui(BigDecimal suoDeShui) {
		this.suoDeShui = suoDeShui;
	}
	public BigDecimal getWqDTZShouShi() {
		return wqDTZShouShi;
	}
	public void setWqDTZShouShi(BigDecimal wqDTZShouShi) {
		this.wqDTZShouShi = wqDTZShouShi;
	}
	public BigDecimal getYxJLRDQTXiangMu() {
		return yxJLRDQTXiangMu;
	}
	public void setYxJLRDQTXiangMu(BigDecimal yxJLRDQTXiangMu) {
		this.yxJLRDQTXiangMu = yxJLRDQTXiangMu;
	}
	public BigDecimal getJingLiRun() {
		return jingLiRun;
	}
	public void setJingLiRun(BigDecimal jingLiRun) {
		this.jingLiRun = jingLiRun;
	}
	public BigDecimal getBhBFZHBQSXLiRun() {
		return bhBFZHBQSXLiRun;
	}
	public void setBhBFZHBQSXLiRun(BigDecimal bhBFZHBQSXLiRun) {
		this.bhBFZHBQSXLiRun = bhBFZHBQSXLiRun;
	}
	public BigDecimal getGsYMGSGDDJinLiRun() {
		return gsYMGSGDDJinLiRun;
	}
	public void setGsYMGSGDDJinLiRun(BigDecimal gsYMGSGDDJinLiRun) {
		this.gsYMGSGDDJinLiRun = gsYMGSGDDJinLiRun;
	}
	public BigDecimal getSsGDSunYi() {
		return ssGDSunYi;
	}
	public void setSsGDSunYi(BigDecimal ssGDSunYi) {
		this.ssGDSunYi = ssGDSunYi;
	}
	public BigDecimal getJlRQTXiangMu() {
		return jlRQTXiangMu;
	}
	public void setJlRQTXiangMu(BigDecimal jlRQTXiangMu) {
		this.jlRQTXiangMu = jlRQTXiangMu;
	}
	public BigDecimal getJlRChaE() {
		return jlRChaE;
	}
	public void setJlRChaE(BigDecimal jlRChaE) {
		this.jlRChaE = jlRChaE;
	}
	public BigDecimal getJbMGShouYi() {
		return jbMGShouYi;
	}
	public void setJbMGShouYi(BigDecimal jbMGShouYi) {
		this.jbMGShouYi = jbMGShouYi;
	}
	public BigDecimal getXsMGShouYi() {
		return xsMGShouYi;
	}
	public void setXsMGShouYi(BigDecimal xsMGShouYi) {
		this.xsMGShouYi = xsMGShouYi;
	}
	public BigDecimal getQtZHShouYi() {
		return qtZHShouYi;
	}
	public void setQtZHShouYi(BigDecimal qtZHShouYi) {
		this.qtZHShouYi = qtZHShouYi;
	}
	public BigDecimal getGsYMGSGDDQTZHShouYi() {
		return gsYMGSGDDQTZHShouYi;
	}
	public void setGsYMGSGDDQTZHShouYi(BigDecimal gsYMGSGDDQTZHShouYi) {
		this.gsYMGSGDDQTZHShouYi = gsYMGSGDDQTZHShouYi;
	}
	public BigDecimal getZhShouYiZongE() {
		return zhShouYiZongE;
	}
	public void setZhShouYiZongE(BigDecimal zhShouYiZongE) {
		this.zhShouYiZongE = zhShouYiZongE;
	}
	public BigDecimal getGsYMGSSYZDZHSYZongE() {
		return gsYMGSSYZDZHSYZongE;
	}
	public void setGsYMGSSYZDZHSYZongE(BigDecimal gsYMGSSYZDZHSYZongE) {
		this.gsYMGSSYZDZHSYZongE = gsYMGSSYZDZHSYZongE;
	}
	public BigDecimal getGsYSSGDDZHSYZongE() {
		return gsYSSGDDZHSYZongE;
	}
	public void setGsYSSGDDZHSYZongE(BigDecimal gsYSSGDDZHSYZongE) {
		this.gsYSSGDDZHSYZongE = gsYSSGDDZHSYZongE;
	}
	public Date getDataCompiledDate() {
		return dataCompiledDate;
	}
	public void setDataCompiledDate(Date dataCompiledDate) {
		this.dataCompiledDate = dataCompiledDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public BigDecimal getGlFeiYong() {
		return glFeiYong;
	}
	public void setGlFeiYong(BigDecimal glFeiYong) {
		this.glFeiYong = glFeiYong;
	}
	
}

