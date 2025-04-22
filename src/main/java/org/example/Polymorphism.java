package org.example;

public class Polymorphism {
    public static void main(String[] args) {
//        Shape genericShape = new Shape();
//        genericShape.draw();
        Circle circleShape = new Circle();
        circleShape.draw();
        Rectangle rectangleShape = new Rectangle();
        rectangleShape.draw();

        Shape circleShape2 = new Circle();
        circleShape2.draw();
        circleShape2.perimeter();
    }
}

abstract class Shape {
    public void draw() {
        System.out.println("Drawing a generic Shape.");
    }

    public void displayName() {
        System.out.println("This is a generic class!");
    }

    public void perimeter() {
        double perimeter = 0;
        System.out.println("Perimeter: "+perimeter);
    }

    public abstract void perimeter(double radius);

    public abstract void perimeter(double l, double w);
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void perimeter(double radius) {
        double perimeter = Math.PI*radius;
        System.out.println("Perimeter: "+perimeter);
    }

    @Override
    public void perimeter(double l, double w) {

    }

    public void calculateCircumference() {

    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    public void perimeter(double radius) {

    }

    @Override
    public void perimeter(double l, double w) {
        double perimeter = (l+w)*2;
        System.out.println("Perimeter: "+perimeter);
    }
}
