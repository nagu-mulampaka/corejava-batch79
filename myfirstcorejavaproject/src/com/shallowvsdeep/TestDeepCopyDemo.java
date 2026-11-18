package com.shallowvsdeep;

class Employee {
	
	int id;
	String name;
	String email;
	Address1 address1;
	
	public Employee(int id, String name, String email, Address1 address1) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address1 = address1;
	}
	
	void employeeInfo() {
		System.out.println("*************************");
		System.out.println("Employee Id: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Email: " + email);
		System.out.println("Employee Address: " + address1.city);
	}
	
	// copy constructor
	public Employee(Employee emp) {
		id = emp.id;
		name = emp.name;
		email = emp.email;
		this.address1 = new Address1(emp.address1);;
	}

}

class Address1 {
	String city;

	public Address1(String city) {
		super();
		this.city = city;
	}
	
	Address1(Address1 address) {
		this.city = address.city;
	}
}

public class TestDeepCopyDemo {

	public static void main(String[] args) {
		System.out.println("main method started");
        Address1 add = new Address1("Visakhapatnam");
        Employee emp1 = new Employee(1, "Nagu", "nagumulampaka@gmail.com", add);
        emp1.employeeInfo();
        
        Employee emp2 = new Employee(emp1);
        emp2.employeeInfo();
        
        emp2.id = 2;
        emp2.name = "hemanth";
        emp2.email = "hemanthkumar@gmail.com";
        emp2.address1.city = "Kadapa";
        emp2.employeeInfo();
        
        emp1.employeeInfo();
	}

}
