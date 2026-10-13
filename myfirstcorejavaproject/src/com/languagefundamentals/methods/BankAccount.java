package com.languagefundamentals.methods;

import java.util.Scanner;

// write a program Account Related information in a bank like withdraw, deposit and check balance
public class BankAccount {

	double balance = 1000.00;

	void deposit(double amount) {
		System.out.println("your entred amount is: " + amount);
		if (amount >= 0) {
			balance = balance + amount;
			checkBalance();
		} else {
			System.out.println("enter valid amount");
		}
	}

	void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			checkBalance();
		} else {
			System.out.println("Insufficient Funds");
		}
	}

	void checkBalance() {
		System.out.println("current balance is: " + balance);
	}

	void main(String[] args) {
		System.out.println("main method started");
		Scanner scanner = new Scanner(System.in);

		System.out.println("----- Welcome to Vcube Bank -----");
		checkBalance();

		System.out.print("Enter the amount to depoit: ");
		double depositAmount = scanner.nextDouble();
		deposit(depositAmount);

		System.out.print("Enter the amount to deposit: ");
		double withdrawAmount = scanner.nextDouble();
		withdraw(withdrawAmount);
		
		scanner.close();

		System.out.println("main method ended");
	}
}
