package com.cms.service.article;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.dao.ArticleDao;
import com.cms.dao.impl.ArticleDaoImpl;
import com.cms.entity.Article;


public class getArticleByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public getArticleByIdServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println("getArticleByid id=" + id);
		ArticleDao aDao = new ArticleDaoImpl();

		Article article = null;
		try {
			article = aDao.getById(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("article", article);
		request.getRequestDispatcher("../back_end/modifyArticle.jsp").forward(request, response);
	}

}
