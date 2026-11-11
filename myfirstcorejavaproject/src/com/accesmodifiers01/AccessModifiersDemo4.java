package com.accesmodifiers01;

public class AccessModifiersDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started from TestAccessDemo2 !!");

//		In Java, One class object can create into another classes if the scope is available.
//		But, If the class constructor is private, we cannot create objects, outside of the classes.

//		The constructor TestAccessDemo1() is not visible if the constructor is private.
		AccessModifiersDemo3 t1 = new AccessModifiersDemo3();

//		Accessing the default data members outside of the classes of same package is possible,..
		System.out.println(t1.id2);
		System.out.println(t1.name2);
		t1.method2();

//		Accessing the public data members within the SAME PACKAGE OUTSIDE OF THe CLASS.
		System.out.println(t1.id3);
		System.out.println(t1.name3);
		t1.method3();

//		Accessing the protected data members within the SAME PACKAGE OUTSIDE OF THE CLASS.
		System.out.println(t1.id4);
		System.out.println(t1.name4);
		t1.method4();

//		Accessing the private data members outside of the class is not possible.
//		The field TestAccessDemo1.id1 is not visible
//		System.out.println(t1.id1);
//		The field TestAccessDemo1.name1 is not visible
//		System.out.println(t1.name1);
//		The method method1() from the type TestAccessDemo1 is not visible
//		t1.method1();

	}
}
