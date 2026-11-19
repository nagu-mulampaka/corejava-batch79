package com.oops.inheritance2;

public class HomeLoan extends LoanImpl {

	void homeDocInfo() {
		System.out.println("We have Received all the documents successfully !!");
	}

	/** ----------------------------------------------------------------------------------------------
	 * Q) What is the difference between Method Overloading vs OverRiding
	 * Method Overriding is one of the concept form Polymorphism
	 * Poly means Meny -- morphism means forms.
	 * Creating methods in many forms based on your requirements will consider as Polymorphism
	 * Polymorphism is Divided into two types 
	 * i) Method Overriding or Dynamic Polymorphism -> Run-time Polymorphism or Late Binding
	 * ii) Method Overloading or static Polymorphism -> Compile-time Polymorphism or early Binding 
	*//// ----------------------------------------------------------------------------------------------
	
	/*
	 * i) Method Overriding or Dynamic Polymorphism Override Means : 
	 * Whenever the child class is not happy or not satisfying with parent class functionalities,
	 * we can create the same method in child class with different behavior will consider as Method Overriding.
	 */
	
	// If we want to achieve Method Overriding, we must need follow 8 Rules
	// Rule 1 : Method Signature must be same.
	// Note : Method Signature means = Method name + Parameters but not return type.
	
	// Rule 2 : Method return type must be same until Java 1.4 version.
	// From Java 1.5 onwards can we use co-varient return types.
	// Note: Even after 1.5 version, 
	// if the Parent class method returns Primitive Data Types,
	// The Child class must return the same data types as a return type.
	// But if the Parent Class method return object data types,
	// then the child class method no need to return the same data types we can use co-varient data types.
	
	// what is co-varient return types ..?
	// if the parent class method return object data types
	// then, the child class method can return the same data types or 
	// it's sub type will consider as co-varient return types.
	
	/// Parent --> Number -----> Child --> Number/Integer/Byte....
	/// Parent --> Object -----> Child --> Number/String .... or any
	/// Parent --> String -----> Child --> String ....
	
	@Override
	Integer welcome(String name) {
		System.out.println("Welcome to Vcube Bank Mr.  " + name);
		return 100;
	}
	
	public static void main(String[] args) {
		System.out.println("----- Welcome to Vcube Home Loan Banking !! -----");
		HomeLoan hl = new HomeLoan();

		if (hl.getCibilScore() >= 300 && hl.getCibilScore() <= 900) {
			System.out.println("Your Cibil is Good Let's enter remianing details ");
			if (hl.getCustomerSalary() >= 700000.00 && hl.getCustomerAgeInfo() > 25) {
				System.out.println("Good with Salary and Age Details continue with Personal Details");
				if (hl.isAadharValid() && hl.isPanValid() && hl.isPhoneValid()) {
					System.out.println("Congrtulations !! Your Loan got Approved !!");
					System.out.println("Your Loan Rate of Interest is: " + hl.getRateOfInterest());
				} else {
					System.out.println("Something went wrong with personal details");
				}
			} else {
				System.out.println("Salary is not sufficient to give Home Lone !!");
			}
		} else {
			System.out.println("You Cibil is Not good loan got rejected");
		}
	}

}
