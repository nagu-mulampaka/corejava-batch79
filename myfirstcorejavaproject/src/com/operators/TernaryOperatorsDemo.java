package com.operators;

// Ternary Operators : ? and :
// The Syntax : (condition) ? statement1 if condition is true : statement2 if the condition is false;
// it is working like if else conditions
public class TernaryOperatorsDemo {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 100;
		
		int max = (x > y) ? x : y;
		System.out.println("Max Value from two numbers: " + max);
		
		int age = 21;
		String isEligible = (age > 18) ? "Yes the given age is eligible for vote" : "No";
		System.out.println("Is the given age is Eligible for Vote ..? " + isEligible);
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		int max_value = (a>b) ? 
				        ((a>c) ? a : c)
				        : (b>c) ? b : c ;
		System.out.println("Max value is: " + max_value);

	}

}
