package com.languagefundamentals.methods;

import java.util.Scanner;

// With return type + with parameters
// write a program to find areas of Triangle, Circle, Square & Rectangle
// Triangle Formula: 0.5 * base * height
// Circle Formula: PI * r * r
// Square Formula : side * side
// Rectangle Formula: length * breadth

public class FindAreasDemo {

	void main(String[] args) {
		System.out.println("main method started");

		Scanner scanner = new Scanner(System.in);

		// find area of Triangle
		System.out.print("enter base: ");
		double base = scanner.nextDouble();
		System.out.print("enter height: ");
		double height = scanner.nextDouble();
		double areaOfTriangle = findAreaofTriangle(base, height);
		System.out.println("Area of Triangle is: " + areaOfTriangle);

		// find area of circle
		System.out.print("enter radius: ");
		double radius = scanner.nextDouble();
		double areaOfCircle = areaOfCircle(radius);
		System.out.println("Area of Circle is: " + areaOfCircle);

		// find square
		System.out.print("enter side: ");
		double side = scanner.nextDouble();
		double square = findAreaOfSquare(side);
		System.out.println("Area of Square: " + square);

		// Rectangle
		System.out.print("enter length: ");
		double length = scanner.nextDouble();
		System.out.print("enter breadth: ");
		double breadth = scanner.nextDouble();
		double rectangle = findAreaofRectangle(length, breadth);
		System.out.println("Area of Rectangle: " + rectangle);

		System.out.println("main method ended");
	}

	double findAreaofTriangle(double base, double height) {
		double triangle = 0.5 * base * height;
		return triangle;
	}

	double areaOfCircle(double radius) {
		return Math.PI * radius * radius;
	}

	double findAreaOfSquare(double side) {
		return side * side;
	}

	double findAreaofRectangle(double length, double breadth) {
		return length * breadth;
	}

}
