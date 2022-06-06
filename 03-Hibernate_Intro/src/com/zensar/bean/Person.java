package com.zensar.bean;

public class Person {
	private int id;
	private String name;
	private double salary;

	// Constructors with all fields
	public Person(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Constructors with single field
	public Person(int id) {
		super();
		this.id = id;
	}

	// Constructors without fields
	public Person() {
		super();
	}

	// Getters And Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// ToString method
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}