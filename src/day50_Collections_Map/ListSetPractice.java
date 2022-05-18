package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println("set = " + set);

        //let's say I need index numbers; but I don't want Array..

        List<Integer> list = new ArrayList<>( set);

        System.out.println("list = " + list);

//        List<String> names = null;
//        System.out.println(names.size());

        System.out.println("---------------------------");

        //pop() --> LIFO
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B','C','D'));
        System.out.println("chars = " + chars); // [A,B,C,D]
        ((Stack) chars).pop();
        System.out.println("chars = " + chars);

        //poll() --> FIFO
        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        System.out.println(names);
        ((LinkedList<String>) names).poll();
        System.out.println(names);
        ((LinkedList<String>) names).poll();
        System.out.println(names);
    }
}
