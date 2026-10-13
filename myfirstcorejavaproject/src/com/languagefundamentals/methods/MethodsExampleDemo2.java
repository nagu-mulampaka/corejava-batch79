package com.languagefundamentals.methods;

// write a program to print calculated values for addition, subtraction, multiplication, division and modules
// by using Arithmetic Operators --> +, -, *, /, %
// No Return type + with parameters
public class MethodsExampleDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		// call by values
		// methods calling by passing the values : arguments
		addition(10, 20); // sum
		subtraction(23, 3); // difference
		multiplication(10, 23); // product
		division(98, 5); // quotient --> 19
		modulus(98, 5); // reminder --> 3

		System.out.println("main method ended");
	}

	// a & b will consider as Parameters
	static void addition(int a, int b) {
		System.out.println("Addition method called");
		System.out.println("Addition Results is: " + (a + b));
	}

	static void subtraction(int a, int b) {
		System.out.println("subtraction method called");
		System.out.println("Subtraction  Results is: " + (a - b));
	}

	static void multiplication(int a, int b) {
		System.out.println("multiplication method is called");
		System.out.println("multiplication Results is: " + (a * b));
	}

	static void division(int a, int b) {
		System.out.println("division method is called");
		System.out.println("division Results is: " + (a / b));
	}

	static void modulus(int a, int b) {
		System.out.println("modulus method is called");
		System.out.println("modulus Results is: " + (a % b));
	}

}
