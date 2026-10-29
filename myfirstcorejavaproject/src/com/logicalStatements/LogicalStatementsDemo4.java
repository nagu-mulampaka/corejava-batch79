package com.logicalStatements;

import java.util.Scanner;

// WAP to manage Attendance based on the criteria
public class LogicalStatementsDemo4 {

	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Are you Regular for Classes ..?");
		boolean areYouAttendingClassesRegularly = scanner.nextBoolean();
		
		System.out.println("Are you Attending Lab Sessions Daily ..? ");
		boolean areYouAttendingLabSessionsDaily = scanner.nextBoolean();
		
		System.out.println("Are you Completing every week exams without fail ..?");
		boolean areyouCompletingEveryWeekExamsWithoutFail = scanner.nextBoolean();
		
		System.out.println("Are you Attending Mocks Every Week ");
		boolean areYouAttendingMocksEveryWeeks = scanner.nextBoolean();
		
		if(areYouAttendingClassesRegularly && areYouAttendingLabSessionsDaily 
				&& areyouCompletingEveryWeekExamsWithoutFail && areYouAttendingMocksEveryWeeks) {
			System.out.println("You will Get a Job in 6 Months without fail !!");
		} else {
			System.out.println("You are Cheating your parents directly");
		}
		
		scanner.close();

	}

}
