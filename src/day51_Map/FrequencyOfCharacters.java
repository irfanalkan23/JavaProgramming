package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "bbcccaaaaa";

//        char[] chars = str.toCharArray(); // --> instead, use split();
        String[] arr = str.split("");

        Map<String, Integer> map = new LinkedHashMap<>();   // in the entry order

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            map.put(each, frequency);
        }
        System.out.println(map);

    }
}
/*
2. Write a program that can return the frequency of characters
        Not: MUST use map
        Ex: str = "bbcccaaaaa"
        output:
            {b=2, c=3, a=5}
 */