package com.cms.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.dao.ChannelDao;
import com.cms.dao.impl.ChannelDaoImpl;
import com.cms.util.ConnectionFactory;

public class deleteChannelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public deleteChannelServlet() {
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


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ChannelDao cDao = new ChannelDaoImpl();
		int id = Integer.parseInt(request.getParameter("id"));
		Connection connection = ConnectionFactory.getInstance().makeConnection();

		try {
			if (cDao.delete(connection, id)) {
				response.sendRedirect("../back_end/listChannelServlet");
			} else {
				response.sendRedirect("../back_end/error.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // TODO Auto-generated method stub
	}

}
