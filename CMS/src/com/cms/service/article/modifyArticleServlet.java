package com.cms.service.article;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.dao.ArticleDao;
import com.cms.dao.impl.ArticleDaoImpl;
import com.cms.entity.Article;
import com.cms.util.ConnectionFactory;


public class modifyArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public modifyArticleServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		String user_id = request.getParameter("user_id");
		String summary = request.getParameter("summary");
		String content = request.getParameter("content");
		String channel_id = request.getParameter("channel_id");
		System.out.println("执行修改文章操作");
		String id = request.getParameter("id");
		Article article = new Article();

		System.out.println("获得的id为" + id);

		article.setArticle_id(Integer.parseInt(id));
		article.setTitle(title);
		article.setUser_id(Integer.parseInt(user_id));
		article.setSummary(summary);
		article.setContent(content);
		article.setChannel_id(Integer.parseInt(channel_id));

		ArticleDao aDao = new ArticleDaoImpl();
		Connection connection = ConnectionFactory.getInstance().makeConnection();

		try {
			if (aDao.updateById(connection, article)) {
				response.sendRedirect("../back_end/listArticleServlet");
			} else {
				response.sendRedirect("../back_end/error.jsp");
			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
