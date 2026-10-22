package com.languagefundamentals.constructors;

public class Bike {

	String model;
	String brand;
	double price;
	String color;
	int year;

	// Instance Initialization Block
	{
		System.out.println("Instance block is called");
	}

	// No-Argument Constructor
	Bike() {
		System.out.println("No-Argument Constructor Called");
		model = "Unknown";
		brand = "Unknown";
		price = 100000.00;
		color = "Unknown";
		year = 2024;
	}

	// One-Argument Constructor
	Bike(String model) {
		System.out.println("One-Argument Constructor Called");
		this.model = model;
	}

	// Two-Argument Constructor
	Bike(String model, String brand) {
		System.out.println("Two-Argument Constructor Called");
		this.model = model;
		this.brand = brand;
	}

	// Three-Argument Constructor
	Bike(String model, String brand, String color) {
		System.out.println("Three-Argument Constructor Called");
		this.model = model;
		this.brand = brand;
		this.color = color;
	}

	// Four-Argument Constructor
	Bike(String model, String brand, double price, String color) {
		System.out.println("Four-Argument Constructor Called");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	// Five-Argument Constructor
	Bike(String model, String brand, double price, String color, int year) {
		System.out.println("Five-Argument Constructor Called");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.year = year;
	}

	public static void main(String[] args) {

		System.out.println("Main Method Started");

		Bike b = new Bike();
		b.bikeInfo();

		Bike b1 = new Bike("Classic 350");
		b1.bikeInfo();

		Bike b2 = new Bike("Pulsar 150", "Bajaj");
		b2.bikeInfo();

		Bike b3 = new Bike("FZ-S", "Yamaha", "Blue");
		b3.bikeInfo();

		Bike b4 = new Bike("Shine", "Honda", 85000.00, "Black");
		b4.bikeInfo();

		Bike b5 = new Bike("Apache RTR 160", "TVS", 125000.00, "White", 2024);
		b5.bikeInfo();

		System.out.println("Main Method Ended");
	}

	// Display Bike Details
	void bikeInfo() {
        System.out.println("Model : " + model);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Color : " + color);
        System.out.println("Year  : " + year);
        System.out.println("*****************************");
    }
}