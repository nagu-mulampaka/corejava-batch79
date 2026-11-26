package com.abstraction;

public class Monkey implements Animal{
	
	// Default methods are allowed only in interfaces.
	// but, we can override in classes.
	@Override
	public void run() {
		System.out.println("Monkey can also Jump !!");
	}

	@Override
	public void sound() {
		System.out.println("Monkey can soung like kichhhh kichhhh");
	}

	@Override
	public void eat() {
		System.out.println("Monkey can eat banana's");
	}

	@Override
	public void walk() {
		System.out.println("Monkey can walk and also jump");
	}

}
