package com.operators;

class A {
	
}
class B extends A{
	
}

public class InstanceofOperatorDemo {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		System.out.println(b instanceof B); // true
		System.out.println(a instanceof A); // true
		System.out.println(a instanceof A); // true
		System.out.println(a instanceof B); // false
		
		Integer i1 = 10;
		System.out.println(i1 instanceof Integer); // true
		System.out.println(i1 instanceof Number); // true
		System.out.println(i1 instanceof Object); // true
		
		Object obj = 100;
		System.out.println(obj instanceof Number); // true
		
		String s = "one";
		System.out.println(s instanceof Object); // true
		System.out.println(s instanceof String); // true
		// Incompatible conditional operand types String and Integer
		// System.out.println(s instanceof Integer);
		System.out.println(null instanceof Integer); // false
		System.out.println(null instanceof Number); // false
		System.out.println(null instanceof String); // false
	}

}
