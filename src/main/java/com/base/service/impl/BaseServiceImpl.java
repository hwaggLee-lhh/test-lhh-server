package com.base.service.impl;

import java.util.Collection;
import java.util.List;

import com.base.model.BaseManager;
import com.base.model.Modelable;
import com.base.service.BaseService;

public abstract class BaseServiceImpl<T extends Modelable> implements BaseService<T> {
	protected abstract BaseManager<T> getBaseManager();
	public T save(T entity) {
		return getBaseManager().save(entity);
	}
	public void update(T entity) {
		getBaseManager().update(entity);
	}
	public void updateByParam(T t) {
		getBaseManager().updateByParam(t);
	}
	public List<T> findList() {
		return getBaseManager().findList();
	}
	public void deleteById(String id) {
		getBaseManager().deleteByIdStr(id);
	}
	public void deleteByIdList(Collection<String> idList) {
		getBaseManager().deleteByIdList(idList);
	}
	public T findById(String idStr) {
		return getBaseManager().findById(idStr);
	}
	public T loadById(String idStr) {
		return getBaseManager().loadById(idStr);
	}
}
