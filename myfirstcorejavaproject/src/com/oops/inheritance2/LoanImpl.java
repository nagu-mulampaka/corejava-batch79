package com.oops.inheritance2;

import java.util.Scanner;

// super class or parent class or base class
public class LoanImpl implements Loan {

	Scanner scanner = new Scanner(System.in);

	private void info() {
		System.out.println("Loan Impl");
	}

	public void hello() {
		System.out.println("Hello Guys Good Morning");
		System.out.println("Hello Method from Loan Impl");
	}

	protected Number welcome(String name) throws Throwable {
		System.out.println("Welcome to Vcube Bank Mr.  " + name);
		return 10;
	}

	@Override
	public double getCustomerSalary() {
		System.out.print("Enter your Salary: ");
		double salary = scanner.nextDouble();
		return salary;
	}

	@Override
	public int getCustomerAgeInfo() {
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		return age;
	}

	@Override
	public int getCibilScore() {
		System.out.print("Enter your Cibil Score: ");
		int cibil = scanner.nextInt();
		return cibil;
	}

	@Override
	public double getRateOfInterest() {
		double roi = 20.0;
		int cibil = getCibilScore();
		if (cibil > 900 || cibil < 300) {
			System.out.println("Cibil Data is Invalid !!");
		} else if (cibil >= 800 && cibil <= 900) {
			System.out.println("Strong Credit Profile, best loan terms.. - Excellent");
			roi = roi - 11.0; // 9%
		} else if (cibil > 770 && cibil < 800) {
			System.out.println("High Approval chances, competitive rates.. - Very Good");
			roi = roi - 9.0; // 11%
		} else if (cibil > 701 && cibil < 770) {
			System.out.println("Eligible for most loans with decent terms.. - Good");
			roi = roi - 8.0; // 12%
		} else if (cibil > 600 && cibil <= 700) {
			System.out.println("May get loan but higher interest.. - Average");
			roi = roi - 7.0; // 13%
		} else {
			System.out.println("Higher risk; loan applications often rejected.. - Poor");
		}
		return roi;
	}

	@Override
	public boolean isAadharValid() {
		boolean isValid = false;
		System.out.print("Enter your Aadhar Card Number: ");
		String aadhar = scanner.next();
		isValid = aadhar.matches("[2-9]{1}[0-9]{11}");
		return isValid;
	}

	// ABCDE1234G
	@Override
	public boolean isPanValid() {
		boolean isValid = false;
		System.out.print("Enter PAN Number: ");
		String pan = scanner.next();
		isValid = pan.matches("[A-Z/a-z]{5}[0-9]{4}[A-Z/a-z]{1}");
		return isValid;
	}

	@Override
	public boolean isPhoneValid() {
		boolean isValid = false;
		System.out.print("Enter Phone Number Here: ");
		String phone = scanner.next();
		isValid = phone.matches("[6-9]{1}[0-9]{9}");
		return isValid;
	}

}
