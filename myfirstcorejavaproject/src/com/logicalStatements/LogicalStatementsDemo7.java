package com.logicalStatements;

import java.util.Scanner;

/*
 * Program: Marriage Eligibility Checker 
 * Description: A simple POC demonstrating nested if-else statements and logical operators in Java.
 */

public class LogicalStatementsDemo7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------- WELCOME TO VCUBE MATRIMONIAL -----------");

        // Step 1: Get the candidate's full name
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("\nHello, " + fullName + "!");
        System.out.println("Let's check your profile compatibility.\n");

        // Step 2: Check the candidate's assets
        System.out.print("Please enter your total assets: ");
        double assets = scanner.nextDouble();

        if (assets >= 50000000.00) {

            System.out.println("Congratulations! Your asset criteria are satisfied.\n");

            // Step 3: Check the candidate's annual salary
            System.out.print("Please enter your annual salary: ");
            double salary = scanner.nextDouble();

            if (salary >= 2500000.00) {

                System.out.println("Your salary criteria are satisfied.\n");

                // Step 4: Check the candidate's age
                System.out.print("Please enter your age: ");
                int age = scanner.nextInt();

                if (age >= 25 && age <= 29) {

                    System.out.println("Your age criteria are satisfied.\n");

                    // Step 5: Check the candidate's height and weight
                    System.out.print("Please enter your height in feet (e.g., 5.8): ");
                    double height = scanner.nextDouble();

                    System.out.print("Please enter your weight in kilograms: ");
                    double weight = scanner.nextDouble();

                    if ((height >= 5.6 && height <= 6.1) && (weight >= 65 && weight <= 75)) {

                        System.out.println("\nYour physical criteria are satisfied.\n");

                        // Step 6: Ask about siblings
                        System.out.print("Do you have any siblings? (true/false): ");
                        boolean hasSiblings = scanner.nextBoolean();

                        if (!hasSiblings) {

                            System.out.println("\nThank you for sharing your details.");
                            System.out.println("We will contact you regarding the next steps.");

                        } else {

                            System.out.println("\nThank you for providing your details.");
                            System.out.println("Our team will review your profile.");
                        }

                    } else {

                        System.out.println("\nYour height or weight does not match the specified criteria.");
                    }

                } else {

                    System.out.println("\nYour age does not match the specified criteria.");
                }

            } else {

                System.out.println("\nYour salary does not meet the specified criteria.");
            }

        } else {

            System.out.println("\nYour assets do not meet the specified criteria.");
        }

        System.out.println("\n----------- THANK YOU FOR VISITING VCUBE -----------");

        scanner.close();
    }
}
