package com.logicalStatements;

import java.util.Scanner;

// write a program to print cricketer info based on the jersey number ..?
public class LogicalStatementsDemo8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Jersey Number: ");
		int jerseyNumber = scanner.nextInt();
		
		switch(jerseyNumber) {
		
		case 7:
			System.out.println("MSD: Mahendra Singh Dhoni");
			System.out.println("Thala For a Reason: Cool Captian & Wicket Keeper");
			break;
		case 18: 
			System.out.println("VK: Virat Kohli");
			System.out.println("Aggerssive Cricketer : Great Batsman : GOAT");
			break;
		case 45:
			System.out.println("RS: Rohit Sharma");
			System.out.println("Hitman: BOSS");
			break;
		case 4:
			System.out.println("AB: Abhisheik Sharma");
			System.out.println("PULI: Ayya Sher");
		    break;
		case 5:
			System.out.println("KL: K Lokesh Rahul");
			System.out.println("Classic Player");
			break;
		default:
			System.out.println("Entred Jersey Number Not Available in my List");	
		}

	}

}
