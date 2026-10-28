package com.operators;

// Assignment Operators : =, +=, -+, *=, /=, %=
public class AssignmentOperatorsDemo {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		float x = 10;
		int result  = 5;
		// Type mismatch: cannot convert from double to int
		// result = (int) (result + 6.7);
		result += 6.7; // Narrowing
		System.out.println(result);
		
		// result = result - 3.9;
		result -= 3.9;
		System.out.println(result);
		
		result *= 4.9; // result = result * 4.9
		System.out.println(result);
		
		result /= 2.5; // results = result / 2.5
		System.out.println(result);
		
		result %= 2.5; // result = result % 2.5
		System.out.println(result);	}

}
