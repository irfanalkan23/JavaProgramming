package day102_BuildInFunctionalInterfaces;

import java.util.function.BiPredicate;

public class BiPredicatePractice {

    public static void main(String[] args) {

        BiPredicate<int[], Integer> contains = (arr, num) -> {
            boolean result = false;
            for (int each : arr) {
                if (each == num){
                    result = true;
                    break;
                }
            }
            return result;
        };

        int[] arr = {10,20,30,40};
        System.out.println(contains.test(arr,40));
    }
}
