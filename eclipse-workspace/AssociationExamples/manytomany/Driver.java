package com.prowings.association.unidirectional.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Driver {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
		name = "driver_vehicle",
		joinColumns	=@JoinColumn(name = "Driver_id"),	
		inverseJoinColumns	=@JoinColumn(name = "Vehicle_id")
	)
	private List<Vehicle> vehicle;

	public Driver() {
		super();

	}

	public Driver(long id, String name, List<Vehicle> vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.vehicle = vehicle;
	}

	public Driver(String name, List<Vehicle> vehicle) {
		super();
		this.name = name;
		this.vehicle = vehicle;
	}

	public Driver(String name) {
		super();
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", vehicle=" + vehicle + "]";
	}
}
