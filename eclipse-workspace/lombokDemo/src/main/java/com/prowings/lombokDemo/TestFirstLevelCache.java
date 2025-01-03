package com.prowings.lombokDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.utils.HibernateUtils;

public class TestFirstLevelCache {
	
	public static void main(String[] args) {
		
		
		SessionFactory sessionfactory = HibernateUtils.getSessionFactoryObj();
		Session session1 = sessionfactory.openSession();
		Transaction txn1 = session1.beginTransaction();
		
		Person person= new Person("Neha","Pune");
		session1.save(person);

		Person Neha1 = session1.get(Person.class,1L);
		System.out.println("First time featched neha object:"+Neha1);
		
		Person Neha2 = session1.get(Person.class,1L);
		System.out.println("Second time featched neha object:"+Neha2);
				
		
		txn1.commit();
		session1.close();
		
		Session session2 = sessionfactory.openSession();
		Transaction txn2 = session2.beginTransaction();
		
		
		Person neha1fromsession2 = session2.get(Person.class,1L);
		System.out.println("First time featched neha object for session2:"+neha1fromsession2);
		
		Person neha2fromsession2 = session2.get(Person.class,1L);
		System.out.println("First time featched neha object for session2:"+neha2fromsession2);
		
		
		txn2.commit();
		session2.close();
		
		
	}
 
}
