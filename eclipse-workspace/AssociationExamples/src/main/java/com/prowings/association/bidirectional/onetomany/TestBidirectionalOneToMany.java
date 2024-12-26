package com.prowings.association.bidirectional.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.utils.HibernateUtils;

public class TestBidirectionalOneToMany {

	public static void main(String[] args) {

		SessionFactory sessionfactory = HibernateUtils.getSessionFactoryObj();
		Session session = sessionfactory.openSession();
		Transaction txn = session.beginTransaction();

		Country country = new Country("India");

		State state1 = new State("Maharashtra", 9737466832L);
		state1.setCountry(country);
		
		State state2 = new State("Karnataka", 734646468L);
		state2.setCountry(country);


		List<State> states = new ArrayList<>();
		states.add(state1);
		states.add(state2);

		
		country.setState(states);
		
		session.persist(country);
			
		Country fetchedcountry = session.get(Country.class, 1L);
		
		//session.remove(country);

		System.out.println(fetchedcountry);

		txn.commit();
		session.close();

	}

}
