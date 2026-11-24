package com.oops.inheritance2;

class Vehicle {
	
	void hello() {
		
	}
	
}

class Person {
	
	void hello() {
		
	}
	
}

/// Why Java Does not support multiple inheritance ..?
/// Due to Diamond problem with methods and constructors.
/// What is Diamond Problem..?
/// Diamond problem define in two ways
/// 1) with methods
/// 2) with constructors

/// 1) With Methods : If the two parent classes consist of same method, by using child class 
/// object if we Parent classes method, which class method will execute is the ambiguity.
/// So, to avoid such ambiguity java does not support multiple Inheritance.

/// Counter Question ..? --> If I don't have same method the is it possible ..?
/// No By extending two classes itself is CE.

/// With Constructors :
/// If the child class no-arg constructor by default calls the super() class constructor, 
/// If the child class constructor extends multiple classes which class super() of constructor should call is the ambiguity.

// Multiple Inheritance is not possible with classes, 
// If we try to extends multiple classes will get CE.
// CE : syntax error on token ", ", . expected
// class Car extends Vehicle, Person{
//	Car c = new Car();
//	c.hello();
// }

public class TestInheritanceDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		
		System.out.println("main method ended");
	}

}
