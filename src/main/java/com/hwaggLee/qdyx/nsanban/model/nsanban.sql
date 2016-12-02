/*
Navicat MySQL Data Transfer

Source Server         : 61.152.154.49
Source Server Version : 50173
Source Host           : 61.152.154.49:3306
Source Database       : nsanban

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2016-04-07 16:00:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for additional_plan
-- ----------------------------
DROP TABLE IF EXISTS `additional_plan`;
CREATE TABLE `additional_plan` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `stockName` varchar(256) DEFAULT NULL,
  `newNoticeDate` date DEFAULT NULL,
  `firstNoticeDate` date DEFAULT NULL,
  `projectSchedule` varchar(64) DEFAULT NULL,
  `issueObject` varchar(600) DEFAULT NULL,
  `addIssueNumber` decimal(100,6) DEFAULT NULL,
  `raiseMoney` decimal(100,6) DEFAULT NULL,
  `addIssuePrice` decimal(100,6) DEFAULT NULL,
  `addIssuePeRatio` decimal(100,6) DEFAULT NULL,
  `rateOfFolding` decimal(100,6) DEFAULT NULL,
  `issueType` varchar(128) DEFAULT NULL,
  `pricingPrinciple` varchar(128) DEFAULT NULL,
  `leadUnderwriters` varchar(128) DEFAULT NULL,
  `transferMode` varchar(128) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for additional_recommend
-- ----------------------------
DROP TABLE IF EXISTS `additional_recommend`;
CREATE TABLE `additional_recommend` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `stockCode` char(6) COLLATE utf8_bin DEFAULT NULL,
  `stockName` varchar(256) COLLATE utf8_bin DEFAULT NULL,
  `newNoticeDate` date DEFAULT NULL,
  `firstNoticeDate` date DEFAULT NULL,
  `projectSchedule` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `issueObject` varchar(600) COLLATE utf8_bin DEFAULT NULL,
  `addIssueNumber` decimal(100,6) DEFAULT NULL,
  `raiseMoney` decimal(100,6) DEFAULT NULL,
  `addIssuePrice` decimal(100,6) DEFAULT NULL,
  `addIssuePeRatio` decimal(100,6) DEFAULT NULL,
  `rateOfFolding` decimal(100,6) DEFAULT NULL,
  `issueType` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  `pricingPrinciple` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  `leadUnderwriters` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  `transferMode` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  `min_image` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for advertisement_image
-- ----------------------------
DROP TABLE IF EXISTS `advertisement_image`;
CREATE TABLE `advertisement_image` (
  `idStr` char(32) NOT NULL,
  `image_name` varchar(128) DEFAULT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `userid` char(32) DEFAULT NULL,
  `status` char(1) DEFAULT NULL COMMENT '0:不展示，1：展示',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for avg_investment
-- ----------------------------
DROP TABLE IF EXISTS `avg_investment`;
CREATE TABLE `avg_investment` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) NOT NULL,
  `ylnl_gg` decimal(20,4) DEFAULT NULL,
  `ylnl_hy` decimal(20,4) DEFAULT NULL,
  `yynl_gg` decimal(20,4) DEFAULT NULL,
  `yynl_hy` decimal(20,4) DEFAULT NULL,
  `cznl_gg` decimal(20,4) DEFAULT NULL,
  `cznl_hy` decimal(20,4) DEFAULT NULL,
  `xjnl_gg` decimal(20,4) DEFAULT NULL,
  `xjnl_hy` decimal(20,4) DEFAULT NULL,
  `gzzb_gg` decimal(20,4) DEFAULT NULL,
  `gzzb_hy` decimal(20,4) DEFAULT NULL,
  `cznl_gg2` decimal(20,4) DEFAULT NULL,
  `cznl_hy2` decimal(20,4) DEFAULT NULL,
  `mdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bal_commercial_banks
-- ----------------------------
DROP TABLE IF EXISTS `bal_commercial_banks`;
CREATE TABLE `bal_commercial_banks` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `bal_IDStr` char(32) COLLATE utf8_bin DEFAULT NULL,
  `XJCFZYHKuanXiang` decimal(100,6) DEFAULT NULL,
  `CFTYKuanXiang` decimal(100,6) DEFAULT NULL,
  `GuiJinShu` decimal(100,6) DEFAULT NULL,
  `ChaiChuZiJin` decimal(100,6) DEFAULT NULL,
  `YGYJZJLQBDJRDQSYDJRZiChan` decimal(100,6) DEFAULT NULL,
  `ZDYGYJZJLQBDJRDQSYDJRZiChan` decimal(100,6) DEFAULT NULL,
  `YSJRZiChan` decimal(100,6) DEFAULT NULL,
  `YSKXLTouZi` decimal(100,6) DEFAULT NULL,
  `DZGSDTouZi` decimal(100,6) DEFAULT NULL,
  `DLYHHYQYDTouZi` decimal(100,6) DEFAULT NULL,
  `DCLDZZiChan` decimal(100,6) DEFAULT NULL,
  `JDZZCJZZhunBei` decimal(100,6) DEFAULT NULL,
  `DCLDZZCJingZhi` decimal(100,6) DEFAULT NULL,
  `QiTaZiChan` decimal(100,6) DEFAULT NULL,
  `YGYJZJLQBDJRDQSYDJRFuZhai` decimal(100,6) DEFAULT NULL,
  `ZDYGYJZJLQBDJRDQSYDJRFuZhai` decimal(100,6) DEFAULT NULL,
  `YSJRFuZhai` decimal(100,6) DEFAULT NULL,
  `XiShouCunKuan` decimal(100,6) DEFAULT NULL,
  `HuiChuHuiKuan` decimal(100,6) DEFAULT NULL,
  `CKZJYFPiaoJu` decimal(100,6) DEFAULT NULL,
  `CunKuanZheng` decimal(100,6) DEFAULT NULL,
  `QiTaFuZhai` decimal(100,6) DEFAULT NULL,
  `QZTZCGChuBei` decimal(100,6) DEFAULT NULL,
  `TaoQiChuBei` decimal(100,6) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_18` (`bal_IDStr`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for bal_securities_company
-- ----------------------------
DROP TABLE IF EXISTS `bal_securities_company`;
CREATE TABLE `bal_securities_company` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `bal_IDStr` char(32) COLLATE utf8_bin DEFAULT NULL,
  `KFZJCunKuan` decimal(100,6) DEFAULT NULL,
  `KHXYZJCunKuan` decimal(100,6) DEFAULT NULL,
  `KHBeiFuJin` decimal(100,6) DEFAULT NULL,
  `ChaiChuZiJin` decimal(100,6) DEFAULT NULL,
  `RongChuZiJin` decimal(100,6) DEFAULT NULL,
  `RongChuZhengQuan` decimal(100,6) DEFAULT NULL,
  `JiaoYiXiWeiFei` decimal(100,6) DEFAULT NULL,
  `QiTaZiChan` decimal(100,6) DEFAULT NULL,
  `ZiYaJieKuan` decimal(100,6) DEFAULT NULL,
  `YSJRFuZhai` decimal(100,6) DEFAULT NULL,
  `XYJYDLMMZhengQuanKuan` decimal(100,6) DEFAULT NULL,
  `QiTaFuZhai` decimal(100,6) DEFAULT NULL,
  `JYFXZhunBei` decimal(100,6) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_19` (`bal_IDStr`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for balance_sheet
-- ----------------------------
DROP TABLE IF EXISTS `balance_sheet`;
CREATE TABLE `balance_sheet` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `sec_ID` char(32) COLLATE utf8_bin DEFAULT NULL,
  `stockCode` char(6) COLLATE utf8_bin DEFAULT NULL,
  `stockName` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  `HBZiJin` decimal(100,6) DEFAULT NULL,
  `JSFuBeiJin` decimal(100,6) DEFAULT NULL,
  `CCZiJin` decimal(100,6) DEFAULT NULL,
  `JYXJRZiChan` decimal(100,6) DEFAULT NULL,
  `YSPiaoJu` decimal(100,6) DEFAULT NULL,
  `YSZhangKuan` decimal(100,6) DEFAULT NULL,
  `YFKuangXiang` decimal(100,6) DEFAULT NULL,
  `YSBaoFei` decimal(100,6) DEFAULT NULL,
  `YSFBZhangkuan` decimal(100,6) DEFAULT NULL,
  `YSFBHTZhunBeiJin` decimal(100,6) DEFAULT NULL,
  `YSLiXi` decimal(100,6) DEFAULT NULL,
  `YSGuLi` decimal(100,6) DEFAULT NULL,
  `QTYSKuan` decimal(100,6) DEFAULT NULL,
  `YSCKTuiShui` decimal(100,6) DEFAULT NULL,
  `YSBuTieKuan` decimal(100,6) DEFAULT NULL,
  `NBYSKuan` decimal(100,6) DEFAULT NULL,
  `MRFSJRZiChan` decimal(100,6) DEFAULT NULL,
  `CunHuo` decimal(100,6) DEFAULT NULL,
  `YNNDQFLDZiChan` decimal(100,6) DEFAULT NULL,
  `QTLDZiChan` decimal(100,6) DEFAULT NULL,
  `LDZCQTXiangMu` decimal(100,6) DEFAULT NULL,
  `LDZCPHXiangMu` decimal(100,6) DEFAULT NULL,
  `LDZCHeJi` decimal(100,6) DEFAULT NULL,
  `FFWTDKJDianKuan` decimal(100,6) DEFAULT NULL,
  `KGCSJRZiChan` decimal(100,6) DEFAULT NULL,
  `CYZDQTouZi` decimal(100,6) DEFAULT NULL,
  `CQYShouKuan` decimal(100,6) DEFAULT NULL,
  `CQGQTouZi` decimal(100,6) DEFAULT NULL,
  `TZXFanDiChan` decimal(100,6) DEFAULT NULL,
  `GDZiChan` decimal(100,6) DEFAULT NULL,
  `ZJGongCheng` decimal(100,6) DEFAULT NULL,
  `GCWuZi` decimal(100,6) DEFAULT NULL,
  `GDZCQingLi` decimal(100,6) DEFAULT NULL,
  `SCXSWZiChan` decimal(100,6) DEFAULT NULL,
  `YQZiChan` decimal(100,6) DEFAULT NULL,
  `WXZiChan` decimal(100,6) DEFAULT NULL,
  `ShangYu` decimal(100,6) DEFAULT NULL,
  `CQDTFeiYong` decimal(100,6) DEFAULT NULL,
  `DYSDSZiChan` decimal(100,6) DEFAULT NULL,
  `QTFLDZiChan` decimal(100,6) DEFAULT NULL,
  `FLDZCQTXiangMu` decimal(100,6) DEFAULT NULL,
  `FLDZCPHXiangMu` decimal(100,6) DEFAULT NULL,
  `FLDZCHeJi` decimal(100,6) DEFAULT NULL,
  `ZCQTXiangMu` decimal(100,6) DEFAULT NULL,
  `ZCPHXiangMu` decimal(100,6) DEFAULT NULL,
  `ZCZongJi` decimal(100,6) DEFAULT NULL,
  `DQJieKuan` decimal(100,6) DEFAULT NULL,
  `XZYYHJieKuan` decimal(100,6) DEFAULT NULL,
  `XSCKJTYCunFang` decimal(100,6) DEFAULT NULL,
  `XRZiJin` decimal(100,6) DEFAULT NULL,
  `JYXJRFuZhai` decimal(100,6) DEFAULT NULL,
  `YFPiaoJu` decimal(100,6) DEFAULT NULL,
  `YFZhangKuan` decimal(100,6) DEFAULT NULL,
  `FSKuanXiang` decimal(100,6) DEFAULT NULL,
  `MCHGJRZiChanKuan` decimal(100,6) DEFAULT NULL,
  `YFSXFJRongJin` decimal(100,6) DEFAULT NULL,
  `YFShuiFei` decimal(100,6) DEFAULT NULL,
  `YFLiXi` decimal(100,6) DEFAULT NULL,
  `YFGuLi` decimal(100,6) DEFAULT NULL,
  `YFFBZhangKuan` decimal(100,6) DEFAULT NULL,
  `NBYingFuKuan` decimal(100,6) DEFAULT NULL,
  `QTYingFuKuan` decimal(100,6) DEFAULT NULL,
  `YJLDFuKuan` decimal(100,6) DEFAULT NULL,
  `BXHTZhengQuanKuan` decimal(100,6) DEFAULT NULL,
  `DLMMZhengQuanKuan` decimal(100,6) DEFAULT NULL,
  `DLCXZhengQuanKuan` decimal(100,6) DEFAULT NULL,
  `YNNDDYShouYi` decimal(100,6) DEFAULT NULL,
  `YFDQZhaiQuan` decimal(100,6) DEFAULT NULL,
  `YNNDQDFLDFuZhai` decimal(100,6) DEFAULT NULL,
  `QTLDFuZhai` decimal(100,6) DEFAULT NULL,
  `LDFZQTXiangMu` decimal(100,6) DEFAULT NULL,
  `LDFZPHXiangMu` decimal(100,6) DEFAULT NULL,
  `LDFZHeJi` decimal(100,6) DEFAULT NULL,
  `CQJieKuan` decimal(100,6) DEFAULT NULL,
  `YFZhaiQuan` decimal(100,6) DEFAULT NULL,
  `QZYouXianGu` decimal(100,6) DEFAULT NULL,
  `QZYongXuZhai` decimal(100,6) DEFAULT NULL,
  `CQYingFuKuan` decimal(100,6) DEFAULT NULL,
  `ZXYingFuKuan` decimal(100,6) DEFAULT NULL,
  `YJFuZhai` decimal(100,6) DEFAULT NULL,
  `DYShouYi` decimal(100,6) DEFAULT NULL,
  `DYSDSFuZhai` decimal(100,6) DEFAULT NULL,
  `QTFLDFuZhai` decimal(100,6) DEFAULT NULL,
  `FLDFZQTXiangMu` decimal(100,6) DEFAULT NULL,
  `FLDFZPHXiangMu` decimal(100,6) DEFAULT NULL,
  `FLDFZHeJi` decimal(100,6) DEFAULT NULL,
  `FZQTXiangMu` decimal(100,6) DEFAULT NULL,
  `FZPHXiangMu` decimal(100,6) DEFAULT NULL,
  `FZHeJi` decimal(100,6) DEFAULT NULL,
  `SSZiBen` decimal(100,6) DEFAULT NULL,
  `ZBGongJi` decimal(100,6) DEFAULT NULL,
  `JKCunGu` decimal(100,6) DEFAULT NULL,
  `ZXChuBei` decimal(100,6) DEFAULT NULL,
  `YYGongJi` decimal(100,6) DEFAULT NULL,
  `YBFXZhunBei` decimal(100,6) DEFAULT NULL,
  `WQDDTZSunShi` decimal(100,6) DEFAULT NULL,
  `WFPLiRun` decimal(100,6) DEFAULT NULL,
  `NFPXJGuLi` decimal(100,6) DEFAULT NULL,
  `WBBBZSChaE` decimal(100,6) DEFAULT NULL,
  `GSYMGSGDQYQTXiangMu` decimal(100,6) DEFAULT NULL,
  `GSYMGSGDQYPHXiangMu` decimal(100,6) DEFAULT NULL,
  `GSYMGSGDQYHeJi` decimal(100,6) DEFAULT NULL,
  `SSGDQuanYi` decimal(100,6) DEFAULT NULL,
  `GDQYQTXiangMu` decimal(100,6) DEFAULT NULL,
  `GDQYPHXiangMu` decimal(100,6) DEFAULT NULL,
  `SYZQYHeJi` decimal(100,6) DEFAULT NULL,
  `FZHGDQYQTXiangMu` decimal(100,6) DEFAULT NULL,
  `FZHGDQYPHXiangMu` decimal(100,6) DEFAULT NULL,
  `FZHSYZQYHeJi` decimal(100,6) DEFAULT NULL,
  `QTQYGongJu` decimal(100,6) DEFAULT NULL,
  `QZYongXuGu` decimal(100,6) DEFAULT NULL,
  `QTZHShouYi` decimal(100,6) DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_44` (`sec_ID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for cas_commercial_banks
-- ----------------------------
DROP TABLE IF EXISTS `cas_commercial_banks`;
CREATE TABLE `cas_commercial_banks` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `cas_ID` char(32) COLLATE utf8_bin DEFAULT NULL,
  `KHCKHTYJQTJRJGCFKXJZengJiaE` decimal(100,6) DEFAULT NULL,
  `KHCKJZengJiaE` decimal(100,6) DEFAULT NULL,
  `TYJQTJRJGCFKXJZengJiaE` decimal(100,6) DEFAULT NULL,
  `CFZYYHHTYKXJQTJRJGJJianShaoE` decimal(100,6) DEFAULT NULL,
  `CFZYYHKXJJianShaoE` decimal(100,6) DEFAULT NULL,
  `CFTYJQTJRJGKXJJianShaoE` decimal(100,6) DEFAULT NULL,
  `CRZJJMCHGJRZCKJZengJiaE` decimal(100,6) DEFAULT NULL,
  `MCHGJRZCKJZengJiaE` decimal(100,6) DEFAULT NULL,
  `CCZJJMRFSJRZCJJianShaoE` decimal(100,6) DEFAULT NULL,
  `CCZJJJianShaoE` decimal(100,6) DEFAULT NULL,
  `MRFSJRZCJJianShaoE` decimal(100,6) DEFAULT NULL,
  `CKZJingE` decimal(100,6) DEFAULT NULL,
  `JYXJRFZJZengJiaE` decimal(100,6) DEFAULT NULL,
  `SQDLXSXFJYJDXianJin` decimal(100,6) DEFAULT NULL,
  `SQLXDXianJin` decimal(100,6) DEFAULT NULL,
  `SQSXFJYJDXianJin` decimal(100,6) DEFAULT NULL,
  `CZDZZCSDDXianJin` decimal(100,6) DEFAULT NULL,
  `SHDYYYQNDHXDDaiKuan` decimal(100,6) DEFAULT NULL,
  `SDDQTYJYHDYGDXianJin` decimal(100,6) DEFAULT NULL,
  `CFZYYHHTYJQTJRJGKXJZengJiaE` decimal(100,6) DEFAULT NULL,
  `CFZYYHKXJZengJiaE` decimal(100,6) DEFAULT NULL,
  `CFTYJQTJRJGKXJZengJiaE` decimal(100,6) DEFAULT NULL,
  `TYJQTJRJGCFKJSJingE` decimal(100,6) DEFAULT NULL,
  `YFXCKZJJianShaoE` decimal(100,6) DEFAULT NULL,
  `CCZJJMRFSJRZCJZengJiaE` decimal(100,6) DEFAULT NULL,
  `CCZJJZengJiaE` decimal(100,6) DEFAULT NULL,
  `MRFSJRZCJZengJiaE` decimal(100,6) DEFAULT NULL,
  `CRZJJMCHGJRZCKJJianShaoE` decimal(100,6) DEFAULT NULL,
  `CRZJJJianShaoE` decimal(100,6) DEFAULT NULL,
  `MCHGJRZCJJianShaoE` decimal(100,6) DEFAULT NULL,
  `JYXJRZCJZengJiaE` decimal(100,6) DEFAULT NULL,
  `ZFLXDXianJin` decimal(100,6) DEFAULT NULL,
  `ZFSXFJYJDXianJin` decimal(100,6) DEFAULT NULL,
  `GMRZZPZCZFDXianJin` decimal(100,6) DEFAULT NULL,
  `YSZKJZengJiaE` decimal(100,6) DEFAULT NULL,
  `ZFQTYJYHDYGDXianJin` decimal(100,6) DEFAULT NULL,
  `FDGLHLRSSDDXianJin` decimal(100,6) DEFAULT NULL,
  `TZZFDXianJin` decimal(100,6) DEFAULT NULL,
  `FXCJZSSDDXianJin` decimal(100,6) DEFAULT NULL,
  `FXQTZQSSDDXianJin` decimal(100,6) DEFAULT NULL,
  `FXCunKuanZheng` decimal(100,6) DEFAULT NULL,
  `ZJGBSSDDXianJin` decimal(100,6) DEFAULT NULL,
  `GFFXZFDFeiYong` decimal(100,6) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_48` (`cas_ID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for cas_securities_company
-- ----------------------------
DROP TABLE IF EXISTS `cas_securities_company`;
CREATE TABLE `cas_securities_company` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `cas_ID` char(32) COLLATE utf8_bin DEFAULT NULL,
  `GMCZHFXQTJRGJJZengJiaE` decimal(100,6) DEFAULT NULL,
  `CXZQSDDXJJingE` decimal(100,6) DEFAULT NULL,
  `DLMMZQSDDXJJingE` decimal(100,6) DEFAULT NULL,
  `MRFSJRZCSDDXianJin` decimal(100,6) DEFAULT NULL,
  `DLCXZQSDDXJJingE` decimal(100,6) DEFAULT NULL,
  `KHJYJSZJZengJia` decimal(100,6) DEFAULT NULL,
  `ZJTZJYZCZengJia` decimal(100,6) DEFAULT NULL,
  `MRFSJRZCZFDXJJingE` decimal(100,6) DEFAULT NULL,
  `CZJYXJRZCDJJShaoE` decimal(100,6) DEFAULT NULL,
  `GMCZHFXQTJRGJJianShaoE` decimal(100,6) DEFAULT NULL,
  `CRZJJJianShaoE` decimal(100,6) DEFAULT NULL,
  `KHJYJSZJJianShao` decimal(100,6) DEFAULT NULL,
  `ZJTZJYZJJianShao` decimal(100,6) DEFAULT NULL,
  `CCZJJZengJiaE` decimal(100,6) DEFAULT NULL,
  `HGYWZJZengJiaE` decimal(100,6) DEFAULT NULL,
  `DLMMZQZFDXJJingE` decimal(100,6) DEFAULT NULL,
  `CZKGCSJRZJJZengJiaE` decimal(100,6) DEFAULT NULL,
  `TZZFDXianJin` decimal(100,6) DEFAULT NULL,
  `CZKGCSJRZCJJianShaoE` decimal(100,6) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_49` (`cas_ID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for cash_flow_statement
-- ----------------------------
DROP TABLE IF EXISTS `cash_flow_statement`;
CREATE TABLE `cash_flow_statement` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `sec_ID` char(32) COLLATE utf8_bin DEFAULT NULL,
  `stockCode` char(6) COLLATE utf8_bin DEFAULT NULL,
  `stockName` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  `XSSPTGLWSDDXianJin` decimal(100,6) DEFAULT NULL,
  `KHCKHTYCFKXJZengJiaE` decimal(100,6) DEFAULT NULL,
  `XZYYHYKJZengJiaE` decimal(100,6) DEFAULT NULL,
  `XQTJRJGCRZJJZengJiaE` decimal(100,6) DEFAULT NULL,
  `SDYBXHTBFQDDXianJin` decimal(100,6) DEFAULT NULL,
  `SDZBXYWXJJingE` decimal(100,6) DEFAULT NULL,
  `BHCJJTZKJZengJiaE` decimal(100,6) DEFAULT NULL,
  `CZJYXJRZCJZengJiaE` decimal(100,6) DEFAULT NULL,
  `SQLXSXFJYJDXianJin` decimal(100,6) DEFAULT NULL,
  `CRZJJZengJiaE` decimal(100,6) DEFAULT NULL,
  `HGYWZJJZengJiaE` decimal(100,6) DEFAULT NULL,
  `SDDSFFanHuan` decimal(100,6) DEFAULT NULL,
  `SDDQTYJYHDYGDXianJin` decimal(100,6) DEFAULT NULL,
  `JYHDXJLRQTXiangMu` decimal(100,6) DEFAULT NULL,
  `JYHDXJLRPingHengXiangMu` decimal(100,6) DEFAULT NULL,
  `JYHDXJLRXiaoJi` decimal(100,6) DEFAULT NULL,
  `GMSPJSLWZFDXianJin` decimal(100,6) DEFAULT NULL,
  `KHDKJDKJZengJiaE` decimal(100,6) DEFAULT NULL,
  `CFZYYHHTYKXJZengJiaE` decimal(100,6) DEFAULT NULL,
  `ZFYBXHTPFKXDXianJin` decimal(100,6) DEFAULT NULL,
  `ZFLXSXFJYJDXianJin` decimal(100,6) DEFAULT NULL,
  `ZFBDHLDXianJin` decimal(100,6) DEFAULT NULL,
  `ZFGZGJYWZGZFDXianJin` decimal(100,6) DEFAULT NULL,
  `ZFDGXFeiYong` decimal(100,6) DEFAULT NULL,
  `ZFDQTYJYHDNGYGDXianJin` decimal(100,6) DEFAULT NULL,
  `YYHDXJHCQTXiangMu` decimal(100,6) DEFAULT NULL,
  `JYHDXJLCPingHengXiangMu` decimal(100,6) DEFAULT NULL,
  `JYHDXJLCXiaoJi` decimal(100,6) DEFAULT NULL,
  `JYHDCSDXJLLJEQTXiangMu` decimal(100,6) DEFAULT NULL,
  `JYHDCSDXJLLJEPHXiangMu` decimal(100,6) DEFAULT NULL,
  `JYHDCSDXJLLJingE` decimal(100,6) DEFAULT NULL,
  `SHTZSQDDXianJin` decimal(100,6) DEFAULT NULL,
  `QDTZSYSDDXianJin` decimal(100,6) DEFAULT NULL,
  `CZGDZCWXZCHQTCQZCSHSDXianJin` decimal(100,6) DEFAULT NULL,
  `CZZGSJQTYEDWSDDXJJingE` decimal(100,6) DEFAULT NULL,
  `SDDQTYTZHDYGDXianJin` decimal(100,6) DEFAULT NULL,
  `SSZYHDQCKSSDDXianJin` decimal(100,6) DEFAULT NULL,
  `TZHDXJLRQTXiangMu` decimal(100,6) DEFAULT NULL,
  `TZHDXJLRPHXiangMu` decimal(100,6) DEFAULT NULL,
  `TZHDXJLRXiaoJi` decimal(100,6) DEFAULT NULL,
  `GJGDWXHQTCQZCSZFDXianJin` decimal(100,6) DEFAULT NULL,
  `TZSZFDXianJin` decimal(100,6) DEFAULT NULL,
  `ZYDKJZengJiaE` decimal(100,6) DEFAULT NULL,
  `QDZGSJQTYYDWZFDXJJingE` decimal(100,6) DEFAULT NULL,
  `ZFDQTYTZHDYGDXianJin` decimal(100,6) DEFAULT NULL,
  `ZJZYHDYCKSZFDXianJin` decimal(100,6) DEFAULT NULL,
  `TZHDXJLCQTXiangMu` decimal(100,6) DEFAULT NULL,
  `TZHDXJLCPHXiangMu` decimal(100,6) DEFAULT NULL,
  `TZHDXJLCXiaoJi` decimal(100,6) DEFAULT NULL,
  `TZHDCSDXJLLJEQTXiangMu` decimal(100,6) DEFAULT NULL,
  `TZHDCSDXJLLJEPHXiangMu` decimal(100,6) DEFAULT NULL,
  `TZHDCSDXJLLJingE` decimal(100,6) DEFAULT NULL,
  `XSTZSDDXianJin` decimal(100,6) DEFAULT NULL,
  `ZGSXISSGDTZSDDXianJin` decimal(100,6) DEFAULT NULL,
  `QDJKSDDXianJin` decimal(100,6) DEFAULT NULL,
  `FXZQSDDXianJin` decimal(100,6) DEFAULT NULL,
  `SDQTYCZHDYGDXianJin` decimal(100,6) DEFAULT NULL,
  `CZHDXJLRQTXiangMu` decimal(100,6) DEFAULT NULL,
  `CZHDXJLRPHXiangMu` decimal(100,6) DEFAULT NULL,
  `CZHDXJLRXiaoJi` decimal(100,6) DEFAULT NULL,
  `CHZWZFDXianJin` decimal(100,6) DEFAULT NULL,
  `FPGLLRHCFLXSZFDXianJin` decimal(100,6) DEFAULT NULL,
  `ZGSZFGSSGDDLiRun` decimal(100,6) DEFAULT NULL,
  `ZFQTYCZHDYGDXianJin` decimal(100,6) DEFAULT NULL,
  `CZHDXJLCQTXiangMu` decimal(100,6) DEFAULT NULL,
  `CZHDXJLCPHXiangMu` decimal(100,6) DEFAULT NULL,
  `CZHDXJLCXiaoJi` decimal(100,6) DEFAULT NULL,
  `CZHDCSDXJLLJEQTXiangMu` decimal(100,6) DEFAULT NULL,
  `CZHDCSDXJLLJEPHXiangMu` decimal(100,6) DEFAULT NULL,
  `CZHDCSDXJLLJingE` decimal(100,6) DEFAULT NULL,
  `TSCLBSBPXJJingE` decimal(100,6) DEFAULT NULL,
  `TSCLGSBTXJJingE` decimal(100,6) DEFAULT NULL,
  `HLBDDXJJXJDJWDYingXiang` decimal(100,6) DEFAULT NULL,
  `XJJXJDJWZJEQTXiangMu` decimal(100,6) DEFAULT NULL,
  `XJJXJDJWJZJEPHXiangMu` decimal(100,6) DEFAULT NULL,
  `XJJXJDJWJZengJiaE` decimal(100,6) DEFAULT NULL,
  `QCXJJXJDJWYuE` decimal(100,6) DEFAULT NULL,
  `QMXJJXJDJWYEQTXiangMu` decimal(100,6) DEFAULT NULL,
  `QMXJJXJDJWYEPHXiangMu` decimal(100,6) DEFAULT NULL,
  `QMXJJXJDJWYuE` decimal(100,6) DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_4` (`sec_ID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for chuangke
-- ----------------------------
DROP TABLE IF EXISTS `chuangke`;
CREATE TABLE `chuangke` (
  `idstr` varchar(32) COLLATE utf8_bin NOT NULL,
  `ck_title` varchar(100) COLLATE utf8_bin NOT NULL,
  `ck_brief` varchar(4000) COLLATE utf8_bin NOT NULL,
  `ck_current_stage` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ck_show_type` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ck_ppt_size` int(11) DEFAULT '0',
  `ck_video` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ck_image` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ck_stock_code` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `ck_stock_name` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `ck_liangdian` varchar(4000) COLLATE utf8_bin DEFAULT NULL,
  `rzje` decimal(100,6) DEFAULT NULL,
  `dqj` decimal(100,6) DEFAULT NULL,
  `gfs` int(11) DEFAULT NULL,
  PRIMARY KEY (`idstr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for chuangke_AT
-- ----------------------------
DROP TABLE IF EXISTS `chuangke_AT`;
CREATE TABLE `chuangke_AT` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `formUserID` char(32) COLLATE utf8_bin DEFAULT NULL,
  `toATUserID` char(32) COLLATE utf8_bin DEFAULT NULL,
  `chuangkeCommentID` char(32) COLLATE utf8_bin DEFAULT NULL,
  `createTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for chuangke_biaoji
-- ----------------------------
DROP TABLE IF EXISTS `chuangke_biaoji`;
CREATE TABLE `chuangke_biaoji` (
  `idstr` varchar(32) NOT NULL,
  `user_id` varchar(32) DEFAULT NULL,
  `chuangke_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`idstr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for chuangke_comment
-- ----------------------------
DROP TABLE IF EXISTS `chuangke_comment`;
CREATE TABLE `chuangke_comment` (
  `idStr` char(32) CHARACTER SET utf8 NOT NULL,
  `parentID` char(32) CHARACTER SET utf8 DEFAULT NULL,
  `ckID` char(32) CHARACTER SET utf8 DEFAULT NULL,
  `userID` char(32) CHARACTER SET utf8 DEFAULT NULL,
  `content` varchar(2048) CHARACTER SET utf8 DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `title` varchar(256) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for chuangke_comment_action
-- ----------------------------
DROP TABLE IF EXISTS `chuangke_comment_action`;
CREATE TABLE `chuangke_comment_action` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `commentID` char(32) COLLATE utf8_bin DEFAULT NULL,
  `userID` char(32) COLLATE utf8_bin DEFAULT NULL,
  `actionType` char(9) COLLATE utf8_bin DEFAULT NULL,
  `createTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for cmndd_dict
-- ----------------------------
DROP TABLE IF EXISTS `cmndd_dict`;
CREATE TABLE `cmndd_dict` (
  `dict_code` varchar(4) NOT NULL,
  `dict_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`dict_code`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cmndd_enum
-- ----------------------------
DROP TABLE IF EXISTS `cmndd_enum`;
CREATE TABLE `cmndd_enum` (
  `enum_code` varchar(9) NOT NULL,
  `dict_code` varchar(4) DEFAULT NULL,
  `enum_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`enum_code`),
  KEY `dict_code` (`dict_code`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cmndd_join_role_privilege
-- ----------------------------
DROP TABLE IF EXISTS `cmndd_join_role_privilege`;
CREATE TABLE `cmndd_join_role_privilege` (
  `fk_privil_id` varchar(32) NOT NULL,
  `fk_role_id` varchar(32) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cmndd_join_user_role
-- ----------------------------
DROP TABLE IF EXISTS `cmndd_join_user_role`;
CREATE TABLE `cmndd_join_user_role` (
  `fk_role_id` varchar(32) NOT NULL,
  `fk_user_id` varchar(32) NOT NULL,
  `begin_date` varchar(10) DEFAULT NULL,
  `end_date` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cmndd_privilege
-- ----------------------------
DROP TABLE IF EXISTS `cmndd_privilege`;
CREATE TABLE `cmndd_privilege` (
  `privil_id` varchar(32) NOT NULL,
  `privil_name` varchar(50) NOT NULL,
  `category` varchar(50) NOT NULL,
  `pattern` varchar(255) NOT NULL,
  `type` varchar(50) NOT NULL,
  `dynamic_rule` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`privil_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cmndd_roles
-- ----------------------------
DROP TABLE IF EXISTS `cmndd_roles`;
CREATE TABLE `cmndd_roles` (
  `role_id` varchar(32) NOT NULL,
  `role_name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `node_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cmndd_user
-- ----------------------------
DROP TABLE IF EXISTS `cmndd_user`;
CREATE TABLE `cmndd_user` (
  `pk_id` varchar(32) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `pwd` varchar(255) NOT NULL,
  `real_name` varchar(50) DEFAULT NULL,
  `login_type` varchar(255) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `last_login_ip` varchar(50) DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `current_login_ip` varchar(50) DEFAULT NULL,
  `current_login_time` datetime DEFAULT NULL,
  `user_status` varchar(1) NOT NULL,
  PRIMARY KEY (`pk_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cmndd_user_enterprise
-- ----------------------------
DROP TABLE IF EXISTS `cmndd_user_enterprise`;
CREATE TABLE `cmndd_user_enterprise` (
  `idStr` char(32) NOT NULL,
  `user_id` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  PRIMARY KEY (`idStr`,`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for db_users
-- ----------------------------
DROP TABLE IF EXISTS `db_users`;
CREATE TABLE `db_users` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` tinyint(1) unsigned NOT NULL,
  `username` varchar(45) NOT NULL DEFAULT '',
  `userpass` varchar(45) NOT NULL DEFAULT '',
  `groupid` int(10) unsigned NOT NULL DEFAULT '1',
  `email` varchar(80) NOT NULL DEFAULT '',
  `signuptime` int(10) unsigned NOT NULL DEFAULT '0',
  `signupip` varchar(45) NOT NULL DEFAULT '',
  `signupreason` varchar(100) NOT NULL DEFAULT '',
  `verifydesc` varchar(100) NOT NULL DEFAULT '',
  `logintime` int(10) unsigned NOT NULL DEFAULT '0',
  `lastlogintime` int(10) unsigned NOT NULL DEFAULT '0',
  `realname` varchar(20) NOT NULL DEFAULT '',
  `sex` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `birthday` date NOT NULL DEFAULT '0000-00-00',
  `qq` varchar(45) NOT NULL DEFAULT '',
  `msn` varchar(45) NOT NULL DEFAULT '',
  `phone` varchar(45) NOT NULL DEFAULT '',
  `gdphone` varchar(45) NOT NULL,
  `signature` varchar(255) NOT NULL DEFAULT '',
  `usertitle` varchar(45) NOT NULL DEFAULT '',
  `todayuploaded` int(10) unsigned NOT NULL DEFAULT '0',
  `lastposttime` int(10) unsigned NOT NULL DEFAULT '0',
  `postsnum` int(10) unsigned NOT NULL DEFAULT '0',
  `address` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `code` int(10) unsigned NOT NULL,
  `credential` varchar(45) NOT NULL,
  `credentialnum` varchar(45) NOT NULL,
  `jgname` varchar(45) NOT NULL,
  `firname` varchar(45) NOT NULL,
  `firsex` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `firphone` varchar(45) NOT NULL,
  `firgdphone` varchar(45) NOT NULL,
  `secname` varchar(45) NOT NULL,
  `secsex` tinyint(1) unsigned NOT NULL DEFAULT '0',
  `secphone` varchar(45) NOT NULL,
  `secgdphone` varchar(45) NOT NULL,
  `credits1` int(10) unsigned NOT NULL DEFAULT '0',
  `credits2` int(10) unsigned NOT NULL DEFAULT '0',
  `credits3` int(10) unsigned NOT NULL DEFAULT '0',
  `credits4` int(10) unsigned NOT NULL DEFAULT '0',
  `credits5` int(10) unsigned NOT NULL DEFAULT '0',
  `credits6` int(10) unsigned NOT NULL DEFAULT '0',
  `credits7` int(10) unsigned NOT NULL DEFAULT '0',
  `credits8` int(10) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`) USING BTREE,
  KEY `email` (`email`) USING BTREE,
  KEY `signupip` (`signupip`,`signuptime`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ent_capital_stock
-- ----------------------------
DROP TABLE IF EXISTS `ent_capital_stock`;
CREATE TABLE `ent_capital_stock` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `qc_wxstjgfkggdsjkzrsl` int(11) DEFAULT NULL,
  `qc_wxstjgfdsjsjgjglrysl` int(11) DEFAULT NULL,
  `qc_wxstjgfkxygsl` int(11) DEFAULT NULL,
  `qc_wxstjgfkggdsjkzrbl` int(11) DEFAULT NULL,
  `qc_wxstjgfdsjsjgjglryslbl` decimal(100,6) DEFAULT NULL,
  `qc_wxstjgfkxygslbl` decimal(100,6) DEFAULT NULL,
  `qc_wxstjgfhxygslbl` decimal(100,6) DEFAULT NULL,
  `qc_wxsgfslbl` decimal(100,6) DEFAULT NULL,
  `wxstjgfkggdsjkzrbqbd` int(11) DEFAULT NULL,
  `wxstjgfdsjsjgjglrybqbd` int(11) DEFAULT NULL,
  `wxstjgfhxygbqbd` int(11) DEFAULT NULL,
  `wxstjgfslbqbd` int(11) DEFAULT NULL,
  `qc_yxstjgfkggdsjkzrsl` int(11) DEFAULT NULL,
  `qc_yxstjgfdsjsjgjglrysl` int(11) DEFAULT NULL,
  `qc_yxstjgfhxygsl` int(11) DEFAULT NULL,
  `qc_yxsgfsl` int(11) DEFAULT NULL,
  `qc_yxstjgfkggdsjkzrslbl` decimal(100,6) DEFAULT NULL,
  `yxstjgfdszsjgjglryslbl` decimal(100,6) DEFAULT NULL,
  `yxstjgfhxygslbl` decimal(100,6) DEFAULT NULL,
  `yxsgfslbl` decimal(100,6) DEFAULT NULL,
  `yxstjgfkggdsjkzrbqbd` int(11) DEFAULT NULL,
  `yxstjgfdsjsjgjglrybqbd` int(11) DEFAULT NULL,
  `yxstjgfhxygbqbd` int(11) DEFAULT NULL,
  `yxstjgfzsbqbd` int(11) DEFAULT NULL,
  `qm_wxstjgfkggdsjkzrsl` int(11) DEFAULT NULL,
  `qm_wxstjgfdsjsjgjglrysl` int(11) DEFAULT NULL,
  `qm_wxstjgfhxygsl` int(11) DEFAULT NULL,
  `qm_wxsgfsl` int(11) DEFAULT NULL,
  `qm_wxstjgfkggdsjkzrbl` decimal(100,6) DEFAULT NULL,
  `qm_wxstjgfdsjsgjglryslbl` decimal(100,6) DEFAULT NULL,
  `qm_wxstjgfhxygslbl` decimal(100,6) DEFAULT NULL,
  `qm_wxsgfslbl` decimal(100,6) DEFAULT NULL,
  `qm_yxstjgfkggdsjkzrls` int(11) DEFAULT NULL,
  `qm_yxstjgfdsjsjgjglrysl` int(11) DEFAULT NULL,
  `qm_yxstjgfhxygsl` int(11) DEFAULT NULL,
  `qm_yxsgfsl` int(11) DEFAULT NULL,
  `qm_yxstjgfkggdsjkzrslbl` decimal(100,6) DEFAULT NULL,
  `qm_yxstjgfdsjsjgjglryslbl` decimal(100,6) DEFAULT NULL,
  `qm_yxstjgfhxygslbl` decimal(100,6) DEFAULT NULL,
  `qm_yxsgfslbl` decimal(100,6) DEFAULT NULL,
  `qc_zgbsl` int(11) DEFAULT NULL,
  `qc_zbbbl` decimal(100,6) DEFAULT NULL,
  `qm_zgbbl` decimal(100,6) DEFAULT NULL,
  `qm_zgbsl` int(11) DEFAULT NULL,
  `zgbbqbd` int(11) DEFAULT NULL,
  `gdzs` int(11) DEFAULT NULL,
  `sfyx` char(2) DEFAULT NULL COMMENT '-1:表示无效，0表示有效',
  `endDate` date DEFAULT NULL COMMENT '近3期报告截至日期',
  `qc_wxstjgfqtsl` int(11) DEFAULT NULL,
  `qc_wxstjgfqtb` decimal(100,6) DEFAULT NULL,
  `qm_wxstjgfqtsl` int(11) DEFAULT NULL,
  `qm_wxstjgfqtbl` decimal(100,6) DEFAULT NULL,
  `qc_yxstjgfqtsl` int(11) DEFAULT NULL,
  `qc_yxstjgfqtbl` decimal(100,6) DEFAULT NULL,
  `qm_yxstjgfqtsl` int(11) DEFAULT NULL,
  `qm_yxstjgfqtbl` decimal(100,6) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ent_djgb
-- ----------------------------
DROP TABLE IF EXISTS `ent_djgb`;
CREATE TABLE `ent_djgb` (
  `idStr` char(32) NOT NULL,
  `name` varchar(64) DEFAULT NULL,
  `position_id` char(32) DEFAULT NULL,
  `user_id` char(32) DEFAULT NULL,
  `profilt` varchar(1024) DEFAULT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ent_lable
-- ----------------------------
DROP TABLE IF EXISTS `ent_lable`;
CREATE TABLE `ent_lable` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) NOT NULL,
  `lable_code` char(32) NOT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ent_market_avgcje_statistics
-- ----------------------------
DROP TABLE IF EXISTS `ent_market_avgcje_statistics`;
CREATE TABLE `ent_market_avgcje_statistics` (
  `idStr` char(32) DEFAULT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `stockName` varchar(64) DEFAULT NULL,
  `cje` decimal(1100,6) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ent_market_avgcjesec_statistcs
-- ----------------------------
DROP TABLE IF EXISTS `ent_market_avgcjesec_statistcs`;
CREATE TABLE `ent_market_avgcjesec_statistcs` (
  `idStr` char(32) NOT NULL,
  `institutionCode` char(8) DEFAULT NULL,
  `institutionName` varchar(128) DEFAULT NULL,
  `cje` decimal(1100,6) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ent_position
-- ----------------------------
DROP TABLE IF EXISTS `ent_position`;
CREATE TABLE `ent_position` (
  `idStr` char(32) NOT NULL,
  `position_name` varchar(128) DEFAULT NULL,
  `position_ranking` char(2) DEFAULT NULL,
  `position_content` varchar(2048) DEFAULT NULL,
  `company` varchar(128) DEFAULT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ent_stakeholder_heji
-- ----------------------------
DROP TABLE IF EXISTS `ent_stakeholder_heji`;
CREATE TABLE `ent_stakeholder_heji` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `qccgs` int(11) DEFAULT NULL,
  `cgbd` int(11) DEFAULT NULL,
  `qmcgs` int(11) DEFAULT NULL,
  `qmcgbl` decimal(100,6) DEFAULT NULL,
  `qmcyxsgfsl` int(11) DEFAULT NULL,
  `qmcywxsgfsl` int(11) DEFAULT NULL,
  `sfyx` char(2) DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ent_stakeholder_info
-- ----------------------------
DROP TABLE IF EXISTS `ent_stakeholder_info`;
CREATE TABLE `ent_stakeholder_info` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `xh` int(4) DEFAULT NULL,
  `gdmc` varchar(64) DEFAULT NULL,
  `qccgs` int(11) DEFAULT NULL,
  `cgbd` int(11) DEFAULT NULL,
  `qmcgs` int(11) DEFAULT NULL,
  `qmcgbl` decimal(100,6) DEFAULT NULL,
  `qmcyxsgfs` int(11) DEFAULT NULL,
  `qmcywxsgfs` int(11) DEFAULT NULL,
  `sfyx` char(2) DEFAULT NULL COMMENT '-1:无效，0有效',
  `endDate` date DEFAULT NULL COMMENT '最近3期报告截至日期',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for ent_text_info
-- ----------------------------
DROP TABLE IF EXISTS `ent_text_info`;
CREATE TABLE `ent_text_info` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `qsmgdjxfgxsm` text,
  `kggdqk` text,
  `sjkzrqk` text,
  `endDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for enterpries_lxxx
-- ----------------------------
DROP TABLE IF EXISTS `enterpries_lxxx`;
CREATE TABLE `enterpries_lxxx` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `stockName` varchar(64) DEFAULT NULL,
  `sssrq` date DEFAULT NULL,
  `zrfs` varchar(64) DEFAULT NULL,
  `zbqs` varchar(64) DEFAULT NULL,
  `xxplr` varchar(64) DEFAULT NULL,
  `gsdh` varchar(64) DEFAULT NULL,
  `gsdzyjdz` varchar(64) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for enterprise_info
-- ----------------------------
DROP TABLE IF EXISTS `enterprise_info`;
CREATE TABLE `enterprise_info` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `stockShortName` varchar(64) DEFAULT NULL,
  `zhName` varchar(256) DEFAULT NULL,
  `enName` varchar(256) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `BusRegCode` char(20) DEFAULT NULL,
  `registerCapital` decimal(100,6) DEFAULT NULL,
  `businessAgentName` varchar(64) DEFAULT NULL,
  `groupType` varchar(256) DEFAULT NULL,
  `companyBrief` text,
  `businessScope` varchar(2048) DEFAULT NULL,
  `businessMain` varchar(2048) DEFAULT NULL,
  `CSRCName` varchar(256) DEFAULT NULL,
  `CSRCDaiMa` char(8) DEFAULT NULL,
  `Province` varchar(64) DEFAULT NULL,
  `City` varchar(64) DEFAULT NULL,
  `EmployeeNumber` int(11) DEFAULT NULL,
  `registerAddress` varchar(256) DEFAULT NULL,
  `officeAddress` varchar(256) DEFAULT NULL,
  `PostalCode` char(6) DEFAULT NULL,
  `phone` varchar(64) DEFAULT NULL,
  `fax` varchar(64) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `networkAddress` varchar(128) DEFAULT NULL,
  `infoDisclosure` varchar(64) DEFAULT NULL,
  `institutionID` varchar(128) DEFAULT NULL COMMENT '机构基本信息表id',
  `lawOffice` varchar(128) DEFAULT NULL,
  `zbqs_name` varchar(64) DEFAULT NULL,
  `kjssws_name` varchar(64) DEFAULT NULL,
  `qzkjssws_name` varchar(128) DEFAULT NULL,
  `kjssws_adress` varchar(128) DEFAULT NULL,
  `gszdxxplpt_net` varchar(128) DEFAULT NULL,
  `gsndbgbzd` varchar(128) DEFAULT NULL,
  `kggd` varchar(64) DEFAULT NULL,
  `sjkzr` varchar(64) DEFAULT NULL,
  `zbqs_officeAddress` varchar(128) DEFAULT NULL,
  `linkAddress` varchar(128) DEFAULT NULL,
  `isshow` char(1) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='数据浏览';

-- ----------------------------
-- Table structure for enterprise_main_income
-- ----------------------------
DROP TABLE IF EXISTS `enterprise_main_income`;
CREATE TABLE `enterprise_main_income` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `projectName` varchar(64) DEFAULT NULL,
  `value` decimal(6,4) DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for enterprise_second_info
-- ----------------------------
DROP TABLE IF EXISTS `enterprise_second_info`;
CREATE TABLE `enterprise_second_info` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `briefComments` varchar(512) DEFAULT NULL,
  `businessMain` varchar(512) DEFAULT NULL,
  `productName` varchar(512) DEFAULT NULL,
  `businessModel` varchar(512) DEFAULT NULL,
  `marketProspects` varchar(512) DEFAULT NULL,
  `coreCompetence` varchar(2048) DEFAULT NULL,
  `cooperativePartner` varchar(512) DEFAULT NULL,
  `strategyPlan` varchar(512) DEFAULT NULL,
  `investor` varchar(512) DEFAULT NULL,
  `founderName` varchar(64) DEFAULT NULL,
  `founderAge` char(3) DEFAULT NULL,
  `founderPioneeringHistory` varchar(512) DEFAULT NULL,
  `dataInterpretation` varchar(512) DEFAULT NULL,
  `dataCompiledDate` datetime DEFAULT NULL,
  `founderImage` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='企业秒懂信息';

-- ----------------------------
-- Table structure for feedback_opinion
-- ----------------------------
DROP TABLE IF EXISTS `feedback_opinion`;
CREATE TABLE `feedback_opinion` (
  `idStr` char(32) NOT NULL,
  `title` varchar(128) DEFAULT NULL,
  `content` varchar(512) DEFAULT NULL,
  `contact_info` varchar(128) DEFAULT NULL,
  `feedback_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for financial_index
-- ----------------------------
DROP TABLE IF EXISTS `financial_index`;
CREATE TABLE `financial_index` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `sec_ID` char(32) COLLATE utf8_bin DEFAULT NULL,
  `stockCode` char(6) COLLATE utf8_bin DEFAULT NULL,
  `stockName` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  `YLNLMGJBSY` decimal(100,6) DEFAULT NULL,
  `YLNLMGXSSY` decimal(100,6) DEFAULT NULL,
  `YLNLMGJZC` decimal(100,6) DEFAULT NULL,
  `YLNLJZCSYLROE` decimal(100,6) DEFAULT NULL,
  `YLNLXSJLL` decimal(100,6) DEFAULT NULL,
  `YLNLXSMLL` decimal(100,6) DEFAULT NULL,
  `YLNLKCFJCXSYDJLRCJLR` decimal(100,6) DEFAULT NULL,
  `XSBXBL` decimal(100,6) DEFAULT NULL,
  `YYNLCHZZTS` decimal(100,6) DEFAULT NULL,
  `YYNLYSZKZZTS` decimal(100,6) DEFAULT NULL,
  `YYNLCHZZL` decimal(100,6) DEFAULT NULL,
  `YYNLYSZKZZL` decimal(100,6) DEFAULT NULL,
  `CZNLZCFZL` decimal(100,6) DEFAULT NULL,
  `CZNLQYCS` decimal(100,6) DEFAULT NULL,
  `CZNLLDBL` decimal(100,6) DEFAULT NULL,
  `CZNLSDBL` decimal(100,6) DEFAULT NULL,
  `CZNLXSZJTXQLRCZFZ` decimal(100,6) DEFAULT NULL,
  `CZNLJYHDCSDXJJLLCLDFZ` decimal(100,6) DEFAULT NULL,
  `CZNLLXBZBS` decimal(100,6) DEFAULT NULL,
  `CZNLJBMGSYTBZZL` decimal(100,6) DEFAULT NULL,
  `CZNLXSMGSSTBZZL` decimal(100,6) DEFAULT NULL,
  `CZNLYYZSRTBZZL` decimal(100,6) DEFAULT NULL,
  `CZNLYYLRTBZZL` decimal(100,6) DEFAULT NULL,
  `CZNLJLRTBZZL` decimal(100,6) DEFAULT NULL,
  `CZNLGSYGPGSGDDJLRTBZZL` decimal(100,6) DEFAULT NULL,
  `CZNLJYHDCSDXJLLTBZZL` decimal(100,6) DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `dataCompiledDate` date NOT NULL,
  `YLNLJZCSLYROWKCJQ` decimal(100,6) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_20` (`sec_ID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for financial_index_abstract
-- ----------------------------
DROP TABLE IF EXISTS `financial_index_abstract`;
CREATE TABLE `financial_index_abstract` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `stockCode` char(6) COLLATE utf8_bin DEFAULT NULL,
  `stockName` varchar(256) COLLATE utf8_bin DEFAULT NULL,
  `grossMargin` decimal(100,6) DEFAULT NULL,
  `netWorth` decimal(100,6) DEFAULT NULL,
  `netWorthYields` decimal(100,6) DEFAULT NULL,
  `jbmgsy` decimal(100,6) DEFAULT NULL,
  `businessIncomeGrowthRate` decimal(100,6) DEFAULT NULL,
  `netProfitGrowthRate` decimal(100,6) DEFAULT NULL,
  `shareholdersNetProfit` decimal(100,6) DEFAULT NULL,
  `worthDebtRatio` decimal(100,6) DEFAULT NULL,
  `currentRatio` decimal(100,6) DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for first_disclose
-- ----------------------------
DROP TABLE IF EXISTS `first_disclose`;
CREATE TABLE `first_disclose` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `title` varchar(256) DEFAULT NULL,
  `URL` varchar(256) DEFAULT NULL,
  `noticeTime` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for first_disclose_AT
-- ----------------------------
DROP TABLE IF EXISTS `first_disclose_AT`;
CREATE TABLE `first_disclose_AT` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `formATUserID` char(32) DEFAULT NULL,
  `toATUserID` char(32) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_32` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for first_disclose_AT_Notice
-- ----------------------------
DROP TABLE IF EXISTS `first_disclose_AT_Notice`;
CREATE TABLE `first_disclose_AT_Notice` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `toATUserID` char(32) DEFAULT NULL,
  `toATTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `readStatus` char(1) DEFAULT '0' COMMENT '1:已读\r\n            0:未读',
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_33` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for first_disclose_comment
-- ----------------------------
DROP TABLE IF EXISTS `first_disclose_comment`;
CREATE TABLE `first_disclose_comment` (
  `idStr` char(32) NOT NULL,
  `parentID` char(32) DEFAULT NULL,
  `firstDiscloseID` char(32) DEFAULT NULL,
  `usrID` char(32) DEFAULT NULL,
  `content` varchar(2048) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `title` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_26` (`firstDiscloseID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for first_disclose_comment_action
-- ----------------------------
DROP TABLE IF EXISTS `first_disclose_comment_action`;
CREATE TABLE `first_disclose_comment_action` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `userID` char(32) DEFAULT NULL,
  `actionType` char(9) DEFAULT NULL COMMENT '踩，赞，分享',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_23` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for first_disclose_copy
-- ----------------------------
DROP TABLE IF EXISTS `first_disclose_copy`;
CREATE TABLE `first_disclose_copy` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `title` varchar(256) DEFAULT NULL,
  `URL` varchar(256) DEFAULT NULL,
  `noticeTime` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for guided_page_images
-- ----------------------------
DROP TABLE IF EXISTS `guided_page_images`;
CREATE TABLE `guided_page_images` (
  `idStr` char(32) NOT NULL,
  `imagename` varchar(64) DEFAULT NULL,
  `status` char(1) DEFAULT NULL COMMENT '0:未审核\r\n            1:审核通过\r\n            2:下架',
  `resolution` varchar(32) DEFAULT NULL,
  `sequential` int(11) DEFAULT NULL COMMENT '按顺序展示',
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for hqxg
-- ----------------------------
DROP TABLE IF EXISTS `hqxg`;
CREATE TABLE `hqxg` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `stockName` varchar(64) DEFAULT NULL,
  `zrspj` decimal(100,6) DEFAULT NULL,
  `cjbs` decimal(100,6) DEFAULT NULL,
  `sshy` char(12) DEFAULT NULL,
  `sshymc` varchar(128) DEFAULT NULL,
  `ssqy` varchar(128) DEFAULT NULL,
  `jyfs` char(2) DEFAULT NULL,
  `yysr` decimal(100,6) DEFAULT NULL,
  `jlr` decimal(100,6) DEFAULT NULL,
  `mll` decimal(100,6) DEFAULT NULL,
  `srjll` decimal(100,6) DEFAULT NULL,
  `jzc` decimal(100,6) DEFAULT NULL,
  `mgsy` decimal(100,6) DEFAULT NULL,
  `gsygpgsgdjlr` decimal(100,6) DEFAULT NULL,
  `zgb` decimal(100,6) DEFAULT NULL,
  `zzc` decimal(100,6) DEFAULT NULL,
  `zfz` decimal(100,6) DEFAULT NULL,
  `zsz` decimal(100,6) DEFAULT NULL,
  `mgjzc` decimal(100,6) DEFAULT NULL,
  `syl` decimal(100,6) DEFAULT NULL,
  `zxj` decimal(100,6) DEFAULT NULL,
  `zdf` decimal(100,6) DEFAULT NULL,
  `zde` decimal(100,6) DEFAULT NULL,
  `cje` decimal(100,6) DEFAULT NULL,
  `cjl` decimal(100,6) DEFAULT NULL,
  `hsl` decimal(100,6) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  `yyzsrtbzzl` decimal(100,6) DEFAULT NULL,
  `yylrtbzzl` decimal(100,6) DEFAULT NULL,
  `jlrtbzzl` decimal(100,6) DEFAULT NULL,
  `gsygpgsgddjlrtbzzl` decimal(100,6) DEFAULT NULL,
  `jyhdcsdxjlltbzzl` decimal(100,6) DEFAULT NULL,
  `jrkp` decimal(100,6) DEFAULT NULL,
  `yszkzzts` decimal(100,6) DEFAULT NULL,
  `chzzts` decimal(100,6) DEFAULT NULL,
  `ldbl` decimal(100,6) DEFAULT NULL,
  `sdbl` decimal(100,6) DEFAULT NULL,
  `zcfzl` decimal(100,6) DEFAULT NULL,
  `jyhdcsdxjjlr` decimal(100,6) DEFAULT NULL,
  `ssbxl` decimal(100,6) DEFAULT NULL,
  `mgxjllje` decimal(100,6) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for hqxg_copy
-- ----------------------------
DROP TABLE IF EXISTS `hqxg_copy`;
CREATE TABLE `hqxg_copy` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `stockName` varchar(64) DEFAULT NULL,
  `zrspj` decimal(100,6) DEFAULT NULL,
  `cjbs` decimal(100,6) DEFAULT NULL,
  `sshy` char(12) DEFAULT NULL,
  `sshymc` varchar(128) DEFAULT NULL,
  `ssqy` varchar(128) DEFAULT NULL,
  `jyfs` char(2) DEFAULT NULL,
  `yysr` decimal(100,6) DEFAULT NULL,
  `jlr` decimal(100,6) DEFAULT NULL,
  `mll` decimal(100,6) DEFAULT NULL,
  `srjll` decimal(100,6) DEFAULT NULL,
  `jzc` decimal(100,6) DEFAULT NULL,
  `mgsy` decimal(100,6) DEFAULT NULL,
  `gsygpgsgdjlr` decimal(100,6) DEFAULT NULL,
  `zgb` decimal(100,6) DEFAULT NULL,
  `zzc` decimal(100,6) DEFAULT NULL,
  `zfz` decimal(100,6) DEFAULT NULL,
  `zsz` decimal(100,6) DEFAULT NULL,
  `mgjzc` decimal(100,6) DEFAULT NULL,
  `syl` decimal(100,6) DEFAULT NULL,
  `zxj` decimal(100,6) DEFAULT NULL,
  `zdf` decimal(100,6) DEFAULT NULL,
  `zde` decimal(100,6) DEFAULT NULL,
  `cje` decimal(100,6) DEFAULT NULL,
  `cjl` decimal(100,6) DEFAULT NULL,
  `hsl` decimal(100,6) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  `yyzsrtbzzl` decimal(100,6) DEFAULT NULL,
  `yylrtbzzl` decimal(100,6) DEFAULT NULL,
  `jlrtbzzl` decimal(100,6) DEFAULT NULL,
  `gsygpgsgddjlrtbzzl` decimal(100,6) DEFAULT NULL,
  `jyhdcsdxjlltbzzl` decimal(100,6) DEFAULT NULL,
  `jrkp` decimal(100,6) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for hqxgscj
-- ----------------------------
DROP TABLE IF EXISTS `hqxgscj`;
CREATE TABLE `hqxgscj` (
  `idStr` char(32) NOT NULL,
  `userid` char(32) DEFAULT NULL,
  `hqxgTitle` varchar(128) DEFAULT NULL,
  `date` char(4) DEFAULT NULL,
  `province` char(32) DEFAULT NULL,
  `industryCode` char(8) DEFAULT NULL,
  `xxzrlxM` char(2) DEFAULT NULL,
  `xxzrlxT` char(2) DEFAULT NULL,
  `yingYeShouRuStart` decimal(1100,6) DEFAULT NULL,
  `yingYeShouRuEnd` decimal(1100,6) DEFAULT NULL,
  `jingLiRunStart` decimal(1100,6) DEFAULT NULL,
  `jingLiRunEnd` decimal(1100,6) DEFAULT NULL,
  `ylncxljllStart` decimal(1100,6) DEFAULT NULL,
  `ylncxljllEnd` decimal(1100,6) DEFAULT NULL,
  `ylnljzcsylroeStart` decimal(1100,6) DEFAULT NULL,
  `ylnljzcsylroeEnd` decimal(1100,6) DEFAULT NULL,
  `gsygpgsgdjlrStart` decimal(1100,6) DEFAULT NULL,
  `gsygpgsgdjlrEnd` decimal(1100,6) DEFAULT NULL,
  `mllStart` decimal(1100,6) DEFAULT NULL,
  `mllEnd` decimal(1100,6) DEFAULT NULL,
  `mgsyStart` decimal(1100,6) DEFAULT NULL,
  `mgsyEnd` decimal(1100,6) DEFAULT NULL,
  `xxzgbStart` decimal(1100,6) DEFAULT NULL,
  `xxzgbEnd` decimal(1100,6) DEFAULT NULL,
  `zczongJiStart` decimal(1100,6) DEFAULT NULL,
  `zczongJiEnd` decimal(1100,6) DEFAULT NULL,
  `fzHeJiStart` decimal(1100,6) DEFAULT NULL,
  `fzHeJiEnd` decimal(1100,6) DEFAULT NULL,
  `xxzszStart` decimal(1100,6) DEFAULT NULL,
  `xxzszEnd` decimal(1100,6) DEFAULT NULL,
  `mgjzcStart` decimal(1100,6) DEFAULT NULL,
  `mgjzcEnd` decimal(1100,6) DEFAULT NULL,
  `hqsyl2Start` decimal(1100,6) DEFAULT NULL,
  `hqsyl2End` decimal(1100,6) DEFAULT NULL,
  `hqsyl1Start` decimal(1100,6) DEFAULT NULL,
  `hqsyl1End` decimal(1100,6) DEFAULT NULL,
  `sylStart` decimal(1100,6) DEFAULT NULL,
  `sylEnd` decimal(1100,6) DEFAULT NULL,
  `hqzrspStart` decimal(1100,6) DEFAULT NULL,
  `hqzrspEnd` decimal(1100,6) DEFAULT NULL,
  `hqzdfStart` decimal(1100,6) DEFAULT NULL,
  `hqzdfEnd` decimal(1100,6) DEFAULT NULL,
  `hqcjjeStart` decimal(1100,6) DEFAULT NULL,
  `hqcjjeEnd` decimal(1100,6) DEFAULT NULL,
  `hqcjslStart` decimal(1100,6) DEFAULT NULL,
  `hqcjslEnd` decimal(1100,6) DEFAULT NULL,
  `hqhslStart` decimal(1100,6) DEFAULT NULL,
  `hqhslEnd` decimal(1100,6) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for hyzdf
-- ----------------------------
DROP TABLE IF EXISTS `hyzdf`;
CREATE TABLE `hyzdf` (
  `idStr` char(32) NOT NULL,
  `sshy` char(12) DEFAULT NULL,
  `sshymc` varchar(128) DEFAULT NULL,
  `zdf` decimal(100,6) DEFAULT NULL,
  `zde` decimal(100,6) DEFAULT NULL,
  `jlrq` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for inc_commercial_banks
-- ----------------------------
DROP TABLE IF EXISTS `inc_commercial_banks`;
CREATE TABLE `inc_commercial_banks` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `bal_IDStr` char(32) COLLATE utf8_bin DEFAULT NULL,
  `DLMMZQYWShouRu` decimal(100,6) DEFAULT NULL,
  `SXFJYJJShouRu` decimal(100,6) DEFAULT NULL,
  `ZQCXYWJShouRu` decimal(100,6) DEFAULT NULL,
  `STKHZZGLYWJShouRu` decimal(100,6) DEFAULT NULL,
  `CWGWJShouRu` decimal(100,6) DEFAULT NULL,
  `BJYWJShouRu` decimal(100,6) DEFAULT NULL,
  `JJGLYWJShouRu` decimal(100,6) DEFAULT NULL,
  `JJXSYWJShouRu` decimal(100,6) DEFAULT NULL,
  `ZQJJYWJShouRu` decimal(100,6) DEFAULT NULL,
  `SXFJYJJSRQTXiangMu` decimal(100,6) DEFAULT NULL,
  `LXJShouRu` decimal(100,6) DEFAULT NULL,
  `YYSRQTXiangMu` decimal(100,6) DEFAULT NULL,
  `YYSRPHXiangMu` decimal(100,6) DEFAULT NULL,
  `YYZhiChu` decimal(100,6) DEFAULT NULL,
  `YYJGLFei` decimal(100,6) DEFAULT NULL,
  `YYZCQTXiangMu` decimal(100,6) DEFAULT NULL,
  `YYZCPHXiangMu` decimal(100,6) DEFAULT NULL,
  `LLZEPHXiangMu` decimal(100,6) DEFAULT NULL,
  `SDSFeiYong` decimal(100,6) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_46` (`bal_IDStr`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for inc_securities_company
-- ----------------------------
DROP TABLE IF EXISTS `inc_securities_company`;
CREATE TABLE `inc_securities_company` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `inc_IDStr` char(32) COLLATE utf8_bin DEFAULT NULL,
  `LXJingShouRu` decimal(100,6) DEFAULT NULL,
  `SXFJYJJingShouRu` decimal(100,6) DEFAULT NULL,
  `YYSRQTXiangMu` decimal(100,6) DEFAULT NULL,
  `YYSRPHXiangMu` decimal(100,6) DEFAULT NULL,
  `YYZhiChu` decimal(100,6) DEFAULT NULL,
  `YWJGuanLiFei` decimal(100,6) DEFAULT NULL,
  `YWZCQTXiangMu` decimal(100,6) DEFAULT NULL,
  `YYZCPHXiangMu` decimal(100,6) DEFAULT NULL,
  `LRZEPHXiangMu` decimal(100,6) DEFAULT NULL,
  `SDSFeiYong` decimal(100,6) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_47` (`inc_IDStr`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for income_statements
-- ----------------------------
DROP TABLE IF EXISTS `income_statements`;
CREATE TABLE `income_statements` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `sec_ID` char(32) COLLATE utf8_bin DEFAULT NULL,
  `stockCode` char(6) COLLATE utf8_bin DEFAULT NULL,
  `stockName` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  `YingYeZongShouRu` decimal(100,6) DEFAULT NULL,
  `YingYeShouRu` decimal(100,6) DEFAULT NULL,
  `LiXiShouRu` decimal(100,6) DEFAULT NULL,
  `YiZhunBaoFei` decimal(100,6) DEFAULT NULL,
  `SSFJYJShouRu` decimal(100,6) DEFAULT NULL,
  `QTYWShouRu` decimal(100,6) DEFAULT NULL,
  `YSZSRQTXiangMu` decimal(100,6) DEFAULT NULL,
  `YYZChengBen` decimal(100,6) DEFAULT NULL,
  `YingYeCheng` decimal(100,6) DEFAULT NULL,
  `LiXiZhiChu` decimal(100,6) DEFAULT NULL,
  `SSFJYJZhiChu` decimal(100,6) DEFAULT NULL,
  `YFFeiYong` decimal(100,6) DEFAULT NULL,
  `TuiBaoJin` decimal(100,6) DEFAULT NULL,
  `PeiFuZhiChuJinE` decimal(100,6) DEFAULT NULL,
  `TQBXHEZBJJinE` decimal(100,6) DEFAULT NULL,
  `BDHLZhiChu` decimal(100,6) DEFAULT NULL,
  `FBFeiYong` decimal(100,6) DEFAULT NULL,
  `QTYWChengBen` decimal(100,6) DEFAULT NULL,
  `YYSJJFuJia` decimal(100,6) DEFAULT NULL,
  `XiaoShouFeiYong` decimal(100,6) DEFAULT NULL,
  `CaiWuFeiYong` decimal(100,6) DEFAULT NULL,
  `ZiChanJianZhiSunShi` decimal(100,6) DEFAULT NULL,
  `YYZCBQTXiangMu` decimal(100,6) DEFAULT NULL,
  `GYJZBDShouYi` decimal(100,6) DEFAULT NULL,
  `TouZiShouYi` decimal(100,6) DEFAULT NULL,
  `DLYQYHYQYDTZShouYi` decimal(100,6) DEFAULT NULL,
  `HuiZongShouYi` decimal(100,6) DEFAULT NULL,
  `YYLRQTXiangMu` decimal(100,6) DEFAULT NULL,
  `YYLRPHXiangMu` decimal(100,6) DEFAULT NULL,
  `YYLiRun` decimal(100,6) DEFAULT NULL,
  `YYWShouRu` decimal(100,6) DEFAULT NULL,
  `FLDZCCZJinSunShi` decimal(100,6) DEFAULT NULL,
  `YXLRZEDQTXiangMu` decimal(100,6) DEFAULT NULL,
  `LRZongE` decimal(100,6) DEFAULT NULL,
  `SuoDeShui` decimal(100,6) DEFAULT NULL,
  `WQDTZShouShi` decimal(100,6) DEFAULT NULL,
  `YXJLRDQTXiangMu` decimal(100,6) DEFAULT NULL,
  `JingLiRun` decimal(100,6) DEFAULT NULL,
  `BHBFZHBQSXLiRun` decimal(100,6) DEFAULT NULL,
  `GSYMGSGDDJinLiRun` decimal(100,6) DEFAULT NULL,
  `SSGDSunYi` decimal(100,6) DEFAULT NULL,
  `JLRQTXiangMu` decimal(100,6) DEFAULT NULL,
  `JLRChaE` decimal(100,6) DEFAULT NULL,
  `JBMGShouYi` decimal(100,6) DEFAULT NULL,
  `XSMGShouYi` decimal(100,6) DEFAULT NULL,
  `QTZHShouYi` decimal(100,6) DEFAULT NULL,
  `GSYMGSGDDQTZHShouYi` decimal(100,6) DEFAULT NULL,
  `ZHShouYiZongE` decimal(100,6) DEFAULT NULL,
  `GSYMGSSYZDZHSYZongE` decimal(100,6) DEFAULT NULL,
  `GSYSSGDDZHSYZongE` decimal(100,6) DEFAULT NULL,
  `GLFeiYong` decimal(100,6) DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_45` (`sec_ID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for industry_star
-- ----------------------------
DROP TABLE IF EXISTS `industry_star`;
CREATE TABLE `industry_star` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `stockName` varchar(256) DEFAULT NULL,
  `description` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for innovate_sec
-- ----------------------------
DROP TABLE IF EXISTS `innovate_sec`;
CREATE TABLE `innovate_sec` (
  `ID` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `stockName` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for institution_assess_level
-- ----------------------------
DROP TABLE IF EXISTS `institution_assess_level`;
CREATE TABLE `institution_assess_level` (
  `idStr` char(32) NOT NULL,
  `institution_id` char(32) DEFAULT NULL,
  `institution_name` varchar(64) DEFAULT NULL,
  `small_class_level` char(3) DEFAULT NULL COMMENT '证券公司分为A(AAA、AA、A)、B(BBB、BB、B)、C(CCC、CC、C)、D、E等5大类11个级别。A、B、C三大类中各级别公司均为正常经营公司,其类别、级别的划分仅反映公司在行业内风险管理能力的相对水平。D类、E类公司分别为潜在风险可能超过公司可承受范围及被依法采取风险处置措施的公司。',
  `big_class_level` char(1) DEFAULT NULL COMMENT '证券公司分为A(AAA、AA、A)、B(BBB、BB、B)、C(CCC、CC、C)、D、E等5大类11个级别。A、B、C三大类中各级别公司均为正常经营公司,其类别、级别的划分仅反映公司在行业内风险管理能力的相对水平。D类、E类公司分别为潜在风险可能超过公司可承受范围及被依法采取风险处置措施的公司。',
  `parent_id` char(32) DEFAULT NULL COMMENT '查询母公司级别',
  `year` int(11) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for institution_AT
-- ----------------------------
DROP TABLE IF EXISTS `institution_AT`;
CREATE TABLE `institution_AT` (
  `id` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `formUserID` char(32) DEFAULT NULL,
  `toATUserID` char(32) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `FK_Reference_42` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for institution_AT_Notice
-- ----------------------------
DROP TABLE IF EXISTS `institution_AT_Notice`;
CREATE TABLE `institution_AT_Notice` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `toATUserID` char(32) DEFAULT NULL,
  `toATTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `readStatus` char(1) DEFAULT '0' COMMENT '1:已读\r\n            0:未读',
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_43` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for institution_business_network
-- ----------------------------
DROP TABLE IF EXISTS `institution_business_network`;
CREATE TABLE `institution_business_network` (
  `idStr` char(32) NOT NULL,
  `code` char(12) DEFAULT NULL,
  `name` varchar(128) DEFAULT NULL,
  `businessFullName` varchar(128) DEFAULT NULL,
  `address` varchar(128) DEFAULT NULL,
  `liability` varchar(64) DEFAULT NULL,
  `registerAddress` varchar(128) DEFAULT NULL,
  `servicePhone` varchar(64) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='券商营业网点';

-- ----------------------------
-- Table structure for institution_comment
-- ----------------------------
DROP TABLE IF EXISTS `institution_comment`;
CREATE TABLE `institution_comment` (
  `idStr` char(32) NOT NULL,
  `institutionName` varchar(128) DEFAULT NULL,
  `userID` char(32) DEFAULT NULL,
  `content` varchar(1024) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `parendid` char(32) DEFAULT NULL,
  `title` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_29` (`institutionName`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for institution_content_action
-- ----------------------------
DROP TABLE IF EXISTS `institution_content_action`;
CREATE TABLE `institution_content_action` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `userID` char(32) DEFAULT NULL,
  `actionType` char(9) DEFAULT NULL COMMENT '踩，赞，分享',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_23` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for institution_data_count
-- ----------------------------
DROP TABLE IF EXISTS `institution_data_count`;
CREATE TABLE `institution_data_count` (
  `idstr` char(32) NOT NULL,
  `institution_fk` char(32) DEFAULT NULL,
  `name` varchar(128) NOT NULL,
  `zsz` decimal(50,4) DEFAULT NULL,
  `pjcje` decimal(50,4) DEFAULT NULL,
  `pjsyl` decimal(50,4) DEFAULT NULL,
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idstr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for institution_executive
-- ----------------------------
DROP TABLE IF EXISTS `institution_executive`;
CREATE TABLE `institution_executive` (
  `idStr` char(32) NOT NULL,
  `code` char(12) DEFAULT NULL,
  `name` varchar(128) DEFAULT NULL,
  `username` varchar(128) DEFAULT NULL,
  `sex` varchar(4) DEFAULT NULL,
  `presasg` varchar(128) DEFAULT NULL,
  `workeDate` date DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='券商高管';

-- ----------------------------
-- Table structure for institution_hot_stock
-- ----------------------------
DROP TABLE IF EXISTS `institution_hot_stock`;
CREATE TABLE `institution_hot_stock` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `stockCode` char(6) COLLATE utf8_bin DEFAULT NULL,
  `stockName` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  `yearmonth` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for institution_index
-- ----------------------------
DROP TABLE IF EXISTS `institution_index`;
CREATE TABLE `institution_index` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `institutionname` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `indextype` char(2) COLLATE utf8_bin DEFAULT NULL COMMENT '01：挂牌指数\r\n            02：做市指数',
  `indexvalue` decimal(100,6) DEFAULT NULL,
  `indexdate` date DEFAULT NULL,
  `changes` decimal(100,6) DEFAULT NULL,
  `changerange` decimal(100,6) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for institution_info
-- ----------------------------
DROP TABLE IF EXISTS `institution_info`;
CREATE TABLE `institution_info` (
  `idStr` char(32) NOT NULL,
  `code` char(12) DEFAULT NULL,
  `name` varchar(128) DEFAULT NULL,
  `zhFullName` varchar(128) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `registerCapital` decimal(100,6) DEFAULT NULL,
  `businessAgentName` varchar(32) DEFAULT NULL,
  `generalManager` varchar(32) DEFAULT NULL,
  `zipcode` char(6) DEFAULT NULL,
  `officeAddress` varchar(256) DEFAULT NULL,
  `registerAddress` varchar(256) DEFAULT NULL,
  `businessQualification` text,
  `netAddress` varchar(256) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `businessLicenseCode` varchar(64) DEFAULT NULL,
  `servicePhone` varchar(64) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='新三板专题-主办券商挂牌统计-市场类型全部-挂牌状态全部';

-- ----------------------------
-- Table structure for institution_info_tmp
-- ----------------------------
DROP TABLE IF EXISTS `institution_info_tmp`;
CREATE TABLE `institution_info_tmp` (
  `idStr` char(32) NOT NULL,
  `code` char(12) DEFAULT NULL,
  `name` varchar(128) DEFAULT NULL,
  `zhFullName` varchar(128) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `registerCapital` decimal(100,6) DEFAULT NULL,
  `businessAgentName` varchar(32) DEFAULT NULL,
  `generalManager` varchar(32) DEFAULT NULL,
  `zipcode` char(6) DEFAULT NULL,
  `officeAddress` varchar(256) DEFAULT NULL,
  `registerAddress` varchar(256) DEFAULT NULL,
  `businessQualification` text,
  `netAddress` varchar(256) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `businessLicenseCode` varchar(64) DEFAULT NULL,
  `servicePhone` varchar(64) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='新三板专题-主办券商挂牌统计-市场类型全部-挂牌状态全部';

-- ----------------------------
-- Table structure for institution_res_report
-- ----------------------------
DROP TABLE IF EXISTS `institution_res_report`;
CREATE TABLE `institution_res_report` (
  `idStr` char(32) NOT NULL,
  `institutionName` varchar(128) DEFAULT NULL,
  `title` varchar(256) DEFAULT NULL,
  `sendDate` date DEFAULT NULL,
  `author` varchar(32) DEFAULT NULL,
  `level` varchar(32) DEFAULT NULL,
  `attachUrl` varchar(256) DEFAULT NULL,
  `type` varchar(1) DEFAULT NULL,
  `abstract` varchar(1024) DEFAULT NULL,
  `relatedIndustry` varchar(512) DEFAULT NULL,
  `relatedStock` varchar(512) DEFAULT NULL,
  `status` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_14` (`institutionName`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for institution_res_report_comment
-- ----------------------------
DROP TABLE IF EXISTS `institution_res_report_comment`;
CREATE TABLE `institution_res_report_comment` (
  `idStr` char(32) NOT NULL,
  `parentID` char(32) DEFAULT NULL,
  `insResRepID` char(32) DEFAULT NULL,
  `userID` char(32) DEFAULT NULL,
  `content` varchar(1024) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `title` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_16` (`insResRepID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for institution_res_req_action
-- ----------------------------
DROP TABLE IF EXISTS `institution_res_req_action`;
CREATE TABLE `institution_res_req_action` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `userID` char(32) DEFAULT NULL,
  `actionType` char(9) DEFAULT NULL COMMENT '踩，赞，分享',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_27` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for institution_res_req_AT
-- ----------------------------
DROP TABLE IF EXISTS `institution_res_req_AT`;
CREATE TABLE `institution_res_req_AT` (
  `idStr` char(32) NOT NULL,
  `formUserID` char(32) DEFAULT NULL,
  `toATUserID` char(32) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `commentID` char(32) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_40` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for institution_res_req_AT_Notice
-- ----------------------------
DROP TABLE IF EXISTS `institution_res_req_AT_Notice`;
CREATE TABLE `institution_res_req_AT_Notice` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `toATUserID` char(32) DEFAULT NULL,
  `toATTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `readStatus` char(1) DEFAULT '0' COMMENT '1:已读\r\n            0:未读',
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_41` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for interact_count
-- ----------------------------
DROP TABLE IF EXISTS `interact_count`;
CREATE TABLE `interact_count` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `band` char(2) COLLATE utf8_bin DEFAULT NULL,
  `commentid` char(32) COLLATE utf8_bin DEFAULT NULL COMMENT 'è¸©ï¼Œèµžï¼Œåˆ†äº«',
  `commentcount` int(11) DEFAULT NULL,
  `evaluatecount` int(11) DEFAULT NULL,
  `zhuan_count` int(11) DEFAULT NULL,
  `coll_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for join_screenlabel_stock
-- ----------------------------
DROP TABLE IF EXISTS `join_screenlabel_stock`;
CREATE TABLE `join_screenlabel_stock` (
  `jss_id` varchar(32) NOT NULL,
  `jss_sl_id` varchar(32) DEFAULT NULL,
  `jss_stock_code` varchar(32) DEFAULT NULL,
  `jss_order` int(11) DEFAULT NULL,
  PRIMARY KEY (`jss_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for lable_dict
-- ----------------------------
DROP TABLE IF EXISTS `lable_dict`;
CREATE TABLE `lable_dict` (
  `idStr` char(32) NOT NULL,
  `lable_name` varchar(64) DEFAULT NULL,
  `content` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for listing_file
-- ----------------------------
DROP TABLE IF EXISTS `listing_file`;
CREATE TABLE `listing_file` (
  `idStr` char(32) NOT NULL,
  `stockDaiMa` char(6) DEFAULT NULL,
  `titile` varchar(256) DEFAULT NULL,
  `sendDate` datetime DEFAULT NULL,
  `fileUrl` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for market_express
-- ----------------------------
DROP TABLE IF EXISTS `market_express`;
CREATE TABLE `market_express` (
  `idStr` char(32) NOT NULL,
  `gpgsjs_zszr` int(11) DEFAULT NULL,
  `gpgsjs_xyzr` int(11) DEFAULT NULL,
  `gpgsjs_hj` int(11) DEFAULT NULL,
  `drxzjs_zszr` int(11) DEFAULT NULL,
  `drxzjs_xyzr` int(11) DEFAULT NULL,
  `drxzjs_hj` int(11) DEFAULT NULL,
  `zgb_zszr` decimal(100,6) DEFAULT NULL,
  `zgb_xyzr` decimal(100,6) DEFAULT NULL,
  `zgb_hj` decimal(100,6) DEFAULT NULL,
  `ltgb_zszr` decimal(100,6) DEFAULT NULL,
  `ltgb_xyzr` decimal(100,6) DEFAULT NULL,
  `ltgb_hj` decimal(100,6) DEFAULT NULL,
  `cjgpzs_zszr` int(11) DEFAULT NULL,
  `cjgpzs_xyzr` int(11) DEFAULT NULL,
  `cjgp_hj` int(11) DEFAULT NULL,
  `cjje_zszr` decimal(100,6) DEFAULT NULL,
  `cjje_xyzr` decimal(100,6) DEFAULT NULL,
  `cjje_hj` decimal(100,6) DEFAULT NULL,
  `cjsl_zszr` decimal(100,6) DEFAULT NULL,
  `cjsl_xyzr` decimal(100,6) DEFAULT NULL,
  `cjsl_hj` decimal(100,6) DEFAULT NULL,
  `cjbs_zszr` decimal(100,6) DEFAULT NULL,
  `cjbs_xyzr` decimal(100,6) DEFAULT NULL,
  `cjbs_hj` decimal(100,6) DEFAULT NULL,
  `zsz_zszr` decimal(100,6) DEFAULT NULL,
  `zsz_xyzr` decimal(100,6) DEFAULT NULL,
  `zsz_hj` decimal(100,6) DEFAULT NULL,
  `endDate` date DEFAULT NULL,
  `dataCompiledDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`),
  UNIQUE KEY `endDate` (`endDate`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for market_scope_statistics
-- ----------------------------
DROP TABLE IF EXISTS `market_scope_statistics`;
CREATE TABLE `market_scope_statistics` (
  `idStr` char(32) NOT NULL DEFAULT '',
  `GPGSHeJi` int(11) DEFAULT '0',
  `GPGSZSZhuanRangShu` int(11) DEFAULT '0',
  `GPGSXYZhuanRangShu` int(11) DEFAULT '0',
  `XZSHeJi` int(11) DEFAULT '0',
  `XZZSZhuanRangShu` int(11) DEFAULT '0',
  `XZXYZhuanRangShu` int(11) DEFAULT '0',
  `RJCJGPHeJi` decimal(100,6) DEFAULT NULL,
  `RJCJGPZSZhuanRangShu` decimal(100,6) DEFAULT NULL,
  `RJCJGPXYZhuanRangShu` decimal(100,6) DEFAULT NULL,
  `CJHeJiJinE` decimal(100,6) DEFAULT NULL,
  `CJZSZhuanRangShuJinE` decimal(100,6) DEFAULT NULL,
  `CJXYZhuanRangShuJinE` decimal(100,6) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  `drsxcjqysl` int(11) DEFAULT '0',
  `drsxcjzsqysl` int(11) DEFAULT '0',
  `drsxcjxyqysl` int(11) DEFAULT '0',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for month_gpcj_info
-- ----------------------------
DROP TABLE IF EXISTS `month_gpcj_info`;
CREATE TABLE `month_gpcj_info` (
  `idstr` char(32) NOT NULL,
  `zszrmygpsl` int(11) DEFAULT NULL,
  `xyzrmygpsl` int(11) DEFAULT NULL,
  `mycje` decimal(100,6) DEFAULT NULL,
  `mycjl` decimal(100,6) DEFAULT NULL,
  `month_date` char(6) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idstr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='按做市和协议划分每月成交情况';

-- ----------------------------
-- Table structure for monthly_turnover_earnings
-- ----------------------------
DROP TABLE IF EXISTS `monthly_turnover_earnings`;
CREATE TABLE `monthly_turnover_earnings` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `stockName` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `currentPrice` decimal(1100,6) DEFAULT NULL,
  `earningsLv` decimal(100,6) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for monthly_turnover_rankings
-- ----------------------------
DROP TABLE IF EXISTS `monthly_turnover_rankings`;
CREATE TABLE `monthly_turnover_rankings` (
  `ID` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `stockName` varchar(64) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `currentPrice` decimal(1100,6) DEFAULT NULL,
  `sumsTotal` decimal(100,6) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for nb_log
-- ----------------------------
DROP TABLE IF EXISTS `nb_log`;
CREATE TABLE `nb_log` (
  `idStr` char(32) NOT NULL,
  `action_type` char(2) DEFAULT NULL,
  `nb_num` int(11) DEFAULT NULL,
  `user_id` char(32) DEFAULT NULL,
  `action_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for neeq_chengfengu
-- ----------------------------
DROP TABLE IF EXISTS `neeq_chengfengu`;
CREATE TABLE `neeq_chengfengu` (
  `idstr` varchar(32) NOT NULL,
  `index_code` varchar(6) NOT NULL,
  `index_name` varchar(100) DEFAULT NULL,
  `stock_code` varchar(6) NOT NULL,
  `stock_name` varchar(100) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idstr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for new_AT_Notice
-- ----------------------------
DROP TABLE IF EXISTS `new_AT_Notice`;
CREATE TABLE `new_AT_Notice` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `toATUserID` char(32) DEFAULT NULL,
  `toATTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `readStatus` char(1) DEFAULT '0' COMMENT '1:已读\r\n            0:未读',
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_31` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for news_AT
-- ----------------------------
DROP TABLE IF EXISTS `news_AT`;
CREATE TABLE `news_AT` (
  `idStr` char(32) NOT NULL,
  `formUserID` char(32) DEFAULT NULL,
  `toATUserID` char(32) DEFAULT NULL,
  `newsCommentID` char(32) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_30` (`newsCommentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for news_comment
-- ----------------------------
DROP TABLE IF EXISTS `news_comment`;
CREATE TABLE `news_comment` (
  `idStr` char(32) NOT NULL,
  `parentID` char(32) DEFAULT NULL COMMENT '迭代评论id',
  `newsID` char(32) DEFAULT NULL,
  `userID` char(32) DEFAULT NULL,
  `content` varchar(1024) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `title` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_17` (`newsID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for news_comment_action
-- ----------------------------
DROP TABLE IF EXISTS `news_comment_action`;
CREATE TABLE `news_comment_action` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `userID` char(32) DEFAULT NULL,
  `actionType` char(9) DEFAULT NULL COMMENT '踩，赞，分享',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_23` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for news_comment_copy
-- ----------------------------
DROP TABLE IF EXISTS `news_comment_copy`;
CREATE TABLE `news_comment_copy` (
  `idStr` char(32) NOT NULL,
  `parentID` char(32) DEFAULT NULL COMMENT '迭代评论id',
  `newsID` char(32) DEFAULT NULL,
  `userID` char(32) DEFAULT NULL,
  `content` varchar(1024) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `title` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_17` (`newsID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for news_info
-- ----------------------------
DROP TABLE IF EXISTS `news_info`;
CREATE TABLE `news_info` (
  `idStr` char(32) NOT NULL,
  `WZTitle` varchar(256) DEFAULT NULL,
  `WZType` char(9) DEFAULT NULL COMMENT '要闻、市场类、股票类、清大原创',
  `GuPiaoCode` char(6) DEFAULT NULL,
  `FaBiaoDate` datetime DEFAULT NULL,
  `Content` longblob,
  `LaiYuan` varchar(128) DEFAULT NULL,
  `Author` varchar(64) DEFAULT NULL,
  `NetAddress` varchar(512) DEFAULT NULL,
  `WZAbstract` varchar(1024) DEFAULT NULL,
  `WZImgUrl` varchar(512) DEFAULT NULL,
  `KeyWord` varchar(100) DEFAULT NULL,
  `ExpandKeyWord` varchar(100) DEFAULT NULL,
  `ShowPrivilege` char(9) DEFAULT NULL COMMENT '预留',
  `show_order` int(11) DEFAULT NULL,
  `industry_type` char(32) DEFAULT NULL,
  `status` char(9) DEFAULT NULL,
  `dataCompiledDate` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='文本大字段';

-- ----------------------------
-- Table structure for news_info_click
-- ----------------------------
DROP TABLE IF EXISTS `news_info_click`;
CREATE TABLE `news_info_click` (
  `idStr` char(32) NOT NULL,
  `newsID` char(32) DEFAULT NULL,
  `userID` char(32) DEFAULT NULL,
  `userIP` varchar(32) DEFAULT NULL,
  `type` int(11) DEFAULT NULL COMMENT '0:点击，1：微讨论',
  `clickDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for news_notice
-- ----------------------------
DROP TABLE IF EXISTS `news_notice`;
CREATE TABLE `news_notice` (
  `idStr` char(32) NOT NULL,
  `noticeType` char(9) DEFAULT NULL COMMENT '定义数据字典表',
  `stockCode` char(6) DEFAULT NULL,
  `title` varchar(128) DEFAULT NULL,
  `url` varchar(256) DEFAULT NULL,
  `createTime` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for notice_AT
-- ----------------------------
DROP TABLE IF EXISTS `notice_AT`;
CREATE TABLE `notice_AT` (
  `idStr` char(32) NOT NULL,
  `formATUserID` char(32) DEFAULT NULL,
  `commentID` char(32) DEFAULT NULL,
  `toATUserID` char(32) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_36` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for notice_AT_Notice
-- ----------------------------
DROP TABLE IF EXISTS `notice_AT_Notice`;
CREATE TABLE `notice_AT_Notice` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `formATUserID` char(32) DEFAULT NULL,
  `toATTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `readStatus` char(1) DEFAULT '0' COMMENT '1:已读\r\n            0:未读',
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_37` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for notice_comment
-- ----------------------------
DROP TABLE IF EXISTS `notice_comment`;
CREATE TABLE `notice_comment` (
  `idStr` char(32) NOT NULL,
  `parentID` char(32) DEFAULT NULL,
  `noticeID` char(32) DEFAULT NULL,
  `usrID` char(32) DEFAULT NULL,
  `content` varchar(2048) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `title` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_24` (`noticeID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for notice_comment_action
-- ----------------------------
DROP TABLE IF EXISTS `notice_comment_action`;
CREATE TABLE `notice_comment_action` (
  `idStr` char(32) NOT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `userID` char(32) DEFAULT NULL,
  `actionType` char(9) DEFAULT NULL COMMENT '踩，赞，分享',
  `commentID` char(32) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_23` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for owner_change_interest
-- ----------------------------
DROP TABLE IF EXISTS `owner_change_interest`;
CREATE TABLE `owner_change_interest` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `sec_ID` char(32) COLLATE utf8_bin DEFAULT NULL,
  `stockCode` char(6) COLLATE utf8_bin DEFAULT NULL,
  `stockName` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_5` (`sec_ID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for qe_conn_investor_project
-- ----------------------------
DROP TABLE IF EXISTS `qe_conn_investor_project`;
CREATE TABLE `qe_conn_investor_project` (
  `investor_id` char(32) DEFAULT NULL,
  `project_id` char(32) DEFAULT NULL,
  `status` char(32) DEFAULT NULL COMMENT '审核状态：1：审核中，2：审核通过，3：审核未通过',
  `status_date` datetime DEFAULT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for qe_enterprise_info
-- ----------------------------
DROP TABLE IF EXISTS `qe_enterprise_info`;
CREATE TABLE `qe_enterprise_info` (
  `idStr` char(32) NOT NULL,
  `short_name` varchar(32) DEFAULT NULL,
  `main_business` varchar(256) DEFAULT NULL,
  `profile` varchar(256) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  `register_code` char(15) DEFAULT NULL,
  `register_capital` decimal(100,6) DEFAULT NULL,
  `legal_person` varchar(64) DEFAULT NULL,
  `address` varchar(128) DEFAULT NULL,
  `network` varchar(128) DEFAULT NULL,
  `img_url` varchar(128) DEFAULT NULL,
  `status` char(1) DEFAULT NULL COMMENT '企业是否有效展示状态\r\n            1：有效\r\n            2：无效\r\n            其他默认无效',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for qe_investor
-- ----------------------------
DROP TABLE IF EXISTS `qe_investor`;
CREATE TABLE `qe_investor` (
  `idStr` char(32) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `abstracts` varchar(256) DEFAULT NULL,
  `city` varchar(64) DEFAULT NULL,
  `company` varchar(64) DEFAULT NULL,
  `industry` varchar(64) DEFAULT NULL,
  `position` varchar(32) DEFAULT NULL,
  `img_url` varchar(128) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for qe_news_info
-- ----------------------------
DROP TABLE IF EXISTS `qe_news_info`;
CREATE TABLE `qe_news_info` (
  `idStr` char(32) NOT NULL,
  `title` varchar(128) DEFAULT NULL,
  `abstracts` varchar(256) DEFAULT NULL,
  `content` text,
  `author` varchar(64) DEFAULT NULL,
  `img_url` varchar(256) DEFAULT NULL,
  `release_date` datetime DEFAULT NULL,
  `status` char(9) DEFAULT NULL COMMENT '针对新闻对外发布的审核状态控制\r\n            1：审核中，2：审核通过，3：审核未通过\r\n            其他暂定位为审核未通过',
  `status_date` datetime DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for qe_news_info_copy
-- ----------------------------
DROP TABLE IF EXISTS `qe_news_info_copy`;
CREATE TABLE `qe_news_info_copy` (
  `idStr` char(32) NOT NULL,
  `title` varchar(128) DEFAULT NULL,
  `abstracts` varchar(256) DEFAULT NULL,
  `content` text,
  `author` varchar(64) DEFAULT NULL,
  `img_url` varchar(256) DEFAULT NULL,
  `release_date` datetime DEFAULT NULL,
  `status` char(9) DEFAULT NULL COMMENT '针对新闻对外发布的审核状态控制\r\n            1：审核中，2：审核通过，3：审核未通过\r\n            其他暂定位为审核未通过',
  `status_date` datetime DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for qe_project
-- ----------------------------
DROP TABLE IF EXISTS `qe_project`;
CREATE TABLE `qe_project` (
  `idStr` char(32) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `abstact` varchar(128) DEFAULT NULL COMMENT '项目介绍，项目两点，项目摘要',
  `city` varchar(64) DEFAULT NULL,
  `industry` varchar(64) DEFAULT NULL,
  `finance` decimal(100,6) DEFAULT NULL,
  `img_url` varchar(128) DEFAULT NULL,
  `update_status` char(9) DEFAULT NULL COMMENT '进展状态定义于整个项目进展情况：\r\n            ',
  `update_status_date` date DEFAULT NULL,
  `enterprise_name` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for qe_topic
-- ----------------------------
DROP TABLE IF EXISTS `qe_topic`;
CREATE TABLE `qe_topic` (
  `idStr` char(32) NOT NULL,
  `title` varchar(128) DEFAULT NULL,
  `content` varchar(512) DEFAULT NULL,
  `object_type` char(1) DEFAULT NULL COMMENT '定义对象外键关联的关系\r\n            1：投资人\r\n            2：为企业\r\n            3：咨询、新闻\r\n            4：项目\r\n            其他：暂定为没有对象',
  `object_id` char(32) DEFAULT NULL,
  `author` varchar(32) DEFAULT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for qe_topic_discussion
-- ----------------------------
DROP TABLE IF EXISTS `qe_topic_discussion`;
CREATE TABLE `qe_topic_discussion` (
  `idStr` char(32) NOT NULL,
  `topic_id` char(32) DEFAULT NULL,
  `content` varchar(128) DEFAULT NULL,
  `author` varchar(32) DEFAULT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for qinghuainvest_group
-- ----------------------------
DROP TABLE IF EXISTS `qinghuainvest_group`;
CREATE TABLE `qinghuainvest_group` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `stockName` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for review_AT
-- ----------------------------
DROP TABLE IF EXISTS `review_AT`;
CREATE TABLE `review_AT` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `formATUserID` char(32) DEFAULT NULL,
  `toATUserID` char(32) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_34` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for review_AT_Notice
-- ----------------------------
DROP TABLE IF EXISTS `review_AT_Notice`;
CREATE TABLE `review_AT_Notice` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `toATUserID` char(32) DEFAULT NULL,
  `toATTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `readStatus` char(1) DEFAULT '0' COMMENT '1:已读\r\n            0:未读',
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_35` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for review_comment
-- ----------------------------
DROP TABLE IF EXISTS `review_comment`;
CREATE TABLE `review_comment` (
  `idStr` char(32) NOT NULL,
  `parentID` char(32) DEFAULT NULL,
  `reviewID` char(32) DEFAULT NULL,
  `userID` char(32) DEFAULT NULL,
  `content` varchar(2048) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `title` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_25` (`reviewID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for review_comment_action
-- ----------------------------
DROP TABLE IF EXISTS `review_comment_action`;
CREATE TABLE `review_comment_action` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `userID` char(32) DEFAULT NULL,
  `actionType` char(9) DEFAULT NULL COMMENT '踩，赞，分享',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_23` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for review_info
-- ----------------------------
DROP TABLE IF EXISTS `review_info`;
CREATE TABLE `review_info` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `reviewDate` date DEFAULT NULL,
  `title` varchar(256) DEFAULT NULL,
  `url` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for s_city
-- ----------------------------
DROP TABLE IF EXISTS `s_city`;
CREATE TABLE `s_city` (
  `cityid` bigint(20) NOT NULL,
  `cityname` varchar(50) DEFAULT NULL,
  `zipcode` varchar(50) DEFAULT NULL,
  `provinceid` bigint(20) DEFAULT NULL,
  `datecreated` datetime DEFAULT NULL,
  `dateupdated` datetime DEFAULT NULL,
  PRIMARY KEY (`cityid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for s_district
-- ----------------------------
DROP TABLE IF EXISTS `s_district`;
CREATE TABLE `s_district` (
  `DistrictID` bigint(20) NOT NULL,
  `DistrictName` varchar(50) DEFAULT NULL,
  `CityID` bigint(20) DEFAULT NULL,
  `DateCreated` datetime DEFAULT NULL,
  `DateUpdated` datetime DEFAULT NULL,
  PRIMARY KEY (`DistrictID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for s_province
-- ----------------------------
DROP TABLE IF EXISTS `s_province`;
CREATE TABLE `s_province` (
  `provinceid` bigint(20) NOT NULL,
  `provincename` varchar(50) DEFAULT NULL,
  `datecreated` datetime DEFAULT NULL,
  `dateupdated` datetime DEFAULT NULL,
  PRIMARY KEY (`provinceid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for screen_label
-- ----------------------------
DROP TABLE IF EXISTS `screen_label`;
CREATE TABLE `screen_label` (
  `sl_id` varchar(32) NOT NULL,
  `sl_type` varchar(9) DEFAULT NULL,
  `sl_name` varchar(50) DEFAULT NULL,
  `sl_desc` varchar(200) DEFAULT NULL,
  `sl_img` varchar(500) DEFAULT NULL,
  `sl_order` int(11) DEFAULT NULL,
  PRIMARY KEY (`sl_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sec_info
-- ----------------------------
DROP TABLE IF EXISTS `sec_info`;
CREATE TABLE `sec_info` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) NOT NULL,
  `stockShortName` varchar(64) NOT NULL,
  `listingDate` date DEFAULT NULL,
  `DelistingDate` date DEFAULT NULL,
  `industryName` varchar(128) DEFAULT NULL,
  `industryCode` char(8) DEFAULT NULL,
  `managementName` varchar(128) DEFAULT NULL,
  `managementCode` char(8) DEFAULT NULL,
  `listingAddress` varchar(256) DEFAULT NULL,
  `stockType` varchar(32) DEFAULT NULL COMMENT '三板股（暂时固定此类）',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='数据浏览';

-- ----------------------------
-- Table structure for sec_market_det_info
-- ----------------------------
DROP TABLE IF EXISTS `sec_market_det_info`;
CREATE TABLE `sec_market_det_info` (
  `idStr` char(32) NOT NULL,
  `code` char(6) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `MarketMaker` varchar(32) DEFAULT NULL,
  `profit` decimal(100,6) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='新三板专题-做市商统计明细';

-- ----------------------------
-- Table structure for sec_market_det_info2
-- ----------------------------
DROP TABLE IF EXISTS `sec_market_det_info2`;
CREATE TABLE `sec_market_det_info2` (
  `idStr` char(32) CHARACTER SET utf8 NOT NULL,
  `name` varchar(64) CHARACTER SET utf8 DEFAULT NULL,
  `code` char(6) CHARACTER SET utf8 DEFAULT NULL,
  `startDate` datetime DEFAULT NULL,
  `MarketMaker` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `profit` decimal(100,6) DEFAULT NULL,
  `dataCompiledDate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for sec_market_det_info3
-- ----------------------------
DROP TABLE IF EXISTS `sec_market_det_info3`;
CREATE TABLE `sec_market_det_info3` (
  `idStr` char(32) NOT NULL,
  `code` char(6) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `MarketMaker` varchar(32) DEFAULT NULL,
  `profit` decimal(100,6) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='新三板专题-做市商统计明细';

-- ----------------------------
-- Table structure for sec_market_statistics
-- ----------------------------
DROP TABLE IF EXISTS `sec_market_statistics`;
CREATE TABLE `sec_market_statistics` (
  `idStr` char(32) NOT NULL,
  `securitiesCode` char(8) DEFAULT NULL,
  `securitiesName` varchar(256) DEFAULT NULL,
  `securitiesMarketNumber` decimal(100,6) DEFAULT NULL,
  `totalRatioLv` decimal(100,6) DEFAULT NULL,
  `firstMarketDate` datetime DEFAULT NULL,
  `stockTotal` decimal(100,6) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='新三板专题-做市券商统计';

-- ----------------------------
-- Table structure for sec_report_info
-- ----------------------------
DROP TABLE IF EXISTS `sec_report_info`;
CREATE TABLE `sec_report_info` (
  `idstr` varchar(32) NOT NULL,
  `stock_code` varchar(10) NOT NULL,
  `base_info` longblob,
  `business_model` longblob,
  `share_capital_movements_and_shareholders` longblob,
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `management_review` text,
  `endDate` date DEFAULT NULL,
  PRIMARY KEY (`idstr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for securities_industry_dictionary
-- ----------------------------
DROP TABLE IF EXISTS `securities_industry_dictionary`;
CREATE TABLE `securities_industry_dictionary` (
  `idStr` char(32) NOT NULL,
  `type` char(12) DEFAULT NULL COMMENT '投资型行业、管理型行业、证监会行业划分',
  `oneLevelCode` char(4) DEFAULT NULL,
  `oneLevelCodeName` varchar(128) DEFAULT NULL,
  `twoLevelCode` char(4) DEFAULT NULL,
  `twoLevelCodeName` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for security_info
-- ----------------------------
DROP TABLE IF EXISTS `security_info`;
CREATE TABLE `security_info` (
  `idStr` char(32) NOT NULL,
  `XXZQDM` char(6) DEFAULT NULL,
  `XXZQJC` varchar(16) DEFAULT NULL,
  `XXYWJC` varchar(20) DEFAULT NULL,
  `XXJCZQ` varchar(6) DEFAULT NULL,
  `XXISIN` varchar(12) DEFAULT NULL,
  `XXZRDW` decimal(100,6) DEFAULT NULL,
  `XXHYZL` varchar(5) DEFAULT NULL,
  `XXHBZL` varchar(2) DEFAULT NULL,
  `XXMGMZ` decimal(100,6) DEFAULT NULL,
  `XXZGB` decimal(100,6) DEFAULT NULL,
  `XXFXSGB` decimal(100,6) DEFAULT NULL,
  `XXSNSY` decimal(100,6) DEFAULT NULL,
  `XXBNSY` decimal(100,6) DEFAULT NULL,
  `XXJSFL` decimal(100,6) DEFAULT NULL,
  `XXYHSL` decimal(100,6) DEFAULT NULL,
  `XXGHFL` decimal(100,6) DEFAULT NULL,
  `XXGPRQ` varchar(8) DEFAULT NULL,
  `XXZQQXR` varchar(8) DEFAULT NULL,
  `XXDQR` varchar(8) DEFAULT NULL,
  `XXMBXL` decimal(100,6) DEFAULT NULL,
  `XXBLDW` decimal(100,6) DEFAULT NULL,
  `XXSLDW` decimal(100,6) DEFAULT NULL,
  `XXZXSBSL` decimal(100,6) DEFAULT NULL,
  `XXJGDW` decimal(100,6) DEFAULT NULL,
  `XXSBCS` decimal(100,6) DEFAULT NULL,
  `XXHXCS` decimal(100,6) DEFAULT NULL,
  `XXXJXZ` decimal(1,0) DEFAULT NULL,
  `XXZTJG` decimal(100,6) DEFAULT NULL,
  `XXDTJG` decimal(100,6) DEFAULT NULL,
  `XXDZZTJG` decimal(100,6) DEFAULT NULL,
  `XXDZDTJG` decimal(100,6) DEFAULT NULL,
  `XXCFGBZ` char(1) DEFAULT NULL,
  `XXZHBL` decimal(100,6) DEFAULT NULL,
  `XXZRZT` char(1) DEFAULT NULL,
  `XXZRJB` char(1) DEFAULT NULL,
  `XXZRLX` char(1) DEFAULT NULL,
  `XXZSSSL` decimal(100,6) DEFAULT NULL,
  `XXTPBZ` char(1) DEFAULT NULL,
  `XXCQCX` char(1) DEFAULT NULL,
  `XXWLTP` char(1) DEFAULT NULL,
  `XXQTYW` varchar(4) DEFAULT NULL,
  `XXGXSJ` decimal(100,6) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for security_info_history
-- ----------------------------
DROP TABLE IF EXISTS `security_info_history`;
CREATE TABLE `security_info_history` (
  `idStr` char(32) NOT NULL,
  `XXZQDM` char(6) DEFAULT NULL,
  `XXZQJC` varchar(16) DEFAULT NULL,
  `XXYWJC` varchar(20) DEFAULT NULL,
  `XXJCZQ` varchar(6) DEFAULT NULL,
  `XXISIN` varchar(12) DEFAULT NULL,
  `XXZRDW` decimal(100,6) DEFAULT NULL,
  `XXHYZL` varchar(5) DEFAULT NULL,
  `XXHBZL` varchar(2) DEFAULT NULL,
  `XXMGMZ` decimal(100,6) DEFAULT NULL,
  `XXZGB` decimal(100,6) DEFAULT NULL,
  `XXFXSGB` decimal(100,6) DEFAULT NULL,
  `XXSNSY` decimal(100,6) DEFAULT NULL,
  `XXBNSY` decimal(100,6) DEFAULT NULL,
  `XXJSFL` decimal(100,6) DEFAULT NULL,
  `XXYHSL` decimal(100,6) DEFAULT NULL,
  `XXGHFL` decimal(100,6) DEFAULT NULL,
  `XXGPRQ` varchar(8) DEFAULT NULL,
  `XXZQQXR` varchar(8) DEFAULT NULL,
  `XXDQR` varchar(8) DEFAULT NULL,
  `XXMBXL` decimal(100,6) DEFAULT NULL,
  `XXBLDW` decimal(100,6) DEFAULT NULL,
  `XXSLDW` decimal(100,6) DEFAULT NULL,
  `XXZXSBSL` decimal(100,6) DEFAULT NULL,
  `XXJGDW` decimal(100,6) DEFAULT NULL,
  `XXSBCS` decimal(100,6) DEFAULT NULL,
  `XXHXCS` decimal(100,6) DEFAULT NULL,
  `XXXJXZ` decimal(1,0) DEFAULT NULL,
  `XXZTJG` decimal(100,6) DEFAULT NULL,
  `XXDTJG` decimal(100,6) DEFAULT NULL,
  `XXDZZTJG` decimal(100,6) DEFAULT NULL,
  `XXDZDTJG` decimal(100,6) DEFAULT NULL,
  `XXCFGBZ` char(1) DEFAULT NULL,
  `XXZHBL` decimal(100,6) DEFAULT NULL,
  `XXZRZT` char(1) DEFAULT NULL,
  `XXZRJB` char(1) DEFAULT NULL,
  `XXZRLX` char(1) DEFAULT NULL,
  `XXZSSSL` decimal(100,6) DEFAULT NULL,
  `XXTPBZ` char(1) DEFAULT NULL,
  `XXCQCX` char(1) DEFAULT NULL,
  `XXWLTP` char(1) DEFAULT NULL,
  `XXQTYW` varchar(4) DEFAULT NULL,
  `XXGXSJ` decimal(100,6) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for security_market
-- ----------------------------
DROP TABLE IF EXISTS `security_market`;
CREATE TABLE `security_market` (
  `idStr` char(32) NOT NULL,
  `hqzqdm` varchar(6) DEFAULT NULL,
  `hqzqjc` varchar(8) DEFAULT NULL,
  `hqzrsp` decimal(100,6) DEFAULT NULL,
  `hqjrkq` decimal(100,6) DEFAULT NULL,
  `hqzjcj` decimal(100,6) DEFAULT NULL,
  `hqcjsl` decimal(100,6) DEFAULT NULL,
  `hqcjje` decimal(100,6) DEFAULT NULL,
  `hqcjbs` decimal(100,6) DEFAULT NULL,
  `hqzgcj` decimal(100,6) DEFAULT NULL,
  `hqzdcj` decimal(100,6) DEFAULT NULL,
  `hqsyl1` decimal(100,6) DEFAULT NULL,
  `hqsyl2` decimal(100,6) DEFAULT NULL,
  `hqjsd1` decimal(100,6) DEFAULT NULL,
  `hqjsd2` decimal(100,6) DEFAULT NULL,
  `hqhycc` decimal(100,6) DEFAULT NULL,
  `hqsjw5` decimal(100,6) DEFAULT NULL,
  `hqssl5` decimal(100,6) DEFAULT NULL,
  `hqsjw4` decimal(100,6) DEFAULT NULL,
  `hqssl4` decimal(100,6) DEFAULT NULL,
  `hqsjw3` decimal(100,6) DEFAULT NULL,
  `hqssl3` decimal(100,6) DEFAULT NULL,
  `hqsjw2` decimal(100,6) DEFAULT NULL,
  `hqssl2` decimal(100,6) DEFAULT NULL,
  `hqsjw1` decimal(100,6) DEFAULT NULL,
  `hqssl1` decimal(100,6) DEFAULT NULL,
  `hqbjw1` decimal(100,6) DEFAULT NULL,
  `hqbsl1` decimal(100,6) DEFAULT NULL,
  `hqbjw2` decimal(100,6) DEFAULT NULL,
  `hqbsl2` decimal(100,6) DEFAULT NULL,
  `hqbjw3` decimal(100,6) DEFAULT NULL,
  `hqbsl3` decimal(100,6) DEFAULT NULL,
  `hqbjw4` decimal(100,6) DEFAULT NULL,
  `hqbsl4` decimal(100,6) DEFAULT NULL,
  `hqbjw5` decimal(100,6) DEFAULT NULL,
  `hqbsl5` decimal(100,6) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for security_market_copy
-- ----------------------------
DROP TABLE IF EXISTS `security_market_copy`;
CREATE TABLE `security_market_copy` (
  `idStr` char(32) NOT NULL,
  `hqzqdm` varchar(6) DEFAULT NULL,
  `hqzqjc` varchar(8) DEFAULT NULL,
  `hqzrsp` decimal(100,6) DEFAULT NULL,
  `hqjrkq` decimal(100,6) DEFAULT NULL,
  `hqzjcj` decimal(100,6) DEFAULT NULL,
  `hqcjsl` decimal(100,6) DEFAULT NULL,
  `hqcjje` decimal(100,6) DEFAULT NULL,
  `hqcjbs` decimal(100,6) DEFAULT NULL,
  `hqzgcj` decimal(100,6) DEFAULT NULL,
  `hqzdcj` decimal(100,6) DEFAULT NULL,
  `hqsyl1` decimal(100,6) DEFAULT NULL,
  `hqsyl2` decimal(100,6) DEFAULT NULL,
  `hqjsd1` decimal(100,6) DEFAULT NULL,
  `hqjsd2` decimal(100,6) DEFAULT NULL,
  `hqhycc` decimal(100,6) DEFAULT NULL,
  `hqsjw5` decimal(100,6) DEFAULT NULL,
  `hqssl5` decimal(100,6) DEFAULT NULL,
  `hqsjw4` decimal(100,6) DEFAULT NULL,
  `hqssl4` decimal(100,6) DEFAULT NULL,
  `hqsjw3` decimal(100,6) DEFAULT NULL,
  `hqssl3` decimal(100,6) DEFAULT NULL,
  `hqsjw2` decimal(100,6) DEFAULT NULL,
  `hqssl2` decimal(100,6) DEFAULT NULL,
  `hqsjw1` decimal(100,6) DEFAULT NULL,
  `hqssl1` decimal(100,6) DEFAULT NULL,
  `hqbjw1` decimal(100,6) DEFAULT NULL,
  `hqbsl1` decimal(100,6) DEFAULT NULL,
  `hqbjw2` decimal(100,6) DEFAULT NULL,
  `hqbsl2` decimal(100,6) DEFAULT NULL,
  `hqbjw3` decimal(100,6) DEFAULT NULL,
  `hqbsl3` decimal(100,6) DEFAULT NULL,
  `hqbjw4` decimal(100,6) DEFAULT NULL,
  `hqbsl4` decimal(100,6) DEFAULT NULL,
  `hqbjw5` decimal(100,6) DEFAULT NULL,
  `hqbsl5` decimal(100,6) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for security_market_history
-- ----------------------------
DROP TABLE IF EXISTS `security_market_history`;
CREATE TABLE `security_market_history` (
  `idStr` char(32) NOT NULL,
  `hqzqdm` varchar(6) DEFAULT NULL,
  `hqzqjc` varchar(8) DEFAULT NULL,
  `hqzrsp` decimal(100,6) DEFAULT NULL,
  `hqjrkq` decimal(100,6) DEFAULT NULL,
  `hqzjcj` decimal(100,6) DEFAULT NULL,
  `hqcjsl` decimal(100,6) DEFAULT NULL,
  `hqcjje` decimal(100,6) DEFAULT NULL,
  `hqcjbs` decimal(100,6) DEFAULT NULL,
  `hqzgcj` decimal(100,6) DEFAULT NULL,
  `hqzdcj` decimal(100,6) DEFAULT NULL,
  `hqsyl1` decimal(100,6) DEFAULT NULL,
  `hqsyl2` decimal(100,6) DEFAULT NULL,
  `hqjsd1` decimal(100,6) DEFAULT NULL,
  `hqjsd2` decimal(100,6) DEFAULT NULL,
  `hqhycc` decimal(100,6) DEFAULT NULL,
  `hqsjw5` decimal(100,6) DEFAULT NULL,
  `hqssl5` decimal(100,6) DEFAULT NULL,
  `hqsjw4` decimal(100,6) DEFAULT NULL,
  `hqssl4` decimal(100,6) DEFAULT NULL,
  `hqsjw3` decimal(100,6) DEFAULT NULL,
  `hqssl3` decimal(100,6) DEFAULT NULL,
  `hqsjw2` decimal(100,6) DEFAULT NULL,
  `hqssl2` decimal(100,6) DEFAULT NULL,
  `hqsjw1` decimal(100,6) DEFAULT NULL,
  `hqssl1` decimal(100,6) DEFAULT NULL,
  `hqbjw1` decimal(100,6) DEFAULT NULL,
  `hqbsl1` decimal(100,6) DEFAULT NULL,
  `hqbjw2` decimal(100,6) DEFAULT NULL,
  `hqbsl2` decimal(100,6) DEFAULT NULL,
  `hqbjw3` decimal(100,6) DEFAULT NULL,
  `hqbsl3` decimal(100,6) DEFAULT NULL,
  `hqbjw4` decimal(100,6) DEFAULT NULL,
  `hqbsl4` decimal(100,6) DEFAULT NULL,
  `hqbjw5` decimal(100,6) DEFAULT NULL,
  `hqbsl5` decimal(100,6) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for security_market_month
-- ----------------------------
DROP TABLE IF EXISTS `security_market_month`;
CREATE TABLE `security_market_month` (
  `idStr` char(32) NOT NULL,
  `hqzqdm` varchar(6) DEFAULT NULL,
  `hqzqjc` varchar(8) DEFAULT NULL,
  `hqzrsp` decimal(100,6) DEFAULT NULL,
  `hqjrkq` decimal(100,6) DEFAULT NULL,
  `hqzjcj` decimal(100,6) DEFAULT NULL,
  `hqcjsl` decimal(100,6) DEFAULT NULL,
  `hqcjje` decimal(100,6) DEFAULT NULL,
  `hqcjbs` decimal(100,6) DEFAULT NULL,
  `hqzgcj` decimal(100,6) DEFAULT NULL,
  `hqzdcj` decimal(100,6) DEFAULT NULL,
  `hqsyl1` decimal(100,6) DEFAULT NULL,
  `hqsyl2` decimal(100,6) DEFAULT NULL,
  `hqjsd1` decimal(100,6) DEFAULT NULL,
  `hqjsd2` decimal(100,6) DEFAULT NULL,
  `hqhycc` decimal(100,6) DEFAULT NULL,
  `hqsjw5` decimal(100,6) DEFAULT NULL,
  `hqssl5` decimal(100,6) DEFAULT NULL,
  `hqsjw4` decimal(100,6) DEFAULT NULL,
  `hqssl4` decimal(100,6) DEFAULT NULL,
  `hqsjw3` decimal(100,6) DEFAULT NULL,
  `hqssl3` decimal(100,6) DEFAULT NULL,
  `hqsjw2` decimal(100,6) DEFAULT NULL,
  `hqssl2` decimal(100,6) DEFAULT NULL,
  `hqsjw1` decimal(100,6) DEFAULT NULL,
  `hqssl1` decimal(100,6) DEFAULT NULL,
  `hqbjw1` decimal(100,6) DEFAULT NULL,
  `hqbsl1` decimal(100,6) DEFAULT NULL,
  `hqbjw2` decimal(100,6) DEFAULT NULL,
  `hqbsl2` decimal(100,6) DEFAULT NULL,
  `hqbjw3` decimal(100,6) DEFAULT NULL,
  `hqbsl3` decimal(100,6) DEFAULT NULL,
  `hqbjw4` decimal(100,6) DEFAULT NULL,
  `hqbsl4` decimal(100,6) DEFAULT NULL,
  `hqbjw5` decimal(100,6) DEFAULT NULL,
  `hqbsl5` decimal(100,6) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sponsor_listing_statistics
-- ----------------------------
DROP TABLE IF EXISTS `sponsor_listing_statistics`;
CREATE TABLE `sponsor_listing_statistics` (
  `idStr` char(32) NOT NULL,
  `securitiesCode` char(8) DEFAULT NULL,
  `securitiesName` varchar(126) DEFAULT NULL,
  `listingNumber` smallint(6) DEFAULT NULL,
  `stockTotalSum` decimal(100,6) DEFAULT NULL,
  `assetsTotalAvg` decimal(100,6) DEFAULT NULL,
  `netAssetsAvg` decimal(100,6) DEFAULT NULL,
  `businessIncomeAvg` decimal(100,6) DEFAULT NULL,
  `shareholdersNetAssetsAvg` decimal(100,6) DEFAULT NULL,
  `marketNumber` smallint(6) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  `createDate` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sponsor_listing_statistics_copy
-- ----------------------------
DROP TABLE IF EXISTS `sponsor_listing_statistics_copy`;
CREATE TABLE `sponsor_listing_statistics_copy` (
  `idStr` char(32) NOT NULL,
  `securitiesCode` char(8) DEFAULT NULL,
  `securitiesName` varchar(126) DEFAULT NULL,
  `listingNumber` smallint(6) DEFAULT NULL,
  `stockTotalSum` decimal(100,6) DEFAULT NULL,
  `assetsTotalAvg` decimal(100,6) DEFAULT NULL,
  `netAssetsAvg` decimal(100,6) DEFAULT NULL,
  `businessIncomeAvg` decimal(100,6) DEFAULT NULL,
  `shareholdersNetAssetsAvg` decimal(100,6) DEFAULT NULL,
  `marketNumber` smallint(6) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  `createDate` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for stock_day_compute_info
-- ----------------------------
DROP TABLE IF EXISTS `stock_day_compute_info`;
CREATE TABLE `stock_day_compute_info` (
  `idStr` char(32) NOT NULL,
  `sec_ID` char(32) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_11` (`sec_ID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='月涨跌幅、周涨跌幅、42周最高价、42周最低价';

-- ----------------------------
-- Table structure for stock_listing_detailed_info
-- ----------------------------
DROP TABLE IF EXISTS `stock_listing_detailed_info`;
CREATE TABLE `stock_listing_detailed_info` (
  `idStr` char(32) NOT NULL,
  `code` char(6) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `tradeType` varchar(256) DEFAULT NULL,
  `sponsorBroker` varchar(256) DEFAULT NULL,
  `sponsorBrokerVice` varchar(256) DEFAULT NULL,
  `listingDate` date DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `steeringBroker` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for stock_listing_detailed_info2
-- ----------------------------
DROP TABLE IF EXISTS `stock_listing_detailed_info2`;
CREATE TABLE `stock_listing_detailed_info2` (
  `idStr` char(32) NOT NULL,
  `code` char(6) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `tradeType` varchar(256) DEFAULT NULL,
  `sponsorBroker` varchar(256) DEFAULT NULL,
  `sponsorBrokerVice` varchar(256) DEFAULT NULL,
  `listingDate` date DEFAULT NULL,
  `startDate` date DEFAULT NULL,
  `steeringBroker` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for task_scheduling
-- ----------------------------
DROP TABLE IF EXISTS `task_scheduling`;
CREATE TABLE `task_scheduling` (
  `idStr` char(32) NOT NULL,
  `groups` varchar(64) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `times` varchar(64) DEFAULT NULL,
  `status` char(1) DEFAULT NULL COMMENT '0:不执行，1：执行，2：废弃',
  `json_data` text,
  `first_start_status` char(1) DEFAULT NULL COMMENT '1激活后手动直接运行一次\r\n            0/其他：激活后等待时间自动执行',
  PRIMARY KEY (`idStr`),
  UNIQUE KEY `AK_Key_2` (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tem_financi_index
-- ----------------------------
DROP TABLE IF EXISTS `tem_financi_index`;
CREATE TABLE `tem_financi_index` (
  `YLNLJZCSLYROWKCJQ` decimal(100,6) DEFAULT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `date` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for three_Edition_Dictionary
-- ----------------------------
DROP TABLE IF EXISTS `three_Edition_Dictionary`;
CREATE TABLE `three_Edition_Dictionary` (
  `idStr` char(32) NOT NULL,
  `type` char(12) DEFAULT NULL COMMENT '01投资型行业、02管理型行业、03证监会行业划分',
  `oneLevelCode` char(32) DEFAULT NULL,
  `oneLevelCodeName` varchar(128) DEFAULT NULL,
  `twoLevelCode` char(32) DEFAULT NULL,
  `twoLevelCodeName` varchar(128) DEFAULT NULL,
  `threeLevelCode` char(32) DEFAULT NULL,
  `threeLevelCodeName` varchar(128) DEFAULT NULL,
  `fourLevelCode` char(32) DEFAULT NULL,
  `fourLevelCodeName` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tmp_a
-- ----------------------------
DROP TABLE IF EXISTS `tmp_a`;
CREATE TABLE `tmp_a` (
  `idstr` char(16) NOT NULL,
  `code` varchar(32) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `count` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`idstr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tmp_astock
-- ----------------------------
DROP TABLE IF EXISTS `tmp_astock`;
CREATE TABLE `tmp_astock` (
  `idstr` char(32) NOT NULL,
  `stockcode` varchar(64) DEFAULT NULL,
  `stockname` varchar(64) DEFAULT NULL,
  `Mtype` varchar(64) DEFAULT NULL,
  `Dtypecode` varchar(16) DEFAULT NULL,
  `Dtypename` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`idstr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tmp_b
-- ----------------------------
DROP TABLE IF EXISTS `tmp_b`;
CREATE TABLE `tmp_b` (
  `idstr` char(16) NOT NULL,
  `code` varchar(32) DEFAULT NULL,
  `count` varchar(64) DEFAULT NULL,
  `kscount` varchar(64) DEFAULT NULL,
  `Mcount` varchar(64) DEFAULT NULL,
  `Tcount` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`idstr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tmp_sec
-- ----------------------------
DROP TABLE IF EXISTS `tmp_sec`;
CREATE TABLE `tmp_sec` (
  `idstr` char(32) COLLATE utf8_bin NOT NULL DEFAULT '',
  `stockcode` varchar(8) COLLATE utf8_bin DEFAULT NULL,
  `stockshortname` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `industrycode` varchar(8) COLLATE utf8_bin DEFAULT NULL,
  `industryname` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `managementcode` varchar(8) COLLATE utf8_bin DEFAULT NULL,
  `managementname` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `xxhyzl` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `xxzrlx` varchar(8) COLLATE utf8_bin DEFAULT NULL,
  `ssqy` varchar(12) COLLATE utf8_bin DEFAULT NULL,
  `xxzgb` decimal(100,6) DEFAULT NULL,
  `hqzrsp` decimal(100,6) DEFAULT NULL,
  `hqcjsl` decimal(100,6) DEFAULT NULL,
  `hqcjje` decimal(100,6) DEFAULT NULL,
  `zxj` decimal(100,6) DEFAULT NULL,
  `zde` decimal(100,6) DEFAULT NULL,
  `zdf` decimal(100,6) DEFAULT NULL,
  `syl` decimal(100,6) DEFAULT NULL,
  `hsl` decimal(100,6) DEFAULT NULL,
  `yysr` decimal(100,6) DEFAULT NULL,
  `jlr` decimal(100,6) DEFAULT NULL,
  `mll` decimal(100,6) DEFAULT NULL,
  `srjll` decimal(100,6) DEFAULT NULL,
  `jzc` decimal(100,6) DEFAULT NULL,
  `mgsy` decimal(100,6) DEFAULT NULL,
  `gsygpgsgdjlr` decimal(100,6) DEFAULT NULL,
  `zzc` decimal(100,6) DEFAULT NULL,
  `zfz` decimal(100,6) DEFAULT NULL,
  `zsz` decimal(100,6) DEFAULT NULL,
  `mgjzc` decimal(100,6) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  PRIMARY KEY (`idstr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for tmptable
-- ----------------------------
DROP TABLE IF EXISTS `tmptable`;
CREATE TABLE `tmptable` (
  `idStr` char(32) CHARACTER SET utf8 NOT NULL,
  `code` char(6) CHARACTER SET utf8 DEFAULT NULL,
  `name` varchar(64) CHARACTER SET utf8 DEFAULT NULL,
  `startDate` datetime DEFAULT NULL,
  `MarketMaker` varchar(32) CHARACTER SET utf8 DEFAULT NULL,
  `m2` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m3` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m4` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m5` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m6` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m7` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m8` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m9` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m10` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m11` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m12` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m13` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m14` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m15` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m16` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m17` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `m18` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `dataCompiledDate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for topic_info
-- ----------------------------
DROP TABLE IF EXISTS `topic_info`;
CREATE TABLE `topic_info` (
  `idStr` char(32) NOT NULL,
  `content` varchar(512) DEFAULT NULL,
  `user_id` char(32) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '要闻、市场类、股票类、清大原创（场外百科）',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tsbg_log
-- ----------------------------
DROP TABLE IF EXISTS `tsbg_log`;
CREATE TABLE `tsbg_log` (
  `idStr` char(32) COLLATE utf8_bin DEFAULT NULL,
  `user_name` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  `op_ip` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  `op_type` varchar(2) COLLATE utf8_bin DEFAULT NULL COMMENT '1，登陆；2，退出',
  `op_Time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `idStr` char(32) NOT NULL,
  `loginname` varchar(64) NOT NULL,
  `password` varchar(64) NOT NULL,
  `nickname` varchar(64) DEFAULT NULL,
  `telephone` char(11) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `type` char(9) DEFAULT NULL,
  `workType` char(9) DEFAULT NULL,
  `enterpriseName` varchar(256) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL COMMENT '1:男\r\n            0:女',
  `province` varchar(64) DEFAULT NULL,
  `city` varchar(64) DEFAULT NULL,
  `address` varchar(256) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `headImagePath` varchar(256) DEFAULT NULL,
  `tel` varchar(15) DEFAULT NULL,
  `pwdtemp` varchar(64) DEFAULT NULL,
  `terminal` varchar(64) DEFAULT NULL,
  `appname` varchar(64) DEFAULT NULL,
  `qq_openid` varchar(64) DEFAULT NULL,
  `weibo_openid` varchar(64) DEFAULT NULL,
  `weixin_openid` varchar(64) DEFAULT NULL,
  `register_channel` varchar(64) DEFAULT NULL,
  `mac` varchar(64) DEFAULT NULL,
  `idfa` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_attention_institution
-- ----------------------------
DROP TABLE IF EXISTS `user_attention_institution`;
CREATE TABLE `user_attention_institution` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `userID` char(32) COLLATE utf8_bin DEFAULT NULL,
  `institutionCode` char(6) COLLATE utf8_bin DEFAULT NULL,
  `institutionName` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for user_attention_stock
-- ----------------------------
DROP TABLE IF EXISTS `user_attention_stock`;
CREATE TABLE `user_attention_stock` (
  `idStr` char(32) NOT NULL,
  `userID` char(32) DEFAULT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `stockName` varchar(128) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_15` (`userID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_attention_user
-- ----------------------------
DROP TABLE IF EXISTS `user_attention_user`;
CREATE TABLE `user_attention_user` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `userID` char(32) COLLATE utf8_bin DEFAULT NULL,
  `attentionuser` char(32) COLLATE utf8_bin DEFAULT NULL,
  `userName` varchar(128) COLLATE utf8_bin DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for user_enterprise_second
-- ----------------------------
DROP TABLE IF EXISTS `user_enterprise_second`;
CREATE TABLE `user_enterprise_second` (
  `idStr` char(32) NOT NULL,
  `userId` char(32) NOT NULL,
  `stockCode` char(6) NOT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_nb
-- ----------------------------
DROP TABLE IF EXISTS `user_nb`;
CREATE TABLE `user_nb` (
  `idStr` char(32) NOT NULL,
  `user_id` char(32) DEFAULT NULL,
  `nb_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_phone
-- ----------------------------
DROP TABLE IF EXISTS `user_phone`;
CREATE TABLE `user_phone` (
  `idStr` char(32) NOT NULL,
  `name` varchar(64) DEFAULT NULL,
  `phone1` char(11) DEFAULT NULL,
  `phone2` char(11) DEFAULT NULL,
  `u_order` int(11) NOT NULL,
  `u_addr` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_recommendation
-- ----------------------------
DROP TABLE IF EXISTS `user_recommendation`;
CREATE TABLE `user_recommendation` (
  `idStr` char(32) DEFAULT NULL,
  `username` varchar(64) DEFAULT NULL,
  `nickname` varchar(64) DEFAULT NULL,
  `userid` char(32) DEFAULT NULL,
  `content` text
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_rivate_letter
-- ----------------------------
DROP TABLE IF EXISTS `user_rivate_letter`;
CREATE TABLE `user_rivate_letter` (
  `idStr` char(32) NOT NULL,
  `send_userid` char(32) DEFAULT NULL,
  `receive_userid` char(32) DEFAULT NULL,
  `send_content` text,
  `respond_parentid` char(32) DEFAULT NULL,
  `status` char(1) DEFAULT NULL COMMENT '1：为发送\r\n            2：已阅读',
  `send_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_tips
-- ----------------------------
DROP TABLE IF EXISTS `user_tips`;
CREATE TABLE `user_tips` (
  `idStr` char(32) NOT NULL,
  `userID` char(32) NOT NULL,
  `comment` varchar(1) DEFAULT '0',
  `at_fayan` varchar(1) DEFAULT '0',
  `at_comment` varchar(1) DEFAULT '0',
  `private_letter` varchar(1) DEFAULT '0',
  `fans` varchar(1) DEFAULT '0',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_token
-- ----------------------------
DROP TABLE IF EXISTS `user_token`;
CREATE TABLE `user_token` (
  `idStr` char(32) NOT NULL,
  `user_id` char(32) NOT NULL,
  `token` char(32) NOT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for video
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
  `idStr` char(32) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `url` varchar(128) DEFAULT NULL,
  `type` char(1) DEFAULT NULL COMMENT '0：项目根目录地址；1：网络地址',
  `status` char(1) DEFAULT NULL COMMENT '0:不展示，1:展示',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `content` text
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for video_info
-- ----------------------------
DROP TABLE IF EXISTS `video_info`;
CREATE TABLE `video_info` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `title` varchar(64) DEFAULT NULL,
  `url` varchar(128) DEFAULT NULL,
  `img_url` varchar(128) DEFAULT NULL,
  `small_img_url` varchar(128) DEFAULT NULL,
  `url_type` char(1) DEFAULT NULL COMMENT '0：项目根目录地址；1：网络地址',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` char(1) DEFAULT NULL COMMENT '1:展示\r\n            0或者其他:不展示',
  `content` varchar(1024) DEFAULT NULL,
  `phone_top` char(1) DEFAULT NULL COMMENT '为手机默认展示在最上面(最多只有一条)\r\n            1：是\r\n            0或者其他：都i为否',
  `level` char(7) DEFAULT NULL,
  `dataCompiledDate` date DEFAULT NULL,
  `top_date` datetime DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for virtual_position
-- ----------------------------
DROP TABLE IF EXISTS `virtual_position`;
CREATE TABLE `virtual_position` (
  `idStr` char(32) NOT NULL,
  `sec_ID` char(32) DEFAULT NULL,
  `userID` char(32) DEFAULT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `stockName` varchar(128) DEFAULT NULL,
  `businessType` char(9) DEFAULT NULL,
  `numbers` int(11) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `businessTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_21` (`userID`) USING BTREE,
  KEY `FK_Reference_22` (`sec_ID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for virtual_profit_loss_lv
-- ----------------------------
DROP TABLE IF EXISTS `virtual_profit_loss_lv`;
CREATE TABLE `virtual_profit_loss_lv` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `userid` char(32) COLLATE utf8_bin DEFAULT NULL,
  `stock_code` char(6) COLLATE utf8_bin DEFAULT NULL,
  `stock_name` varchar(68) COLLATE utf8_bin DEFAULT NULL,
  `profit_loss_lv` decimal(100,6) DEFAULT NULL,
  `buy` decimal(100,6) DEFAULT NULL,
  `sell` decimal(100,6) DEFAULT NULL,
  `pdate` datetime DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for virtual_stock
-- ----------------------------
DROP TABLE IF EXISTS `virtual_stock`;
CREATE TABLE `virtual_stock` (
  `idStr` char(32) COLLATE utf8_bin NOT NULL,
  `stock_code` char(6) COLLATE utf8_bin DEFAULT NULL,
  `userid` char(32) COLLATE utf8_bin DEFAULT NULL,
  `stock_name` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `stock_number` int(11) DEFAULT NULL,
  `cost` decimal(100,6) DEFAULT NULL,
  `ndate` datetime DEFAULT NULL,
  `profitlv` decimal(100,6) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for wei_AT
-- ----------------------------
DROP TABLE IF EXISTS `wei_AT`;
CREATE TABLE `wei_AT` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `formUserID` char(32) DEFAULT NULL,
  `toATUserID` char(32) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `comment_type` char(1) DEFAULT NULL,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_38` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wei_AT_Notice
-- ----------------------------
DROP TABLE IF EXISTS `wei_AT_Notice`;
CREATE TABLE `wei_AT_Notice` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `toATUSERID` char(32) DEFAULT NULL,
  `toATTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `readStatus` char(1) DEFAULT '0' COMMENT '1:已读\r\n            0:未读',
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_39` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wei_collection
-- ----------------------------
DROP TABLE IF EXISTS `wei_collection`;
CREATE TABLE `wei_collection` (
  `idStr` char(32) NOT NULL,
  `user_id` char(32) DEFAULT NULL,
  `wei_id` char(32) DEFAULT NULL,
  `collection_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '要闻、市场类、股票类、清大原创（场外百科）',
  `band` char(2) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wei_comment
-- ----------------------------
DROP TABLE IF EXISTS `wei_comment`;
CREATE TABLE `wei_comment` (
  `idStr` char(32) NOT NULL,
  `userID` char(32) DEFAULT NULL,
  `title` varchar(256) DEFAULT NULL,
  `content` longtext,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `source_id` char(32) DEFAULT NULL,
  `zhuan_id` char(32) DEFAULT NULL,
  `source_band` char(2) DEFAULT NULL,
  `is_delete` char(1) DEFAULT NULL,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wei_comment_action
-- ----------------------------
DROP TABLE IF EXISTS `wei_comment_action`;
CREATE TABLE `wei_comment_action` (
  `idStr` char(32) NOT NULL,
  `commentID` char(32) DEFAULT NULL,
  `userID` char(32) DEFAULT NULL,
  `actionType` char(9) DEFAULT NULL COMMENT '踩，赞，分享',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`),
  KEY `FK_Reference_13` (`commentID`) USING BTREE
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wei_comment_comment
-- ----------------------------
DROP TABLE IF EXISTS `wei_comment_comment`;
CREATE TABLE `wei_comment_comment` (
  `idStr` char(32) NOT NULL,
  `wei_id` char(32) DEFAULT NULL,
  `userID` char(32) DEFAULT NULL,
  `content` text,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wei_comment_temp
-- ----------------------------
DROP TABLE IF EXISTS `wei_comment_temp`;
CREATE TABLE `wei_comment_temp` (
  `id` varchar(32) NOT NULL,
  `oldcontent` text,
  `newcontent` text,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wei_file
-- ----------------------------
DROP TABLE IF EXISTS `wei_file`;
CREATE TABLE `wei_file` (
  `idStr` char(32) NOT NULL,
  `wei_id` char(32) DEFAULT NULL,
  `file_name` varchar(512) DEFAULT NULL,
  `save_path` varchar(512) DEFAULT NULL,
  `file_type` varchar(1) DEFAULT NULL COMMENT '1：图片，2：pdf，3：word',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '要闻、市场类、股票类、清大原创（场外百科）',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wei_institution
-- ----------------------------
DROP TABLE IF EXISTS `wei_institution`;
CREATE TABLE `wei_institution` (
  `idStr` char(32) NOT NULL,
  `ins_name` varchar(128) DEFAULT NULL,
  `wei_id` char(32) DEFAULT NULL,
  `sourceType` varchar(1) DEFAULT NULL COMMENT '来源：1，发布页面，2，内容，3，转发源',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wei_news
-- ----------------------------
DROP TABLE IF EXISTS `wei_news`;
CREATE TABLE `wei_news` (
  `idStr` char(32) NOT NULL,
  `news_id` char(32) DEFAULT NULL,
  `wei_id` char(32) DEFAULT NULL,
  `sourceType` varchar(1) DEFAULT NULL COMMENT '来源：1，发布页面，2，内容，3，转发源',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wei_stock
-- ----------------------------
DROP TABLE IF EXISTS `wei_stock`;
CREATE TABLE `wei_stock` (
  `idStr` char(32) NOT NULL,
  `stockCode` char(6) DEFAULT NULL,
  `wei_id` char(32) DEFAULT NULL,
  `sourceType` varchar(1) DEFAULT NULL COMMENT '来源：1，发布页面，2，内容，3，转发源',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wei_topic
-- ----------------------------
DROP TABLE IF EXISTS `wei_topic`;
CREATE TABLE `wei_topic` (
  `idStr` char(32) NOT NULL,
  `top_idStr` char(32) DEFAULT NULL,
  `wei_id` char(32) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '要闻、市场类、股票类、清大原创（场外百科）',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for wei_video
-- ----------------------------
DROP TABLE IF EXISTS `wei_video`;
CREATE TABLE `wei_video` (
  `idStr` char(32) NOT NULL,
  `video_id` char(32) DEFAULT NULL,
  `wei_id` char(32) DEFAULT NULL,
  `sourceType` varchar(1) DEFAULT NULL COMMENT '来源：1，发布页面，2，内容，3，转发源',
  PRIMARY KEY (`idStr`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- View structure for view_comment
-- ----------------------------
DROP VIEW IF EXISTS `view_comment`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `view_comment` AS (select `w`.`idStr` AS `idStr`,`w`.`content` AS `content`,`w`.`userID` AS `userID`,`w`.`wei_id` AS `wei_id`,`w`.`createTime` AS `createTime`,'01' AS `type` from `wei_comment_comment` `w`) union all (select `r`.`idStr` AS `idStr`,`r`.`content` AS `content`,`r`.`userID` AS `userID`,`r`.`reviewID` AS `wei_id`,`r`.`createTime` AS `createTime`,'07' AS `type` from `review_comment` `r`) union all (select `i`.`idStr` AS `idStr`,`i`.`content` AS `content`,`i`.`userID` AS `userID`,`i`.`insResRepID` AS `wei_id`,`i`.`createTime` AS `createTime`,'05' AS `type` from `institution_res_report_comment` `i`) union all (select `n`.`idStr` AS `idStr`,`n`.`content` AS `content`,`n`.`usrID` AS `userID`,`n`.`noticeID` AS `wei_id`,`n`.`createTime` AS `createTime`,'06' AS `type` from `notice_comment` `n`) union all (select `f`.`idStr` AS `idStr`,`f`.`content` AS `content`,`f`.`usrID` AS `userID`,`f`.`firstDiscloseID` AS `wei_id`,`f`.`createTime` AS `createTime`,'08' AS `type` from `first_disclose_comment` `f`) ;
