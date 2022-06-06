package com.zensar.bean;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	private String name;
	
	private double basicSalary;
	
	private LocalDate dateOfJoin;
	
	private char grade;
	
	// getters and setters
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}
	public char getGrade() {
		return grade;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	// ToString method
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", basicSalary=" + basicSalary + ", dateOfJoin="
				+ dateOfJoin + ", grade=" + grade + "]";
	}
}