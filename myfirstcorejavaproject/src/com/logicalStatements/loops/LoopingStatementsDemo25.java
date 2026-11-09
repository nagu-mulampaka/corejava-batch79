package com.logicalStatements.loops;

// Write a program swap elements using bitwise (XOR) Operator.
public class LoopingStatementsDemo25 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int x = 10;
		int y = 20;

		System.out.println("Before Swapping x and y values");
		System.out.println("X value is: " + x);
		System.out.println("Y value is: " + y);
		
		// 16  8  4  2  1
		// 01010
		// 10100
		// -------------
		// 16 8 4 2
		x = x ^ y; // 30
		y = x ^ y; // 
		x = x ^ y; 
		
		System.out.println("\nAfter Swapping x and y values");
		System.out.println("X value is: " + x);
		System.out.println("Y value is: " + y);

	}

}
