package com.base.web;

import javax.annotation.Resource;

import com.base.utils.JSONConvert;

/**
 * 接口注入类
 * @author huage
 *
 */
public class CtrlService {

	@Resource
    protected JSONConvert jsonConvert;
}
