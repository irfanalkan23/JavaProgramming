package week06_ForLoop;

import java.util.Scanner;

public class EncryptPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password:");
        String password = scan.nextLine();

        String encryption = "";
        for (int i = 0; i < password.length(); i++) {
            encryption += password.charAt(i) + "x";
        }
        System.out.println(encryption);
    }
}
/*
 * 5.
 * Given a string password. Encrypt with "x" a given password
 * and print.
 * (do with for loop)
 * password: cydeo
 * encrypt with char :x
 * output:cxyxdxexox
 */