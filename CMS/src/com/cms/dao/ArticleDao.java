/**
 * ArticleDao.java Version 1.0.0 Created on 2017年7月6日 Copyright Wangqingang
 *
 */
package com.cms.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.cms.entity.Article;

public interface ArticleDao {

	/**
	 * 增加一条用户记录
	 * 
	 * @param connection
	 * @param admin
	 * @return
	 * @throws SQLException
	 */
	public boolean save(Connection connection, Article article) throws SQLException;

	/**
	 * 根据文章id修改某一条记录
	 * 
	 * @param connection
	 * @param id
	 * @param user
	 * @return
	 * @throws SQLException
	 */
	public boolean updateById(Connection connection, Article article) throws SQLException;

	/**
	 * 根据id删除某一篇文章
	 * 
	 * @param connection
	 * @param user
	 * @throws SQLException
	 */
	public boolean delete(Connection connection, int id) throws SQLException;

	/**
	 * 得到数据库中所有文章数据
	 * 
	 * @param connection
	 * @throws SQLException
	 */
	public List<Article> getAll() throws SQLException;

	/**
	 * 通过Id获取要修改的文章信息
	 * 
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public Article getById(int id) throws SQLException;
}
