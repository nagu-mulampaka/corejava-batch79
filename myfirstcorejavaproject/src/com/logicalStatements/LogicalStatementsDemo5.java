package com.logicalStatements;

import java.util.Scanner;

// WAP to manage Attendance based on the criteria
public class LogicalStatementsDemo5 {

	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Are you Regular for Classes ..?: ");
		String areYouAttendingClassesRegularly = scanner.nextLine();
		
		System.out.print("Are you Attending Lab Sessions Daily ..?: ");
		String areYouAttendingLabSessionsDaily = scanner.nextLine();
		
		System.out.print("Are you Completing every week exams without fail ..?: ");
		String areyouCompletingEveryWeekExamsWithoutFail = scanner.nextLine();
		
		System.out.print("Are you Attending Mocks Every Week: ");
		String areYouAttendingMocksEveryWeeks = scanner.nextLine();
		
		if(areYouAttendingClassesRegularly.equalsIgnoreCase("yes") 
				&& areYouAttendingLabSessionsDaily.equalsIgnoreCase("yes") 
				&& areyouCompletingEveryWeekExamsWithoutFail.equalsIgnoreCase("yes")
				&& areYouAttendingMocksEveryWeeks.equalsIgnoreCase("yes")) {
			System.out.println("You will Get a Job in 6 Months without fail !!");
		} else {
			System.out.println("You are Cheating your parents directly");
		}
		
		scanner.close();

	}

}
