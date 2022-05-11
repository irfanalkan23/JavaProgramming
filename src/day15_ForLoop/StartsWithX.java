package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();    // this way, no need to close the Scanner. not assigning to a variable. We use input once.

        if(word.charAt(0) == 'x') {
            word = word.replaceFirst("x", "a");    // creates a new String object --> "acodex"
        }
        System.out.println(word);
    }
}
/*
Warmup tasks:
	1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */