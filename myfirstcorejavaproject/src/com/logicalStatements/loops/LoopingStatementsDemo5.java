package com.logicalStatements.loops;

import java.util.Scanner;

// A factor is a whole number that divides another number completely meaning that remainder is zero.
// Write a program to print factors of a given number ..?
// input : number --> 6
// output : numbers --> 1 2 3 6

// input : number --> 24
// output : numbers --> 1 2 3 4 6 8 12 24
public class LoopingStatementsDemo5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("main method started");
		System.out.print("Enter a number here: ");
		int number = scanner.nextInt();

		findFactors(number);
		scanner.close();
	}
	static void findFactors(int number) {
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(number);
	}

}
