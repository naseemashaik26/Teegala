package com.tnsif.task4;
		class Animal {
		    void eat() {
		        System.out.println("The animal is eating.");
		    }
		}

		// Child Class (also known as Subclass or Derived Class)
		// The 'extends' keyword is used to establish the inheritance relationship.
		class Dog extends Animal {
		    void bark() {
		        System.out.println("The dog is barking.");
		    }
		}

		// Main class to demonstrate the single inheritance
		public class Singleinheritance{
		    public static void main(String[] args) {
		        // Create an object of the Child class
		        Dog myDog = new Dog();

		        // The child object can call its own method
		        myDog.bark();

		        // The child object can also call the method of the parent class
		        // because it has inherited the 'eat()' method.
		        myDog.eat();
		    }
}
	


