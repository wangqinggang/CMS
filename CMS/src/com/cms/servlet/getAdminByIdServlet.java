package com.cms.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.dao.AdminDao;
import com.cms.dao.impl.AdminDaoImpl;
import com.cms.entity.Admin;

/**
 * 通过id获取管理员信息
 * 
 */
public class getAdminByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public getAdminByIdServlet() {
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
		System.out.println("getAdminByid id=" + id);
		AdminDao aDao = new AdminDaoImpl();

		Admin admin = null;
		try {
			admin = aDao.getById(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("admin", admin);
		request.getRequestDispatcher("../back_end/modifyAdmin.jsp").forward(request, response);



	}

}
