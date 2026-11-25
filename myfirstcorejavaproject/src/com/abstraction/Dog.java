package com.abstraction;

public class Dog implements Animal{
	
	@Override
	public void sleep() {
		System.out.println("Dogs Won't sleep at night's and helps villages or city streets");
	}

	@Override
	public void sound() {
		System.out.println("Dog Sounds like Bow Bow");	
	}

	@Override
	public void eat() {
		System.out.println("Dogs can eat anything !! No limts");
	}

	@Override
	public void walk() {
		System.out.println("Dog can walk and also run like anything");
	}

}
