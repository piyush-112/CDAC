package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.CandidateDaoImpl;
import com.app.dao.UserDaoImpl;
import com.app.entities.User;

import static com.app.utils.DBUtils.*;

/**
 * Servlet implementation class LoginServlet
 */

public class DBConnectionManager extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init()
	 */
	@Override
	public void init() throws ServletException {
		try {
			// get servlet config
			ServletConfig config = getServletConfig();
			String url = config.getInitParameter("db_url");
			String name = config.getInitParameter("user_name");
			String pwd = config.getInitParameter("password");
			// open cn
			openConnection(url, name, pwd);
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
	@Override
	public void destroy() {
		try {
			// close db cn
			closeConnection();
		} catch (Exception e) {

			System.out.println("err in destroy !");
		}
	}

	
}
