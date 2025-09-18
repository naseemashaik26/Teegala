package com.tnsif.task5;
final class FinalClass {
    public void display() {
        System.out.println("This is a final class. It cannot be subclassed.");
    }
}

class ParentClass {
    // 2. A final method cannot be overridden by a subclass.
    public final void finalMethod() {
        System.out.println("This is a final method. It cannot be overridden.");
    }

    public void regularMethod() {
        System.out.println("This is a regular method. It can be overridden.");
    }
}

class ChildClass extends ParentClass {
    @Override
    public void regularMethod() {
        System.out.println("This is a method from ChildClass, overriding regularMethod.");
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {
        // 3. A final variable can only be initialized once. Its value cannot be changed.
        final double PI = 3.14159;
        System.out.println("The value of PI is: " + PI);
        System.out.println("\n--- Demonstrating Final Method ---");
        ChildClass child = new ChildClass();
        
        child.finalMethod();
        child.regularMethod();
    }
}
