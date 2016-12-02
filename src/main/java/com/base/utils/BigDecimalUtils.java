package com.base.utils;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public class BigDecimalUtils {
    public static final Logger log = Logger.getLogger(BigDecimalUtils.class);

    public static final BigDecimal ZERO = new BigDecimal("0");

    public static final BigDecimal ONE = new BigDecimal("1");

    /**
     * 两数相乘，四舍五入，保留2位小数
     * 
     * @param one
     * @param two
     * @return
     */
    public static BigDecimal multiply(BigDecimal one, BigDecimal two) {
        return multiply(one, two, 2);
    }

    /**
     * 两数相乘，四舍五入
     * 
     * @param one
     * @param two
     * @param scale
     *            保留位数
     * @return
     */
    public static BigDecimal multiply(BigDecimal one, BigDecimal two, int scale) {
        return one.multiply(two).setScale(scale, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 三数相乘，四舍五入，保留2位小数
     * 
     * @param one
     * @param two
     * @return
     */
    public static BigDecimal multiply(BigDecimal one, BigDecimal two, BigDecimal three) {
        return one.multiply(two).multiply(three).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal divide(BigDecimal numerator, BigDecimal denominator) {
        return divide(numerator, denominator, 2);
    }

    public static BigDecimal divide(BigDecimal numerator, BigDecimal denominator, int scale) {
        return numerator.divide(denominator, scale, BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal setScale(BigDecimal decimal) {
        return decimal.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal setScale(int scale, BigDecimal decimal) {
        return decimal.setScale(scale, BigDecimal.ROUND_HALF_UP);
    }

    /**
     * 解析String为BigDecimal，如果str为空返回0，如果抛出NumberFormatException，返回0
     * 
     * @param str
     *            需要解析的数字
     * @return BigDecimal
     */
    public static BigDecimal valueOf(String str) {
        return valueOf(str, ZERO);
    }

    /**
     * 解析String为BigDecimal，如果str为空返回0，如果抛出NumberFormatException，返回default
     * 
     * @param str
     *            需要解析的数字
     * @param defaultValue
     * @return BigDecimal
     */
    public static BigDecimal valueOf(String str, BigDecimal defaultValue) {
        if (StringUtils.isEmpty(str)) {
            return defaultValue;
        }
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException ex) {
            return defaultValue;
        }
    }

    /**
     * 解析String，小数位控制
     * 
     * @param str
     * @param scale
     * @return
     */
    public static String valueOfScale(String str, int scale) {
        if (StringUtils.isBlank(str)) {
            return str;
        }
        try {
            BigDecimal propertyDecimal = new BigDecimal(str);
            propertyDecimal = BigDecimalUtils.setScale(scale, propertyDecimal);
            return propertyDecimal.toString();
        } catch (NumberFormatException ex) {
            return str;
        }
    }
    /**
     * 返回BigDecimal对象的string表示
     * 判断如果是jdk1.5或以上调用toPlainString方法，否则调用toString方法
     * 因程序有可能运行在jdk1.4版本中，所以用反射方式调用
     * @param bd
     * @return
     */
    @SuppressWarnings("all")
	public static String toString(BigDecimal bd) {
    	if(bd==null) return null;
    	String version = System.getProperty("java.version");
    	version = version.replaceAll("\\.", "");
    	if(version.length()>3) {
    		version = version.substring(0,3);
    	}
    	Integer ver = new Integer(version);
    	if(ver.intValue()<150) return bd.toString();
    	try {
    		Class c = Class.forName("java.math.BigDecimal");
    		Method m = c.getMethod("toPlainString", null);
    		Object o = m.invoke(bd, null);
    		return (String)o;
		} catch (Exception e) {
			log.error(e.getMessage());
		}
    	return bd.toString();
    }
    
    public static String format(BigDecimal decimal, String pattern) {
        double dd = decimal.doubleValue();
        if (dd == 0) {
            return decimal.toString();
        }
        DecimalFormat format = new DecimalFormat(pattern);
        return format.format(dd).toString();
    }
}
