package com.oops.inheritance2;

import java.util.Scanner;

// FCFS : First come first servers
// SUB class or child class or derived class
public class PersonalLoan extends LoanImpl{

	static Scanner scanner = new Scanner(System.in);
	
	// Override  Means : Whenever the child class is not happy or not satisfying with parent class 
	// functionalities, we can create the same method with same parameter with different behavior
	// in the child class will consider as Method Overriding.
	@Override
	public void hello() {
		System.out.println("Hello Guys Good Morning");
		System.out.println("Hello Method from Personal Loan");
	}

	void personalLoanDocInfo() {
		System.out.println("All Documents Have Bean Varified");
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		System.out.println("----- Welcome to Vcube Banking Loan -----");
		
		// In Java , there are 4 Scenarios to create Parent & Child Objects .
		// Scenario 1 : 
		// In By using child Object, child reference 
		// we can call the both parent & child class functionalities is the concept called Inheritance
		
		PersonalLoan pl = new PersonalLoan();

		double salary = pl.getCustomerSalary();
		int age = pl.getCustomerAgeInfo();
		int cibil = pl.getCibilScore();

		if (salary >= 100000.00 && age >= 25 && cibil >= 300 && cibil <= 900 
				&& pl.isAadharValid() && pl.isPanValid() && pl.isPhoneValid()) {
			System.out.println("Congrtultions !! you are eligible for personal loan");
			System.out.println("Your Rate of Interest is: " + pl.getRateOfInterest());
			pl.personalLoanDocInfo();
		} else {
			System.out.println("Focus on Your Carrer !!");
			System.out.println("Sorry for the inconvenience !! your loan got rejected");
		}

		// Scenario 2 : Parent Object & Parent Reference
		// By using Parent Object & Parent Reference 
		// we can access only Parent class functionalities but we cannot access child class functionalities.
		LoanImpl l1 = new LoanImpl();
		// CE : The method personalLoanDocInfo() is undefined for the type LoanImpl
		// l1.personalLoanDocInfo();
		
		// Q) Can we store child reference into parent Reference ..? -> YES
		// Q) Can we store Parent Object into child Reference ..? -> NO
		// Scenario 3 : 
		// By Using child object & parent reference means Up-casting
		// we can access only the Parent Class functionalities  but we cannot access child class functionalities directly.
		// By using Up-casting, we can achieve Dynamic Method Dispatching 
		// Dynamic Method Dispatching means whenever we create child object parent reference 
		// we can access parent class functionalities only but the parent class method overridden in child class
		// then instead of parent class functionalities execute child class functionalities will consider as Dynamic Method Dispatching.
		LoanImpl l2 = new PersonalLoan();
		l2.hello();
		
		// what is the advantage of This means, 
		// we can achieve Abstraction through Up-casting like below
		Loan l3 = new PersonalLoan();
		l3.hello();
		
		// CE : The method personalLoanDocInfo() is undefined for the type LoanImpl
		// l2.personalLoanDocInfo();
		
		// Scenario 4 :
		// By using Parent Object with child reference we get compile time error below
		// CE : Type mismatch: cannot convert from LoanImpl to PersonalLoan
		// we cannot store parent object into child reference .
		// so, Down-Casting is not possible directly.
		// By using, Type-casting it is possible just for namesake. 
		// But we will get Run-Time Exception saying that - ClassCastException
		
		// PersonalLoan pl2 = new LoanImpl(); // CE
		PersonalLoan pl2 = (PersonalLoan) new LoanImpl();
		pl2.hello();
		
		System.out.println("main method ended");
	}

}
