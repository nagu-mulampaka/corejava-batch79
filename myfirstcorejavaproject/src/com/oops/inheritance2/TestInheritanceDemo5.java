package com.oops.inheritance2;

class TestA1 {

}

class TestB1 {
	TestB1() {
		System.out.println("Test B Constructor is called");
	}
}

class TestC1 extends TestB1 {
	TestC1() {
		super();
		System.out.println("Test C Constructor is called");
	}
}

public class TestInheritanceDemo5 {
	public static void main(String[] args) {
		System.out.println("main method started");
		TestC1 c1 = new TestC1();
		System.out.println("main method ended");
	}
}
