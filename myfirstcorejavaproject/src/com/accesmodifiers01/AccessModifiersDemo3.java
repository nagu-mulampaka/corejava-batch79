package com.accesmodifiers01;

//Illegal modifier for the class TestAccessDemo1; 
//only public,<default>,strictfp, abstract & final are permitted
public class AccessModifiersDemo3 {

//	By default, Blocks scope is, class scope.
	{
		System.out.println("instance block loaded ");
	}

	static {
		System.out.println("static block loaded ");
	}

//	In Java, If we want to achieve singleton design pattern, the first step is constructor must be private.
//	private TestAccessDemo1() {
//		System.out.println("no-arg constructor called ");
//	}

	// default Data Members
	int id2 = 45;
	String name2 = "Rohit";

	void method2() {
		System.out.println("method2 called ");
	}
	

    // protected Data Members
	protected int id4 = 5;
	protected String name4 = "Nagu";

	protected void method4() {
		System.out.println("method4 called ");
	}

	// public Data Members
	public int id3 = 7;
	public String name3 = "MSD";

	public void method3() {
		System.out.println("method3 called ");
	}

	// private Data Members
	private int id1 = 18;
	private String name1 = "Virat";

	private void method1() {
		System.out.println("method1 called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from TestAccessDemo1");

		AccessModifiersDemo3 t1 = new AccessModifiersDemo3();

//		Accessing the private data members within the class.
		System.out.println(t1.id1);
		System.out.println(t1.name1);
		t1.method1();

//		Accessing the default data members within the class.
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();

//		Accessing the public data members within the class.
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();

//		Accessing the protected data members within the class.
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();

		System.out.println("main method ended from TestAccessDemo1");
	}

	private class TestCl1 {

	}

	private interface TestIn1 {

	}
}