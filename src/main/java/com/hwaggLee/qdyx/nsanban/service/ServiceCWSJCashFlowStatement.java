package com.hwaggLee.qdyx.nsanban.service;

import java.util.List;

import com.base.model.Page;
import com.base.model.PageParam;
import com.base.service.BaseService;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJCashFlowStatement;

public interface ServiceCWSJCashFlowStatement extends BaseService<ModelCWSJCashFlowStatement>{


	Page<ModelCWSJCashFlowStatement> findPage(ModelCWSJCashFlowStatement example, PageParam pageParam);
	ModelCWSJCashFlowStatement save(ModelCWSJCashFlowStatement c);
	void saves(List<ModelCWSJCashFlowStatement> list);



}

