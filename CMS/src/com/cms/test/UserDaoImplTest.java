/**
 * UserDaoImplTest.java Version 1.0.0 Created on 2017年7月5日 Copyright Wangqingang
 *
 */
package com.cms.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.cms.dao.AdminDao;
import com.cms.dao.UserDao;
import com.cms.dao.impl.AdminDaoImpl;
import com.cms.dao.impl.UserDaoImpl;
import com.cms.entity.Admin;
import com.cms.entity.User;
import com.cms.util.ConnectionFactory;


public class UserDaoImplTest {
	@Test
	public void test() {
		UserDao uDao = new UserDaoImpl();
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		User user = new User();
		user.setUser_name("user1");
		user.setUser_pwd("123");
		try {
			System.out.println(uDao.validate(connection, user));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test2() {
		AdminDao aDao = new AdminDaoImpl();
		Admin admin;
		try {
			admin = aDao.getById(1);
			System.out.println(admin.getAdmin_name());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
