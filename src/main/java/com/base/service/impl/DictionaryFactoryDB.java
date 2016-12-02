package com.base.service.impl;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.commons.lang.StringUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.base.config.ConfigPropertiesFile;
import com.base.service.DictionaryFactory;

@Component("dictionaryFactoryDB")
public class DictionaryFactoryDB extends DictionaryFactory {
	private ConfigPropertiesFile config = null;
	public DictionaryFactoryDB() {
		this.config = new ConfigPropertiesFile("properties/cmndd-dictionary-db.properties", "UTF-8");
	}
	private static final long serialVersionUID = 1L;

	private static final String SQL_SUBFIX = ".sql";

    private static final String DICT_APPLICATION_SQL = "dictapplication.sql";

    /**
     * 数据源
     */
    @Resource
    private DataSource dataSource;
     
    protected List<Map<String, Object>> getData(String dictCode) {
        Assert.notNull(dataSource, "dataSource is null");
        String sql = config.getString(dictCode + SQL_SUBFIX);
        boolean isAppication = false;
        /*首先判断单独业务字典的sql语句有没有，没有的话说明属于系统字典*/
        if (StringUtils.isEmpty(sql)) {
            isAppication = true;
            sql = config.getString(DICT_APPLICATION_SQL);
        }
        Assert.hasLength(sql, "sql is not found");
        List<Map<String, Object>> list = new JdbcTemplate(dataSource).queryForList(sql);
        //如果是单独业务数据字典的话，对返回结果增加dictCode和diceName
        if (isAppication == false) {
        	for (Map<String, Object> map : list) {
        		map.put(DICT_CODE, dictCode);
                map.put(DICT_NAME, config.getString(dictCode));
			}
        }
        return list;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
}
