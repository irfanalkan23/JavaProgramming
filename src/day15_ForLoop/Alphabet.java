package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        for(char i = 'A'; i <= 'Z'; i++) { // ASCII 65-90
            System.out.print(i + " ");
        }

        System.out.println();

        for(char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }

        System.out.println();

        for(char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + " ");
        }

        System.out.println();

        for(char i = 1; i <= 40000; i++) {
            System.out.print(i + " ");
        }





    }
}
