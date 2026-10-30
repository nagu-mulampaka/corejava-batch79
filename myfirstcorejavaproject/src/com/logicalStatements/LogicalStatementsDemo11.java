package com.logicalStatements;

import java.util.Scanner;

// write a program to print calculated values from two values based on the symbols
public class LogicalStatementsDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner scanner = new Scanner(System.in);
		String repeat = "";
		
	    do {
	    	System.out.print("Enter a Number: ");
			int a = scanner.nextInt();
			
			System.out.print("Enter b Number: ");
			int b = scanner.nextInt();
			
			System.out.print("Enter a Symbol like (+ - * / %): ");
			char symbol = scanner.next().charAt(0);
			int result = 0;
			
			switch(symbol) {
			case '+' -> result = a + b;
			case '-' -> result = a - b;
			case '*' -> result = a * b;
			case '/' -> result = a / b;
			case '%' -> result = a % b;
			default -> {
				result = 0;
				System.out.println("Entred Symbol is Invalid");
			    }
			}
			System.out.println("The Resulted Value is: " + result);
			System.out.print("Do you want to continue (yes/no): ");
			repeat = scanner.next();
	    } while(repeat.equalsIgnoreCase("yes"));
		
	    System.out.println("Calculator Closed");
		scanner.close();
	}
}
