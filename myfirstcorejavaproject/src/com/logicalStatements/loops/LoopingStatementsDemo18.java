package com.logicalStatements.loops;

import java.util.Scanner;

// Write a program to find the digits count of the given number ..?
public class LoopingStatementsDemo18 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number here: ");
		int number = sc.nextInt();
		int digitCount = 0;

		while (number > 0) {
			number = number / 10; // 123/10 = 12 --> 12/10 = 1 --> 1/10 --> 0
			digitCount++;
		}
		
		System.out.println("count of the given digits are: " + digitCount);
	}

}
