package com.tnsif.task5;

	public class MethodOverloadingExample {

	    // Method 6: Takes a boolean and a String
	    public void print(boolean flag, String text) {
	        System.out.println("Method 6: Printing a boolean (" + flag + ") and a String (" + text + ")");
	    }

	    public static void main(String[] args) {
	        // Fix the object creation here
	        MethodOverloadingExample obj = new MethodOverloadingExample();

	        // Calling overloaded methods based on data types
	        System.out.println("--- Calling overloaded methods based on data types ---");
	        obj.display(10, 20.5); // Calls Method 1 (int, double)
	        obj.display(30.7, 40); // Calls Method 2 (double, int)
	        System.out.println();

	        // Calling overloaded methods based on the number of parameters
	        System.out.println("--- Calling overloaded methods based on number of parameters ---");
	        obj.display("Hello"); // Calls Method 3 (single String)
	        obj.display("Java", "Programming"); // Calls Method 4 (two Strings)
	        System.out.println();

	        // Calling overloaded methods based on the sequence of parameters
	        System.out.println("--- Calling overloaded methods based on sequence of parameters ---");
	        obj.print("Sequence is important", true); // Calls Method 5 (String, boolean)
	        obj.print(false, "This is important"); // Calls Method 6 (boolean, String)
	    }

	    // Other overloaded methods (display) that are referenced in the main method would also need to be defined
	    // For example:
	    public void display(int a, double b) {
	        System.out.println("Method 1: int and double");
	    }

	    public void display(double a, int b) {
	        System.out.println("Method 2: double and int");
	    }

	    public void display(String s) {
	        System.out.println("Method 3: single String");
	    }

	    public void display(String s1, String s2) {
	        System.out.println("Method 4: two Strings");
	    }

	    public void print(String s, boolean b) {
	        System.out.println("Method 5: String and boolean");
	    }
	}

