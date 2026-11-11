package com.accesmodifiers01;

// Illegal modifier for the interface TestIn; 
// only public, <default>, strictfp & abstract are permitted
// private interface TestIn {
//	
// }

//Illegal modifier for the class AccessModifiersDemo1; 
//only public, abstract, strictfp, <default> & final are permitted
public class AccessModifiersDemo1 {

	// private data members
	private int id1;
	private String name;

	// private method
	private void method1() {
		System.out.println("Method1 Called");
	}
	
	// block scope is always class scope
	// instance block
	{
		System.out.println("Instance Block Called");
	}
	
	// static block
	// error : Syntax error, insert "Identifier" to complete CompactConstructorHeader
	static {
		System.out.println("Static Block Called");
	}
	
	// By using private constructor, we can stop the object creation, outside of the classes.
	// private constructors can help to singleton design pattern.
	// private AccessModifiersDemo1() {
	// 	System.out.println("No-arg Constructor is called");
	// }

	public static void main(String[] args) {
		System.out.println("main method started from AccessModifiersDemo1");

		AccessModifiersDemo1 demo = new AccessModifiersDemo1();

		// private data members we can access within the class
		System.out.println(demo.id1);
		System.out.println(demo.name);
		demo.method1();

		System.out.println("main method ended");
	}

	// inner classes & interfaces
	private class TetsA {

	}

	private interface TestB {

	}

}
