package com.arrays;

// write a program to represent few names using array
public class TestArraysDemo2 {

	public static void main(String[] args) {

		String[] names = new String[5];

		names[0] = "Nagu";
		names[1] = "Hemanth";
		names[2] = "Sai";
		names[3] = "Ashok";
		names[4] = "Narendra";

		for (String each : names) {
			System.out.println("Hello " + each);
		}

		System.out.println();
		for (int i = 0; i < names.length; i++) {
			System.out.println("Welcome: " + names[i]);
		}

	}

}
