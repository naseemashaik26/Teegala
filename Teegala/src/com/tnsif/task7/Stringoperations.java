package com.tnsif.task7;

public class Stringoperations {

	    public static void main(String[] args) {
	        System.out.println("--- Using StringBuilder ---");
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        System.out.println("After append(): " + sb);
	        sb.insert(6, "Java ");
	        System.out.println("After insert(): " + sb);

	        sb.reverse();
	        System.out.println("After reverse(): " + sb);
	        sb.delete(0, 5); 
	        System.out.println("After delete(): " + sb);

	        System.out.println("\n--- Using StringBuffer ---");
	        StringBuffer sbf = new StringBuffer("Java");
	        sbf.append(" Programming");
	        System.out.println("After append(): " + sbf);
	        sbf.reverse();
	        System.out.println("After reverse(): " + sbf);
	   
	        sbf.insert(0, "Learning ");
	        System.out.println("After insert(): " + sbf);
	    }
	}

