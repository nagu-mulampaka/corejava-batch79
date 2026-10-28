package com.operators;

public class ShiftOperatorsDemo {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int x = 79;
		int y = 2;
		System.out.println(x << y); // 316
		
		int a = 83;
		int b = 2;
		System.out.println(a >> b); // 20
		System.out.println(a >>> b); // 20 (signed right shift operator)
		
		System.out.println("main method ended");
	}

}
