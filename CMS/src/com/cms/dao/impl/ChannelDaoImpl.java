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

import com.cms.dao.ChannelDao;
import com.cms.entity.Channel;
import com.cms.util.ConnectionFactory;

public class ChannelDaoImpl implements ChannelDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cms.dao.AdminDao#save(java.sql.Connection, com.cms.entity.Admin)
	 */
	@Override
	public boolean save(Connection connection, Channel channel) throws SQLException {
		String sql = "insert into channel(channel_name) values(?)";

		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, channel.getChannel_name());
		int set = pStatement.executeUpdate();
		pStatement.close();
		if (set != 0) {
			return true;
		}
		return false;

	}

	/*
	 * 通过传入栏目id修改栏目信息
	 * 
	 * @see com.cms.dao.AdminDao#updateById(java.sql.Connection, java.lang.Long,
	 * com.cms.entity.Admin)
	 */
	@Override
	public boolean updateById(Connection connection, Channel channel) throws SQLException {
		String sql = "update channel set channel_name=? where channel_id=?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, channel.getChannel_name());
		pStatement.setInt(2, channel.getChannel_id());
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
	public boolean delete(Connection connection, int id) throws SQLException {
		String sql = "delete from channel where channel_id=?";

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
	public List<Channel> getAll() throws SQLException {
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		String sql = "select * from channel";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		ResultSet rSet = pStatement.executeQuery();
		List<Channel> listChannel = new ArrayList<Channel>();
		while (rSet.next()) {

			Channel channel = new Channel();
			channel.setChannel_id(rSet.getInt(1));
			channel.setChannel_name(rSet.getString(2));
			channel.setIsparent(rSet.getBoolean(3));
			channel.setIsshow(rSet.getBoolean(4));
			channel.setParent(rSet.getShort(5));
			listChannel.add(channel);
		}
		connection.close();
		return listChannel;
	}



	/*
	 * (non-Javadoc) 根据管理员id修改管理员信息
	 * 
	 * @see com.cms.dao.AdminDao#getById(int)
	 */
	@Override
	public Channel getById(int id) throws SQLException {
		String sql = "SELECT * FROM channel WHERE channel_id = ?";
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setInt(1, id);
		ResultSet rSet = pStatement.executeQuery();
		Channel channel = new Channel();
		if (rSet.next()) {
			channel.setChannel_id(rSet.getInt(1));
			channel.setChannel_name(rSet.getString(2));
			channel.setIsparent(rSet.getBoolean(3));
			channel.setIsshow(rSet.getBoolean(4));
			channel.setParent(rSet.getShort(5));
		}
		connection.close();

		return channel;
	}


}
