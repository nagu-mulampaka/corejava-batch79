package com.logicalStatements.loops;

import java.util.Scanner;

// What is Perfect Number Means sum of it's factors excluding itself.
// Write a program to find whether the given number is perfect or not ..?
// 6 --> 1 2 3 6 --> 1 + 2 + 3 = 6
// 28 --> 1 2 4 7 14 --> 28
// 496 --> 

// input : Number --> 6
// output : true or false --> boolean
public class LoopingStatementsDemo6 {

	static boolean isPerfect(int number) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % 2 == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("main method started");
		System.out.print("Enter a number here: ");
		int number = scanner.nextInt();

		boolean status = isPerfect(number);
		if (status) {
			System.out.println("The Given Number is Perfect");
		} else {
			System.out.println("The Given Number is Not Perfect");
		}
		
		scanner.close();
	}

}
