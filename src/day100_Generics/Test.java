package day100_Generics;

import day45_Abstraction.shape.Shape;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Integer[] numbers = {1,2,3,4,5,6};
        Double[] decimals = {1.5,2.5,3.5,4.5,5.5,6.5};
        String[] names = {"Java", "Selenium", "SQL", "API"};
        Shape[] shapes = {null, null};

        //Generics.printEach(decimals);

        ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(15,20,30,40));
        //Generics.printEach(scores);

        Generics<Integer> obj = new Generics<>();

        obj.printEach(numbers);
        obj.printEach(scores);

        System.out.println("--------------------------------------");

        //List<Integer>


    }
}
