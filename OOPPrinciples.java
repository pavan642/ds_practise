
/**
 *
 * Q. What are the core principles of Object-Oriented Programming (OOP)? Explain each with an example in Java.
 * Ans. Explanation of core principles of Object-Oriented Programming (OOP) with Java examples
 * Approach
 * Define the four core OOP principles: Encapsulation, Inheritance, Polymorphism, and Abstraction
 * Provide a brief explanation for each principle
 * Include a simple Java code example demonstrating each principle
 *
 *
 * **/
public class OOPPrinciples {
    // Encapsulation example
    static class Encapsulation {
        private int data;
        public void setData(int data) { this.data = data; }
        public int getData() { return data; }
    }

    // Inheritance example
    static class Animal {
        public void sound() { System.out.println("Animal sound"); }
    }
    static class Dog extends Animal {
        @Override
        public void sound() { System.out.println("Dog barks"); }
    }

    // Polymorphism example
    static class Shape {
        public void draw() { System.out.println("Drawing shape"); }
    }
    static class Circle extends Shape {
        @Override
        public void draw() { System.out.println("Drawing circle"); }
    }

    // Abstraction example
    abstract static class Vehicle {
        abstract void move();
    }
    static class Car extends Vehicle {
        void move() { System.out.println("Car is moving"); }
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setData(10);
        System.out.println("Encapsulation data: " + e.getData());

        Animal a = new Animal();
        a.sound();
        Dog d = new Dog();
        d.sound();

        Shape s = new Shape();
        s.draw();
        Shape c = new Circle();
        c.draw();

        Vehicle v = new Car();
        v.move();
    }
}