package com.oops.inheritance2;

interface Book {
	void javaInfo();
}

class J2se implements Book {

	@Override
	public void javaInfo() {
		System.out.println("Java is Simple when you practice !!");
	}
	
	void java8Info() {
		System.out.println("Java 8 More simple !!");
	}
}

//A class extends a class and also implements interface will consider as Hybrid inheritance.
//a combination of Multi-level & Hierarchical inheritance will also consider as Hybrid Inheritance.
class J2EE extends J2se implements Book {
	
}
  
public class TestInheritanceDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		J2EE j2e = new J2EE();
		j2e.javaInfo();
		j2e.java8Info();
		
        System.out.println("main method ended");
	}

}
