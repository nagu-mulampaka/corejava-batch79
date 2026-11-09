package com.logicalStatements.loops;

import java.util.Scanner;

// Write a program to print the given number is palindrome or not ...?
public class LoopingStatementsDemo17 {

	static int reverseOfNumber(int number) {
		int lastDigit = 0;
		int reverse = 0;

		while (number > 0) {
			lastDigit = number % 10;
			number = number / 10;
			reverse = reverse * 10 + lastDigit;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("main method started");
		System.out.print("Enter a number here: ");
		int number = scanner.nextInt();

		int reverseResults = reverseOfNumber(number);

		if (number == reverseResults) {
			System.out.println("The Given number is Palindrome");
		} else {
			System.out.println("The Give number is not a Palindrome");
		}
		System.out.println("Reverse of the Given Number is: " + reverseResults);
		scanner.close();
	}

}
