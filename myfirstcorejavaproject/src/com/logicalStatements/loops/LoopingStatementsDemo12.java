package com.logicalStatements.loops;

import java.util.Scanner;

// Write a program to print 0 to 100 prime numbers ..?
public class LoopingStatementsDemo12 {

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			status = false;
		} 
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number upto where you want to print: ");
		int number = scanner.nextInt();

		for (int i = 1; i <= number; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
