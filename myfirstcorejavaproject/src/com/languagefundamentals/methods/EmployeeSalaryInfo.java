package com.languagefundamentals.methods;

import java.util.Scanner;

// with return type + no parameters
public class EmployeeSalaryInfo {

	Scanner scanner = new Scanner(System.in);

	void main(String[] args) {

		System.out.println("main method started");
		
		double basic = getBasicSalary();
		double hrs = getHouseRentAllowance();
		double lva = getLeaveTravelAssitance();
		double meal = getMealCopuns();
		double pf = getPF();
		double gra = getGratuity();
		
		System.out.println("Total fix compensation: " + (basic + hrs + lva + meal + pf + gra));
		
		System.out.println("main method ended");

	}

	double getBasicSalary() {
		System.out.print("Enter Basic Salary: ");
		double basicSal = scanner.nextDouble();
		return basicSal;
	}

	double getHouseRentAllowance() {
		System.out.print("Enter HRA: ");
		double hra = scanner.nextDouble();
		return hra;
	}

	double getLeaveTravelAssitance() {
		System.out.print("Enter LTA: ");
		double lva = scanner.nextDouble();
		return lva;
	}

	double getMealCopuns() {
		System.out.print("Enter meal amount: ");
		double mealCoupns = scanner.nextDouble();
		return mealCoupns;
	}

	double getPF() {
		System.out.print("Enter PF amount: ");
		double pf = scanner.nextDouble();
		return pf;
	}

	double getGratuity() {
		System.out.print("Enter Gratuity Amount: ");
		double grutuity = scanner.nextDouble();
		return grutuity;
	}

}
