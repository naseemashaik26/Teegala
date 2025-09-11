package com.tnsif.second;

public class Operators {
	    public static void main(String[] args) {
	        int a = 10, b = 5;

	        // 1. Arithmetic Operators
	        System.out.println("=== Arithmetic Operators ===");
	        System.out.println("a + b = " + (a + b));
	        System.out.println("a - b = " + (a - b));
	        System.out.println("a * b = " + (a * b));
	        System.out.println("a / b = " + (a / b));
	        System.out.println("a % b = " + (a % b));

	        // 2. Relational Operators
	        System.out.println("\n=== Relational Operators ===");
	        System.out.println("a == b: " + (a == b));
	        System.out.println("a != b: " + (a != b));
	        System.out.println("a > b: " + (a > b));
	        System.out.println("a < b: " + (a < b));
	        System.out.println("a >= b: " + (a >= b));
	        System.out.println("a <= b: " + (a <= b));

	        // 3. Logical Operators
	        System.out.println("\n=== Logical Operators ===");
	        boolean x = true, y = false;
	        System.out.println("x && y: " + (x && y));
	        System.out.println("x || y: " + (x || y));
	        System.out.println("!x: " + (!x));

	        // 4. Assignment Operators
	        System.out.println("\n=== Assignment Operators ===");
	        int c = 10;
	        System.out.println("c = " + c);
	        c += 5; System.out.println("c += 5 → " + c);
	        c -= 3; System.out.println("c -= 3 → " + c);
	        c *= 2; System.out.println("c *= 2 → " + c);
	        c /= 4; System.out.println("c /= 4 → " + c);
	        c %= 3; System.out.println("c %= 3 → " + c);

	        // 5. Unary Operators
	        System.out.println("\n=== Unary Operators ===");
	        int d = 5;
	        System.out.println("d = " + d);
	        System.out.println("d++ = " + (d++)); 
	        System.out.println("After d++: " + d);
	        System.out.println("++d = " + (++d)); 
	        System.out.println("d-- = " + (d--)); 
	        System.out.println("After d--: " + d);
	        System.out.println("--d = " + (--d)); 

	        // 6. Bitwise Operators
	        System.out.println("\n=== Bitwise Operators ===");
	        int m = 6, n = 3; 
	        System.out.println("m & n = " + (m & n));  
	        System.out.println("m | n = " + (m | n));
	        System.out.println("m ^ n = " + (m ^ n)); 
	        System.out.println("~m = " + (~m));       
	        System.out.println("m << 1 = " + (m << 1));
	        System.out.println("m >> 1 = " + (m >> 1));

	        // 7. Ternary Operator
	        System.out.println("\n=== Ternary Operator ===");
	        int max = (a > b) ? a : b;
	        System.out.println("Max of a and b = " + max);
	    }
	}


