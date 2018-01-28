package com.pluralsight.spring.simpleWebApp.model;

public class User {

	private String firstName;
	private String lastName;
	private ContactInfo contact;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ContactInfo getContact() {
		return contact;
	}

	public void setContact(ContactInfo contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return String.format("User info: %s %s @ %s. From %s, %s", firstName, lastName, contact.getEmail(), contact.getCity(), contact.getCountry());
	}

}

