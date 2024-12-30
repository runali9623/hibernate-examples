package com.prowings.association.bidirectional.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String type;
	@Column
	private String model;
	
	@ManyToMany(mappedBy="vehicle",cascade = CascadeType.ALL)
	
	private List<Driver> driver=new ArrayList<>();
	
	public Vehicle() {
		super();
	}

	public Vehicle(long id, String type, String model, List<Driver> driver) {
		super();
		this.id = id;
		this.type = type;
		this.model = model;
		this.driver = driver;
	}

	public Vehicle(String type, String model, List<Driver> driver) {
		super();
		this.type = type;
		this.model = model;
		this.driver = driver;
	}

	public Vehicle(String type, String model) {
		super();
		this.type = type;
		this.model = model;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<Driver> getDriver() {
		return driver;
	}

	public void setDriver(List<Driver> driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", type=" + type + ", model=" + model + ", driver=" + driver + "]";
	}
	
}
