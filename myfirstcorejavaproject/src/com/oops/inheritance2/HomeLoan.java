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
	*//// --------------------------------------------------------------------------------------------
	
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
	
    ///	Rule 3 : Method Access Modifiers Scope should not be reduced.
    /// Note : If the Parent method returns Highest Scope, the Child should not be lowest scope 
    /// otherwise we will get the CE : Cannot reduce the visibility of the inherited method from LoanImpl
    /// Example 1 : If the Parent class method scope is public --> child class method scope must be public
    /// Example 2 : If the Parent class method scope is protected --> child class method scope can be protected/public
    /// Example 3 : If the Parent class method scope is default --> child class method scope can be default/protected/public
    /// Example 4 : If the Parent class method scope is private --> we cannot Override.
    /// private <-- <default> <-- protected <-- public
    
    /// Rule 4 : private methods cannot Override it into child class, because the scope of private is within the class.
    /// Note : If the Parent method is private, the same method we can write it into child class is not a problem until we use @Override
    /// if we use @Override then it is Compile time error.
    /// CE: The method info() of type HomeLoan must override or implement a supertype method

    /// Rule 5 : static methods cannot override into child classes. 
    /// Because static methods are loading at class loading time But Overriding is happening at Runtime Object Creations.
    /// Note : If the Parent class static methods can write it into child class will not give any errors.until we use @Override annotation.
    /// If we use @Override for static methods then it is Compile time error.
    /// CE : The method main(String[]) of type TestB must override or implement a supertype method
    /// Writing the same static method from parent to child will consider as method Hiding.

    /// Rule 6 : final methods cannot override it into child class.
    /// Note : final is a keyword to 
    ///        stop inheritance for classes, 
    ///        stop Method overriding for methods, 
    ///        stop re-assiging the values of a variables.
    /// Note : If the class is final all methods inside class also final.
    ///        If the class is final all variables inside that class are not final.
    /// Note : final methods can call in different class but we cannot override.

    /// Rule 7 : Exception Handling 
    /// If the parent class method throws any exceptions the child class not need to throws any exceptions.
    /// But, If the Child class method throws any exception then, 
    /// the Parent Class method must throw the same Exception or it's Parent Exception (Throwable).
    /// CE : Exception Exception is not compatible with throws clause in LoanImpl.welcome(String)
    /// Q) What is Exception Propagation.

    /// Rule 8 : Abstract Method Related
    /// If the Parent is interface or abstract class which may contains abstract methods 
    /// then the child class must override the abstract methods from Parent.
    /// Similarly, if the class contains normal method, 
    /// those normal methods can also override it as abstract methods if the child class is abstract.
    
	private void info() {
		System.out.println("Home Loan Impl");
	}
	
	@Override
	 public Integer welcome(String name) throws Exception{
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
