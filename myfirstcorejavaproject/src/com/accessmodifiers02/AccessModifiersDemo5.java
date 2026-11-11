package com.accessmodifiers02;

import com.accesmodifiers01.AccessModifiersDemo3;

class AccessModifiersDemo6 extends AccessModifiersDemo5 {
	public static void main(String[] args) {
		AccessModifiersDemo6 demo6 = new AccessModifiersDemo6();
		System.out.println(demo6.id4);
	}
}

// sub class or child class or derived class
public class AccessModifiersDemo5 extends AccessModifiersDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		AccessModifiersDemo3 demo3 = new AccessModifiersDemo3();
		
		// Accessing the public data outside of the packages is also possible.
		System.out.println(demo3.id3);
		System.out.println(demo3.name3);
		demo3.method3();
		
		// Accessing the protected data members outside of the packages not possible directly.
		// System.out.println(demo3.id4);
		// System.out.println(tdemo31.name4);
		// demo3.method4();
		
		AccessModifiersDemo5 demo5 = new AccessModifiersDemo5();
		System.out.println(demo5.id4);
		System.out.println(demo5.name4);
		demo5.method4();
		
		// Even though, your the class is public but the data members are default, 
		// so default data members, we cannot access outside of the packages.
		// System.out.println(demo3.id2);
		// System.out.println(demo3.name2);
		// demo3.method2();

	}

}
