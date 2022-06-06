package com.zensar.messageapi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "This Classs is Used to store messages information")
public class Message {

	@ApiModelProperty(notes = "This is Id Information of the Message")
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