package week05;

public class StringReview {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1 == str2); // output: true, they are both pointing to the same object in String Pool.

        System.out.println(str1.equals(str2));  // checks if two strings have same text, returns boolean

        String newStr1 = str1.replaceAll("av", "Av");
        System.out.println(newStr1);
        String newStr2 = str1.replace("av", "Av");
        System.out.println(newStr2);

        String str4 = " EU8 Awesome";
        str4 = str4.trim().replaceFirst(" ", "").toUpperCase().substring(3);
        System.out.println(str4);



    }
}
