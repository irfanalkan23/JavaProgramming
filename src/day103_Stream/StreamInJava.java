package day103_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInJava {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,5,7,7,6,8,9};
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,5,7,7,6,8,9);

        Arrays.stream(arr);
        Stream.of(1,2,3,4,5,6,5,7,7,6,8,9);
        Stream<Integer> stream = list.stream();

        //======== Commonly used INTERMEDIATE OPERATIONS =========
        // map(), filter(), distinct(), sorted(), limit()

        list.stream()
                .map(x->x*x)
                .filter(x->x>20)
                .distinct()
                .sorted()   //ascending order
                .limit(3)   //first 3 numbers
                .forEach(System.out::println);

        System.out.println("list = " + list);

        //======== Commonly used TERMINAL OPERATIONS =========
        // forEach(), collect(), reduce(), count(), findFirst()/findAny(), anyMatch()/allMatch()

        List<Integer> squares = list.stream()
                .map(x->x*x)
                .collect(Collectors.toList());

        System.out.println("squares = " + squares);

        int sum = list.stream()
                .map(x->x*x)
                .reduce(0,(num1,num2)->num1+num2);

        System.out.println("sum = " + sum);

        long count = list.stream()
                .map(x -> x * x)
                .count();

        System.out.println("count = " + count);

        Integer firstValue = list.stream()
                .map(x -> x * x)
                .findFirst().get();

        System.out.println("firstValue = " + firstValue);

        boolean anyMatch = list.stream()
                .map(x -> x * x)
                .anyMatch(sq -> sq < 20);

        System.out.println("anyMatch = " + anyMatch);

        boolean allMatch = list.stream()
                .map(x -> x * x)
                .allMatch(sq -> sq < 20);

        System.out.println("allMatch = " + allMatch);
    }
}
