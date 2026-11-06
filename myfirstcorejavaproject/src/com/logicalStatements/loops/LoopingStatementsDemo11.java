package com.logicalStatements.loops;

import java.util.Scanner;

// Write a program to print Math Table using for loop ..?

// Input : 
// Which table do you want to print: 9
// how many times do you want to print 10

// Output
// 9 X 1 = 09
// 9 X 2 = 18
// 9 X 3 = 27
// 9 X 4 = 36
// 9 X 5 = 45
// 9 X 6 = 54
// 9 X 7 = 63
// 9 X 8 = 72
// 9 X 9 = 81
// 9 X 10 = 90

public class LoopingStatementsDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Which table do you want to print: ");
		int table = scanner.nextInt();

		System.out.print("How many time do you want to print: ");
		int times = scanner.nextInt();

		for (int i = 1; i <= times; i++) {
			System.out.println(table + " X " + i + " = " + (i * table));
		}

	}

}
