package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;
import com.app.entities.Role;
import com.app.entities.User;

public class TestJPACtorExpression {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create user dao instance
			UserDao dao = new UserDaoImpl();
			System.out.println("Enter user role ");
			dao.getNamesAndDobByRole(Role.valueOf(sc.next().toUpperCase()))
					.forEach(u -> System.out.println(u.getFirstName() + " " + u.getLastName() + " " + u.getDob()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
