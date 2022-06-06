package com.zensar.bean.pack1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contactInfos10")
public class ContactInfo {

	@Id
	@Column
	private int contactId;
	@Column
	private String email;
	@Column
	private String phone;
	@OneToOne()
	@MapsId
	@JoinColumn(name = "person_id")
	private Person person;

	// Constructors with expect contactId & person fields
	public ContactInfo(String email, String phone) {
			super();
			this.email = email;
			this.phone = phone;
		}

	// Constructors without fields
	public ContactInfo() {
			super();
		}

	// Getters and Setters
	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	// ToString Method expect person
	@Override
	public String toString() {
		return "Contact_Info [contactId=" + contactId + ", email=" + email + ", phone=" + phone + "]";
	}
}