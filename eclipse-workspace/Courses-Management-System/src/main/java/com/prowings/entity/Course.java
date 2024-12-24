package com.prowings.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.JOINED)
@MappedSuperclass
@DiscriminatorColumn(name = "Mode", discriminatorType = DiscriminatorType.STRING)
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String CourseName;
	@Column
	private int Duration;
	@Column
	private Long Fees;

	public Course() {
		super();

	}

	public Course(int id, String courseName, int duration, Long fees) {
		super();
		this.id = id;
		CourseName = courseName;
		Duration = duration;
		Fees = fees;
	}

	public Course(String courseName, int duration, Long fees) {
		super();
		CourseName = courseName;
		Duration = duration;
		Fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	public Long getFees() {
		return Fees;
	}

	public void setFees(Long fees) {
		Fees = fees;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", CourseName=" + CourseName + ", Duration=" + Duration + ", Fees=" + Fees + "]";
	}
}
