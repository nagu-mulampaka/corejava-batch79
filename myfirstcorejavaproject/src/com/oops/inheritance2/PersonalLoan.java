package com.oops.inheritance2;

import java.util.Scanner;

public class PersonalLoan extends LoanImpl{

	static Scanner scanner = new Scanner(System.in);

	void personalLoanDocInfo() {
		System.out.println("All Documents Have Bean Varified");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		System.out.println("----- Welcome to Vcube Banking Loan -----");
		
		// By using child Object, child reference we can call the both parent & child class functionalities is the concept called Inheritance
		PersonalLoan pl = new PersonalLoan();

		double salary = pl.getCustomerSalary();
		int age = pl.getCustomerAgeInfo();
		int cibil = pl.getCibilScore();

		if (salary >= 100000.00 && age >= 25 && cibil >= 300 && cibil <= 900) {
			System.out.println("Congrtultions !! you are eligible for personal loan");
			System.out.println("Your Rate of Interest is: " + pl.getRateOfInterest());
		} else {
			System.out.println("Focus on Your Carrer !!");
			System.out.println("Sorry for the inconvenience !! your loan got rejected");
		}

		System.out.println("main method ended");
	}

}
