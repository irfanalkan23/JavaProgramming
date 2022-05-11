package week02;

import java.util.Scanner;

public class UserInputIntro {

    public static void main(String[] args) {

        System.out.println("Output");

        Scanner input = new Scanner(System.in);
        System.out.println("Put your name : ");
        String name = input.next();
        System.out.println("name = " + name);
    }
}
