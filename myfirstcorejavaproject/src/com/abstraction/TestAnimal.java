package com.abstraction;

// Driver Class
public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("Welcome to Animal Park");
		
		// List<Integer> l = new ArrayList<>();
		// l.add(10);
		
		// Connection con = DriverManager.getConnection("");
		// con.createStatement();
		
		System.out.println("Cat Info *******************");
        Animal c = new Cat();
        c.sound();
        c.eat();
        c.walk();
        c.sleep();
        c.run();
        Animal.breath();
        // This static method of interface Animal can only be accessed as Animal.breath
        // c.breath();
        
        System.out.println("Dog Info ********************");
        Animal d = new Dog();
        d.sound();
        d.eat();
        d.walk();
        d.sleep();
        d.run();
        Animal.breath();
        
        System.out.println("Monkey Info ********************");
        Animal m = new Monkey();
        m.sound();
        m.eat();
        m.walk();
        m.sleep();
        m.run();
        Animal.breath();
	}

}
