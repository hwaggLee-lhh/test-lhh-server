package com.base.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;

public class EditorUtils {
    
    public static void convertObj(HttpServletRequest req, Object obj) {
        ServletRequestDataBinder binder = getBinder(obj);
        binder.bind(req);
    }
    
    public static void convertObjWithDate(HttpServletRequest req, Object obj) {
        ServletRequestDataBinder binder = getBinder(obj);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
        binder.bind(req);
    }
    
    public static void convertObjWithDateTime(HttpServletRequest req, Object obj) {
        ServletRequestDataBinder binder = getBinder(obj);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
        binder.bind(req);
    }
    
    private static ServletRequestDataBinder getBinder(Object obj) {
        ServletRequestDataBinder binder = new ServletRequestDataBinder(obj);
        return binder;
    }
}
