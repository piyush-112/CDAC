package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.AddressDao;
import com.app.dao.AddressDaoImpl;
import com.app.dao.UserDao;
import com.app.dao.UserDaoImpl;
import com.app.entities.Address;
import com.app.entities.Role;
import com.app.entities.User;

public class AssignUserAddress {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			AddressDao dao=new AddressDaoImpl();
			System.out.println("Enter user id");
			Long userId = sc.nextLong();
			System.out.println(
					"Enter adr details - adrLine1, String adrLine2, String city, String state, String country, String zipCode");
			Address adr = new Address(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
			System.out.println(dao.assignUserAddress(userId,adr));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
