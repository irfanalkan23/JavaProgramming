package week03;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        scanner.nextLine();
//        if(number % 2 == 0) {
//            System.out.println(number + " is even");
//        } else {
//            System.out.println(number + " is odd");
//        }
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("result = " + result);

    }
}
