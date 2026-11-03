package com.logicalStatements;

import java.util.Scanner;

public class RestaurantFoodOrderingApp {

	public static void main(String[] args) {
		System.out.println("========== Welcome to Nagu Restaurant ==========");
		Scanner scanner = new Scanner(System.in);
		String select_category = "";
		double grand_total = 0;
		double all_starters_price = 0;
		double allmaincourse_price = 0;
		double allDeserts_total_price = 0;
		
		do {
			System.out.println("\n---------- MENU ----------");
			System.out.println("1. Starters");
			System.out.println("2. Maincourse");
			System.out.println("3. Desserts");
			
			System.out.print("\nEnter Category: ");
		    int category = scanner.nextInt();
		    
		    switch(category) {
		        
		    // starters logic
		    case 1 -> {
		        String starter_yes_no = "";
		    	
		    	do {
		    		System.out.println("\n----- Starters Menu -----");
			    	System.out.println("1. Chicken 65");
			    	System.out.println("2. Paneer Tikka");
			    	System.out.println("3. Veg Manchuria");
			    	System.out.println("4. Chicken Lollipop");
			    	System.out.println("5. Gobi Manchuria");
			    	
			    	System.out.print("\nEnter Starter Item: ");
			    	int starter_item = scanner.nextInt();
			    	double starter_price = 0;
			    	
			    	switch(starter_item) {
			    	case 1 -> {
			    		System.out.println("Chicken 65 = 180 Rupees");
			    		starter_price += 180;
			    	}
			    	case 2 -> {
			    		System.out.println("Paneer Tikka = 160 Rupees");
			    		starter_price += 160;
			    	}
			    	case 3 -> {
			    		System.out.println("Veg Manchuria = 120 Rupees");
			    		starter_price += 120;
			    	}
			    	case 4 -> {
			    		System.out.println("Chicken Lollipop = 200 Rupees");
			    		starter_price += 200;
			    	}
			    	case 5 -> {
			    		System.out.println("Gobi Manchuria = 100 Rupees");
			    		starter_price += 100;
			    	}
			    	default -> System.out.println("Sorry Starter Not Available");
			    	}
			    	all_starters_price += starter_price;
			    	System.out.print("Do you want to continue ordering starters (yes/no): ");
			    	starter_yes_no = scanner.next();
			    	
		    	} while (starter_yes_no.equalsIgnoreCase("yes"));
		    	System.out.println("Total Starters Price: " + all_starters_price + " Rupees");
		    }
		    
		    // main course course
		    case 2 -> {
		    	
		    	String maincourse_yes_no = "";
		    	
		    	do {
		    		System.out.println("\n----- Main Course Menu -----");
			    	System.out.println("1. Chicken Biryani");
			    	System.out.println("2. Veg Biryani");
			    	System.out.println("3. Mutton Biryani");
			    	System.out.println("4. Fried Rice");
			    	System.out.println("5. Butter Naan");
			    	
			    	System.out.print("\nEnter Main Course Item: ");
			    	int maincourse_item = scanner.nextInt();
			    	double maincourse_price = 0;
			    	
			    	switch(maincourse_item) {
			    	case 1 -> {
			    		System.out.println("Chicken Biryani = 250 Rupees");
			    		maincourse_price += 250;
			    	}
			    	case 2 -> {
			    		System.out.println("Veg Biryani = 180 Rupees");
			    		maincourse_price += 180;
			    	}
			    	case 3 -> {
			    		System.out.println("Mutton Biryani = 300 Rupees");
			    		maincourse_price += 300;
			    	}
			    	case 4 -> {
			    		System.out.println("Fried Rice = 150 Rupees");
			    		maincourse_price += 150;
			    	}
			    	case 5 -> {
			    		System.out.println("Butter Naan = 40 Rupees");
			    		maincourse_price += 40;
			    	}
			    	default -> System.out.println("Main Course Not Available");
			    	}
			    	allmaincourse_price += maincourse_price;
		    		System.out.print("Do you want to continue ordering main course (yes/no): ");
		    		maincourse_yes_no = scanner.next();
		    		
		    	} while(maincourse_yes_no.equalsIgnoreCase("yes"));
		    	System.out.println("Total Main Course Price: " + allmaincourse_price + " Rupees");
		    }
		    
		    // Desserts logic
		    case 3 -> {
		    	
		    	String dessert_yes_no = "";
		    	
		    	do {	
		    		System.out.println("\n----- Desserts Menu -----");
			    	System.out.println("1. Ice Cream");
			    	System.out.println("2. Gulab Jamun");
			    	System.out.println("3. Brownie");
			    	System.out.println("4. Fruit Salad");
			    	System.out.println("5. Cake");
			    	
			    	System.out.print("\nEnter Dessert Item: ");
			    	int dessert_item = scanner.nextInt();
			    	double dessert_price = 0;
			    	
			    	switch(dessert_item) {
			    	case 1 -> {
			    		System.out.println("Ice Cream = 80 Rupees");
			    		dessert_price += 80;
			    	}
			    	case 2 -> {
			    		System.out.println("Gulab Juman = 60 Rupees");
			    		dessert_price += 60;
			    	}
			    	case 3 -> {
			    		System.out.println("Brownie = 120 Rupees");
			    		dessert_price += 120;
			    	}
			    	case 4 -> {
			    		System.out.println("Fruit Salad = 100 Rupees");
			    		dessert_price += 100;
			    	}
			    	case 5 -> {
			    		System.out.println("Cake = 150 Rupees");
			    		dessert_price += 150;
			    	}
			    	default -> System.out.println("Sorry Dessert Not Available");
			    	}
			    	allDeserts_total_price += dessert_price;
		    		System.out.print("Do you want to continue ordering Desserts (yes/no): ");
		    		dessert_yes_no = scanner.next();	
		    	} while(dessert_yes_no.equalsIgnoreCase("yes"));
		    	System.out.println("Total Deserts Price: " + allDeserts_total_price + " Rupees");
		    }
		    
		    }
		    System.out.print("\nDo you want to continue with another category (yes/no): ");
		    select_category = scanner.next();
		} while(select_category.equalsIgnoreCase("yes"));
		
		grand_total = all_starters_price + allmaincourse_price + allDeserts_total_price;
		
		// Invoice Logic
		System.out.println("\n========== INVOICE ==========");
		System.out.println("Total Starters Price: " + all_starters_price);
		System.out.println("Total Main Course Price: " + allmaincourse_price);
		System.out.println("Total Desserts Price: " + allDeserts_total_price);
		System.out.println("-----------------------------");
		System.out.println("Grand Total: " + grand_total);
		
		scanner.close();
	}

}
