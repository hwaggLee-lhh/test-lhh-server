package com.hwaggLee.qdyx.tsmarket;

import java.util.Set;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;


public class MinaHandlerCallback extends IoHandlerAdapter {
	@Override  
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {  
        cause.printStackTrace();  
    }  
  
    @Override  
    public void messageReceived(IoSession session, Object message)throws Exception {
    	System.out.println("回调成功");
    	clear(session);
    }

    
    /**
     * 清除session中的attribute
     * 解决mina通讯中内存溢出异常
     * 测试方法，未找到明确依据
     * @param session
     */
    private void clear(IoSession session) {
    	Set<Object> set = session.getAttributeKeys();
    	if(set==null || set.size()==0) return;
    	for (Object object : set) {
			if(session.containsAttribute(object)) {
				session.removeAttribute(object);
			}
		}
    }
    
    @Override  
    public void sessionCreated(IoSession session) throws Exception {
    	System.out.println("创建成功");
    }  
    @Override
    public void messageSent(IoSession session, java.lang.Object message) {
    	System.out.println("发送消息成功");
    }
    public void sessionClosed(IoSession session) throws Exception {
    	System.out.println("关闭成功");
    }
}
