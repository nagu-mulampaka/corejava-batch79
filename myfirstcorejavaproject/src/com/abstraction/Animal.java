package com.abstraction;

public interface Animal {
	
	public static final String ORG_NAME = "VCUBE";
	
	// by default all methods public and abstract
	public abstract void sound();
	public abstract void eat();
	public abstract void walk();
	
	// To provide default behavior & and to avoid backward compatibility we need default methods in interface
	// what is backward compatibility ..?
	// If we change anything in interfaces, we must need to change all the classes,
	// if it is 1000 means, we must need to change 1000 classes, so this process will consider as a backward compatibility
	// to avoid this, we use default method in interfaces.
	// still, if we want to provide specific behavior for a particular class, yes we can override default method.
	default void sleep() {
		System.out.println("Most of the animals sleep time is night's only");
	};
}
