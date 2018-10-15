package com.cms.service.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.dao.UserDao;
import com.cms.dao.impl.UserDaoImpl;
import com.cms.entity.User;
import com.cms.util.ConnectionFactory;


public class userLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public userLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("用户登陆验证servlet执行");
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		User user = new User();
		user.setUser_name(uname);
		user.setUser_pwd(upwd);
		UserDao uDao = new UserDaoImpl();
		Connection connection = ConnectionFactory.getInstance().makeConnection();
		try {
			if (uDao.validate(connection, user)) {
				request.getSession().setAttribute("user", user);
				response.sendRedirect("./front_end/index.jsp");
			} else {
				request.getSession().setAttribute("error", "用户名或密码错误！请重新输入");
				request.getRequestDispatcher("userLogin.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
