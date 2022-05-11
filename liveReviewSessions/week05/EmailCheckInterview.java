package week05;

import java.util.Scanner;

public class EmailCheckInterview {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String email = s.nextLine();
//        boolean valid = email.contains("@") && email.contains(".")
//                && email.indexOf(".") > email.indexOf("@")+1
//                && email.indexOf("@") > 0
//                && email.lastIndexOf(".") < email.length()-1;

/*        indexof("@")<1 :  0 (no character before @ sign) or -1 (there is no @ sign)
        indexof("@") >= email.length()-3   (a@a.a: indexof("@):length()-4 )
                what if we have 2 @ signs :
        the index of @ sign == last index of @ sign: there is one @ sign, otherwise problem
        DOT Conditions
        indexof(".")<1 :  0 (no character before dot sign) or -1 (there is no dot sign)
        indexofDotSign == email.length()-1 : problem
        the index of @ sign > bigger than indexofDotSign: problem
        the index of @ sign + 1 ==  indexofDotSign (@.): there is no character in between : problem
        */

        int atSignIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");
        boolean result = true;

        if(atSignIndex<1 || atSignIndex>= email.length()-3 || atSignIndex != email.lastIndexOf("@")) {
            result = false;
        }
        if(dotIndex<1 || dotIndex == email.length()-1 || atSignIndex > dotIndex || atSignIndex+1 == dotIndex) {
            result = false;
        }
        System.out.println(result);

//        boolean valid = email.indexOf("@") >= 1             /* @ exists and not the first char */
//                && email.indexOf("@") < email.length() - 3  /* a@a.a: index of @ is length() -4 */
//                &&                                          /* if we have more than 2 @ */
//                &&                                          /* no char before . sign */
//                &&                                          /* index of . sign should be less than length() -1  */
//                &&                                          /* a@a.a: index of @ is length() -4 */ ;
//        System.out.println(valid);


    }
}
/*
Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
 */