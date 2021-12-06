package com.nelsonripoll.learningjava;

import com.nelsonripoll.learningjava.Person;

public class BankAccount {
	private String account;
	private double balance;
	private Person owner;
	
	
	public BankAccount () {}
	
	public BankAccount (String account, double initialBalance, Person owner) {
		this.setAccount(account);
		this.setBalance(initialBalance);
		this.setOwner(owner);
	}
	
	public BankAccount (String account, double initialBalance, String firstName, String lastName, int age, String emailAddress, String phoneNumber) {
		this.setAccount(account);
		this.setBalance(initialBalance);
		this.setOwner(firstName, lastName, age, emailAddress, phoneNumber);
	}
	
	public void deposit (double amount) {
		this.balance += amount;
		this.printBalance();
	}
	
	public void withdraw (double amount) {
		if (this.balance - amount < 0) {
			System.out.println("Only " + this.balance + " available. Withrawal not processed.");
		} else {
			this.balance -= amount;
			this.printBalance();
		}
	}
	
	public void printBalance () {
		System.out.println("Balance: " + this.balance);
	}
	
	/*
	 * GETTERS
	 */
	public String getAccount () {
		return this.account;
	}
	
	public double getBalance () {
		return this.balance;
	}
	
	public Person getOwner () {
		return this.owner;
	}
	
	/*
	 * SETTERS
	 */
	public void setAccount (String account) {
		this.account = account;
	}
	
	public void setBalance (double amount) {
		this.balance = amount;
	}
	
	public void setOwner (Person owner) {
		this.owner = owner;
	}
	
	public void setOwner (String firstName, String lastName, int age, String emailAddress, String phoneNumber) {
		this.owner = new Person();
		
		this.owner.setFirstName(firstName);
		this.owner.setLastName(lastName);
		this.owner.setAge(age);
		this.owner.setEmailAddress(emailAddress);
		this.owner.setPhoneNumber(phoneNumber);
	}
}