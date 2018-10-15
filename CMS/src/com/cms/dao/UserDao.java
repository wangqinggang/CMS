/**
 * UserDao.java Version 1.0.0 Created on 2017年7月3日 Copyright Wangqingang
 *
 */
package com.cms.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.cms.entity.User;

public interface UserDao {

	/**
	 * 增加一条用户记录
	 * 
	 * @param connection
	 * @param user
	 * @throws SQLException
	 */
	public boolean save(Connection connection, User user) throws SQLException;

	/**
	 * 根据用户id修改某一条记录
	 * 
	 * @param connection
	 * @param id
	 * @param user
	 * @throws SQLException
	 */
	public boolean updateById(Connection connection, User user) throws SQLException;

	/**
	 * 删除某一条用户记录
	 * 
	 * @param connection
	 * @param user
	 * @throws SQLException
	 */
	public boolean delete(Connection connection, User user) throws SQLException;

	/**
	 * 得到数据库中所有用户数据
	 * 
	 * @param connection
	 * @throws SQLException
	 */
	public List<User> getAll(Connection connection) throws SQLException;

	/**
	 * 验证用户权限
	 * 
	 * @param connection
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	public boolean validate(Connection connection, User user) throws SQLException;
}
