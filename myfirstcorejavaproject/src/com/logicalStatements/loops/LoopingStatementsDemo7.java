package com.logicalStatements.loops;

import java.util.Scanner;

// Write a program to print factorial of a given number using for loop ..?
// input : 5 --> 5! 
// output : 5 x 4 x 3 x 2 x 1 = 120
public class LoopingStatementsDemo7 {

	static int factorial(int number) {
		int fact = 1;
		for (int i = number; i >= 1; i--) {
			fact = fact * i; // 5 x 4 = 20 x 3 = 60 x 2 = 120 x 1 = 120
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number here: ");
		int number = scanner.nextInt();

		int fact = factorial(number);
		System.out.println("Factorial of a given number is: " + fact);
		
		scanner.close();

	}

}
