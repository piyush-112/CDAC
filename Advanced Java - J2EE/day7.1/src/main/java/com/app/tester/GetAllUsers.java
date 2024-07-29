package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory; 

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;
import com.app.entities.Role;
import com.app.entities.User;

public class GetAllUsers {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory()) {
			// create user dao instance
			UserDao dao = new UserDaoImpl();
			System.out.println("All users -");
			dao.getAllUsers().forEach(user -> System.out.println(user));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
