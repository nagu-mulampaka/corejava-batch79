package com.logicalStatements.loops;

// write a program to print 1 to 100 even numbers using for loop
public class LoopsDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");

		// Even numbers Loop
		System.out.println("Even Numbers");
		for (int i = 0; i <= 100; i = i + 2) {
			if (i != 0) {
				System.out.print(i + " ");
			}
		}

		// Odd Numbers Loop
		System.out.println("\nOdd Numbers");
		for (int i = 1; i <= 100; i = i + 2) {
			if (i != 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\nmain method ended");
	}

}
