package com.zensar.bean;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name = "doctors10")

@NamedQueries({ @NamedQuery(name = "findAll", query = "select d from Doctor d"),
		@NamedQuery(name = "findById", query = "select d from Doctor d where d.id=:searchId"),
		@NamedQuery(name = "updateFees", query = "update Doctor set fees=fees+400") })

@NamedNativeQueries({
		@NamedNativeQuery(name = "readAll", query = "select * from doctors10", resultClass = Doctor.class),
		@NamedNativeQuery(name = "readById", query = "select * from doctors10 where id=?", resultClass = Doctor.class) })

public class Doctor {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	String name;
	double fees;
	String gender;
	LocalDate practicingSince;

	// Constructor
	public Doctor(String name, double fees, String gender, LocalDate practicingSince) {
		super();
		this.name = name;
		this.fees = fees;
		this.gender = gender;
		this.practicingSince = practicingSince;
	}

	// Constructor without fields
	public Doctor() {
		super();
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getFees() {
		return fees;
	}

	public String getGender() {
		return gender;
	}

	public LocalDate getPracticingSince() {
		return practicingSince;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setPracticingSince(LocalDate practicingSince) {
		this.practicingSince = practicingSince;
	}

	// ToString Method
	@Override
	public String toString() {
		return "\n Doctor [id=" + id + ", name=" + name + ", fees=" + fees + ", gender=" + gender + ", practicingSince="
				+ practicingSince + "]";
	}
}