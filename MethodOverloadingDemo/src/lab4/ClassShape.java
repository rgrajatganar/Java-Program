package lab4;


class Shape2 {
    public void draw() {
        System.out.println("Drawing generic shape");
    }

    public double calculateArea() {
        return 0.0;
    }
}

class Circle2 extends Shape2 {
    protected double radius;

    public Circle2(double radius) {
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

class Cylinder extends Circle2 {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Cylinder");
        // Code to draw a cylinder
    }

    @Override
    public double calculateArea() {
        double circleArea = super.calculateArea();
        double cylinderSurfaceArea = (2 * Math.PI * radius * height) + (2 * circleArea);
        return cylinderSurfaceArea;
    }
}

public class ClassShape {
    public static void main(String[] args) {
        Circle2 circle = new Circle2(4);
        Cylinder cylinder = new Cylinder(2, 7);

        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        cylinder.draw();
        System.out.println("Surface Area of Cylinder: " + cylinder.calculateArea());
    }
}


