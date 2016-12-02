package com.hwaggLee.qdyx.nsanban.service;

import java.util.List;

import com.base.model.Page;
import com.base.model.PageParam;
import com.base.service.BaseService;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJIncomeStatements;

public interface ServiceCWSJIncomeStatements extends BaseService<ModelCWSJIncomeStatements>{


	Page<ModelCWSJIncomeStatements> findPage(ModelCWSJIncomeStatements example, PageParam pageParam);
	ModelCWSJIncomeStatements save(ModelCWSJIncomeStatements c);
	void saves(List<ModelCWSJIncomeStatements> list);


}

