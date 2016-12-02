package com.base.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

import org.apache.log4j.Logger;
import org.springframework.util.Assert;

import com.base.model.Dictionary;
import com.base.model.Enumeration;

public abstract class DictionaryFactory implements Serializable {
    
    private static final long serialVersionUID = 6417761806628943394L;

    protected final Logger log = Logger.getLogger(getClass());
    
    public static final String DICT_CODE = "dictcode";
    
    public static final String DICT_NAME = "dictname";

    public static final String ENUM_CODE = "enumcode";

    public static final String ENUM_NAME = "enumname";
    
	private static final CacheManager cacheManager = CacheManager.create();
    private static Cache cache = cacheManager.getCache("dictCache");
	static {
		cache = cacheManager.getCache("dictCache");
		if (cache == null) {
			try {
				System.setProperty(Cache.NET_SF_EHCACHE_USE_CLASSIC_LRU, "true");
			} finally {
			}
		}
	}
    
    /**得到所有的枚举数据，每个枚举的map中包含四个元素
     * ，DictionaryFactory.DICT_CODE
     * ，DictionaryFactory.DICT_NAME
     * ，DictionaryFactory.ENUM_CODE
     * ，DictionaryFactory.ENUM_NAME
     * @return List<Map<key, value>>
     */
    protected abstract List<Map<String, Object>> getData(String dictCode);

    public Enumeration getEnumByName(String dictName, String enumName) {
        Assert.hasText(dictName, "dictName is null");
        Assert.hasText(dictName, "dictName is null");
        Enumeration enumeration = new Enumeration(null, enumName);
        List<Map<String, Object>> list = getData(null);
        for (Map<String, Object> map : list) {
        	if (dictName.equals(map.get(DICT_NAME)) && enumName.equals(map.get(ENUM_NAME))) {
                enumeration = new Enumeration(map.get(ENUM_CODE).toString(), enumName);
            }
		}
        Assert.notNull(enumeration, "dictName:" + dictName + ",enumName:" + enumName + ",not found");
        return enumeration;
    }

    /**
     * 根据字典代码取字典
     * @param code
     * @return
     */
    public Dictionary getDictionary(String dictCode) {
        if (dictCode == null) {
            return null;
        }
		net.sf.ehcache.Element ce = cache.get(dictCode);
		Dictionary temp = ce==null?null:(Dictionary)ce.getObjectValue();
		if(temp!=null) return temp;
        
        Map<String, Dictionary> dictMap = assembleDictionary(dictCode);
        // 放入缓存中
        for (Map.Entry<String, Dictionary> entry : dictMap.entrySet()) {
        	// 放入缓存中
			cache.put(new net.sf.ehcache.Element((String) entry.getKey(), entry.getValue()));
		}
        Dictionary dictionary = (Dictionary) dictMap.get(dictCode);
        Assert.notNull(dictionary, "invalid dictCode:" + dictCode);
        return dictionary;
    }
    /**
     * 装配字典
     * @param data
     * @return Map<dictCode,Dictionary>
     */
    private Map<String, Dictionary> assembleDictionary(String dictionaryCode) {
        Map<String, Dictionary> dictMap = new HashMap<String, Dictionary>(1);
        List<Map<String, Object>> list = getData(dictionaryCode);
        for (Map<String, Object> map : list) {
        	String dictCode = map.get(DICT_CODE).toString().trim();
            String dictName = map.get(DICT_NAME).toString().trim();
            String enumCode = map.get(ENUM_CODE).toString().trim();
            String enumName = map.get(ENUM_NAME).toString().trim();
            Enumeration element = new Enumeration(enumCode, enumName);
            Dictionary dict = (Dictionary) dictMap.get(dictCode);
            // 判断在map中有没有dict
            if (dict != null) {
                // 更新字典
                dict.addEnum(element);
            } else {
                // 新建字典
                dict = new Dictionary();
                dict.setCode(dictCode);
                dict.setName(dictName);
                dict.addEnum(element);
                dictMap.put(dictCode, dict);
            }
		}
        
        return dictMap;
    }


    /**
     * 根据元素代码取元素名称。
     * @param enumCode
     * @return String
     */
    public String getEnumerationName(String enumCode) {
        return getEnumeration(enumCode).getName();
    }
    
    /**业务数据字典专用
     * @param dictCode 业务数据字典名称
     * @param enumCode 编码
     * @return 名称
     */
    public String getEnumerationName(String dictCode, String enumCode) {
        Dictionary dictionary = getDictionary(dictCode);
        if (dictionary == null) {
            return null;
        }
        return dictionary.getEnumName(enumCode);
    }
    
    /**
     * 根据元素中的代码设定元素中的名称
     * @param enumeration
     */
    public void setName(Enumeration enumeration) {
        if (enumeration == null) {
            return;
        }
        Enumeration temp = getEnumeration(enumeration.getCode());
        if (temp == null) {
            return;
        }
        enumeration.setName(temp.getName());
    }
    
    /**
     * 根据元素代码取元素对象。
     * @param enumCode
     * @return Enumeration
     */
    public Enumeration getEnumeration(String enumCode) {
        if (enumCode == null) {
            return null;
        }
        checkEnumCode(enumCode);
        String dictCode = enumCode.substring(0, enumCode.indexOf('-'));
        return getDictionary(dictCode).getEnumeration(enumCode);
    }
    
    
    protected void checkEnumCode(String enumCode) {
        Assert.isTrue(isValidEnumCode(enumCode), "invalid enumCode:" + enumCode);
    }
    
    protected boolean isValidEnumCode(String enumCode) {
        return enumCode.indexOf('-') != -1;
    }

    protected String getDictCodeFromEnumCode(String enumCode) {
        return enumCode.substring(0, enumCode.indexOf('-'));
    }

    public void removeCache(String dictCode) {
    	cache.remove(dictCode);
    }
}