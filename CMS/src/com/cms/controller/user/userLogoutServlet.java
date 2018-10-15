package com.cms.controller.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cms.entity.User;


public class userLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public userLogoutServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("用户退出登录");
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if (user != null) {
			session.invalidate();
			request.getRequestDispatcher("../userLogin.jsp").forward(request, response);
		}
	}

}
