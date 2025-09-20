package com.tnsif.task7;

public class wrapperclass {

	    @SuppressWarnings("removal")
		public static void main(String[] args) {
	        int primitiveInt = 100;
	        System.out.println("Primitive int value: " + primitiveInt);
	        Integer wrapperInt = primitiveInt;
	        System.out.println("Wrapper Integer object: " + wrapperInt);
	        int anotherPrimitiveInt = wrapperInt;
	        System.out.println("Unboxed primitive int value: " + anotherPrimitiveInt);
	        Integer anotherWrapperInt = new Integer(200);
	        System.out.println("Manually created wrapper Integer object: " + anotherWrapperInt);
	        String numberAsString = "55";
	        int parsedInt = Integer.parseInt(numberAsString);
	        System.out.println("Parsed int from string: " + parsedInt);

	    }
	}

