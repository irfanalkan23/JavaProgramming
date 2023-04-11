package day102_BuildInFunctionalInterfaces;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerPractice {

    public static void main(String[] args) {

        BiConsumer<String, Integer> printMultipleTimes = (str, n) -> {
            for (int i = 1; i <= n ; i++) {
                System.out.println(str);
            }
        };

        printMultipleTimes.accept("Wooden Spoon", 5);

        System.out.println("---------------------------");

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
        map.put("D",40);
        map.put("E",50);

        map.forEach( (x,y) -> {
            System.out.println(x + " : " + y);
        });

        System.out.println("---------------------------");

        map.forEach( (k,v) -> {
            if (v >= 30){
                System.out.println(k);
            }
        });
    }
}
