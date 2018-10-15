/**
 * ArticleDaoImpl.java Version 1.0.0 Created on 2017年7月6日 Copyright Wangqingang
 *
 */
package com.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cms.dao.ArticleDao;
import com.cms.entity.Article;
import com.cms.util.ConnectionFactory;


public class ArticleDaoImpl implements ArticleDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cms.dao.ArticleDao#save(java.sql.Connection, com.cms.entity.Article)
	 */
	@Override
	public boolean save(Connection connection, Article article) throws SQLException {
		String sql =
				"insert into article(title,user_id,summary,content,channel_id) values(?,?,?,?,?)";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, article.getTitle());
		pStatement.setInt(2, article.getUser_id());
		pStatement.setString(3, article.getSummary());
		pStatement.setString(4, article.getContent());
		pStatement.setInt(5, article.getChannel_id());
		int set = pStatement.executeUpdate();
		pStatement.close();
		if (set != 0) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cms.dao.ArticleDao#updateById(java.sql.Connection, com.cms.entity.Article)
	 */
	@Override
	public boolean updateById(Connection connection, Article article) throws SQLException {
		String sql =
				"update article set title=?,user_id=?,summary=?,content=?,channel_id=? where article_id=?";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setString(1, article.getTitle());
		pStatement.setInt(2, article.getUser_id());
		pStatement.setString(3, article.getSummary());
		pStatement.setString(4, article.getContent());
		pStatement.setInt(5, article.getChannel_id());
		pStatement.setInt(6, article.getArticle_id());
		int s = pStatement.executeUpdate();
		if (s != 0) {
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cms.dao.ArticleDao#delete(java.sql.Connection, int)
	 */
	@Override
	public boolean delete(Connection connection, int id) throws SQLException {
		String sql = "delete from article where article_id=?";

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
	 * @see com.cms.dao.ArticleDao#getAll()
	 */
	@Override
	public List<Article> getAll() throws SQLException {
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		String sql = "select * from article";
		PreparedStatement pStatement = connection.prepareStatement(sql);
		ResultSet rSet = pStatement.executeQuery();
		List<Article> listArticle = new ArrayList<Article>();
		while (rSet.next()) {

			Article article = new Article();
			article.setArticle_id(rSet.getInt(1));
			article.setTitle(rSet.getString(2));
			article.setUser_id(rSet.getInt(3));
			article.setSummary(rSet.getString(4));
			article.setContent(rSet.getString(5));
			article.setReadtimes(rSet.getInt(6));
			article.setHits(rSet.getInt(7));
			article.setChannel_id(rSet.getInt(8));
			listArticle.add(article);
		}
		connection.close();
		return listArticle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cms.dao.ArticleDao#getById(int)
	 */
	@Override
	public Article getById(int id) throws SQLException {
		String sql = "SELECT * FROM article WHERE article_id = ?";
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		PreparedStatement pStatement = connection.prepareStatement(sql);
		pStatement.setInt(1, id);
		ResultSet rSet = pStatement.executeQuery();
		Article article = new Article();
		if (rSet.next()) {
			article.setArticle_id(rSet.getInt(1));
			article.setTitle(rSet.getString(2));
			article.setUser_id(rSet.getInt(3));
			article.setSummary(rSet.getString(4));
			article.setContent(rSet.getString(5));
			article.setReadtimes(rSet.getInt(6));
			article.setHits(rSet.getInt(7));
			article.setAdd_date(rSet.getDate(8));
			article.setChannel_id(rSet.getInt(9));

		}
		connection.close();

		return article;
	}



}

