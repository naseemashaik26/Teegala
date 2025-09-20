package com.tnsif.task5;
	interface Shape {
	    double calculateArea();
	}
	interface ColoredShape extends Shape {
	    String getColor();
	}

	class Circle implements ColoredShape {
	    private double radius;
	    private String color;

	    // Constructor to initialize the circle's radius and color
	    public Circle(double radius, String color) {
	        this.radius = radius;
	        this.color = color;
	    }

	    @Override
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    
	    @Override
	    public String getColor() {
	        return color;
	    }
	}

	public class interfaces {
	    public static void main(String[] args) {
	        Circle myCircle = new Circle(5.0, "Blue");
	        System.out.println("The area of the " + myCircle.getColor() + " circle is: " + myCircle.calculateArea());
	    }
	}