package com.logicalStatements;

import java.util.Scanner;

// WAP to check the Eligibility for voting and driving ..?
public class LogicalStatementsDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age here: ");
		int age = scanner.nextInt();
        
		if(age >= 18) {
			System.out.println("Have a Good Day");
			System.out.println("Congratulations !! You are eligible for Voting and Driving");
		}
		else {
			System.out.println("Sorry you are not eligible for Voting and Driving");
		}
		
		System.out.println("main method ended");
		
		scanner.close();
	}

}