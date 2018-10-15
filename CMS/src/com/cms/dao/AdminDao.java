/**
 * AdminDao.java Version 1.0.0 Created on 2017年7月5日 Copyright Wangqingang
 *
 */
package com.cms.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.cms.entity.Admin;

public interface AdminDao {
	/**
	 * 增加一条用户记录
	 * 
	 * @param connection
	 * @param admin
	 * @return
	 * @throws SQLException
	 */
	public boolean save(Connection connection, Admin admin) throws SQLException;

	/**
	 * 根据用户id修改某一条记录
	 * 
	 * @param connection
	 * @param id
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	public boolean updateById(Connection connection, Admin admin) throws SQLException;

	/**
	 * 根据id删除某一条用户记录
	 * 
	 * @param connection
	 * @param user
	 * @throws SQLException
	 */
	public boolean delete(Connection connection, int id) throws SQLException;

	/**
	 * 得到数据库中所有用户数据
	 * 
	 * @param connection
	 * @throws SQLException
	 */
	public List<Admin> getAll() throws SQLException;

	/**
	 * 验证用户权限
	 * 
	 * @param connection
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	public boolean validate(Connection connection, Admin admin) throws SQLException;

	/**
	 * 通过Id获取要修改的管理员信息
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public Admin getById(int id) throws SQLException;
}
