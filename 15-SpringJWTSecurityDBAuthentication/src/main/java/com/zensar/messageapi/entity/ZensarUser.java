package com.zensar.messageapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class ZensarUser {
	
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false, unique = true)
	private String userName;
	@Column(nullable = false)
	private String Password;
	
	// Setter & Getter
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		Password = password;
	}
}