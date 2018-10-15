package com.cms.service.article;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.dao.ArticleDao;
import com.cms.dao.impl.ArticleDaoImpl;
import com.cms.entity.Article;


public class listArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public listArticleServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArticleDao aDao = new ArticleDaoImpl();

		List<Article> listArticle = null;
		try {
			listArticle = aDao.getAll();
			System.out.println("执行查询文章列表");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("listArticle", listArticle);
		request.getRequestDispatcher("../back_end/listArticle.jsp").forward(request, response);
	}

}
