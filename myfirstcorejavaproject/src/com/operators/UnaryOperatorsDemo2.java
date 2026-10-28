package com.operators;

public class UnaryOperatorsDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int x = 10;
		int y = 20;
		
		System.out.println(--x); // 9
		System.out.println(x++); // 9 --> 10
		System.out.println(++x); // 11
		System.out.println(x--); // 11 --> 10
		System.out.println(x--); // 9
		System.out.println(--y); // 19
		System.out.println(++y); // 20
		System.out.println(--x); // 8
		System.out.println(x++); // 8 --> 9
		System.out.println(--y); // 19
		System.out.println(--y); // 18
		System.out.println(y--); // 18 --> 17
		System.out.println(y++); // 17 --> 18
		System.out.println(y--); // 18 --> 17
		
		System.out.println(x + y); // 9 + 17 --> 26
		System.out.println(++x + ++y); // 10 + 18 = 28
		System.out.println(++x - ++y + --x + ++y); // 22
		System.out.println("x value is: " + x); // 11
		System.out.println("y value is: " + y); // 18
	}

}
