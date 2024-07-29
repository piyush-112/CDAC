package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.*;
import com.app.entities.*;

public class RegisterNewCategory {
	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create user dao instance
			CategoryDao dao = new CategoryDaoImpl();
			System.out.println("Enter Category details -  Category Name" + "  "
					+ "Category Description");
			Category newcategory = new Category(sc.next().toLowerCase(), sc.nextLine());
			System.out.println(dao.createcategory(newcategory));
		} catch (Exception e) {
		e.printStackTrace();
		}

	}
}
