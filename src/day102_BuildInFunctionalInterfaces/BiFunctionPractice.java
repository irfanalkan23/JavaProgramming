package day102_BuildInFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionPractice {

    public static void main(String[] args) {

        BiFunction<int[], int[], List<Integer>> merge = (a,b) -> {
            List<Integer> list = new ArrayList<>();
            for (int each : a) {
                list.add(each);
            }
            for (int each : b) {
                list.add(each);
            }
            return list;
        };

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        List<Integer> numbers = merge.apply(arr1, arr2);
        System.out.println(numbers);
    }
}
