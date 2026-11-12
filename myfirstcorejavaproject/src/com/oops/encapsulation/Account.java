package com.oops.encapsulation;

// POJO : Plain Old Java Object
// DTO : Data Transfer Object
// Model : Data Model
public class Account {

	private long accountNumebr;
	private double balance;
	private String accountHolderName;
	
	public Account() {
		
	}

	public Account(long accountNumebr, double balance, String accountHolderName) {
		super();
		this.accountNumebr = accountNumebr;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumebr = accountNumber;
	}

	public long getAccountNumber() {
		return accountNumebr;
	}

	public void setBalance(double balance) {
		if (balance > 0) {
			this.balance = balance;
		} else {
			System.err.println("Invalid Amount Please Entered");
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountHolderName() {
		return accountHolderName + " V Cube Bank";
	}

	@Override
	public String toString() {
		return "Account [accountNumebr=" + accountNumebr + ", balance=" + balance + ", accountHolderName=" + accountHolderName + "]";
	}

}
