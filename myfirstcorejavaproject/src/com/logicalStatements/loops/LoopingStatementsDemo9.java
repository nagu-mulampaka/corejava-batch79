package com.logicalStatements.loops;

import java.util.Scanner;

// Write a program Fibonacci Series  ..?
// input : 10
// output : print 10 fibonacci series values : 0 1 1 2 3 5 8 13 21 34 
public class LoopingStatementsDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many values you want to print: ");
		int number = scanner.nextInt();

		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + " " + n2);

		for (int i = 1; i <= number - 2; i++) {
			int n3 = n1 + n2; // 1
			System.out.print(" " + n3); // 1
			n1 = n2;
			n2 = n3;
		}
	}

}
