package com.prowings.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("OffCourse")

public class OfflineCourse extends Course {
	@Column
	private String Location;
	@Column
	private int BatchSize;

	public OfflineCourse() {
		super();
	}

	public OfflineCourse(String courseName, int duration, Long fees, String Location, int BatchSize) {
		super(courseName, duration, fees);
		this.Location = Location;
		this.BatchSize = BatchSize;
	}

	public OfflineCourse(String location, int batchSize) {
		super();
		Location = location;
		BatchSize = batchSize;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getBatchSize() {
		return BatchSize;
	}

	public void setBatchSize(int batchSize) {
		BatchSize = batchSize;
	}

	@Override
	public String toString() {
		return "OfflineCourse [Location=" + Location + ", BatchSize=" + BatchSize + "]";
	}

}
