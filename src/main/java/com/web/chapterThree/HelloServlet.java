package com.web.chapterThree;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().println("hello world");
		//response.sendError(404); 设置指定code跳转到web.xml的跳转页
	   response.getWriter().append("getRequestUrl:").append(request.getRequestURL())//完整路径)
	   .append("---getRequestURI:").append(request.getRequestURI())//服务器路径
	   .append("---getServletPath:").append(request.getServletPath())//返回servlet  URL-MAPPING 的路径
	   .append("---getHeader:").append(request.getHeader("Content-Encoding"))
	   .append("ServletInitParameter"+this.getServletConfig().getInitParameter("Encoding"));
	   
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void destroy() {
		System.out.println(this.getServletName() + "stopped");
	}

	//访问时调用    在web.xml加入 load-on-startup 启动时候调用 值为servlet优先级
	//有2个init 方法 有参的调用了无参的, 是为了防止重写了有参而没有调用父类init 防止初始化失败
	public void init() throws ServletException {
		System.out.println(this.getServletName() + "started");
	}

	//在servlet中默认情况下，无论你是get还是post 提交过来 都会经过service（）方法来处理，然后转向到doGet.具体看service源码 判断请求Methode值再调用具体方法  service方法主要用来做转向
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		super.service(req, res);
	}

}
