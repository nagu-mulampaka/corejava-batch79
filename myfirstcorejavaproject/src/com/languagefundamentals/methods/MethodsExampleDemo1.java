package com.languagefundamentals.methods;

public class MethodsExampleDemo1 {
	
	// static method
	public static void welcome() {
		System.out.println("welcome to Java World !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println(Thread.currentThread());
		
		// method calling
		// static methods can call directly using class name
		welcome();
		MethodsExampleDemo1.welcome();
		
		MethodsExampleDemo1 obj = new MethodsExampleDemo1();
		obj.hello();
		
		System.out.println("main method ended");
	}
	
	// instance method
	public void hello() {
		System.out.println("Hello Good Morning");
	}

}
