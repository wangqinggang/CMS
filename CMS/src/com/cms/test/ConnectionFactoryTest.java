/**
 * ConnectionFactoryTest.java Version 1.0.0 Created on 2017年6月29日 Copyright Wangqingang
 *
 */
package com.cms.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.cms.util.ConnectionFactory;

public class ConnectionFactoryTest {

	/**
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		ConnectionFactory cFactory = ConnectionFactory.getInstance();
		Connection connection = cFactory.makeConnection();
		System.out.println(connection.getAutoCommit());

	}

}
