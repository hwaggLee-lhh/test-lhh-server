package com.hwaggLee.qdyx.nsanban.manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.base.model.BaseManager;
import com.base.model.Page;
import com.base.model.PageParam;
import com.hwaggLee.qdyx.nsanban.model.ModelCWSJBalanceSheet;

@Repository("managercwsjbalancesheet")
public class ManagerCWSJBalanceSheet extends BaseManager<ModelCWSJBalanceSheet>{

	@Override
	public Class<ModelCWSJBalanceSheet> getModelClass() {
		return ModelCWSJBalanceSheet.class;
	}

	public Page<ModelCWSJBalanceSheet> findPage(ModelCWSJBalanceSheet example, PageParam pageParam) {
		DetachedCriteria dc = super.getDetachedCriteria();
		
		if (example != null && StringUtils.isNotEmpty(example.getStockCode())) {
			dc.add(Restrictions.like("stockCode", example.getStockCode(),
					MatchMode.ANYWHERE));
		}
        if (example!=null && example.getDataCompiledDate()!=null) {
        	String date = new SimpleDateFormat("yyyy-MM-dd").format(example.getDataCompiledDate());
            try {
				dc.add(Restrictions.between("dataCompiledDate", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(date+" 00:00:00"),new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(date+" 23:59:59")));
			} catch (ParseException e) {
				e.printStackTrace();
				throw new RuntimeException("日期格式转换错误");
			}
        }
//        dc.addOrder(Order.desc("dataCompiledDate"));
        return super.findPage(dc, pageParam);
	}
	
	public ModelCWSJBalanceSheet findByStockCodeAndEndDate(String stockCode,Date endDate) {
		DetachedCriteria dc = super.getDetachedCriteria();
		dc.add(Restrictions.eq("stockCode", stockCode));
		dc.add(Restrictions.eq("endDate", endDate));
		List<ModelCWSJBalanceSheet> list = super.findList(dc);
		if( list != null && list.size()>0) return list.get(0);
		return null;
	}
	
}
