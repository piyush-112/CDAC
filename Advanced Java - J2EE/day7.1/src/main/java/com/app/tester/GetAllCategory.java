package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.*;
import com.app.entities.*;

public class GetAllCategory {
	public static void main(String[] args) {
		try (SessionFactory sf = getFactory()) {
			// create user dao instance
			CategoryDao dao = new CategoryDaoImpl();
			System.out.println("All Category -");
			dao.getAllcategories().forEach(categories -> System.out.println(categories));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
