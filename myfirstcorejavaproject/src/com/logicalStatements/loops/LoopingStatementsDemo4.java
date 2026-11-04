package com.logicalStatements.loops;

// write a program to print 10 to 0 Odd Numbers using for loop
public class LoopingStatementsDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		System.out.println("Odd Numbers");
		for (int i = 10; i >= 0; i--) {
			if (i % 2 == 1 && i != 0) {
				System.out.print(i + " ");
			}
		}
		
		// Even Numbers
		System.out.println("\nEven Numbers");
		for (int i = 10; i >= 0; i--) {
			if (i % 2 == 0 && i != 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\nmain method ended");
	}

}
