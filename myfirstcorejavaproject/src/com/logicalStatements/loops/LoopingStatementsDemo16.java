package com.logicalStatements.loops;

import java.util.Scanner;

// Write a program to print the given number in a reverse order ..?
// input : 123
// output : 321

// input : 12345
// output : 54321
public class LoopingStatementsDemo16 {
	
	static int reverseNumber(int number) {
		int lastDigit = 0;
		int reverse = 0;
		while(number > 0) {
			lastDigit = number % 10; // 456 % 10 --> 6, 45 % 10 --> 5, 4 % 10 = 4
			number = number / 10; // 456 / 10 --> 45, 45 / 10 --> 4, 4 / 10 = 0
			reverse = reverse * 10 + lastDigit; // 654
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number here: ");
		int number = scanner.nextInt(); // 456
		int reverse = reverseNumber(number);
		System.out.println("Reverse of the given number is: " + reverse);
		scanner.close();
	}

}
