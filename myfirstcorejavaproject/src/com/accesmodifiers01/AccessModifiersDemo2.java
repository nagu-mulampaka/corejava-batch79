package com.accesmodifiers01;

public class AccessModifiersDemo2 {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		// we can create one class object into another class.
		// if the class constructor is private we cannot create objects outside of the classes to.
		// Error : The constructor AccessModifiersDemo1() is not visible
		AccessModifiersDemo1 demo = new AccessModifiersDemo1();
		
		// private data members we can not access outside of the class
		// System.out.println(demo.id1);
		// System.out.println(demo.name);
		// demo.method1();

        
	}

}
