package com.prowings.association.bidirectional.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	
	@OneToMany( mappedBy="country",cascade = CascadeType.ALL)
	
	private  List<State> state;

	public Country(String country) {
		super();

	}

	public Country(long id, String name, List<State> state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
	}

	public Country(String name, List<State> state) {
		super();
		this.name = name;
		this.state = state;
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

	public List<State> getState() {
		return state;
	}

	public void setState(List<State> state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", state=" + state + "]";
	}

}
