package day103_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5,5,5));

        //Imperative approach:
        List<Integer> result1 = new ArrayList<>();
        for (Integer each : numbers) {
            if(!result1.contains(each)){
                result1.add(each);
            }
        }

        System.out.println(result1);

        System.out.println("--------------------------------");

        //Declarative approach:
        List<Integer> result2 = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(result2);
    }
}
