package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number = 300;

        boolean evenNumber = number % 2 == 0;

        if(evenNumber) {
            System.out.println(number + " is even number");
        }

        if(!evenNumber) {
            System.out.println(number + " is odd number");
        }
    }
}
