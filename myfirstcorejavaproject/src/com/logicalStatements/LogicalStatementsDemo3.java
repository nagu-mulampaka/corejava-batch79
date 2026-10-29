package com.logicalStatements;

import java.util.Scanner;

// WAP to check the Given name is less then 15 characters to allow for a valid passport valid name.
public class LogicalStatementsDemo3 {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter Your Full Name: ");
        String fullName = scanner.nextLine();
        
        if(fullName.length() <= 15) {
        	System.out.println("Congratulations !! Your name is valid to add into passport");
        } else {
        	System.out.println("Sorry, Your name is too long make it short to add into passport");
        }
        
        scanner.close();
	}

}
