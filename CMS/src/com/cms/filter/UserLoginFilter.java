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

import com.cms.entity.User;


public class UserLoginFilter implements Filter {


	public UserLoginFilter() {
		// TODO Auto-generated constructor stub
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}



	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		if (user == null) {
			
//			 String s=req.getHeader("Referer");
//	            if (s==null){
//	                req.getRequestDispatcher("/login/toLogin").forward(req,resp);
//	                return;
//	            }else {
//	                return;
//	            }


			
			System.out.println("用户权限验证filter执行");
			session.setAttribute("error", "你还没有登录！");
			req.getRequestDispatcher("../userLogin.jsp").forward(req, resp);// 强制类型转换之后的
		} else {
			chain.doFilter(request, response);
		}


	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}
