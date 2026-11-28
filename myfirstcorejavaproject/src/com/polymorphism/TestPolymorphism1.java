package com.polymorphism;

public class TestPolymorphism1 {

	public static void main(String[] args) {
		
		TestPolymorphism1 p1 = new TestPolymorphism1();
		System.out.println(p1); // address of the object
		
		System.out.println("Welcome to Polymorphism"); // String
		System.out.println(500090); // int
		System.out.println(6304887542L); // long
		System.out.println(5.9F); // float
		System.out.println(78.5D); // double
		System.out.println('M'); // char
		System.out.println(true); // boolean
		System.out.println();
		
		char[] ch = {'a', 'b', 'c', 'd'};
		System.out.println(ch); // abcd
		
		// byte can converted into short 
		// short can converted into int
		byte b = 10;
		System.out.println(b);

	}

}
