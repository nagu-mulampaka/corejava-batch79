package com.arrays;

// write a program to print 10 student ages using Array
public class TestArraysDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		// Step 1 : Declare the Array
		int[] ages;

		// Step 2 : Create the Array
		ages = new int[10];

		// Step 3 : Initialize an Array
		ages[0] = 10;
		ages[1] = 16;
		ages[2] = 12;
		ages[3] = 20;
		ages[4] = 25;
		ages[5] = 26;
		ages[6] = 15;
		ages[7] = 25;
		ages[8] = 22;
		ages[9] = 23;

		// Step 4 : Represent an Array
		// System.out.println(ages[0]);
		// System.out.println(ages[1]);
		// System.out.println(ages[2]);
		// System.out.println(ages[3]);
		// System.out.println(ages[4]);
		// System.out.println(ages[5]);
		// System.out.println(ages[6]);
		// System.out.println(ages[7]);
		// System.out.println(ages[8]);
		// System.out.println(ages[9]);

		System.out.println("Representation an Array using for each loop");
		for (int n : ages) {
			System.out.print(n + " ");
		}

		System.out.println("\nRepresentation an Array using for loop");
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
	}

}
