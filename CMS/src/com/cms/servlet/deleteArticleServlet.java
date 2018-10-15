package com.cms.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.dao.ArticleDao;
import com.cms.dao.impl.ArticleDaoImpl;
import com.cms.util.ConnectionFactory;


public class deleteArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public deleteArticleServlet() {
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
		int id = Integer.parseInt(request.getParameter("id"));
		Connection connection = ConnectionFactory.getInstance().makeConnection();

		try {
			if (aDao.delete(connection, id)) {
				response.sendRedirect("../back_end/listArticleServlet");
			} else {
				response.sendRedirect("../back_end/error.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
