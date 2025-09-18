
	package com.tnsif.task4;

	// Interface 1: defines a behavior for flying
	interface Flyable {
	    void fly();
	}

	// Interface 2: defines a behavior for swimming
	interface Swimmable {
	    void swim();
	}

	// Class that implements both interfaces
	class Duck implements Flyable, Swimmable {
	    @Override
	    public void fly() {
	        System.out.println("The duck is flying.");
	    }

	    @Override
	    public void swim() {
	        System.out.println("The duck is swimming.");
	    }
	}

	// Main class to demonstrate multiple inheritance with interfaces
	public class Multiple {
	    public static void main(String[] args) {
	        Duck myDuck = new Duck();  // Create Duck object
	        myDuck.fly();
	        myDuck.swim();
	    }
	}


