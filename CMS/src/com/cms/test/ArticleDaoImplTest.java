/**
 * ArticleDaoImplTest.java Version 1.0.0 Created on 2017年7月6日 Copyright Wangqingang
 *
 */
package com.cms.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cms.dao.impl.ArticleDaoImpl;
import com.cms.entity.Article;
import com.cms.util.ConnectionFactory;


public class ArticleDaoImplTest {

	/**
	 * Test method for {@link com.cms.dao.impl.ArticleDaoImpl#getAll()}.
	 */
	@Test
	public void testGetAll() {
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		List<Article> listArticle = new ArrayList<Article>();

		try {
			listArticle = new ArticleDaoImpl().getAll();
			System.out.println(listArticle.isEmpty());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Article article : listArticle) {// 其内部实质上还是调用了迭代器遍历方式，这种循环方式还有其他限制，不建议使用。
			System.out.println(article.getHits());
		}
	}

}
