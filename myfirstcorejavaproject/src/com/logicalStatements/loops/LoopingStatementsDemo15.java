package com.logicalStatements.loops;

import java.util.Scanner;

// write a program to print sum of the digits of a given number ..?
// input : 123 = 6
// input : 5678 = 26
// input : 1 = 1
public class LoopingStatementsDemo15 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int sum = 0;
		int lastDigit = 0;
		
		while(number > 0 ) {
			lastDigit = number % 10;
			number = number / 10;
			sum = sum + lastDigit;
		}
        
		System.out.println("Sum of the given number is: " + sum);
		scanner.close();
	}
}
