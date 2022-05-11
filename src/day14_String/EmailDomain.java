package day14_String;

import java.util.Arrays;

public class EmailDomain {
    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";
        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");
        String domain = email.substring(beginningIndex, endingIndex);
        System.out.println("domain = " + domain);

        //====================
        String[] data = email.split("[, ?.@]+");
        System.out.println(Arrays.toString(data));
        //======================
    }
}
/*
1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo
 */