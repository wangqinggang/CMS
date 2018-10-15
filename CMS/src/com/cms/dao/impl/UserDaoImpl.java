/**
 * UserDaoImpl.java Version 1.0.0 Created on 2017年7月3日 Copyright Wangqingang
 *
 */
package com.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cms.dao.UserDao;
import com.cms.entity.User;
import com.cms.util.ConnectionFactory;


public class UserDaoImpl implements UserDao {


	@Override
	public boolean save(Connection connection, User user) throws SQLException {
		PreparedStatement pStatement = connection
				.prepareCall("INSERT INTO user(user_name,user_pwd,reg_date)VALUES (?,?,?)");
		// 获取当前时间
		Date time = new java.sql.Date(new Date().getTime());

		DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 创建一个格式化日期对象
		String punchTime = simpleDateFormat.format(time); // 格式化后的时间
		pStatement.setString(1, user.getUser_name());
		pStatement.setString(2, user.getUser_pwd());
		pStatement.setString(3, punchTime);
		int set = pStatement.executeUpdate();
		pStatement.close();
		if (set != 0) {
			return true;
		}
		return false;

	}
	// connection.prepareCall(updateSql)与connection.prepareCall区别



	@Override
	public boolean delete(Connection connection, User user) throws SQLException {
		PreparedStatement pStatement = connection.prepareStatement("DELETE FROM user WHERE id=?");

		pStatement.setInt(1, user.getUser_id());
		int s = pStatement.executeUpdate();

		if (s != 0) {
			return true;
		}
		return false;


	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cms.dao.UserDao#updateById(java.sql.Connection, java.lang.Long, com.cms.entity.User)
	 */
	@Override
	public boolean updateById(Connection connection, User user) throws SQLException {
		String sql = "update user set user_name=? ,user_pwd=? where user_id=?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, user.getUser_name());
		pStatement.setString(2, user.getUser_pwd());
		pStatement.setInt(3, user.getUser_id());
		int s = pStatement.executeUpdate();
		if (s != 0) {
			return true;
		}
		return false;

	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cms.dao.UserDao#getAll(java.sql.Connection)
	 */
	@Override
	public List<User> getAll(Connection connection) throws SQLException {
		String sql = "select * from user";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		ResultSet rSet = pStatement.executeQuery();
		List<User> listUser = new ArrayList<User>();
		while (rSet.next()) {

			User user = new User();
			user.setUser_id(rSet.getInt(1));
			user.setUser_name(rSet.getString(2));
			user.setUser_pwd(rSet.getString(3));
			user.setReg_date(rSet.getDate(5));
			user.setLast_login_date(rSet.getDate(6));
			user.setIscomment(rSet.getBoolean(7));
			user.setIsvote(rSet.getBoolean(8));
			listUser.add(user);
		}
		connection.close();
		return listUser;

	}



	/*
	 * 验证用户登录
	 * 
	 * @see com.cms.dao.UserDao#validate(java.sql.Connection, com.cms.entity.User)
	 */
	@Override
	public boolean validate(Connection connection, User user) throws SQLException {

		connection = ConnectionFactory.getInstance().makeConnection();
		String sql = "SELECT  * FROM user WHERE user_name = ? AND user_pwd = ?;";
		PreparedStatement pStatement = connection.prepareStatement(sql);

		pStatement.setString(1, user.getUser_name());
		pStatement.setString(2, user.getUser_pwd());
		ResultSet rSet = pStatement.executeQuery();
		if (rSet.next()) {
			return true;
		} else {
			return false;
		}
	}

}
