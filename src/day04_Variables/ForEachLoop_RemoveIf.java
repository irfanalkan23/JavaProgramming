package day04_Variables;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachLoop_RemoveIf {
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        // System.out.println(it.next());

        for(int i=0; i< cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        for (String car : cars) {   // for each cars, print car
            System.out.println(car);
        }

        while(it.hasNext()) {
            System.out.println(it.next());
        }


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it2 = numbers.iterator();
        while(it2.hasNext()) {
            Integer i = it2.next();
            if(i < 10) {
                it2.remove();
            }
        }
        System.out.println(numbers);

        numbers.removeIf(i -> i < 10);
        System.out.println(numbers);
    }
}





