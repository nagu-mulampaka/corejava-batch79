package com.languagefundamentals.methods;

public class CalculatorDemo {

	void main(String[] args) {
       System.out.println("main method is started");
       
       int sum = addition();
       System.out.println("Addition of Two Numbers: " + sum);
       
       double product = multiplication();
       System.out.println("Multiplication of two numbers: " + product);
       
       System.out.println("main method is ended");
	}
	
	int addition() {
		System.out.println("addition method is called");
		int a = 100;
		int b = 200;
		int sum = a + b;
		return sum;
	}
	
	double multiplication() {
		System.out.println("multiplication method is called");
		int a = 300;
		int b = 5;
		int product = a * b;
		return product;
	}

}
