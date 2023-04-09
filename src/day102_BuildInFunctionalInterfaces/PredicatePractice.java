package day102_BuildInFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice {

    public static void main(String[] args) {
        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equals(p);
        };
        boolean result1 = isPalindrome.test("Java");
        System.out.println(result1);

        //Predicate<Integer> isEven = p -> p % 2 == 0;

        System.out.println("-------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,4,3,6,7,8,8,9,6,5,43,3));
        //list.removeIf(isEven);
        list.removeIf(p -> p % 2 == 0);
        System.out.println(list);

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));

        names.removeIf(isPalindrome);   //Collections have removeIf() method, which accepts predicate!
        System.out.println(names);

        System.out.println("-------------------");

        Predicate<Integer> isOdd = a -> a % 2 == 1;
        boolean r1 = isOdd.test(100);
        System.out.println(r1);

        Predicate<String> isPalindrome2 = (str) -> {
          String reversed = "";
            for (int i = str.length()-1; i >= 0; i--) {
                reversed += str.charAt(i);
            }
            return str.equalsIgnoreCase(reversed);
        };

        boolean r2 = isPalindrome2.test("Level");
        System.out.println(r2);

    }
}

