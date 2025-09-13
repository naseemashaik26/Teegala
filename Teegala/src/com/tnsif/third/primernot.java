package com.tnsif.third;

public class primernot {
	public static void main(String[]args) {
		int num =29;
		boolean isprime = true;
		if (num<2) {
			isprime = false;
		}
		else {
			for(int i=2;i<=num/2;i++) {
				if(num% i ==0) {
					isprime = false;
					break;
				}
			}
		}
		if(isprime) {
			System.out.println(num +"is a prime number.");
		}
		else {
			System.out.println(num +"is not aprime number.");
		}
	}

}
