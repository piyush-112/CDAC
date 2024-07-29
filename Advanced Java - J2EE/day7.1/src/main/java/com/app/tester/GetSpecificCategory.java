package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.*;
import com.app.entities.*;

public class GetSpecificCategory {
	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); 
				Scanner sc = new Scanner(System.in)) {
			// create user dao instance
			CategoryDao dao = new CategoryDaoImpl();
			System.out.println("Enter Catagory: ");
			System.out.println(dao.getCategoryByName(sc.next().toLowerCase()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
