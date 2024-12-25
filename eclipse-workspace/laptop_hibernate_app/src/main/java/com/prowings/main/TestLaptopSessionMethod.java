package com.prowings.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.entity.LaptopEntity;

public class TestLaptopSessionMethod {

	public static void main(String[] args) {

		SessionFactory sessionFactory1 = new Configuration().configure().buildSessionFactory();

		Session session1 = sessionFactory1.openSession();

		Transaction txn1 = session1.beginTransaction();

		LaptopEntity lap1 = new LaptopEntity("Dell 1.2", "silver", 100000L);
		LaptopEntity lap2 = new LaptopEntity("AppleNew", "white", 200000L);
		LaptopEntity lap3 = new LaptopEntity("Asus 3.0", "gray", 160000L);

		session1.save(lap1);
		session1.save(lap2);
		session1.save(lap3);

		LaptopEntity fetchedLaptop1 = session1.get(LaptopEntity.class, 2);
		System.out.println("featched laptop is:" + fetchedLaptop1);

		// fetchedLaptop1.setId(2);
		fetchedLaptop1.setName("AppleNew 0.3");

		txn1.commit();

//		session1.evict(fetchedLaptop1);
//		System.out.println("featchedLaptop1 is successfully evicted from session1:" + fetchedLaptop1);

		session1.detach(fetchedLaptop1);
		System.out.println("featchedLaptop1 is successfully detached from session1:" + fetchedLaptop1);

		Session session2 = sessionFactory1.openSession();
		Transaction txn2 = session2.beginTransaction();

		LaptopEntity fetchedLaptop2 = session2.get(LaptopEntity.class, 2);
		System.out.println("featched laptop is:" + fetchedLaptop2);

		// session2.update(fetchedLaptop1);
		// session2.merge(fetchedLaptop1);

		// session2.clear();

//		session2.evict(fetchedLaptop2);
//		System.out.println("featchedLaptop1 is successfully evicted from session2:" + fetchedLaptop2);
		
		session2.detach(fetchedLaptop2);
		System.out.println("featchedLaptop1 is successfully detached from session1:" + fetchedLaptop2);

		txn2.commit();
		session2.close();
		session1.close();

	
	}

} 
