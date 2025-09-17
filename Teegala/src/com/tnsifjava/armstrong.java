package com.tnsifjava;

public class armstrong {

	public static void main(String[] args) {
		        int num = 153;   // change this number to test
		        int originalNum = num;
		        int sum = 0;

		        while (num > 0) {
		            int digit = num % 10;       // get last digit
		            sum = sum + (digit * digit * digit); // cube of digit
		            num = num / 10;             // remove last digit
		        }

		        if (sum == originalNum) {
		            System.out.println(originalNum + " is an Armstrong number.");
		        } else {
		            System.out.println(originalNum + " is NOT an Armstrong number.");
		        }
		    }
		


	}


