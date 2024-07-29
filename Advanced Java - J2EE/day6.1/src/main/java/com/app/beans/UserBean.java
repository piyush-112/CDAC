package com.app.beans;

import java.sql.SQLException;

import com.app.dao.UserDaoImpl;
import com.app.entities.User;

public class UserBean {
//state
	private String email;
	private String pass;
	// dependency
	private UserDaoImpl userDao;
	// user details
	private User userDetails;
	// status message
	private String message;

	// def ctor
	public UserBean() throws SQLException {
		// create depcy
		userDao = new UserDaoImpl();
		System.out.println("user bean created!");
	}

	// setters n getters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public UserDaoImpl getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}

	public User getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(User userDetails) {
		this.userDetails = userDetails;
	}

	public String getMessage() {
		return message;
	}

	// B.L method for user signin
	public String authenticateUser() throws SQLException {
		System.out.println("in auth user " + email + " " + pass);
		// JB --> DAO's for DAL
		userDetails = userDao.signIn(email, pass);
		if (userDetails == null) {
			message = "Pls retry ! Invalid email or password ";
			return "login";
		}
		// login successful , proceed to authorization
		message = "Successful Login";
		if (userDetails.getRole().equals("admin"))
			return "admin_page";
		// voter
		if (userDetails.isStatus())
			return "logout";
		return "candidate_list";

	}
}
