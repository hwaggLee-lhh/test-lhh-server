package com.hwaggLee.crawler.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

public class HttpClientLoginUtil {
	private String userName = "";

	private String password = "";

	String tmpcookies = "";

	private static String redirectURL = "http://i.taobao.com/my_taobao.htm";

	private static String loginURL = "https://login.taobao.com/member/login.jhtml";

	private HttpResponse response;

	private DefaultHttpClient httpclient = null;

	private String redirectLocation = null;

	private String defaultContent = null;

	public HttpClientLoginUtil(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public void printInfo(String info) {
		System.out.println(info);
	}

	public void printError(String info) {
		System.out.println(info);
	}

	@SuppressWarnings("deprecation")
	public boolean login() {
		printInfo("开始登陆。。。");
		if (httpclient != null) {
			System.out.println("已经登陆成功");
			return true;
		}
		httpclient = null;
		httpclient = new DefaultHttpClient();
		HttpPost httpost = new HttpPost(loginURL);
		// All the parameters post to the web site
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("origURL", redirectURL));
		nvps.add(new BasicNameValuePair("autoLogin", "true"));
		nvps.add(new BasicNameValuePair("TPL_username", userName));
		nvps.add(new BasicNameValuePair("TPL_password", password));
		try {
			httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
			response = httpclient.execute(httpost);
		} catch (Exception e) {
			printError("登录失败");
			e.printStackTrace();
			return false;
		} finally {
			httpost.abort();
		}
		Header[] hs = response.getAllHeaders();
		for (Header h : hs) {
			// System.out.println(h.getName() + ":" + h.getValue());
			printInfo(h.getName() + ":" + h.getValue());
		}
		redirectLocation = getRedirectLocation();
		redirectLocation = "http://i.taobao.com/my_taobao.htm";
		if (getToken() == null) {
			System.out.println("登录失败");
			return false;
		}
		List<org.apache.http.cookie.Cookie> cookies = httpclient.getCookieStore().getCookies();// 取出登陆成功后，服务器返回的cookies信息，里面保存了服务器端给的“临时证”
		tmpcookies = "";
		for (int i = 0; i < cookies.size(); i++) {
			org.apache.http.cookie.Cookie c = cookies.get(i);
			tmpcookies = tmpcookies + c.getName() + "=" + c.getValue() + ";";
			// System.out.println(c);
		}
		printInfo("完成登陆");
		return true;
	}

	private String getRedirectLocation() {
		Header locationHeader = response.getFirstHeader("Location");
		if (locationHeader == null) {
			return null;
		}
		return locationHeader.getValue();
	}

	public String getToken() {
		String retu = getText(redirectLocation);
		String requesttoken = null;
		int start = retu.indexOf("查看余额");// 这里要改一下，看一下登录成功后页面有什么内容，以区分是否成功登录，以前淘宝登录后可以使用"查看余额"区分，貌似现在不行了
		if (start != -1) {
			requesttoken = "success";
			defaultContent = retu;
		}
		return requesttoken;
	}

	private String getText(String redirectLocation) {
		HttpGet httpget = new HttpGet(redirectLocation);
		// Create a response handler
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		String responseBody = "";
		try {
			responseBody = httpclient.execute(httpget, responseHandler);
		} catch (Exception e) {
			e.printStackTrace();
			responseBody = null;
		} finally {
			httpget.abort();
		}
		// System.out.println(responseBody);
		return responseBody;
	}

	public String getDefaultContent() {
		return defaultContent;
	}

	@SuppressWarnings("deprecation")
	public boolean logout() {
		printInfo("开始退出。。。");
		if (login()) {
			String logoutUrl = "退出登录的url";
			HttpPost httpost = new HttpPost(logoutUrl);
			List<NameValuePair> nvps2 = new ArrayList<NameValuePair>();
			try {
				httpost.setEntity(new UrlEncodedFormEntity(nvps2, HTTP.UTF_8));
				response = httpclient.execute(httpost);
				// System.out.println("退出状态 " + response.getStatusLine());
				httpost.abort();
			} catch (Exception e) {
				printError("退出失败");
				e.printStackTrace();
				return false;
			} finally {
				httpost.abort();
				httpclient.getConnectionManager().shutdown();
			}
		}
		printInfo("完成退出");
		return true;
	}

	public String getBoughtList() {
		printInfo("开始截取[已买到的宝贝]页面数据。。。");
		// HttpGet httpget = new HttpGet(
		// "http://trade.taobao.com/trade/itemlist/list_bought_items.htm");
		HttpGet httpget = new HttpGet("http://trade.taobao.com/trade/itemlist/listBoughtItems.htm?action=itemlist/QueryAction&event_submit_do_query=1&clickMore=0&pageNum=6");
		httpget.setHeader("cookie", tmpcookies);
		
		// Create a response handler
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		String responseBody = null;
		try {
			responseBody = httpclient.execute(httpget, responseHandler);
		} catch (ClientProtocolException e) {
			printError("截取[已买到的宝贝]页面数据失败");
			e.printStackTrace();
		} catch (IOException e) {
			printError("截取[已买到的宝贝]页面数据失败");
			e.printStackTrace();
		} finally {
			httpget.abort();
		}
		printInfo("完成截取[已买到的宝贝]页面数据");
		return responseBody;
	}

	public String getUrlContent(String url) {
		printInfo("开始截取菜单项页面数据。。。");
		HttpGet httpget = new HttpGet(url);
		httpget.setHeader("cookie", tmpcookies);
		// Create a response handler
		ResponseHandler<String> responseHandler = new BasicResponseHandler();
		String responseBody = null;
		try {
			responseBody = httpclient.execute(httpget, responseHandler);
		} catch (ClientProtocolException e) {
			printError("截取页面数据失败");
			e.printStackTrace();
		} catch (IOException e) {
			printError("截取页面数据失败");
			e.printStackTrace();
		} finally {
			httpget.abort();
		}
		printInfo("完成截取菜单项页面数据");
		return responseBody;
	}

	public static void main(String[] args) {
		HttpClientLoginUtil taobao = new HttpClientLoginUtil("18616818966", "li243573295");
		taobao.login();
		taobao.getBoughtList();
		// taobao.logout();
	}
}
