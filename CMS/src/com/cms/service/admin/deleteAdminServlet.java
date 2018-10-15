package com.cms.service.admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.dao.AdminDao;
import com.cms.dao.impl.AdminDaoImpl;
import com.cms.util.ConnectionFactory;

/**
 * 删除管理员信息
 * 
 */
public class deleteAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public deleteAdminServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AdminDao aDao = new AdminDaoImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			if (aDao.delete(id)) {
				response.sendRedirect("../back_end/listAdminServlet");
			} else {
				response.sendRedirect("../back_end/error.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

