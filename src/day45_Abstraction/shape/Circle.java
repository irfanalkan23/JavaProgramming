package day45_Abstraction.shape;

public class Circle extends Shape{

    private double radius;

    public static final double pi = 3.14;  // we can also have this in interface

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if(radius < 0) {
            throw new RuntimeException("Invalid Radius: " + radius);
        }
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                "radius=" + radius +
                '}';
    }
}
