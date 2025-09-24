
	package com.tnsif.task8;

	public class ThrowsDemo {
		    public static void main(String[] args) {
		        try {
		            
		            int result = 10 / 0;
		            System.out.println("The result is: " + result); 
		        } catch (ArithmeticException e) {
		            
		            System.err.println("An error occurred: Cannot divide by zero."); 
		            e.printStackTrace(); 
		        } finally {
		            
		            System.out.println("The 'finally' block always executes.");
		        }
		    }
		}



