package com.languagefundamentals.constructors;

public class Student {
	
	int roll_number;
	String name;
	int age;
	String course;
	
	// no-arg constructor
	Student() {
		System.out.println("no-arg constructor is called");
		roll_number = 42;
		name = "unknown";
		age = 18;
		course = "unknown";
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		// The below Object is created with the help of default constructor (if no constructors in a class)
		// The below Object is created with the help of no-arg constructor
		Student student1 = new Student();
		student1.getStudentInfo();
		
		Student student2 = new Student();
		student2.getStudentInfo();
		
		Student student3 = new Student();
		student3.getStudentInfo();

		System.out.println("main method ended");
	}
	
	void getStudentInfo() {
		System.out.println("Roll Number: " + roll_number);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Course: " + course);
	}

}
