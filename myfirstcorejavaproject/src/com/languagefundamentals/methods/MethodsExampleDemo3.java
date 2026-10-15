package com.languagefundamentals.methods;

class Student {
	int id;
	String name;
	int age;
}

public class MethodsExampleDemo3 {
	void main(String[] args) {
		System.out.println("main method started");
		
		System.out.println("student info method started");
		Student student = getStudent();
		System.out.println(student);
		System.out.println(student.id);
		System.out.println(student.name);
		System.out.println(student.age);
		System.out.println("student info method ended");
		
		getStudent1Info(student);

		System.out.println("main method ended");
	}
	
	void getStudent1Info(Student s) {
		System.out.println("student 1 info started");
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println("student 1 info ended");
	}

	// Factory Method
	Student getStudent() {
		Student student = new Student(); // address of the object
		student.id = 101;
		student.name = "Mulampaka Nagu";
		student.age = 26;
		return student;
	}
}
