package com.logicalStatements;

import java.util.Scanner;

// write a POC to provide a invoice based on your purchase the fruits or vegetables ..?
public class LogicalStatementsDemo12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("main method started");
		String yes_no = "";
		double total_price = 0;

		do {	
			System.out.print("Enter the Catagory: ");
			String catagory = scanner.next();

			switch (catagory) {
			
			case "fruites" -> {
				String fruits_yes_no = "";
				double all_fruits_price = 0;
				
				do {	
					System.out.print("Enter Fruit Item Here: ");
					String fruitItem = scanner.next();
					
					switch (fruitItem) {
					case "orange" -> {
						System.out.println("Orange 1kg = 100 Rupees");
						double orangePrice = 100;
						all_fruits_price +=  orangePrice;
					}
					case "mango" -> {
						System.out.println("Mango 1kg = 200 Rupees");
						double mangoPrice = 200;
						all_fruits_price +=  mangoPrice;
					}
					case "apple" -> {
					    System.out.println("Apple 1kg = 180 Rupees");
					    double applePrice = 180;
					    all_fruits_price += applePrice;
					}
					case "banana" -> {
					    System.out.println("Banana 1 Dozen = 60 Rupees");
					    double bananaPrice = 60;
					    all_fruits_price += bananaPrice;
					}
					case "grapes" -> {
					    System.out.println("Grapes 1kg = 120 Rupees");
					    double grapesPrice = 120;
					    all_fruits_price += grapesPrice;
					}
					case "pineapple" -> {
					    System.out.println("Pineapple 1 Piece = 80 Rupees");
					    double pineapplePrice = 80;
					    all_fruits_price += pineapplePrice;
					}
					case "watermelon" -> {
					    System.out.println("Watermelon 1 Piece = 50 Rupees");
					    double watermelonPrice = 50;
					    all_fruits_price += watermelonPrice;
					}
					case "papaya" -> {
					    System.out.println("Papaya 1kg = 60 Rupees");
					    double papayaPrice = 60;
					    all_fruits_price += papayaPrice;
					}
					case "guava" -> {
					    System.out.println("Guava 1kg = 80 Rupees");
					    double guavaPrice = 80;
					    all_fruits_price += guavaPrice;
					}
					case "pomegranate" -> {
					    System.out.println("Pomegranate 1kg = 200 Rupees");
					    double pomegranatePrice = 200;
					    all_fruits_price += pomegranatePrice;
					}
					case "strawberry" -> {
					    System.out.println("Strawberry 1kg = 300 Rupees");
					    double strawberryPrice = 300;
					    all_fruits_price += strawberryPrice;
					}
					default -> {
						System.out.println("Sorry, Entered Fruit Not Available");
					}
				  }
					System.out.print("Do you want to continue (yes/no): ");
					fruits_yes_no =  scanner.next();
					
				} while (fruits_yes_no.equalsIgnoreCase("yes"));
				
				System.out.println("Total Fruites Price is: " + all_fruits_price);
				total_price += all_fruits_price;
			}
			
			case "vegetables" -> {
				String veg_yes_no = "";
				double all_vegetables_price = 0;
				
				do {
					System.out.print("Enter Vegetables Items: ");
					String veg_items = scanner.next();
					
					switch(veg_items) {
					case "tom" -> {
					    System.out.println("Tomato 1kg = 40 Rupees");
					    double tomatoPrice = 40;
					    all_vegetables_price += tomatoPrice;
					}
					case "pot" -> {
					    System.out.println("Potato 1kg = 30 Rupees");
					    double potatoPrice = 30;
					    all_vegetables_price += potatoPrice;
					}
					case "oni" -> {
					    System.out.println("Onion 1kg = 50 Rupees");
					    double onionPrice = 50;
					    all_vegetables_price += onionPrice;
					}
					case "car" -> {
					    System.out.println("Carrot 1kg = 60 Rupees");
					    double carrotPrice = 60;
					    all_vegetables_price += carrotPrice;
					}
					case "cab" -> {
					    System.out.println("Cabbage 1kg = 40 Rupees");
					    double cabbagePrice = 40;
					    all_vegetables_price += cabbagePrice;
					}
					case "cauli" -> {
					    System.out.println("Cauliflower 1kg = 50 Rupees");
					    double cauliflowerPrice = 50;
					    all_vegetables_price += cauliflowerPrice;
					}
					case "brin" -> {
					    System.out.println("Brinjal 1kg = 45 Rupees");
					    double brinjalPrice = 45;
					    all_vegetables_price += brinjalPrice;
					}
					case "beans" -> {
					    System.out.println("Beans 1kg = 80 Rupees");
					    double beansPrice = 80;
					    all_vegetables_price += beansPrice;
					}
					case "ladyfinger" -> {
					    System.out.println("Ladies Finger 1kg = 60 Rupees");
					    double ladiesFingerPrice = 60;
					    all_vegetables_price += ladiesFingerPrice;
					}
					case "cuc" -> {
					    System.out.println("Cucumber 1kg = 35 Rupees");
					    double cucumberPrice = 35;
					    all_vegetables_price += cucumberPrice;
					}
					default -> System.out.println("Entered Vegetable is not available");
					}
					System.out.print("Do you Want to continue (yes/no): ");
					veg_yes_no = scanner.next();
					
				} while (veg_yes_no.equalsIgnoreCase("yes"));
				System.out.println("Totla Vegetables Price is: " + all_vegetables_price);
				total_price += all_vegetables_price;
			}
			}
			System.out.print("Do you want to the continue with catagory (yes/no): ");
			yes_no = scanner.next();
		} while(yes_no.equalsIgnoreCase("yes"));
		
		System.out.println("Total Price is: " + total_price);
	}

}
