package com.languagefundamentals.constructors;

public class Laptop {

	String model;
	String brand;
	String color;
	double price;
	int ram;

	// Instance initialization block
	{
		System.out.println("Instance block is called");
	}

	// No-arg constructor
	Laptop() {
		System.out.println("No-arg constructor is called");
		this("unknown");
	}

	// One-arg constructor
	Laptop(String model) {
		System.out.println("One-arg constructor is called");
		this(model, "unknown");
		
	}

	// Two-arg constructor
	Laptop(String model, String brand) {
		System.out.println("Two-arg constructor is called");
		this(model, brand, "unknown");
	}

	// Three-arg constructor
	Laptop(String model, String brand, String color) {
		System.out.println("Three-arg constructor is called");
		this(model, brand, color, 10000.00);
	}

	// Four-arg constructor
	Laptop(String model, String brand, String color, double price) {
		System.out.println("Four-arg constructor is called");
		this(model, brand, color, price, 20);
	}

	// Five-arg constructor
	Laptop(String model, String brand, String color, double price, int ram) {
		System.out.println("Five-arg constructor is called");
		this.model = model;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.ram = ram;
	}

	// Main method
	public static void main(String[] args) {

		System.out.println("Main method started");

		Laptop l = new Laptop();
		l.laptopInfo();

    	Laptop l1 = new Laptop("Inspiron");
		l1.laptopInfo();

		Laptop l2 = new Laptop("Pavilion", "HP");
		l2.laptopInfo();

		Laptop l3 = new Laptop("ThinkPad", "Lenovo", "Black");
		l3.laptopInfo();

		Laptop l4 = new Laptop("Vivobook", "Asus", "Silver", 55000.00);
		l4.laptopInfo();

		Laptop l5 = new Laptop("MacBook Air", "Apple", "Midnight", 99900.00, 16);
		l5.laptopInfo();

		System.out.println("Main method ended");
	}

	// Display laptop details
	void laptopInfo() {
		System.out.println("Model of the Laptop: " + model);
		System.out.println("Brand of the Laptop: " + brand);
		System.out.println("Color of the Laptop: " + color);
		System.out.println("Price of the Laptop: " + price);
		System.out.println("RAM of the Laptop: " + ram + " GB");
		System.out.println("******************************");
	}
}