package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbaacc";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        System.out.println("result = " + result);
    }
}
/*
	2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */