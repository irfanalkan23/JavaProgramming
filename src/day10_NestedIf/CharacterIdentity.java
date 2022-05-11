package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = 'd';

        if(ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
            System.out.println("Alphabetic");
        } else {
            System.out.println("Special character");
        }


        char ch2 = 65;

        if(ch2 >= 48 && ch2 <= 57) {
            System.out.println("Digit");
        } else if((ch2 >= 65 && ch2 <= 90) || (ch2 >= 97 && ch2 <= 122)){
            System.out.println("Alphabetic");
        } else {
            System.out.println("Special character");
        }


    }
}
