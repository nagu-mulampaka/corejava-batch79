package com.oops.inheritance2;

// one class consist of multiple children's will consider as Hierarchical Inheritance
class Human {
	void eat() {
		System.out.println("Humans can eat by using hands !!");
	}

	void sleep() {
		System.out.println("Humans can sleep alteast 8 hours for day !!");
	}
}

class Employee extends Human {
	@Override
	void sleep() {
		System.out.println("Employees can work 18hr per day !! and sleep only 6 hrs per day");
	}
}

class Student extends Human {
	@Override
	void sleep() {
		System.out.println("Student's Can Sleep 6 hours");
		System.out.println("Most students are studios & preparing minimum 18hr per day !!");
	}
}

// Driver Class
public class TestInheritanceDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Student student = new Student();
		student.eat();
		student.sleep();

		System.out.println("main method ended");

	}

}
