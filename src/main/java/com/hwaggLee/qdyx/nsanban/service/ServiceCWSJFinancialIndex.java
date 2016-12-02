package com.hwaggLee.qdyx.nsanban.service;

import java.util.List;

import com.base.model.Page;
import com.base.model.PageParam;
import com.base.service.BaseService;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJFinancialIndex;

public interface ServiceCWSJFinancialIndex extends BaseService<ModelCWSJFinancialIndex>{


	Page<ModelCWSJFinancialIndex> findPage(ModelCWSJFinancialIndex example, PageParam pageParam);
	ModelCWSJFinancialIndex save(ModelCWSJFinancialIndex c);
	void saves(List<ModelCWSJFinancialIndex> list);



}

