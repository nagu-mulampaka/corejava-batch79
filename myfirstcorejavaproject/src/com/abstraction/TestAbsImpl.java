package com.abstraction;

// Driver Class
public class TestAbsImpl {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		// Even though, we unable to create an object of abstract class still we can access 
		// abstract class instance methods by using child object with parent reference and with the help of up-casting
		// Cannot instantiate the type TestAbs
		// TestAbs abs = new TestAbs();
		
		TestAbs t1 = new Test1();
		t1.method1();
		t1.method2();
		t1.method3();
		t1.method6();
	}

}
