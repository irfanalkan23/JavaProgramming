package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A02_DistinctNumbers {

    // add only distinct numbers

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integers (input ends with 0 : ");

        int value;

        do {
            value = input.nextInt();
            if( !list.contains(value) && value != 0) {  // add if arraylist does not contain
                                                        // and if not equal to "0"
                list.add(value);
            }

        }while (value != 0);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("max= " + max + ", min= " + min);

        Collections.shuffle(list);
        System.out.println(list);

    }
}
