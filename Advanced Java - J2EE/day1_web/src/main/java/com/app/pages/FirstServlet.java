package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hello")
public class FirstServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config)
	{
		System.out.println("in init "+Thread.currentThread());
	}
	@Override
	public void destroy()
	{
		System.out.println("in destroy "+Thread.currentThread());
	}
	@Override
	public void doGet(HttpServletRequest rq,HttpServletResponse rs) throws ServletException,IOException{
		System.out.println("in do-get "+Thread.currentThread());
		//1. set resp cont type
		rs.setContentType("text/html");
		//2. to send text resp from servlet -> to the clnt  , get writer
		try(PrintWriter pw=rs.getWriter()) {
			//3. generate dyn resp
			pw.print("<h4>Welcome 2 Servlets !"+LocalDateTime.now()+"</h4>");
		}//WC : pw.close -> pw.flush --resp is rendered !
		
	}

}
