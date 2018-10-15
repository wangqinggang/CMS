/**
 * TransactionTest.java Version 1.0.0 Created on 2017年6月28日 Copyright Wangqingang
 *
 */
package com.cms.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root",
					"root");


		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;

	}

	public static void insertUserDate(Connection connection) throws SQLException {

		String sql = "INSERT INTO tbl_user(id,name,password,email)"
				+ "VALUES(10,'Tom','123456','tom@gmail.com')";
		Statement statement = connection.createStatement();
		int count = statement.executeUpdate(sql);
		System.out.println("向用户表插入了" + count + " 条记录");

	}

	public static void insertAddressData(Connection connection) throws SQLException {
		String sql = "INSERT INTO tbl_address(id,city,country,user_id)"
				+ "VALUES(1,'shanghai','china','10')";
		Statement statement = connection.createStatement();
		int count = statement.executeUpdate(sql);
		System.out.println("向地址表中插入了" + count + "条记录");

	}

	public static void main(String[] args) {
		Connection connection = null;

		try {
			connection = getConnection();
			connection.setAutoCommit(false);

			insertUserDate(connection);
			insertAddressData(connection);
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("========捕获到SQL异常=======");
			e.printStackTrace();
			try {
				connection.rollback();
				System.out.println("=========事务回滚成功！=========");
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e3) {
				// TODO: handle exception
				e3.printStackTrace();
			}
		}
	}


}
