package com.abstraction;

public interface Animal {
	
	public static final String ORG_NAME = "VCUBE";
	
	// by default all methods public and abstract
	public abstract void sound();
	public abstract void eat();
	public abstract void walk();
	
	// default methods in interface.
	// To provide default behavior & and to avoid backward compatibility problems we need default methods in interface
	// what is backward compatibility ..?
	// If we change anything in interfaces, we must need to change all the classes,
	// if it is 1000 means, we must need to change 1000 classes, so this process will consider as a backward compatibility
	// to avoid this problem when we want to provide default behavior, we use default method in interfaces.
	// still, if we want to provide specific behavior for a particular class, yes we can override default method.
	
	// we can write any number of default methods.
	default void sleep() {
		System.out.println("Most of the animals sleep time is night's only");
		hello();
	}
	
	default void run() {
		System.out.println("Animails can run");
		hello();
	}
	
	// static methods in interface.
	// Whenever we want to provide utility constant behavior then go for static methods
	// where static methods, we cannot override.
	// static methods can access by using only interface name but not with object reference variable.
	static void breath() {
		System.out.println("Every Animal Must Breath to Servival !!");
		hello();
	}
	
	// private methods in interface.
	// To avoid duplicate functionalities in default methods & static methods, from java 1.9 onwards introduced private methods.
	// private methods, we cannot override.
	// the scope of private method scope is within the class.
	private static void hello() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello moderen interface !!");
		hello();
	}
	
}
