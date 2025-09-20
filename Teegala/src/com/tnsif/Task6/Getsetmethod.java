package com.tnsif.Task6;

public class Getsetmethod {
	    public static void main(String[] args) {
	        // 1. Create an instance (object) of the Employee class
	        Employee employee1 = new Employee("John Doe", 12345, 60000.0);

	        // 2. Use getter methods to retrieve and print initial values
	        System.out.println("Employee 1 Initial Details:");
	        System.out.println("Name: " + employee1.getName());
	        System.out.println("Employee ID: " + employee1.getEmployeeId());
	        System.out.println("Salary: $" + employee1.getSalary());

	        // 3. Use setter methods to modify the object's properties
	        System.out.println("\nUpdating salary...");
	        employee1.setSalary(65000.0);
	        employee1.setName("Jane Doe");

	        // 4. Use getter methods again to retrieve and print updated values
	        System.out.println("Employee 1 Updated Details:");
	        System.out.println("Name: " + employee1.getName());
	        System.out.println("Salary: $" + employee1.getSalary());
	    }
	}

	class Employee {
	    private String name;
	    private int employeeId;
	    private double salary;
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    // --- Setter Methods ---
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public void setSalary(double salary) {
	        // You can add validation logic here, e.g., to ensure salary is not negative
	        if (salary >= 0) {
	            this.salary = salary;
	        } else {
	            System.out.println("Error: Salary cannot be negative.");
	        }
	    }
	}