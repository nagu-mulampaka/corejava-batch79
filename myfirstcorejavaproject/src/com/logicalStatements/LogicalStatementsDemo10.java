package com.logicalStatements;

import java.util.Scanner;

// write a program to print day info based on String
// Cannot switch on a value of type double. 
// Only convertible int values, strings or enum variables are permitted
public class LogicalStatementsDemo10 {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a Day here: ");
		String day = scanner.next();
		String newDay = day.toLowerCase();
		
		switch(newDay) {
		case "monday" -> System.out.println("Monday's are Lazy to work !!");
		case "tuesday", "wednesday", "thursday" -> {
			System.out.println("These Days are normal Days to work");
			System.out.println("Non-veg Day in Hostel");
			}
		case "friday" -> System.out.println("Weekend Mode Started"); 
		case "saturday" -> System.out.println("Weekend and Funday to plan movies");
		case "sunday" -> {
			System.out.println("Full Non-veg Day at Home");
			System.out.println("Full Rest Day");
		    }
		default -> System.out.println("Invalid Day");
		}
		scanner.close();
	}
      
	}

