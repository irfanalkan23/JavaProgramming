package day08_IfStatements;

public class ShortQuiz {
    public static void main(String[] args) {
        long a = 30L;
        long b = (short) a;
        System.out.println(b);

        /* a. 30 --> correct
           b. 30L
           c. compile error
         */

        int c = 3, d = 2;
        long e = (c+d) * 2 / 3 % 2;  // first parenthesis, then left to right (* / %)
        System.out.println(e);  // output : 1

    }
}
