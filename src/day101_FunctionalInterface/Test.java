package day101_FunctionalInterface;

public class Test {
    public static void main(String[] args) {

        MyInterface cube = x -> System.out.println(x*x*x);

        cube.function(10);

        MyInterface oddOrEven = (a) -> {
            if (a % 2 == 0){
                System.out.println(a + " is even number");
            } else {
                System.out.println(a + " is odd number");
            }
        };

        oddOrEven.function(100);
    }
}
