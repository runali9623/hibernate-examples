package com.prowings.association.unidirectional.manytomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String type;
	@Column
	private String model;
	
	public Vehicle() {
		super();
	}

	public Vehicle(long id, String type, String model) {
		super();
		this.id = id;
		this.type = type;
		this.model = model;
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

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", type=" + type + ", model=" + model + "]";
	}
}
