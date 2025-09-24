package com.tnsif.task8;

public class Throwdemo{

    public static void checkAge(int age) {
        if (age < 18) {
            // Throw an exception with a custom error message.
            throw new ArithmeticException("The age is less than 18, not eligible for voting.");
        } else {
            System.out.println("Eligible for voting.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Program to demonstrate the 'throw' keyword.");
        try {
            System.out.println("\nChecking age for 15...");
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        System.out.println("\nChecking age for 20...");
        checkAge(20);

        System.out.println("\nProgram finished.");
    }
}
