package com.abstraction;

public abstract class TestAbs implements TestInterface1 {

	final static int a = 10;
	int x = 100;

	// instance block
	{
		System.out.println("instance block called from abstract class");
	}

	// static block
	static {
		System.out.println("static block called from abstract class");
	}

	TestAbs() {
		System.out.println("no-arg constrcuctor called");
	}

	// abstract method
	abstract void welcome();

	// concrete methods
	void method6() {
		System.out.println("Concrete method from abstract class");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method3() {
		System.out.println("method3 called from Abstract class");
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub

	}

}
