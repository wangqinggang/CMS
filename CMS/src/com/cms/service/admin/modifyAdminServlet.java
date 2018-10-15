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
import com.cms.entity.Admin;
import com.cms.util.ConnectionFactory;

public class modifyAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public modifyAdminServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("admin_name");
		String pwd = request.getParameter("admin_pwd");
		String right = request.getParameter("right");
		Boolean admin_right = Boolean.parseBoolean(right);
		System.out.println("执行添加管理员操作");
		String id = request.getParameter("id");
		Admin admin = new Admin();

		System.out.println(id);
		admin.setAdmin_id(Integer.parseInt(id));
		admin.setAdmin_name(name);
		admin.setAdmin_pwd(pwd);
		admin.setAdmin_right(admin_right);
		AdminDao aDao = new AdminDaoImpl();
		try {
			if (aDao.updateById(admin)) {
				response.sendRedirect("../back_end/listAdminServlet");
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
