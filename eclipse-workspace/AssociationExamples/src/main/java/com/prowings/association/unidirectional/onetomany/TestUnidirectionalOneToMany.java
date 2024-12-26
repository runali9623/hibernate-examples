package com.prowings.association.unidirectional.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.utils.HibernateUtils;

public class TestUnidirectionalOneToMany {

	public static void main(String[] args) {

		SessionFactory sessionfactory = HibernateUtils.getSessionFactoryObj();
		Session session = sessionfactory.openSession();
		Transaction txn = session.beginTransaction();

		State state1 = new State("Maharashtra", 9737466832L);
		State state2 = new State("Karnataka", 734646468L);

		List<State> states = new ArrayList<>();
		states.add(state1);
		states.add(state2);

		Country country = new Country("India", states);

		session.persist(country);

		Country fetchedcountry = session.get(Country.class, 1L);

		System.out.println(fetchedcountry);

		txn.commit();
		session.close();

	}

}
