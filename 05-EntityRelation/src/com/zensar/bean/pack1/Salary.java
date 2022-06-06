package com.zensar.bean.pack1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salaries10")
public class Salary {

	@Id
	@Column
	private int salaryId;
	@Column
	private double ctc;
	@Column
	private double deductions;
	@Column
	private double salaryForMonth;
	@OneToOne()
	@MapsId
	@JoinColumn(name = "person_id")
	private Person person;
	
	// Constructor
	public Salary(double ctc, double deductions, double salaryForMonth) {
		super();
		this.ctc = ctc;
		this.deductions = deductions;
		this.salaryForMonth = salaryForMonth;
	}

	public Salary() {
		super();
	}

	// Getters and Setters
	public int getSalaryId() {
		return salaryId;
	}

	public double getCtc() {
		return ctc;
	}

	public double getDeductions() {
		return deductions;
	}

	public double getSalaryForMonth() {
		return salaryForMonth;
	}

	public Person getPerson() {
		return person;
	}

	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}

	public void setCtc(double ctc) {
		this.ctc = ctc;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

	public void setSalaryForMonth(double salaryForMonth) {
		this.salaryForMonth = salaryForMonth;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	// ToString Method
	@Override
	public String toString() {
		return "Salary [salaryId=" + salaryId + ", ctc=" + ctc + ", deductions=" + deductions + ", salaryForMonth="
				+ salaryForMonth + "]";
	}
}