package com.tnsif.task4;

public class superkeyword {
	// Vehicle.java (Parent Class)
	class Vehicle {
	    void displayType() {
	        System.out.println("This is a generic vehicle.");
	    }
	}
	// Car.java (Child Class)
	class Car extends Vehicle {
	    @Override
	    void displayType() {
	        // Call the parent class's displayType() method using the super keyword
	        super.displayType();
	        System.out.println("This is a specific car.");
	    }
	}
	// Main.java
	public class Main {
	    public static void main(String[] args) {
	        Car myCar = new Car();
	        myCar.displayType();
	    }
	}

}
