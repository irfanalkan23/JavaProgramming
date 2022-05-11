package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        byte age = 38;

        short weight = 160;

        int salary = 100_000;

        long asset = 3_333_333_333L;  // if you don't type L, you get error "integer number too large"

        float tax = 4.34F;

        double PI = 3.14; // for double, we don't need to use D

        char hash = '#';
        char hash2 = 35;
        System.out.println("hash = " + hash);
        System.out.println("hash2 = " + hash2);

        boolean result = 100 > 300;
        System.out.println("result = " + result);
    }
}
