package com.operators;

// ==, !=, >, >=, <, <= --> will return boolean expressions either true or false
// == operator checks the values or content if the data type is primitive.
// == operator checks the address if the data type is object type.
public class ComprisonOperatorsDemo {

	public static void main(String[] args) {

		String s1 = "nagu"; // SCP (String constant pool) --> 1
		String s2 = new String("Nagu"); // Heap --> 2
		String s3 = new String("Ram"); // --> 2 objects

		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		int a = 10;
		int b = 20;
		int c = 20;

		System.out.println(a == b); // false
		System.out.println(b == c); // true

		System.out.println(a < b); // true
		System.out.println(a <= c); // true
		System.out.println(c >= a); // true
		System.out.println(b > c); // false
		System.out.println(b != a); // true

	}

}
