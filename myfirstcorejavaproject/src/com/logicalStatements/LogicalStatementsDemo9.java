package com.logicalStatements;

import java.util.Scanner;

// write a program to print day info based on the day number
public class LogicalStatementsDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a Day Number Here: ");
		int day = scanner.nextInt();

		switch (day) {
		case 1 -> System.out.println("SUNDAY");
		case 2 -> System.out.println("MONDAY");
		case 3 -> System.out.println("TUESDAY");
		case 4 -> {
			System.out.println("WEDNESDAY");
			System.out.println("Wednesday is cool day");
		}
		case 5 -> System.out.println("THURSDAY");
		case 6 -> System.out.println("FRIDAY");
		case 7 -> System.out.println("SATURDAY");
		default -> System.out.println("Entered Number is Invalid Day");
		}
		scanner.close();
	}

}
