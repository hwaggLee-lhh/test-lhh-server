package com.hwaggLee.qdyx.nsanban.service;

import java.util.List;

import com.base.model.Page;
import com.base.model.PageParam;
import com.base.service.BaseService;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJBalanceSheet;

public interface ServiceCWSJBalanceSheet extends BaseService<ModelCWSJBalanceSheet>{

	Page<ModelCWSJBalanceSheet> findPage(ModelCWSJBalanceSheet example, PageParam pageParam);
	ModelCWSJBalanceSheet save(ModelCWSJBalanceSheet c);
	void saves(List<ModelCWSJBalanceSheet> list);

}

