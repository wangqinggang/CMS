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


public class adminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public adminLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("管理员登陆验证");
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");

		Admin admin = new Admin();
		admin.setAdmin_name(uname);
		admin.setAdmin_pwd(upwd);
		AdminDao aDao = new AdminDaoImpl();
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		try {
			if (aDao.validate(connection, admin)) {
				request.getSession().setAttribute("admin", admin);
				response.sendRedirect("./back_end/backindex.jsp");
			} else {
				request.getSession().setAttribute("error", "用户名或密码错误！请重新输入");
				request.getRequestDispatcher("adminLogin.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
