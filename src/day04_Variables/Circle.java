package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        double radius = 5;
        double area = Math.PI*radius*radius;
        double perimeter = 2*Math.PI*radius;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
