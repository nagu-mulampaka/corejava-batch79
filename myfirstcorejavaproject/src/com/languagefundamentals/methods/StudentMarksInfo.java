package com.languagefundamentals.methods;

import java.util.Scanner;

public class StudentMarksInfo {

	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started");

		StudentMarksInfo student = new StudentMarksInfo();
		int telugu = student.getTeluguMarks();
		int hindi = student.getHindiMarks();
		int english = student.getEnglishMarks();
		int maths = student.getMathsMarks();
		int science = student.getScienceMarks();
		int social = student.getSocialMarks();

		System.out.println("----- Student Marks -----");
		System.out.println("Telugu Marks: " + telugu);
		System.out.println("Hindi Marks: " + hindi);
		System.out.println("English Marks: " + english);
		System.out.println("Maths Marks: " + maths);
		System.out.println("Science Marks: " + science);
		System.out.println("Social Marks: " + social);

		int sum = telugu + hindi + english + maths + science + social;
		System.out.println("Total Sum of the Marks: " + sum);
		
		double avarage = sum / 6;
		System.out.println("The Avarage of the marks: " + avarage);

		System.out.println("main method ended");
	}

	int getTeluguMarks() {
		System.out.print("Enter Telugu marks here: ");
		int telugu = scanner.nextInt();
		return telugu;
	}

	int getHindiMarks() {
		System.out.print("Enter Hindi marks here: ");
		int hindi = scanner.nextInt();
		return hindi;
	}

	int getEnglishMarks() {
		System.out.print("Enter English marks here: ");
		int english = scanner.nextInt();
		return english;
	}

	int getMathsMarks() {
		System.out.print("Enter Maths marks here: ");
		int maths = scanner.nextInt();
		return maths;
	}

	int getScienceMarks() {
		System.out.print("Enter Science marks here: ");
		int science = scanner.nextInt();
		return science;
	}

	int getSocialMarks() {
		System.out.print("Enter Social marks here: ");
		int social = scanner.nextInt();
		return social;
	}

}
