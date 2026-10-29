package com.logicalStatements;

import java.util.Scanner;

// write a program to find whether the given number is positive or negative
public class LogicalStatementsDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner scanner = new Scanner(System.in);

		System.out.print("enter number here: ");
		int number = scanner.nextInt();

		if (number > 0)
			System.out.println("The Given Number is Positive");
		else
			System.out.println("The Given Number is Negative");

		System.out.println("Main method ended");

		scanner.close();
	}

}
