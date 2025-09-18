package com.tnsif.task5;

public class StaticMemberDemo {
	
	    public static int staticCounter = 0;

	    // 2. Static Initialization Block:
	    // This block of code is executed exactly once when the class is loaded into memory.
	    // It's useful for initializing static variables that require more complex setup.
	    static {
	        System.out.println("Static block executed. Initializing staticCounter to 10.");
	        staticCounter = 10;
	    }
	    public int instanceId;
	    public StaticMemberDemo(int id) {
	        this.instanceId = id;
	        staticCounter++; // We can access and modify static members from an instance context.
	    }
	    public static void displayStaticCounter() {
	        System.out.println("The current value of staticCounter is: " + staticCounter);
	        
	    }
	    public void displayInstanceInfo() {
	        System.out.println("Instance ID: " + this.instanceId + ", Static Counter: " + staticCounter);
	    }

	    // Main method to run the program and demonstrate usage.
	    public static void main(String[] args) {

	        System.out.println("--- Demonstrating Static Members ---");

	        // Access the static variable directly using the class name, before any objects are created.
	        System.out.println("Accessing staticCounter directly: " + StaticMemberDemo.staticCounter);

	        // Call the static method directly using the class name.
	        StaticMemberDemo.displayStaticCounter();

	        System.out.println("\n--- Creating instances to modify the static variable ---");

	        // Create the first instance.
	        StaticMemberDemo obj1 = new StaticMemberDemo(1);
	        obj1.displayInstanceInfo();

	        // Create the second instance.
	        StaticMemberDemo obj2 = new StaticMemberDemo(2);
	        obj2.displayInstanceInfo();

	        // The static variable is shared, so both objects' constructors incremented the same counter.
	        System.out.println("\n--- Final state of static members after object creation ---");
	        StaticMemberDemo.displayStaticCounter();
	    }
	}

