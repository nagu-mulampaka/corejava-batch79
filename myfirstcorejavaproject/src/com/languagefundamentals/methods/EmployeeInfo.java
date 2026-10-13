package com.languagefundamentals.methods;

import java.util.Scanner;

// write to print Employee Info !!
public class EmployeeInfo {

	public static void main(String[] args) {

		EmployeeInfo obj = new EmployeeInfo();
		Scanner scanner = new Scanner(System.in);

		System.out.print("please enter salary here: ");
		double salary = scanner.nextDouble();

		System.out.print("enter your age here: ");
		int age = scanner.nextInt();

		System.out.print("enter your name here: ");
		scanner.nextLine();
		String name = scanner.nextLine();

		System.out.print("Enter your phone number here: ");
		long phone = scanner.nextLong();

		System.out.print("Enter gender here: ");
		char gender = scanner.next().charAt(0); // method chaining

		System.out.println("---------- Employee Details ----------");
		obj.getEmployeeSalary(salary);
		obj.getEmployeeAge(age);
		obj.getEmployeeName(name);
		obj.getEmployeePhoneNumber(phone);
		obj.getEmployeeGender(gender);

		scanner.close();
	}

	void getEmployeeSalary(double salary) {
		System.out.println("The Emplpoyee Current Salary is: " + salary);
	}

	void getEmployeeAge(int age) {
		System.out.println("Employee Age is: " + age);
	}

	void getEmployeeName(String name) {
		System.out.println("Employee Name is: " + name);
	}

	void getEmployeePhoneNumber(long phoneNumber) {
		System.out.println("Employee Phone Number: " + phoneNumber);
	}

	void getEmployeeGender(char gender) {
		System.out.println("Employee Gender: " + gender);
	}

}
