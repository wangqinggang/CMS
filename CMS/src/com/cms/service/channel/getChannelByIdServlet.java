package com.cms.service.channel;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.dao.ChannelDao;
import com.cms.dao.impl.ChannelDaoImpl;
import com.cms.entity.Channel;


public class getChannelByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public getChannelByIdServlet() {
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
		System.out.println("getChannelByid id=" + id);
		ChannelDao cdao = new ChannelDaoImpl();

		Channel channel = null;
		try {
			channel = cdao.getById(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("channel", channel);
		request.getRequestDispatcher("../back_end/modifyChannel.jsp").forward(request, response);

	}

}
