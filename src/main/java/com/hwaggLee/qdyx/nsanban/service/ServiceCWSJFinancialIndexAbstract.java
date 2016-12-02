package com.hwaggLee.qdyx.nsanban.service;

import java.util.List;

import com.base.model.Page;
import com.base.model.PageParam;
import com.base.service.BaseService;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJFinancialIndexAbstract;

public interface ServiceCWSJFinancialIndexAbstract extends BaseService<ModelCWSJFinancialIndexAbstract>{


	Page<ModelCWSJFinancialIndexAbstract> findPage(ModelCWSJFinancialIndexAbstract example, PageParam pageParam);
	ModelCWSJFinancialIndexAbstract save(ModelCWSJFinancialIndexAbstract c);
	void saves(List<ModelCWSJFinancialIndexAbstract> list);


}

