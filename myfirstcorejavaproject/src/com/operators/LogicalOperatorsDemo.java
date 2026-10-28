package com.operators;

// Logical Operators : &&, ||, ! 
// Logical statements will works with conditional statements and returns boolean expressions
public class LogicalOperatorsDemo {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int x = 10;
		int y =  20;
		int z = 30;
		
		// The operator && is undefined for the argument type(s) int, int
		// System.out.println(x && y);
		
	    System.out.println("******* Logical AND(&&) *******");
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false --> Dead code
		System.out.println(false && false); // false --> Dead Code
		
		System.out.println(++x <= 10 && ++x >= 10); // Dead code
		System.out.println("x value is: " + x); // 11
		
		System.out.println(x > y && x > z); // false
		System.out.println(x < y && x < z); // true
		System.out.println(x < z && y > z); // false
		System.out.println(x > z && x < z); // false
		
		System.out.println("******* Logical OR(||) *******");
		System.out.println(true || true); // true --> Dead Code
		System.out.println(true || false); // true --> Dead Code
		System.out.println(false || true); // true
 		System.out.println(false || false); // false
 		
 		System.out.println(++x >= 10 || ++x >= 10);
 		System.out.println("x value is: " + x); // 12
 		
 		System.out.println(x > y || x > z); // false
		System.out.println(x < y || x < z || y < z || z > y); // true
		System.out.println(x < z || y > z); // true
		System.out.println(x > z || x < z); // true
		
		System.out.println("******* Logical NOT(!) *******");
		System.out.println(!true); // false
		System.out.println(!(x > z)); // true
	}
}
