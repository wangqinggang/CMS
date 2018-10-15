/**
 * AdminDaoTest.java Version 1.0.0 Created on 2017年7月5日 Copyright Wangqingang
 *
 */
package com.cms.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.cms.dao.AdminDao;
import com.cms.dao.impl.AdminDaoImpl;
import com.cms.entity.Admin;
import com.cms.util.ConnectionFactory;


public class AdminDaoTest {

	@Test
	public void test() {
		AdminDao aDao = new AdminDaoImpl();
		List<Admin> listAdmin = null;
		try {
			listAdmin = aDao.getAll();
			for (Admin admin : listAdmin) {
				System.out.println(admin.getAdmin_id() + " " + admin.getAdmin_name() + ""
						+ admin.getAdmin_pwd() + "" + admin.getAdmin_right());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void test2() {
		AdminDao aDao = new AdminDaoImpl();
		Admin admin = new Admin();
		admin.setAdmin_id(4);
		admin.setAdmin_name("123");
		admin.setAdmin_pwd("123");
		admin.setAdmin_right(false);
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		try {
			System.out.println("12121212");
			if (aDao.updateById(connection, admin)) {
				System.out.println("1111111");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
