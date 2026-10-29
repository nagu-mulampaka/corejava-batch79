package com.logicalStatements;

import java.util.Scanner;

// whenever we have multiple conditions to check and provide unique solution 
// for each condition then will go for else-if.
// write a program to print grades based on the marks percentage ..?
public class LogicalStatementsDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your marks Percentage: ");
		double marksPercentage = scanner.nextDouble();

		if (marksPercentage > 100 || marksPercentage < 0) {
			System.out.println("Invalid Marks to Calculate !!");
		} else if (marksPercentage >= 90) {
			System.out.println("Grade A");
		} else if (marksPercentage >= 80) {
			System.out.println("Grade B");
		} else if (marksPercentage >= 70) {
			System.out.println("Grade C");
		} else if (marksPercentage >= 60) {
			System.out.println("Grade D");
		} else if (marksPercentage >= 35) {
			System.out.println("Just Passed");
		} else {
			System.out.println("Filed !!");
		}
		scanner.close();
	}

}
