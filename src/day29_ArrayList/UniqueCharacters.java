package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaaabcccdeeeef";
// how can I create an ArrayList from a String?
// toCharArray() or split() method?
// toCharArray() returns you "char primitive array" --> it cannot be converted to ArrayList!
// because it is primitive and ArrayList does not support primitives!
// I can use split() method. I can get each character of the String

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println("list = " + list);

        String unique = "";
        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if(frequency == 1) {
                unique += each;
            }
        }
        System.out.println("unique = " + unique);

        System.out.println("----- another solution; ----------");

        list.removeIf(p -> Collections.frequency(list, p) != 1);

        System.out.println("list = " + list);
    }
}
