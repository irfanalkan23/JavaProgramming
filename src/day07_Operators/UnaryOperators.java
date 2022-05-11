package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;
        ++a;   // pre increment: increases the value by 1 right away
        System.out.println(a);   // 6
        --a;
        System.out.println(a);   // 5

        int c = 100;
        System.out.println(c++);   // 100. post increment: first
        System.out.println(c);     // 101

    }
}
