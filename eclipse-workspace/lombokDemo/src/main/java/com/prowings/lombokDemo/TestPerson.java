package com.prowings.lombokDemo;

public class TestPerson {
	
public static void main(String[] args) {
	
	Person person = new Person("Runali","Pune");
	
	person.setName("Neha");
	System.out.println(person.getAddress());
	person.setAddress("Mumbai");
	
	System.out.println(person.getAddress());
	System.out.println(person);
	
		
}

}
