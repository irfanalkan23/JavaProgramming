package day45_Abstraction.shape;

import static day45_Abstraction.shape.Circle.pi;

public class Cylinder extends Shape{

    private double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0) {
            throw new RuntimeException("Invalid Radius: " + radius);
        }
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0) {
            throw new RuntimeException("Invalid Radius: " + height);
        }
        this.height = height;
    }

    @Override
    public double area() {
        return pi * radius * radius * height;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
}
