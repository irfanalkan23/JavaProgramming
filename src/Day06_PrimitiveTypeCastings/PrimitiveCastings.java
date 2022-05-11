package Day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        long a = 3333;
        int b = (int) a;

        long c = 1000000;
        short d = (short) c;

        System.out.println("c = " + c + "\nd = " +d);

        double e = 10.8;
        int f = (int) e;
        System.out.println("e = " + e + "\nf = " +f);

        double g = 20.5;
        short h = (short) g;
    }
}
