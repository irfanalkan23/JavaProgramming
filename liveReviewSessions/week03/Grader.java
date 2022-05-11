package week03;

import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");


        if(scanner.hasNextInt()) {
            int score = scanner.nextInt();
            scanner.nextLine();
            if(score >= 0 && score <= 100) {   // first, do a sanity check.
                System.out.println("Your grade is valid");
                if(score <= 100 && score >= 90) {
                    System.out.println("A");
                } else if(score < 90 && score >= 80) {
                    System.out.println("B");
                } else if(score < 80 && score >= 70) {
                    System.out.println("C");
                } else if(score < 60 && score >= 70) {
                    System.out.println("D");
                } else {
                    System.out.println("F");
                }
            } else {
                System.out.println("Not a valid entry");
            }
        } else {
            System.out.println("not an integer");
        }
    }
}
