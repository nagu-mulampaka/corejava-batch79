package com.logicalStatements.loops;

import java.util.Scanner;

// Write a program to print factorial of a given number using for recursion ..?
public class LoopingStatementsDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number here: ");
		int number = scanner.nextInt();

		int fact = factorial(number);
		System.out.println("factorial of a given number is: " + fact);
		scanner.close();
	}

	static int factorial(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}
		return number * factorial(number - 1);
	}

}
