package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number:");
            int number = scan.nextInt();
            if(number > max) {
                max = number;
            }
        }

        System.out.println("max number = " + max);
    }
}
