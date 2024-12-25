package com.prowings.lap;

    import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.Session;

	public class TestLaptop {
		
		public static void main(String[] args) {
			
			System.out.println("Creating session factory object!!");
			
			//step-1 : create session factory object
			SessionFactory sessionfactory= new Configuration().configure().buildSessionFactory(); 
			
			//Step-2 : Create Session object
			Session session = sessionfactory.openSession();
			
			//Step-3 : Create Transaction object
			Transaction txn = session.beginTransaction(); // Transaction started
			
			//Step-4 : Perform DB operations on object
			Laptop lap1 = new Laptop("Hp",8,50000);
			Laptop lap2 = new Laptop("Lenovo",6,60000);
			
			session.save(lap1);
			session.save(lap2);
			
			
			txn.commit();
			session.close();
			
			
			System.out.println("Laptop object saved to DB successfully!!");

		}

	}
