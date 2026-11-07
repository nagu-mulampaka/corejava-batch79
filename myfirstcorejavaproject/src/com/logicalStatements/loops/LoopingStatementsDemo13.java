package com.logicalStatements.loops;

import java.util.Scanner;

// Write a program to check the given number is prime or not ..?
public class LoopingStatementsDemo13 {

	static boolean isPrime(int number) {
		boolean status = true;
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to check prime: ");
		int number = scanner.nextInt();

		boolean prime = isPrime(number);
		if (prime) {
			System.out.println("The given number is prime");
		} else {
			System.out.println("The given number is not a prime");
		}
        scanner.close();
	}

}
