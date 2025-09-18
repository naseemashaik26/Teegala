package com.tnsif.task5;

public class Constructoroverloading {
    double width;
    double height;
    double depth;

    // Default constructor
    public Constructoroverloading() {
        System.out.println("Default constructor called.");
        this.width = 10;
        this.height = 10;
        this.depth = 10;
    }

    // Constructor for a cube
    public Constructoroverloading(double side) {
        System.out.println("Constructor for a cube called.");
        this.width = side;
        this.height = side;
        this.depth = side;
    }

    // Constructor for a rectangular box
    public Constructoroverloading(double w, double h, double d) {
        System.out.println("Constructor for a rectangular box called.");
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // Method to calculate the volume
    public double volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        // Create an object using the default constructor
        Constructoroverloading defaultBox = new Constructoroverloading();
        System.out.println("Volume of default box: " + defaultBox.volume());
        System.out.println("------------------------------------");

        // Create an object using the cube constructor
        Constructoroverloading cube = new Constructoroverloading(5);
        System.out.println("Volume of cube: " + cube.volume());
        System.out.println("------------------------------------");

        // Create an object using the rectangular box constructor
        Constructoroverloading rectangularBox = new Constructoroverloading(2, 3, 4);
        System.out.println("Volume of rectangular box: " + rectangularBox.volume());
        System.out.println("------------------------------------");
    }
}