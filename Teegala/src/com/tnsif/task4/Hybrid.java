package com.tnsif.task4;

	class Vehicle {
	    void displayVehicle() {
	        System.out.println("This is a generic vehicle.");
	    }
	}

	// Hierarchical Inheritance: Car inherits from Vehicle
	class Car extends Vehicle {
	    void displayCar() {
	        System.out.println("This is a car.");
	    }
	}

	// Hierarchical Inheritance: Bus also inherits from Vehicle
	class Bus extends Vehicle {
	    void displayBus() {
	        System.out.println("This is a bus.");
	    }
	}

	// Single Inheritance: SportsCar inherits from Car,
	// which is already part of the hierarchy. This creates the hybrid structure.
	class SportsCar extends Car {
	    void displaySportsCar() {
	        System.out.println("This is a sports car.");
	    }
	}

	public class Hybrid {
	    public static void main(String[] args) {
	        // Creating an object of the most specific class
	        SportsCar mySportsCar = new SportsCar();
	        
	        // Calling methods from all parent classes in the hierarchy
	        mySportsCar.displayVehicle(); // Inherited from Vehicle
	        mySportsCar.displayCar();     // Inherited from Car
	        mySportsCar.displaySportsCar(); // Its own method
	    }
	}


