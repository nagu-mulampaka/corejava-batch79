package com.abstraction;

public class Monkey implements Animal{

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
