package com.zensar.messageapi.entity;

public class Message {

	private int id;
	private String message;

	// Getters And Setters
	public int getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}