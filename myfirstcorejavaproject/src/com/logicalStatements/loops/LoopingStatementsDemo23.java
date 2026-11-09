package com.logicalStatements.loops;

// Write a program swap elements using third variable
public class LoopingStatementsDemo23 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int x = 10;
		int y = 20;
		
		System.out.println("Before Swapping x and y values");
		System.out.println("X value is: " + x);
		System.out.println("Y value is: " + y);
		
		int temp = x;
		x = y;
		y = temp;

		System.out.println("\nAfter Swapping x and y values");
		System.out.println("X value is: " + x);
		System.out.println("Y value is: " + y);

	}

}
