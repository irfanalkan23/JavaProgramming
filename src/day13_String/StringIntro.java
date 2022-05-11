package day13_String;

public class StringIntro {
    public static void main(String[] args) {
        String name = "Wooden Spoon";
        String name2 = "Wooden Spoon";

        System.out.println(name == name2);  // true

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");

        System.out.println(str1 == str2);   // false


    }
}
