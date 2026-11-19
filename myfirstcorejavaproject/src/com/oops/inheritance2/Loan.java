package com.oops.inheritance2;

// interface is a Blueprint to create classes.
// interface is a contract between the client and Developers
// interface tells what to do nut not how to do
public interface Loan {
	public void hello();
	public abstract double getCustomerSalary();
	public abstract int getCustomerAgeInfo();
	public abstract int getCibilScore();
	public abstract double getRateOfInterest();
	public abstract boolean isAadharValid();
	public abstract boolean isPanValid();
	public abstract boolean isPhoneValid();
}
