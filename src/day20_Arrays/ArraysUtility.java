package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] numbers = {1,4,5,6,7,3,2,7,5};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);   // sorts the array in ascending order

        System.out.println(Arrays.toString(numbers));

    }
}
