/**
 * modifyAdminServletTest.java Version 1.0.0 Created on 2017年7月6日 Copyright Wangqingang
 *
 */
package com.cms.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.cms.dao.AdminDao;
import com.cms.dao.impl.AdminDaoImpl;
import com.cms.entity.Admin;
import com.cms.util.ConnectionFactory;


public class modifyAdminServletTest {

	@Test
	public void test() {
		Admin admin = new Admin();
		AdminDao aDao = new AdminDaoImpl();
		int id = 6;
		admin.setAdmin_name("root8");
		admin.setAdmin_pwd("123");
		admin.setAdmin_right(false);
		try {
			aDao.updateById(admin);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
