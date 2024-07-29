package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.UserDaoImpl;
import com.app.entities.User;

/**
 * Servlet implementation class VoterRegistrationServlet
 */
@WebServlet(value="/voter_register", loadOnStartup=2)
public class VoterRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserDaoImpl userDao;
    
	
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			// create user dao instance
			userDao = new UserDaoImpl();
		} catch (Exception e) {
			System.out.println(e);
			// re throw the exc to WC to inform about init failure
			// API - ServletException(String mesg , Throwable rootCause)
			throw new ServletException("err in init of " + getClass(), e);
		}
	}
	
	
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			// clean up dao
			userDao.cleanUp();
		} catch (Exception e) {
//			throw new RuntimeException
//			("err in destory of " + getClass(), e);
			System.out.println("err in destroy !");
		}
	}
    
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		try(PrintWriter pw = response.getWriter()){
			String fname = request.getParameter("fn");
			String lname = request.getParameter("ln");
			String email = request.getParameter("em");
			String pwd = request.getParameter("pass");
			String dob = request.getParameter("dob");
			
			LocalDate mydob = LocalDate.parse(dob);
			
			Period dif = Period.between(mydob, LocalDate.now());
			
			if(dif.getYears() < 21) {
				pw.print("Signup Failed... Minimum age required is 21");
				pw.print("<h5>Go to registration page<a href='voter_registration.html'>Registration</a></h5>");
			}
			else {
				Date mdob = Date.valueOf(mydob);
				
				User myUser = new User(fname, lname, email, pwd, mdob);
				
				if(myUser == null) {
					pw.print("<h5>Invalid Registration , Please <a href='voter_registration.html'>Retry</a></h5>");
					
				}
				else {
					Cookie c1 = new Cookie("userinfo",myUser.toString());
					response.addCookie(c1);
					
					pw.print("Successful Registration!!!!!");
					pw.print("<h5>Go to Login Page<a href='login.html'>Login</a></h5>");
					String result = userDao.voterRegistration(myUser);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServletException("err in doPost of " + getClass(), e);		}
	}

}
