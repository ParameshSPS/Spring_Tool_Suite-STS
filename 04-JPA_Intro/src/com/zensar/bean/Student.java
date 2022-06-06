package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	private int roolNumber;
	@Column
	private String name;
	@Embedded
	private Address address;
	
	public int getRoolNumber() {
		return roolNumber;
	}
	public void setRoolNumber(int roolNumber) {
		this.roolNumber = roolNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [roolNumber=" + roolNumber + ", name=" + name + ", address=" + address + "]";
	}
}
