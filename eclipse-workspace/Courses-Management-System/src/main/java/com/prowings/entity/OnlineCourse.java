package com.prowings.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("OnCourse")
public class OnlineCourse extends Course {
	@Column
	private String Platform;
	@Column
	private int DurationMonths;

	public OnlineCourse() {
		super();
	}

	public OnlineCourse(String courseName, int duration, Long fees, String Platform, int DurationMonths) {
		super(courseName, duration, fees);
		this.Platform = Platform;
		this.DurationMonths = DurationMonths;
	}

	public String getPlatform() {
		return Platform;
	}

	public void setPlatform(String platform) {
		Platform = platform;
	}

	public int getDurationMonths() {
		return DurationMonths;
	}

	public void setDurationMonths(int durationMonths) {
		DurationMonths = durationMonths;
	}

	@Override
	public String toString() {
		return "OnlineCourse [Platform=" + Platform + ", DurationMonths=" + DurationMonths + "]";
	}

}
