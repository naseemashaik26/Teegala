package com.tnsif.task8;

public class multiplecatch {

	    public static void main(String args[]) {
	        System.out.println("Demonstrating multiple catch blocks.");

	        // Case 1: Demonstrating ArithmeticException
	        try {
	            System.out.println("\nAttempting to perform division by zero...");
	            int result = 30 / 0;
	            System.out.println("Result: " + result); // This line will not be executed
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException caught: " + e.getMessage());
	            System.out.println("Task 1 is completed.");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught.");
	            System.out.println("Task 2 completed.");
	        } catch (Exception e) {
	            System.out.println("Common task completed: An unknown exception occurred.");
	        }

	        // Case 2: Demonstrating ArrayIndexOutOfBoundsException
	        try {
	            System.out.println("\nAttempting to access an invalid array index...");
	            int a[] = new int[5];
	            a[5] = 10; // This line will cause the exception
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException caught.");
	            System.out.println("Task 1 is completed.");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
	            System.out.println("Task 2 completed.");
	        } catch (Exception e) {
	            System.out.println("Common task completed: An unknown exception occurred.");
	        }

	        System.out.println("\nRest of the code continues to execute.");
	    }
	}
