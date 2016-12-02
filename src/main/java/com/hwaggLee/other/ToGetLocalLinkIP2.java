package com.hwaggLee.other;

import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * @author suzhw<br>
 *         日期：2014-10-14<br>
 *         功能：根据启动并运行的网卡名称，找到本机实际的IP地址(已知当前运行的无线网卡名包含“wireless”字段)<br>
 *         版权：版权所有(C) 2014，suzhw<br>
 * @version v0.1
 * @see
 */
public class ToGetLocalLinkIP2 {
	public static void main(String[] args) throws Exception {
		System.out.println("开始");
		Enumeration<NetworkInterface> en = NetworkInterface
				.getNetworkInterfaces();
		while (en.hasMoreElements()) {
			NetworkInterface ni = en.nextElement();
			printParameter(ni);

		}
		System.out.println("结束");
	}

	public static void printParameter(NetworkInterface ni)
			throws SocketException {
		//if (null != ni.getDisplayName() && ni.getDisplayName().contains("eth0") && ni.isUp()) {
			System.out.println(" Name = " + ni.getName());
			System.out.println(" Display Name = " + ni.getDisplayName());
			System.out.println(" Is up = " + ni.isUp());
			System.out
					.println(" Support multicast = " + ni.supportsMulticast());
			System.out.println(" Is loopback = " + ni.isLoopback());
			System.out.println(" Is virtual = " + ni.isVirtual());
			System.out.println(" Is point to point = " + ni.isPointToPoint());
			System.out
					.println(" Hardware address = " + ni.getHardwareAddress());
			System.out.println(" MTU = " + ni.getMTU());

			System.out.println("\nList of Interface Addresses:");
			List<InterfaceAddress> list = ni.getInterfaceAddresses();
			Iterator<InterfaceAddress> it = list.iterator();

			while (it.hasNext()) {
				InterfaceAddress ia = it.next();
				if(null!=ia.getBroadcast()){
					System.out.println(" 本机实际联网网卡IPv4地址： " + ia.getAddress().getHostAddress());
				}
			}

			System.out
					.println("**************************************************");
		//}
	}
}
