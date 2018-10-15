package com.cms.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cms.entity.Admin;

public class AdminLoginFilter implements Filter {

	public AdminLoginFilter() {
		// TODO Auto-generated constructor stub
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("管理员权限验证");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		Admin admin = (Admin) session.getAttribute("admin");
		/*
		 * 权限过滤，如果用户session存在，但Referer为空，则表示<iframe>的页面直接通过浏览器访问，
		 * 过滤该非法请求，如果用户session不存在，则直接过滤该非法请求
		 */
		if (admin != null) {
			String s = req.getHeader("Referer");
			if (s == null) {
				session.setAttribute("error", "非法请求！");
				req.getRequestDispatcher("../adminLogin.jsp").forward(req, resp);// 强制类型转换之后的

			} else {
				chain.doFilter(request, response);
			}
			// session.setAttribute("error", "你还没有登录！");
			// req.getRequestDispatcher("../adminLogin.jsp").forward(req, resp);// 强制类型转换之后的
		} else {
			session.setAttribute("error", "你还没有登录！");
			req.getRequestDispatcher("../adminLogin.jsp").forward(req, resp);// 强制类型转换之后的
		}
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}
