package com.hwaggLee.crawler.client;

import java.beans.PropertyDescriptor;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;

public class HttpRequestor {
	private static final Logger logger = Logger.getLogger(HttpRequestor.class);

	public static void main(String[] args) throws Exception {
		/*
		 * HttpUmeng umeng = new HttpUmeng();
		 * System.out.println(umeng.getAuth_token());
		 */
	}

	private static Integer connectTimeout = null;
	private static Integer socketTimeout = null;
	private static String proxyHost = null;
	private static Integer proxyPort = null;

	/**
	 * Do GET request
	 * 
	 * @param url
	 * @param charset
	 *            ：（默认）utf-8
	 * @param contentType
	 *            ：（默认）application/x-www-form-urlencoded
	 * @return
	 * @throws Exception
	 * @throws IOException
	 */
	public static String doGet(String url, String charset, String contentType) {
		if (StringUtils.isBlank(url))
			return null;
		if (StringUtils.isBlank(charset))
			charset = "utf-8";
		if (StringUtils.isBlank(contentType))
			contentType = "application/x-www-form-urlencoded";
		logger.info("-------start-------request.get.http:" + url);

		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader reader = null;
		StringBuffer resultBuffer = new StringBuffer();
		String tempLine = null;
		try {
			URL localURL = new URL(url);
			URLConnection connection = openConnection(localURL);
			HttpURLConnection httpURLConnection = (HttpURLConnection) connection;
			httpURLConnection.setRequestProperty("Accept-Charset", charset);
			httpURLConnection.setRequestProperty("Content-Type", contentType);
			if (httpURLConnection.getResponseCode() >= 300) {
				logger.error("HTTP Request is not success, Response code is "+ httpURLConnection.getResponseCode());
			}
			inputStream = httpURLConnection.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream);
			reader = new BufferedReader(inputStreamReader);

			while ((tempLine = reader.readLine()) != null) {
				resultBuffer.append(tempLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (inputStreamReader != null) {
				try {
					inputStreamReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		//System.out.println(resultBuffer.toString());
		logger.info("------end--------request.get");
		return resultBuffer.toString();
	}

	/**
	 * Do POST request
	 * 
	 * @param url
	 * @param parameterMap
	 * @param charset
	 *            ：（默认）utf-8
	 * @param contentType
	 *            ：（默认）application/x-www-form-urlencoded
	 * @return
	 * @throws Exception
	 */
	public static String doPost(String url, Map<String, String> parameterMap,
			String charset, String contentType) {
		if (StringUtils.isBlank(charset))
			charset = "utf-8";
		if (StringUtils.isBlank(contentType))
			contentType = "application/x-www-form-urlencoded";
		logger.info("-------start-------request.post.http:" + url + "?"
				+ parameterMap.toString());

		StringBuffer parameterBuffer = new StringBuffer();
		if (parameterMap != null) {
			Iterator<String> iterator = parameterMap.keySet().iterator();
			String key = null;
			String value = null;
			while (iterator.hasNext()) {
				key = iterator.next();
				value = parameterMap.get(key);
				parameterBuffer.append(key).append("=")
						.append(value == null ? "" : value);
				if (iterator.hasNext()) {
					parameterBuffer.append("&");
				}
			}
		}

		OutputStream outputStream = null;
		OutputStreamWriter outputStreamWriter = null;
		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader reader = null;
		StringBuffer resultBuffer = new StringBuffer();
		String tempLine = null;
		try {
			URL localURL = new URL(url);
			URLConnection connection = openConnection(localURL);
			HttpURLConnection httpURLConnection = (HttpURLConnection) connection;

			httpURLConnection.setDoOutput(true);
			httpURLConnection.setRequestMethod("POST");
			httpURLConnection.setRequestProperty("Accept-Charset", charset);
			httpURLConnection.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");
			httpURLConnection.setRequestProperty("Content-Length",
					String.valueOf(parameterBuffer.length()));
			outputStream = httpURLConnection.getOutputStream();
			outputStreamWriter = new OutputStreamWriter(outputStream);
			outputStreamWriter.write(parameterBuffer.toString());
			outputStreamWriter.flush();

			if (httpURLConnection.getResponseCode() >= 300) {
				throw new Exception(
						"HTTP Request is not success, Response code is "
								+ httpURLConnection.getResponseCode());
			}
			inputStream = httpURLConnection.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream);
			reader = new BufferedReader(inputStreamReader);

			while ((tempLine = reader.readLine()) != null) {
				resultBuffer.append(tempLine);
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			if (outputStreamWriter != null) {
				try {
					outputStreamWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (inputStreamReader != null) {
				try {
					inputStreamReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		//System.out.println(resultBuffer.toString());
		logger.info("------end--------request.post");
		return resultBuffer.toString();
	}

	private static URLConnection openConnection(URL localURL)
			throws IOException {
		URLConnection connection;
		if (proxyHost != null && proxyPort != null) {
			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(
					proxyHost, proxyPort));
			connection = localURL.openConnection(proxy);
		} else {
			connection = localURL.openConnection();
		}
		renderRequest(connection);
		return connection;
	}

	/**
	 * Render request according setting
	 * 
	 * @param request
	 */
	private static void renderRequest(URLConnection connection) {

		if (connectTimeout != null) {
			connection.setConnectTimeout(connectTimeout);
		}

		if (socketTimeout != null) {
			connection.setReadTimeout(socketTimeout);
		}

	}

	/*
	 * Getter & Setter
	 */
	public Integer getConnectTimeout() {
		return connectTimeout;
	}

	public void setConnectTimeout(Integer connectTimeout) {
		HttpRequestor.connectTimeout = connectTimeout;
	}

	public Integer getSocketTimeout() {
		return socketTimeout;
	}

	public void setSocketTimeout(Integer socketTimeout) {
		HttpRequestor.socketTimeout = socketTimeout;
	}

	public String getProxyHost() {
		return proxyHost;
	}

	public void setProxyHost(String proxyHost) {
		HttpRequestor.proxyHost = proxyHost;
	}

	public Integer getProxyPort() {
		return proxyPort;
	}

	public void setProxyPort(Integer proxyPort) {
		HttpRequestor.proxyPort = proxyPort;
	}

	/**
	 * 打印class模型
	 * 
	 * @param str
	 */
	@SuppressWarnings("unchecked")
	public static void printClassObject(JSONObject object) {
		if (object == null)
			return;
		Set<String> set = object.keySet();
		System.out.println("private static final long serialVersionUID = 1L;");
		System.out.println("private String idStr;");
		for (String key : set) {
			if (StringUtils.isBlank(key))
				continue;
			Object ob = object.get(key);
			String className = "String";
			if (ob instanceof Integer) {
				className = "Integer";
			}else if(ob instanceof Boolean){
				className = "Boolean";
			}else if(ob instanceof Double){
				className = "Double";
			}
			System.out.println("private "+className+" " + key + ";");
		}

		System.out.println("public String getIdStr(){");
		System.out.println("  return idStr;");
		System.out.println("}");
		System.out.println("public void setIdStr(String idStr){");
		System.out.println("  this.idStr=idStr;");
		System.out.println("}");
		
		for (String key : set) {
			if (StringUtils.isBlank(key))continue;
			String k = (key.substring(0, 1).toUpperCase() + key.substring(1));
			StringBuilder sb = new StringBuilder();
			Object ob = object.get(key);
			String className = "String";
			if (ob instanceof Integer) {
				className = "Integer";
			}else if(ob instanceof Boolean){
				className = "Boolean";
			}else if(ob instanceof Double){
				className = "Double";
			}
			sb.append("public "+className+" get" + k + "(){");
			sb.append("\n");
			sb.append("	return " + key + ";");
			sb.append("\n");
			sb.append("}");
			sb.append("\n");
			sb.append("public void set" + k + "("+className+" " + key + "){");
			sb.append("\n");
			sb.append("	this." + key + "=" + key + ";");
			sb.append("\n");
			sb.append("}");
			sb.append("\n");
			System.out.println(sb.toString());
		}
	}

	/**
	 * 打印class模型
	 * 
	 * @param str
	 */
	public static void printClassArray(JSONArray array) {
		if (array == null || array.size() == 0)
			return;
		printClassObject(array.getJSONObject(0));
	}

	public static <T> T createInstance(Class<T> cls) {
		try {
			return cls.newInstance();
		} catch (InstantiationException ex) {
			throw new IllegalArgumentException(ex.getMessage());
		} catch (IllegalAccessException ex) {
			throw new IllegalArgumentException(ex.getMessage());
		}
	}

	public static <T> T convertObj(JSONObject jsonObj, Class<T> cls) {
		T obj = createInstance(cls);
		convertObj(jsonObj, obj);
		return obj;
	}

	public static <T> List<T> convertObj(JSONArray jsonArray, Class<T> cls) {
		List<T> list = new LinkedList<T>();
		for (Iterator iterator = jsonArray.iterator(); iterator.hasNext();) {
			JSONObject jsonObj = (JSONObject) iterator.next();
			list.add(convertObj(jsonObj, cls));
		}
		return list;
	}

	public static void convertObj(JSONObject jsonObj, Object obj) {
		PropertyDescriptor[] pds = BeanUtils.getPropertyDescriptors(obj
				.getClass());
		for (int i = 0; i < pds.length; i++) {
			PropertyDescriptor pd = pds[i];
			if (jsonObj.containsKey(pd.getName())&& pd.getPropertyType() == String.class) {
				invokeSetMethod(obj, pd.getWriteMethod(),
						jsonObj.get(pd.getName()));
			} else if (jsonObj.containsKey(pd.getName())&& pd.getPropertyType() == Integer.class) {
				invokeSetMethod(obj, pd.getWriteMethod(),jsonObj.get(pd.getName()));
			}else if (jsonObj.containsKey(pd.getName())&& pd.getPropertyType() == Double.class) {
				invokeSetMethod(obj, pd.getWriteMethod(),jsonObj.get(pd.getName()));
			}
		}
	}

	public static void invokeSetMethod(Object object, Method method,
			Object value) {
		try {
			method.invoke(object, new Object[] { value });
		} catch (IllegalAccessException ex) {
			throw new IllegalArgumentException(ex.getMessage());
		} catch (InvocationTargetException ex) {
			throw new IllegalArgumentException(ex.getMessage());
		} catch (Exception ex) {
			throw new IllegalArgumentException(ex.getMessage());
		}
	}
	

	/**
	 * 图片路径
	 * @param urlPath
	 * @param fileName:图片存放地址，和名称
	 * @throws Exception
	 */
    public static void getImages(String urlPath,String fileName) throws Exception{
        URL url = new URL(urlPath);//：获取的路径
        //:http协议连接对象
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setReadTimeout(6 * 10000);
        if (conn.getResponseCode() <10000){
            InputStream inputStream = conn.getInputStream();
            byte[] data = readStream(inputStream);
            FileOutputStream outputStream = new FileOutputStream(fileName);
            outputStream.write(data);
            outputStream.close();
        }
	}
    

	/**
	 * 图片路径
	 * @param urlPath
	 * @param fileName:图片存放地址，和名称
	 * @throws Exception
	 */
    public static byte[] getImages(String urlPath) throws Exception{
        URL url = new URL(urlPath);//：获取的路径
        //:http协议连接对象
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setReadTimeout(6 * 10000);
        if (conn.getResponseCode() <10000){
            InputStream inputStream = conn.getInputStream();
            return readStream(inputStream);
        }
        return null;
	}
    
    /**
     * 读取url中数据，并以字节的形式返回
     * @param inputStream
     * @return
     * @throws Exception
     */
    public static byte[] readStream(InputStream inputStream) throws Exception{
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = -1;
        while((len = inputStream.read(buffer)) !=-1){
            outputStream.write(buffer, 0, len);
        }
        outputStream.close();
        inputStream.close();
        return outputStream.toByteArray();
    }
    
    /** 
    * 功能描述 : 检测当前URL是否可连接或是否有效, 
    * 最多连接网络 5 次, 如果 5 次都不成功说明该地址不存在或视为无效地址. 
    * 
    * @param url 
    * 指定URL网络地址 
    * 
    * @return String 
    */  
    public static boolean isConnect(String url) {  
    	int counts = 0;  
    	boolean succ = false; 
    	if (url == null || url.length() <= 0) { 
    		return false; 
    	}  
    	while (counts < 5) {  
    		try {  
    			URL urlStr = new URL(url);  
    			HttpURLConnection connection = (HttpURLConnection) urlStr.openConnection();  
    			int state = connection.getResponseCode();
    			System.out.println(state);
    			/*if (state == 200) {  
    				//succ = connection.getURL().toString();
    				return true;
    			}*/
    		} catch (Exception ex) {  
    			counts++; logger.info("loop :" + counts);  
    			continue;  
    		}  
    	}  
    	return false;  
    }  
}
