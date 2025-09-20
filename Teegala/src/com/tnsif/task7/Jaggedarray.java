package com.tnsif.task7;

public class Jaggedarray {

	    public static void main(String[] args) {
	        int[][] jaggedArray = new int[3][];

	        
	        jaggedArray[0] = new int[2]; 
	        jaggedArray[1] = new int[4]; 
	        jaggedArray[2] = new int[3]; 
	        jaggedArray[0][0] = 1;
	        jaggedArray[0][1] = 2;

	        // Row 1
	        jaggedArray[1][0] = 3;
	        jaggedArray[1][1] = 4;
	        jaggedArray[1][2] = 5;
	        jaggedArray[1][3] = 6;

	        // Row 2
	        jaggedArray[2][0] = 7;
	        jaggedArray[2][1] = 8;
	        jaggedArray[2][2] = 9;
	        System.out.println("Printing the elements of the jagged array:");
	        for (int i = 0; i < jaggedArray.length; i++) {
	            System.out.print("Row " + i + ": ");
	            for (int j = 0; j < jaggedArray[i].length; j++) {
	                System.out.print(jaggedArray[i][j] + " ");
	            }
	            System.out.println(); 
	        }
	    }
	}
