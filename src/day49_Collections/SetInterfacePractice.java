package day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

//        Set<Integer> set1 = new ArrayList<>();    // there is no IS A relationship

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 1000));

        System.out.println("list = " + list);


        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(list);

        System.out.println("hashSet = " + hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();



        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));

    }
}
