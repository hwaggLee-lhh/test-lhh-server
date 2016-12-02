package com.hwaggLee.qdyx.nsanban.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.base.model.BaseException;
import com.base.model.BaseManager;
import com.base.model.Page;
import com.base.model.PageParam;
import com.base.service.impl.BaseServiceImpl;
import com.base.utils.ModelUtils;
import com.hwaggLee.qdyx.nsanban.manager.ManagerCWSJFinancialIndex;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJFinancialIndex;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJFinancialIndex;

@Service("implservicecwjsfinancialindex")
public class ImplServiceCWJSFinancialIndex extends BaseServiceImpl<ModelCWSJFinancialIndex> implements ServiceCWSJFinancialIndex{

	@Resource
	private ManagerCWSJFinancialIndex managercwsjfinancialindex;

	@Override
	protected BaseManager<ModelCWSJFinancialIndex> getBaseManager() {
		return managercwsjfinancialindex;
	}


	public Page<ModelCWSJFinancialIndex> findPage(ModelCWSJFinancialIndex example,
			PageParam pageParam) {
		return managercwsjfinancialindex.findPage(example, pageParam);
	}

	@Override
	public ModelCWSJFinancialIndex save(ModelCWSJFinancialIndex c) {
		if( c == null )return null;
		if( c.getEndDate() == null ){
			throw new BaseException("存在没有报告期的数据");
		}
		ModelCWSJFinancialIndex cs = this.managercwsjfinancialindex.findByStockCodeAndEndDate(c.getStockCode(), c.getEndDate());
		if( cs == null ){
			this.managercwsjfinancialindex.save(c);
			return c;
		}else{
			String idStr = cs.getIdStr();
			ModelUtils.transferValue(c, cs);
			cs.setIdStr(idStr);
			this.managercwsjfinancialindex.update(cs);
			return cs;
		}
	}
	@Override
	public void saves(List<ModelCWSJFinancialIndex> list) {
		if( list == null || list.isEmpty()) return;
		for (ModelCWSJFinancialIndex c : list) {
			this.save(c);
			System.out.println(c.getStockCode());
		}
	}

}

