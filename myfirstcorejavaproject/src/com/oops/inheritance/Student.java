package com.oops.inheritance;

// implicit Single Inheritance
// Here, Student class extends object class
// In Java, Every class extends object class whether explicitly or not.
public class Student {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		int a = 0x2b2fa4f7; // Hexa-Decimal Representation of object
		System.out.println(a);
		
		Student student = new Student();
	    System.out.println(student.hashCode());
	    System.out.println(student);
	    
	    // Returns a string representation of the object.
        System.out.println(student.toString());
	}

}
