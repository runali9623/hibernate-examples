package com.prowings.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	static SessionFactory sessionfactory = null;

	public static SessionFactory getSessionFactoryObj() {

		if (sessionfactory == null) {
			System.out.println("Creating SessionFactory object");
			sessionfactory = new Configuration().configure().buildSessionFactory();
			return sessionfactory;
		} else {
			System.out.println("SessionFactory is already initialized....");
			return sessionfactory;
		}
	}

}
