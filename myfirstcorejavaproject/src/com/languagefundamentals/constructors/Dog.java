package com.languagefundamentals.constructors;

// this & super are the keywords in java
// this is a keyword to invoke current class object data members.
// super is a keyword to invoke parent class object data members.
// this & super we can use in instance methods and constructors but not in static methods.

class Animal {
	int age = 5;
	String bread = "Labrador Retriever";
	
	public static void main(String[] args) {
		System.out.println("main method started from Animal");
	}
}

public class Dog extends Animal{
	
	int age = 8;
	String bread = "German Shepherd"; 

	public static void main(String[] args) {
		System.out.println("main method started from Dog");
		Dog d = new Dog();
		d.dogInfo();
		
		// CE : Cannot use super/this in a static context
		//.System.out.println("Age of the Dog: " + super.age);
		// System.out.println("Bread of the Dog: " + super.bread);
		// System.out.println("Age of the Dog: " + this.age);
		// System.out.println("Bread of the Dog: " + this.bread);
	}
	
	void dogInfo() {
		System.out.println("******* Parent Class Data menbers *******");
		System.out.println("Age of the Dog: " + super.age);
		System.out.println("Bread of the Dog: " + super.bread);
		System.out.println("******* Child Class Data menbers *******");
		System.out.println("Age of the Dog: " + this.age);
		System.out.println("Bread of the Dog: " + this.bread);
	}

}
