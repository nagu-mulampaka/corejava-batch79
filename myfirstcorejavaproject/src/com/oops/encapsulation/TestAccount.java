package com.oops.encapsulation;

// Driver Class
public class TestAccount {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		System.out.println("----------------------------------------------");
		Account ac3 = new Account(4567891230L, 300000.00, "Mulampaka Suresh");
		// System.out.println("Account Number: " + ac3.getAccountNumber());
		// System.out.println("Account Balance: " + ac3.getBalance());
		// System.out.println("Account Holder Name: " + ac3.getAccountHolderName());
		
		System.out.println(ac3);

		Account ac = new Account();
		
		// Setter methods are helping to modify the data 
		ac.setAccountNumber(1234567890);
		ac.setBalance(-10000.00);
		ac.setAccountHolderName("Mulampaka Nagu");

		// Getter methods are helping to modify the data
		System.out.println("Account Number: " + ac.getAccountNumber());
		System.out.println("Account Balance: " + ac.getBalance());
		System.out.println("Account Holder Name: " + ac.getAccountHolderName());
		
		System.out.println("----------------------------------------------");
        Account ac1 = new Account();
		
		// Setter methods are helping to modify the data 
        ac1.setAccountNumber(9876543210L);
		ac1.setBalance(20000.00);
		ac1.setAccountHolderName("Sella Hemanth Kumar");

		// Getter methods are helping to modify the data
		System.out.println("Account Number: " + ac1.getAccountNumber());
		System.out.println("Account Balance: " + ac1.getBalance());
		System.out.println("Account Holder Name: " + ac1.getAccountHolderName());

		// We are Stopping the direct access through private keyword.
		// accessing the outside of the classes directly.
		// ac.accountNumebr = 1234567890;
		// ac.balance = -10000.00;
		// ac.accountHolderName = "Mulampaka Nagu";

		// System.out.println("Account Number: " + ac.accountNumebr);
		// System.out.println("Account Balance: " + ac.balance);
		// System.out.println("Account Holder Name: " + ac.accountHolderName);

	}

}
