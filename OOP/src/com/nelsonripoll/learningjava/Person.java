package com.nelsonripoll.learningjava;

public class Person {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;
	private int age;
	
	public boolean isTeen () {
		if (this.age > 12 && this.age < 20) {
			return true;
		}
		
		return false;
	}
	
	public String getFullName () {
		if (this.firstName.isEmpty() && !this.lastName.isEmpty()) {
			return this.lastName;
		}
		
		if (this.lastName.isEmpty() && !this.firstName.isEmpty()) {
			return this.firstName;
		}
		
		if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
			return "";
		}
		
		return this.firstName + " " + this.lastName;
	}
	
	/*
	 * GETTERS
	 */
	public String getFirstName () {
		return this.firstName;
	}
	
	public String getLastName () {
		return this.lastName;
	}
	
	public int getAge () {
		return this.age;
	}
	
	public String getEmailAddress () {
		return this.emailAddress;
	}
	
	public String getPhoneNumber () {
		return this.phoneNumber;
	}
	
	/*
	 * SETTERS
	 */
	public void setFirstName (String name) {
		this.firstName = name;
	}
	
	public void setLastName (String name) {
		this.lastName = name;
	}
	
	public void setAge (int age) {
		if (age < 0 || age > 100) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}
	
	public void setEmailAddress (String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setPhoneNumber (String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}