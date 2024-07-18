package lab4;


abstract class Shape1 {
    public abstract void draw();
    public abstract double calculateArea();
}

class Circle extends Shape1 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        // Code to draw a circle
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape1 {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
        // Code to draw a square
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

class Triangle extends Shape1 {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
        // Code to draw a triangle
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Square square = new Square(4);
        Triangle triangle = new Triangle(5, 6);

        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        square.draw();
        System.out.println("Area of Square: " + square.calculateArea());

        triangle.draw();
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}

