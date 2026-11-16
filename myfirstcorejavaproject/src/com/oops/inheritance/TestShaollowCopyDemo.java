package com.oops.inheritance;

class Employee implements Cloneable {

	int id;
	String name;
	Address address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
}

class Address {

	String city;

	public Address(String city) {
		super();
		this.city = city;
	}
}

public class TestShaollowCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started");
		Address address = new Address("Visakhapatnam");

		Employee emp1 = new Employee(101, "Nagu", address);
		System.out.println("****************************");
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.address.city); // vizag
		System.out.println("****************************");

		Employee emp2 = (Employee) emp1.clone();
		System.out.println("****************************");
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		System.out.println(emp2.address.city); // vizag
		System.out.println("****************************");
		
		emp2.id = 102;
		emp2.name = "Hemanth";
		emp2.address.city = "Banglore";
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		System.out.println(emp2.address.city); // banglore
		System.out.println("****************************");
		System.out.println(emp1.id);
		System.out.println(emp1.name);
		System.out.println(emp1.address.city); // banglore
		System.out.println("****************************");
	}

}
