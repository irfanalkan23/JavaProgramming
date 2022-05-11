package day13_String;

public class StringMethods {
    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

//        char tenthChar = word.charAt(9);
//        System.out.println("tenthChar = " + tenthChar);

        String s1 = "Batch 25 is the best batch. Java Programming Language";
        int totalChars = s1.length();
        System.out.println("totalChars = " + totalChars);
        char lastChar = s1.charAt(s1.length()-1);
        System.out.println("lastChar = " + lastChar);

        String str = "wooden spoon";            // String is immutable! this object does not change!!!
        str = str.toLowerCase();  // "WOODEN SPOON"
        System.out.println(str);
        // you can store only one data in a variable!


    }
}
