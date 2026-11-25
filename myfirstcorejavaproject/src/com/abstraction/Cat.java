package com.abstraction;

// Cat IS-A animal
public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Meow Meow");
	}

	@Override
	public void eat() {
		System.out.println("Cat can eat rat");
	}

	@Override
	public void walk() {
		System.out.println("Cat can walk like cat-walk");
	}

}
