package com.prowings.association.unidirectional.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.utils.HibernateUtils;

public class TestUniManyToMany {

	public static void main(String[] args) {

		SessionFactory sessionfactory = HibernateUtils.getSessionFactoryObj();
		Session session = sessionfactory.openSession();
		Transaction txn = session.beginTransaction();

		Driver driver1 = new Driver("Ramesh Patil");
		Driver driver2 = new Driver("Ram Yadav");

		Vehicle car = new Vehicle("Car", "Honda");
		Vehicle Truck = new Vehicle("Truck", "Tata");
		Vehicle Bike = new Vehicle("Bike", "Royal Enfield");

		List<Vehicle> vehiclefordriver1 = new ArrayList<>();
		vehiclefordriver1.add(car);
		vehiclefordriver1.add(Truck);
		driver1.setVehicle(vehiclefordriver1);

		List<Vehicle> vehiclefordriver2 = new ArrayList<>();
		vehiclefordriver2.add(Bike);
		vehiclefordriver2.add(car);
		driver2.setVehicle(vehiclefordriver2);

		session.persist(driver1);
		session.persist(driver2);

		txn.commit();
		session.close();
	}

}
