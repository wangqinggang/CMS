/**
 * AdminDaoImpl.java Version 1.0.0 Created on 2017年7月5日 Copyright Wangqingang
 *
 */
package com.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cms.dao.AdminDao;
import com.cms.entity.Admin;
import com.cms.util.ConnectionFactory;

public class AdminDaoImpl implements AdminDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cms.dao.AdminDao#save(java.sql.Connection, com.cms.entity.Admin)
	 */
	@Override
	public boolean save(Admin admin) throws SQLException {
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		
		String sql = "insert into admin(admin_name,admin_pwd) values(?,?)";

		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, admin.getAdmin_name());
		pStatement.setString(2, admin.getAdmin_pwd());
		int set = pStatement.executeUpdate();
		connection.close();
		pStatement.close();
		if (set != 0) {
			return true;
		}
		connection.close();
		return false;

	}

	/*
	 * 通过传入管理员id修改当前管理员信息
	 * 
	 * @see com.cms.dao.AdminDao#updateById(java.sql.Connection, java.lang.Long,
	 * com.cms.entity.Admin)
	 */
	@Override
	public boolean updateById(Admin admin) throws SQLException {
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		String sql = "update admin set admin_name=? ,admin_pwd=?,admin_right=? where admin_id=?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, admin.getAdmin_name());
		pStatement.setString(2, admin.getAdmin_pwd());
		pStatement.setBoolean(3, admin.getAdmin_right());
		pStatement.setInt(4, admin.getAdmin_id());
		int s = pStatement.executeUpdate();
		if (s != 0) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cms.dao.AdminDao#delete(java.sql.Connection, com.cms.entity.Admin)
	 */
	@Override
	public boolean delete(int id) throws SQLException {
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		String sql = "delete from admin where admin_id=?";

		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setInt(1, id);
		int s = pStatement.executeUpdate();

		if (s != 0) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cms.dao.AdminDao#getAll(java.sql.Connection)
	 */
	@Override
	public List<Admin> getAll() throws SQLException {
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		String sql = "select * from admin";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		ResultSet rSet = pStatement.executeQuery();
		List<Admin> listAdmin = new ArrayList<Admin>();
		while (rSet.next()) {

			Admin admin = new Admin();
			admin.setAdmin_id(rSet.getInt(1));
			admin.setAdmin_name(rSet.getString(2));
			admin.setAdmin_pwd(rSet.getString(3));
			admin.setAdmin_right(rSet.getBoolean(4));
			listAdmin.add(admin);
		}
		connection.close();
		return listAdmin;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cms.dao.AdminDao#validate(java.sql.Connection, com.cms.entity.Admin)
	 */
	@Override
	public boolean validate(Admin admin) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		connection = ConnectionFactory.getInstance().makeConnection();
		String sql = "SELECT  * FROM admin WHERE admin_name = ? AND admin_pwd = ?;";
		PreparedStatement pStatement = connection.prepareStatement(sql);

		pStatement.setString(1, admin.getAdmin_name());
		pStatement.setString(2, admin.getAdmin_pwd());
		ResultSet rSet = pStatement.executeQuery();
		if (rSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * (non-Javadoc) 根据管理员id修改管理员信息
	 * 
	 * @see com.cms.dao.AdminDao#getById(int)
	 */
	@Override
	public Admin getById(int id) throws SQLException {
		String sql = "SELECT * FROM admin WHERE admin_id = ?";
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setInt(1, id);
		ResultSet rSet = pStatement.executeQuery();
		Admin admin = new Admin();
		if (rSet.next()) {
			admin.setAdmin_id(rSet.getInt(1));
			admin.setAdmin_name(rSet.getString(2));
			admin.setAdmin_pwd(rSet.getString(3));
			admin.setAdmin_right(rSet.getBoolean(4));
		}
		connection.close();

		return admin;
	}


}
