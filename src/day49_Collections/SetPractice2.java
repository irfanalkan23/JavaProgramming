package day49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr ={"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

//        arr = new HashSet<>(Arrays.asList(arr)).toArray(new String[0]); // --> random
        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]); // --> insertion order


//        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
//        arr = set1.toArray(new String[0]);
//        System.out.println(set1);

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,3,1,2,3,4,5,5,6,10,10,20,20,30,10));
        list = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println(list);


        System.out.println("--------------------------------");

        String str = "eeeeeaaaabbbbccccdddeeeee";

        String result = "";  //e10a4b4c4d3 --> keep the same order=linkedHashSet
        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count = Collections.frequency( Arrays.asList(str.split("")), each );
            result += each + count;
        }

        System.out.println(result);


        System.out.println("--------------------------------");

        // Given Integer[] nums, return fifth element ofter removing the duplicates,
        // do not change the order of the elements..
        Integer[] nums = {1,2,1,1,2,2,3,3,3,3,2,3,3,4,5,6,7,8,4,5,6,7};
        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));

        System.out.println("----------------------------------------");

        Set<String> names = new LinkedHashSet<>();  //Set does not have index numbers!

        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));

        System.out.println(names.toArray(new String[0])[2]);    //return the 3rd element

        System.out.println(new ArrayList<>(names).get(4) );

        for (String each : names) {
            System.out.println(each);
        }
    }
}
