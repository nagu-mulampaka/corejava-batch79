package com.oops.inheritance2;

abstract class TestA {
	public static void main(String[] args) {
		System.out.println("main method started from Test A");	
	}
	
	abstract void hello();
}

class TestB extends TestA{
	public static void main(String[] args) {
		System.out.println("main method started from Test B");
	}

	@Override
	void hello() {
		System.out.println("Hello");
	}
}

abstract class TestC extends TestB {
	
	@Override
	abstract void hello();
}

public class TestDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
