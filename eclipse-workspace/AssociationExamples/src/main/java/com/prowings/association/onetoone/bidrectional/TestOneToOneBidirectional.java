package com.prowings.association.onetoone.bidrectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.utils.HibernateUtils;

public class TestOneToOneBidirectional {

	public static void main(String[] args) {

		BankAccount banlac1 = new BankAccount(8935424378L, "Maharashtra Bank", 150000);
		Customer customer1 = new Customer("Runali", 1234567890L);
        customer1.setBankaccount(banlac1); 


		BankAccount banlac2 = new BankAccount(986456732L, "Axis Bank", 200000);
		Customer customer2 = new Customer("Shweta", 9876543201L);
        customer2.setBankaccount(banlac2); 
        
        
        BankAccount banlac3 = new BankAccount(76353658126L, "State Bank", 300000);
		Customer customer3 = new Customer("Neha", 8876590432L);
        customer3.setBankaccount(banlac3); 

		SessionFactory sessionfactory = HibernateUtils.getSessionFactoryObj();	
		Session session = sessionfactory.openSession();
		Transaction txn = session.beginTransaction();
			
//		session.persist(customer1);
		session.persist(customer2);
		session.persist(customer3);

		Customer featchedCustomer = session.get(Customer.class, 1);
		session.remove(customer1);
		System.out.println(featchedCustomer);


		txn.commit();
		session.close();
	}

}
