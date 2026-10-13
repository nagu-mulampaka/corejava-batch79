package com.languagefundamentals.methods;

// write a program to print Student Info --> 2) No return type + with parameters
public class StudentInfo {

	void main(String[] args) {
		System.out.println("main method started");
		
		displayStudentAge(26); // 26 is an argument
		displayStudentName("Mulampaka", "Nagu");
		displayStudentFee(26000.00);
		displayStudentWeight(55);
		
		System.out.println("main method ended");
	}
	
	void displayStudentAge(int age) { // age is an parameter
		System.out.println("Student Age: " + age);
	}
	
	void displayStudentName(String firstname, String lastname) { // name is an parameter
		System.out.println("Full Name of the Student is: " + firstname + " " + lastname);
	}
	
	void displayStudentFee(double fee) {
		System.out.println("Total Fee: " + fee);
	}
	
	void displayStudentWeight(double weight) {
		System.out.println("Student Weight: " + weight);
	}

}
