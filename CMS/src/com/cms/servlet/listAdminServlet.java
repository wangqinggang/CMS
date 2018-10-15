package com.cms.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.dao.AdminDao;
import com.cms.dao.impl.AdminDaoImpl;
import com.cms.entity.Admin;

/**
 * 获取管理员信息
 * 
 */
public class listAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public listAdminServlet() {
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
		List<Admin> listAdmin = null;
		try {
			listAdmin = aDao.getAll();
			System.out.println("执行查询管理员列表");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("listAdmin", listAdmin);
		request.getRequestDispatcher("../back_end/listAdmin.jsp").forward(request, response);


	}

}
