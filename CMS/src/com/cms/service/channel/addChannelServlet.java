package com.cms.service.channel;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.dao.ChannelDao;
import com.cms.dao.impl.ChannelDaoImpl;
import com.cms.entity.Channel;
import com.cms.util.ConnectionFactory;


public class addChannelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public addChannelServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("channel_name");
		String type = request.getParameter("channel_type");

		System.out.println("执行添加栏目操作");
		Channel channel = new Channel();
		channel.setChannel_name(name);
		channel.setChannel_type(type);
		ChannelDao cDao = new ChannelDaoImpl();
		Connection connection = ConnectionFactory.getInstance().makeConnection();

		try {
			if (cDao.save(connection, channel)) {
				response.sendRedirect("../back_end/listChannelServlet");
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
