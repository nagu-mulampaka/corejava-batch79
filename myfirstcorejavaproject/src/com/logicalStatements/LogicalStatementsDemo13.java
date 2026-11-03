package com.logicalStatements;

import java.util.Scanner;

public class LogicalStatementsDemo13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your marks here: ");
		int marks = scanner.nextInt();
		
		String grade = switch(marks/10) {
		case 10, 9 -> {
			System.out.println("Marks Kosame Puttina Janalu");
			yield "A";
		}
		case 8 -> "B";
		case 7 -> "C";
		case 6, 5, 4 -> "D";
		case 1, 2, 3 -> "Fail";
		default -> "Invalid";
		};
		
		System.out.println("Grade is: " + grade);
		
		scanner.close();

	}

}
