package com.hwaggLee.qdyx.tsmarket;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

public class StartTsmarketTest {

	public static void main(String[] args) {
		StartTsmarketTest t = new StartTsmarketTest();
		t.testConnection();
	}
	
	private void testConnection(){
		try {
			String hostName = "218.1.111.62";
			int bindPort = 10001;
			NioSocketConnector connector = new NioSocketConnector();
	        DefaultIoFilterChainBuilder chain = connector.getFilterChain();
	        chain.addLast("objectFilter", new ProtocolCodecFilter(new HCoderFactory(Charset.forName("UTF-8"))));
	        MinaHandlerCallback handler = new MinaHandlerCallback();
	        connector.setHandler(handler);
	        connector.getSessionConfig().setUseReadOperation(true);
	        ConnectFuture cf = connector.connect(new InetSocketAddress(hostName, bindPort));
	        cf.awaitUninterruptibly();
	        IoSession session =  cf.getSession();
	        session.write( "1001\n");//1001,1002,1003,1004,9999
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
