package com.logicalStatements.loops;

import java.util.Scanner;

// Write a program to find the given number is Armstrong number or not ..?
// An Armstrong number is a number that equals the sum of its own digits
// each raised the power of the number of digits 
// for example --> 153 --> 1^3 + 5 ^ 3 + 3 ^ 3 ==> 153. 
public class LoopingStatementsDemo19 {

	public static void main(String[] args) {
		System.out.println("main method started");
		// System.out.println(Math.pow(5, 2));

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number here: ");
		int number = scanner.nextInt();
		int lastDigit = 0;
		int sum = 0;
		int digitCount = 0;
		int originalNumber = number;
		int temp = number;

//		while (number > 0) {
//			number = number / 10;
//			digitCount++;
//		}
		
		String str = Integer.toString(number);
		digitCount = str.length();

		while (originalNumber > 0) {
			lastDigit = originalNumber % 10;
			originalNumber = originalNumber / 10;
			// sum = sum + lastDigit * lastDigit * lastDigit;
			sum = (int) (sum + Math.pow(lastDigit, digitCount));
		}

		System.out.println("Sum of the given number is: " + sum);

		if (sum == temp) {
			System.out.println("The Given Number is Armstrong Number");
		} else {
			System.out.println("Then Given Number is not a Armstrong Number");
		}
		scanner.close();
	}

}
