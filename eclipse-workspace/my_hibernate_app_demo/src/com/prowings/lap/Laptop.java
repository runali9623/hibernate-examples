package com.prowings.lap;

public class Laptop {
	
	private int id;
	private String name;
	private int Ram;
	private int price;
	
	public Laptop() {
		
		
	}

	public Laptop(int id, String name, int ram, int price) {
		super();
		this.id = id;
		this.name = name;
		Ram = ram;
		this.price = price;
	}

	public Laptop(String name, int ram, int price) {
		super();
		this.name = name;
		Ram = ram;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRam() {
		return Ram;
	}

	public void setRam(int ram) {
		Ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", Ram=" + Ram + ", price=" + price + "]";
	}
}

