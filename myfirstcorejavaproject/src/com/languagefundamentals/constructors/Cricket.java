package com.languagefundamentals.constructors;

class Sport {
	
	int teamSize;
	String rules;
	long timeInSeconds;
	
	public Sport(int teamSize, String rules, long timeInSeconds) {
		System.out.println("Sport Parametarized Constructor Called");
		super();
		this.teamSize = teamSize;
		this.rules = rules;
		this.timeInSeconds = timeInSeconds;
	}

	public static void main(String[] args) {
		System.out.println("main method started from sports !!");
	}
}

// if in the parent class there are only parameterized constructor, 
// then we cannot extends and create the object of child class, 
// because parent class does not contains no-arg constructor or default constructor, so we cannot not extends here
public class Cricket {
	
	// CE : Implicit super constructor Sport() is undefined. Must explicitly invoke another constructor
	Cricket() {
		System.out.println("Cricket No-arg Constructor Called");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Cricket !!");
        Cricket cricket = new Cricket();
	}

}
