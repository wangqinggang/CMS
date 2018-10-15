/**
 * ConnectionFactory.java Version 1.0.0 Created on 2017年6月29日 Copyright Wangqingang
 *
 */
package com.cms.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class ConnectionFactory {
	public static String driver;
	public static String dburl;
	public static String user;
	public static String password;

	private Connection connection = null;
	private static final ConnectionFactory factory = new ConnectionFactory();


	static {// 静态代码块，初始化类，为类的属性赋值，加载类时执行一次，初始化
		Properties properties = new Properties();// 该类用来保存属性文件中的键值对
		try {
			InputStream inputStream = ConnectionFactory.class.getClassLoader()
					.getResourceAsStream("dbconfig.properties");// 获取属性类的内容
			properties.load(inputStream);// 读取流中的键值对列表
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("=============配置文件读取错误=============");
		}
		driver = properties.getProperty("driver");
		dburl = properties.getProperty("dburl");
		user = properties.getProperty("user");
		password = properties.getProperty("password");


	}

	private ConnectionFactory() {

	}

	public static ConnectionFactory getInstance() {// 单例模式，保证程序运行期间只能有一个ConnectionFactory实例存在
		return factory;
	}

	public Connection makeConnection() {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(dburl, user, password);


		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}



}
