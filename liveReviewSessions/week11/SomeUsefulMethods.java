package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class SomeUsefulMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(Integer.valueOf(1));
        System.out.println(list);
        list.removeIf(p->p==1);

        System.out.println("---------------------");

        // both of these methods you will need to use at the automation:
        // array to array list
        String [] array = {"red", "green","blue"};
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList(array));
        System.out.println(listTwo);

        // arraylist to array
        String [] arrayTwo = new String[listTwo.size()];
        listTwo.toArray(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));

        // So, how to make an int array to an Integer ArrayList


    }
}
