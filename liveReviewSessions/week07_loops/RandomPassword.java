package week07_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGabcdefg0123456789!@#$%&";
        Random random = new Random();

        String password = "";

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(source.length()-1);
            System.out.println("index = " + index);
            password += source.charAt(index);
        }
        System.out.println("password = " + password);
    }
}
