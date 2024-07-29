package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;  

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;
import com.app.entities.Role;
import com.app.entities.User;

public class RegisterNewUser {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create user dao instance
			UserDao dao = new UserDaoImpl();
			System.out.println("Enter user details -  firstName,  lastName," + "  "
					+ "email,  password,  dob,  phoneNo, role reg amount");
			User newUser = new User(sc.next(), sc.next(), sc.next(), sc.next(), LocalDate.parse(sc.next()), sc.next(),
					Role.valueOf(sc.next()), sc.nextDouble());
			System.out.println(dao.registerUser(newUser));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
