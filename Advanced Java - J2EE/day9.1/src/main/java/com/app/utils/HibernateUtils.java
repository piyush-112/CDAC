package com.app.utils;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/*
 * To build singleton , immutable , heavy weight SF from Config.
 */
public class HibernateUtils {
	private static SessionFactory factory;
	static {
		System.out.println("in init block");
		factory=new Configuration() //empty config
				.configure() //populated config object with props
				.buildSessionFactory();				
	}
	public static SessionFactory getFactory() {
		return factory;
	}
}
