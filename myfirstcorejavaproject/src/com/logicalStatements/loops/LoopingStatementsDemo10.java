package com.logicalStatements.loops;

import java.util.Scanner;

// Write a program to find Nth Fibonacci number using for loop.
// Input: 10
// Output: 34

public class LoopingStatementsDemo10 {

	public static void main(String[] args) {
        System.out.println("main method started");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position: ");
        int number = scanner.nextInt();

        int n1 = 0;
        int n2 = 1;

        if (number <= 0) {
            System.out.println("Please enter a positive number");
        } else if (number == 1) {
            System.out.println("Nth Fibonacci number is: " + n1);
        } else if (number == 2) {
            System.out.println("Nth Fibonacci number is: " + n2);
        } else {
            for (int i = 3; i <= number; i++) {
                int n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            System.out.println("Nth Fibonacci number is: " + n2);
        }
        scanner.close();
    }
}