package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> {
          String reverse = new StringBuilder(p).reverse().toString();
          return reverse.equals(p);
        };
        boolean result1 = isPalindrome.test("Java");
        System.out.println(result1);

        Predicate<Integer> isEven = p -> p % 2 == 0;

        System.out.println("-------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,4,3,6,7,8,8,9,6,5,43,3));

        list.removeIf(isEven);

        System.out.println(list);

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));

        names.removeIf(isPalindrome);
        System.out.println(names);

        System.out.println("-----------------------");

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };
        printEach.accept("Java");

        System.out.println("-------------------------");
        
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,34));

//        for (Integer each : list2) {
//            if(each%2!=0){
//                System.out.println(each);
//            }
//        }

        list2.forEach(p -> { if(p%2!=0) System.out.println(p); });

        System.out.println("----------------------");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbe", "Aygun Abbaso Jarullah", "Jilili Jiwuer", "Ali Ismayılow"));

        employees.forEach( s -> System.out.println(s.charAt(0) + "." + s.charAt(s.lastIndexOf(" ") + 1)));

        System.out.println("----------------------");

        // convert int array to List of Integer:
        // argument= int[], return=List<Integer>
        Function< int[], List<Integer> > convertToList = (a) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] arr ={1,2,3,4,5,6,7,8,9};
        List<Integer> l = convertToList.apply(arr);
        System.out.println(l);

        System.out.println("-------------------------");

        // argument= List<Integer> , return=int[]
        Function<List<Integer>, int[]> convertToArray = (a) -> {
            int[] result = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result[i] = a.get(i);
            }
            return result;
        };
        int[] arr2 = convertToArray.apply(Arrays.asList(1,2,3,4,5));
        System.out.println(Arrays.toString(arr2));

    }
}



