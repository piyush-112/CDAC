package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.CategoryDao;
import com.app.dao.CategoryDaoImpl;
import com.app.entities.Category;

public class GetCompleteGraph {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create category dao instance
			CategoryDao dao = new CategoryDaoImpl();
			// for testing - do not add any white space
			System.out.println("Enter category name , to get all posts n their author info");
			Category category = dao.getCompleteGraph(sc.next());
			System.out.println("Category details -");
			System.out.println(category);
			category.getPosts().forEach(p -> {
				System.out.println("Post Details ");
				System.out.println(p);
				System.out.println("Blogger  details");
				System.out.println(p.getBlogger());
			});
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
