/**
 * UserDaoTest.java Version 1.0.0 Created on 2017年7月3日 Copyright Wangqingang
 *
 */
package com.cms.test;

import java.sql.Connection;

import com.cms.dao.UserDao;
import com.cms.dao.impl.UserDaoImpl;
import com.cms.entity.User;
import com.cms.util.ConnectionFactory;

public class UserDaoTest {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getInstance().makeConnection();
			connection.setAutoCommit(false);

			UserDao userDao = new UserDaoImpl();
			User tom = new User();


			userDao.save(connection, tom);
			connection.commit();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}
}
