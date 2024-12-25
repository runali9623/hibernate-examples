package com.prowings.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.entity.LaptopEntity;

public class TestLaptopHibernate {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction txn = session.beginTransaction();

//		LaptopEntity lap1 = new LaptopEntity("hp", "Gray", 60000L);
//		LaptopEntity lap2 = new LaptopEntity("Lenovo", "black", 80000L);
		// LaptopEntity lap3 = new LaptopEntity("Dell", "silver", 70000L);

//		session.save(lap1);
//		session.save(lap2);
		// session.save(lap3);

//		session.persist(lap1);
//		session.persist(lap2);
		// session.persist(lap3);

		// LaptopEntity fetchedLaptop = session.get(LaptopEntity.class, 1);
		// LaptopEntity fetchedLaptop = session.load(LaptopEntity.class, 1);
		// System.out.println("fetchedLaptop is :"+fetchedLaptop);

//		session.get(LaptopEntity.class, 1);

		LaptopEntity lap4 = new LaptopEntity("Dell", "silver", 100000L);
		LaptopEntity lap5 = new LaptopEntity("Apple", "white", 120000L);
		LaptopEntity lap6 = new LaptopEntity("Asus", "gray", 60000L);

		session.save(lap4);
		session.save(lap5);
		session.save(lap6);

//		lap4.setId(1);
//		lap4.setPrice(80000L);
//		lap4.setColor("black");

//		lap5.setId(2);
//		lap5.setPrice(90000L);
//		lap5.setColor("silver");

//		lap6.setId(3);
//		lap6.setPrice(100000L);
//		lap6.setColor("white");

//		 session.saveOrUpdate(lap4);
//		 session.saveOrUpdate(lap5);
//		 session.saveOrUpdate(lap6);

//		LaptopEntity fetchedLaptop = session.get(LaptopEntity.class, 1);
//		LaptopEntity fetchedLaptop1 = session.get(LaptopEntity.class, 2);
//		LaptopEntity fetchedLaptop2 = session.get(LaptopEntity.class, 3);
//
//		fetchedLaptop.setPrice(80500);
//		session.update(fetchedLaptop);
//
//		fetchedLaptop1.setPrice(90500);
//		session.update(fetchedLaptop2);
//
//		fetchedLaptop2.setPrice(10500);
//		session.update(fetchedLaptop1);
		

		
		txn.commit();
		session.close();

		sessionFactory.close();
	}

}
