package com.shallowvsdeep;

class Student implements Cloneable{
	int id;
	String name;
	Address address;

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	void studentInfo() {
		System.out.println("*********************************");
		System.out.println("Student Id: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("Student Address: " + address.city);
	}
}

class Address {
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}
}

public class TestShallowCopyDemo1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started");
		Address address = new Address("Visakhapatnam");
		Student student1 = new Student(1, "Nagu", address);
		student1.studentInfo();
		
		Student student2 = (Student) student1.clone();
		student2.id = 2;
		student2.name = "Hemanth";
		student2.address.city = "Hyderabad";
		student2.studentInfo();
		
		student1.studentInfo();
        System.out.println("main method ended");
        
	}

}
