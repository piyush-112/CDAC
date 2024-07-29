package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import com.app.entities.Role;
import com.app.entities.User;

public interface UserDao {
	String registerUser(User user);

	User getUserDetails(Long userId);

	List<User> getAllUsers();

	List<User> getUsersByDobAndRole(LocalDate start, LocalDate end, Role role);

	User signIn(String email, String password);
	//get all user's last names  under a specific role
	List<String> getLastNamesByRole(Role role);
	//get all user first name , last name,dob under a specific role
	List<User> getNamesAndDobByRole(Role role);
	//change pwd
	String changePassword(String email,String pwd,String newPwd);
	String applyDiscount(LocalDate date, double discount);
}
