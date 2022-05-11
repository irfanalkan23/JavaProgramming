package week05;

import java.util.Scanner;

public class ReverseUsingCharAtMethod {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word of 5 characters: ");
        String word = s.next();

        boolean isPalindrom = word.charAt(0) == word.charAt(4) && word.charAt(1) == word.charAt(3);

        if(isPalindrom) {
            System.out.println(word + " is a Palindrom");
        } else {
            System.out.println(word + " is NOT a Palindrom");
        }
        s.close();
    }
}
