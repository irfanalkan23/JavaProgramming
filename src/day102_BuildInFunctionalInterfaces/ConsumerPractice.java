package day102_BuildInFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {

//Consumer: takes one type, does not return a value.

    public static void main(String[] args) {

        Consumer<int[]> printEach = n -> {
            for (int each : n) {
                System.out.println(each);
            }
        };

        int[] numbers = {100,200,300,400};
        printEach.accept(numbers);

        // find initials:
        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbe", "Aygun Abbaso Jarullah", "Jilili Jiwuer", "Ali Ismayılow"));

        employees.forEach( s -> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ") + 1)));

    }
}
