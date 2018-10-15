/**
 * ChannelDao.java Version 1.0.0 Created on 2017年7月6日 Copyright Wangqingang
 *
 */
package com.cms.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.cms.entity.Channel;

public interface ChannelDao {
	/**
	 * 增加一条栏目
	 * 
	 * @param connection
	 * @param admin
	 * @return
	 * @throws SQLException
	 */
	public boolean save(Connection connection, Channel channel) throws SQLException;

	/**
	 * 根据栏目id修改某一条记录
	 * 
	 * @param connection
	 * @param id
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	public boolean updateById(Connection connection, Channel channel) throws SQLException;

	/**
	 * 根据栏目id删除某一条栏目
	 * 
	 * @param connection
	 * @param user
	 * @throws SQLException
	 */
	public boolean delete(Connection connection, int id) throws SQLException;

	/**
	 * 得到数据库中所有栏目数据
	 * 
	 * @param connection
	 * @throws SQLException
	 */
	public List<Channel> getAll() throws SQLException;

	/**
	 * 通过Id获取要修改的管理员信息
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public Channel getById(int id) throws SQLException;
}
