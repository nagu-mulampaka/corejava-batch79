package com.logicalStatements.loops;

import java.util.Scanner;

// Write a program to convert Decimal Number to Binary Number ..?
// 10 --> 2^3 + 2^2 + 2^1 + 2^0 --> 8 + 4 + 2 + 1 = 1010
public class LoopingStatementsDemo20 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a number: ");
		int number = scanner.nextInt();
		int remainder = 0;
		String binaryNumber = "";
		
		// 18
		while(number > 0) {
			remainder = number % 2; // 18%2 = 0, 9%2 = 1, 4%2 = 0, 2%2 = 0, 1%2 = 1 
			number = number / 2; // 18/2 = 9, 9/2 = 4, 4/2 = 2, 2/2 = 1, 1/2 = 0
			binaryNumber = remainder + binaryNumber; // 01001 --> 10010
		}
		
		System.out.println("Binary Number of a Given Decimal number is: " + binaryNumber);
        scanner.close();
	}

}
