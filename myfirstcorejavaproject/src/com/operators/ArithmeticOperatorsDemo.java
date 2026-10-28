package com.operators;

import java.util.Scanner;

// Arithmetic Operators : +, -, *, /, %
public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter second number: ");
		int secondNumber = scanner.nextInt();

		// String + anything is String only, Here we need to use BODMAS Formula
		// sum
		System.out.println("Addition of the numbers: " + (firstNumber + secondNumber));

		// CE : The operator - is undefined for the argument type(s) String, int
		// System.out.println("Difference of two numbers: " + firstNumber - secondNumber);
		
		// difference
		System.out.println("Difference of two numbers: " + (firstNumber - secondNumber));

		// product 10 * 5 --> 50
		System.out.println("Multiplication of two numbers: " + firstNumber * secondNumber);

		// quotient 98/5 --> 19 --> 56/2 --> 78/6 --> 56/98
		System.out.println("Division of two numbers: " + firstNumber / secondNumber);

		// reminder 88/4 99/5
		System.out.println("Modulus of two numbers: " + firstNumber % secondNumber);

		scanner.close();

	}

}
