package com.tnsifjava;

public class palindrome {
		    public static void main(String[] args) {
		        int num = 121;   // change this number to test
		        int originalNum = num;
		        int reverse = 0;

		        while (num > 0) {
		            int digit = num % 10;        // get last digit
		            reverse = reverse * 10 + digit; // build reversed number
		            num = num / 10;              // remove last digit
		        }

		        if (originalNum == reverse) {
		            System.out.println(originalNum + " is a Palindrome number.");
		        } else {
		            System.out.println(originalNum + " is NOT a Palindrome number.");
		        }
		    }
		

	}

