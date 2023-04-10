package day102_BuildInFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {

    public static void main(String[] args) {

        Function<int[], List<Integer>> arrayToList = array -> {
            List<Integer> list = new ArrayList<>();
            for (int each : array) {
                list.add(each);
            }
            return list;
        };

        int[] arr = {1,2,3,4,5};
        List<Integer> list = arrayToList.apply(arr);
        System.out.println(list);
    }
}
