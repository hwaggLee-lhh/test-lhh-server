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
import com.hwaggLee.qdyx.nsanban.manager.ManagerCWSJFinancialIndexAbstract;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJFinancialIndexAbstract;
import com.hwaggLee.qdyx.nsanban.service.ServiceCWSJFinancialIndexAbstract;

@Service("implservicecwjsfinancialindexabstract")
public class ImplServiceCWJSFinancialIndexAbstract extends BaseServiceImpl<ModelCWSJFinancialIndexAbstract> implements ServiceCWSJFinancialIndexAbstract{

	@Resource
	private ManagerCWSJFinancialIndexAbstract managercwsjfinancialindexabstract;

	@Override
	protected BaseManager<ModelCWSJFinancialIndexAbstract> getBaseManager() {
		return managercwsjfinancialindexabstract;
	}


	public Page<ModelCWSJFinancialIndexAbstract> findPage(ModelCWSJFinancialIndexAbstract example,
			PageParam pageParam) {
		return managercwsjfinancialindexabstract.findPage(example, pageParam);
	}

	@Override
	public ModelCWSJFinancialIndexAbstract save(ModelCWSJFinancialIndexAbstract c) {
		if( c == null )return null;
		if( c.getEndDate() == null ){
			throw new BaseException("存在没有报告期的数据");
		}
		ModelCWSJFinancialIndexAbstract cs = this.managercwsjfinancialindexabstract.findByStockCodeAndEndDate(c.getStockCode(), c.getEndDate());
		if( cs == null ){
			this.managercwsjfinancialindexabstract.save(c);
			return c;
		}else{
			String idStr = cs.getIdStr();
			ModelUtils.transferValue(c, cs);
			cs.setIdStr(idStr);
			this.managercwsjfinancialindexabstract.update(cs);
			return cs;
		}
	}
	@Override
	public void saves(List<ModelCWSJFinancialIndexAbstract> list) {
		if( list == null || list.isEmpty()) return;
		for (ModelCWSJFinancialIndexAbstract c : list) {
			this.save(c);
			System.out.println(c.getStockCode());
		}
	}

}

