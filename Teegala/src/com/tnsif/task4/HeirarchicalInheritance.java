package com.tnsif.task4;

// Parent class
class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

// Main class to demonstrate Hierarchical Inheritance
public class HeirarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("--- Dog Object ---");
        dog.eat();  // Inherited from Animal
        dog.bark();

        System.out.println("\n--- Cat Object ---");
        cat.eat();  // Inherited from Animal
        cat.meow();
    }
}
