package com.oops.inheritance2;

// Implicit Single Inheritance
// Parent class 
class Animal {
	
	void sound() {
		System.out.println("Animal cannot talk but can sound !!");
	}
	
	void walk() {
		System.out.println("Animals can walk and also run");
	}

}

// Single Inheritance
// One Class extends only one class will consider as single inheritance
// Child class
class Dog extends Animal{
	
	@Override
	void sound() {
		System.out.println("Dogs can sound like Bow Bow !!");
	}
}

// Multi-level Inheritance
// one class extends another class, that another class extends one more class and so on will consider as Multi-level Inheritance.
// Grand child class 
class BabyDog extends Dog {
	@Override
	void sound() {
		System.out.println("Baby Dog can sound uff uff");
	}
}

// Driver Class
public class TestInheritanceDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
        BabyDog d = new BabyDog();
        d.sound();
        d.walk();
        System.out.println(d.hashCode());
        
        Dog dog = new Dog();
        dog.sound();
        
        System.out.println("main method ended");
	}

}
