package com.languagefundamentals.constructors;

class Product {
	
	String model;
	String brand;
	String color;
	double price;
	
	public Product() {
		System.out.println("No-arg Constructor is Called from Product");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started from product");
	}
}

// In Every Constructor in Java Program, JVM calls the super() by default whether we called explicitly or not .
public class Mobile extends Product{
	
	public Mobile() {
		System.out.println("No-arg Constructor Called from Mobile");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Mobile");
		Mobile mobile = new Mobile();
		mobile.mobileInfo();
	}
	
	void mobileInfo() {
		System.out.println("Model of the Mobile: " + model);
		System.out.println("Brand of the Mobile: " + brand);
		System.out.println("Color of the Mobile: " + color);
		System.out.println("Price of the Mobile: " + price);
	}

}
