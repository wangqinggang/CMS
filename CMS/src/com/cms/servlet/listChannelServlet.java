package com.cms.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.dao.ChannelDao;
import com.cms.dao.impl.ChannelDaoImpl;
import com.cms.entity.Channel;


public class listChannelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public listChannelServlet() {
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
		ChannelDao cDao = new ChannelDaoImpl();
		List<Channel> listChannel = null;
		try {
			listChannel = cDao.getAll();
			System.out.println("执行查询栏目列表");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("listChannel", listChannel);
		request.getRequestDispatcher("../back_end/listChannel.jsp").forward(request, response);
	}

}
