package com.logicalStatements.loops;

// Write a program swap elements without using third variable
public class LoopingStatementsDemo24 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int x = 30;
		int y = 40;

		System.out.println("Before Swapping x and y values");
		System.out.println("X value is: " + x);
		System.out.println("Y value is: " + y);
		
		x = x + y; // 70
		y = x - y; // 30
		x = x - y; // 40
		
		System.out.println("\nAfter Swapping x and y values");
		System.out.println("X value is: " + x);
		System.out.println("Y value is: " + y);
	}

}
