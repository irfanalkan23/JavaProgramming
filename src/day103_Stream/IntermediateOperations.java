package day103_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {

    public static void main(String[] args) {

        //distinct():
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
        list1 = list1.stream().distinct().collect( Collectors.toList());	// delete duplicates
        System.out.println(list1);		// output: [1, 2, 3, 4, 5, 6]

        int[] arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};
        arr1 = Arrays.stream(arr1).distinct().toArray();
        System.out.println(Arrays.toString(arr1));		// output: [1, 2, 3, 4, 5, 6]

        //skip(n): skip the first n elements. returns stream.
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2 = list2.stream().skip(5).collect(Collectors.toList());	// skip(5): skip first 5 elements
        System.out.println(list2);		// [6, 7, 8, 9, 10]

        int[] nums2 =  {1,2,3,4,5,6,7,8,9,10};
        nums2 = Arrays.stream(nums2).skip(4).toArray();
        System.out.println(Arrays.toString(nums2));

        //limit(n): return first n elements in the stream
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3 = list3.stream().limit(7).skip(3).collect(Collectors.toList());
        System.out.println("list3 = " + list3);        // [4, 5, 6, 7]

        //map(function): used for transforming the elements in the stream by applying the specified function
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4 = list4.stream().map( p -> p * 10 ).collect(Collectors.toList());
        System.out.println("list4 = " + list4);        // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        days =  days.stream().map( p -> p.substring(0, 3) ).collect(Collectors.toList());
        System.out.println("days = " + days);    // [Mon, Tue, Wed, Thu, Fri, Sat, Sun]

        List<Integer> list10 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list10 = list10.stream().map( p -> {
            if (p%2!=0){        //if the number is odd, return number*2
                return p*2;
            } else {
                return p;
            }
        } ).collect(Collectors.toList());
        System.out.println("list10 = " + list10);

        //filter(Predicate):
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens = list5.stream().filter( p -> p%2==0).collect(Collectors.toList());
        System.out.println(evens);	// [2, 4, 6, 8, 10]

        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));
        long countJava = names.stream().filter( p -> p.equalsIgnoreCase("java")).count();
        System.out.println(countJava);		// 3
        names.stream().filter( p -> p.equalsIgnoreCase("java")).forEach( p -> System.out.println(p));	// Java		java		jAvA

        //sorted(): sort the elements in the stream
        List<Integer> list11 = new ArrayList<>(Arrays.asList(1,2,30,4,5,60,7,80,9,10));
        list11 = list11.stream().sorted().collect(Collectors.toList());
        System.out.println("list11 = " + list11);

        //peek(Consumer): return the elements in the stream after performing
        //the specified operation on eacn element
        List<Integer> list12 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        list12 = list12.stream().filter(p->p%5==0).peek(p-> System.out.println(p)).collect(Collectors.toList());
        System.out.println("list12 = " + list12);;

        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,30,4,5,6,7,8,9,10));
        boolean r1 = list6.stream().allMatch(p -> p%2==0);	// returns boolean
        System.out.println(r1);			// false

        boolean r2 = list6.stream().anyMatch(p -> p>20);
        System.out.println(r2);			// true

        boolean r3 = list6.stream().noneMatch(p -> p%3==0);
        System.out.println(r3);			// false

        /*
        Task:
        1. Eliminate the duplicates
        2. find the strings that start with "J" only
        3. convert them all to upper case
        4. store them into a new list
         */
        List<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","JavaScript","Python","Java","C#","JavaScript","Java","TypeScript","Python","JSON","JSON"));
        List<String> result = words.stream().distinct().filter(p -> p.startsWith("J")).map(p -> p.toUpperCase()).collect(Collectors.toList());
        System.out.println("result = " + result);
    }
}
