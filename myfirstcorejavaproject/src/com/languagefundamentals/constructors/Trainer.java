package com.languagefundamentals.constructors;

class Person {
	
	int age;
	String name;
	String city;
	
	public Person() {
		System.out.println("Person Class Constructor Called");
	}

	public Person(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}
	
}

// Either this() or super() can call but not both
// Until java 24 version this() or super() must be the first line of the any constructor.
// But, After 25 onwards, this() and super() can be written anywhere in the constructor based on Requirements.
public class Trainer extends Person{
	
	// by using child class we can call super()
	public Trainer() {
		super(26, "Unknown", "Unknown");
		System.out.println("Trainer Class Constructor Called");
	}
	
	Trainer(int age, String name, String city) {
		super.age = age;
		super.name = name;
		super.city = city;
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method started form Trainer");
		
        Trainer trainer = new Trainer();
        trainer.trainerInfo();       
        
        Trainer trainer2 = new Trainer(26, "Nagu", "Visakhapatnam");
        trainer2.trainerInfo();  
        
        System.out.println("main method ended from Trainer");
	}
	

	void trainerInfo() {
		System.out.println("Age of the Trainer: " + age);
		System.out.println("Name of the Trainer: " + name);
		System.out.println("City of the Trainer: " + city);
		System.out.println("*********************************");
	}
}
