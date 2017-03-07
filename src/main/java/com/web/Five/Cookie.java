package com.web.Five;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Cookie() {
		super();
	}

	/*
	 * cookie可以设定限定域名Domain,Expires设置了cookie的过期时间
	 * Max-Age设置了存在秒数,如果没有设置Expires和Max-Age浏览器关闭后就会删除
	 * 浏览器只会通过HTTPS发送Cookie,其他技术无法访问
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
