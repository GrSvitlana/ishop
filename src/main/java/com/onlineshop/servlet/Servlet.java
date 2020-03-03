package com.onlineshop.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = -313385363290634165L;
	
	//  The init() method is started by the browser when the Java program (MyProgram.class) is loaded and run by the browser.
	@Override
	public void init() throws ServletException {
		super.init();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("Hello world!");
		out.println("</body></html>");
		
		out.close();
	}
	
	// The java.lang.Process.destroy() method kills the subprocess. The subprocess represented by this Process object is forcibly terminated.
	@Override
	public void destroy() {
		super.destroy();
	}

}
