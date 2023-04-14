package day103_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {

    public static void main(String[] args) {

        //collect(Collector)
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list1 = list1.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        System.out.println("list1 = " + list1);

        // toArray()
        int[] array = {1,2,3,4,5,6,7};
        array = Arrays.stream(array).filter(p->p>4).map(p->p*10).toArray();
        System.out.println("array = " + Arrays.toString(array));

        // count() : returns the count of the elements of the stream, return type is long
        long n = Stream.of(1,2,3,4,5,6,7,8,9).count();
        System.out.println("n = " + n);

        long m = Stream.of("Java","Python","Java","C#","Java").filter(p->p.equals("Java")).count();
        System.out.println("m = " + m);

        // reduce(initialIdentity, BinaryOperator) :
        // combines the elements of the stream and returns them as a single value
        int[] arr = {1,2,3,4,5};
        int sum = Arrays.stream(arr).reduce(0, (x,y) -> x+y);
        System.out.println("sum = " + sum);

        String[] words = {"Java","Python","C#","Java"};
        String s = Arrays.stream(words).reduce("", (a,b)-> a + " " + b);
        System.out.println("s = " + s);

        // forEach(Consumer) : iterates all the elements of the stream.
        // peek() is intermediate operator (returns stream), forEach() is terminal operator
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list2.stream().filter(p -> p>5).forEach(p -> System.out.println(p));

        // min()
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Integer min = list3.stream().min(Integer::compareTo).get();
        System.out.println("min = " + min);

        // max()
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Integer max = list4.stream().max(Integer::compareTo).get();
        System.out.println("max = " + max);

        // allMatch(Predicate)
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        boolean r1 = list5.stream().allMatch(p -> p>0);
        System.out.println("r1 = " + r1);   //true

        // anyMatch(Predicate)
        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        boolean r2 = list6.stream().anyMatch(p -> p>8);
        System.out.println("r2 = " + r2);   //true

        // noneMatch(Predicate)
        List<Integer> list7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        boolean r3 = list7.stream().noneMatch(p -> p>10);
        System.out.println("r3 = " + r3);   //true

    }
}
