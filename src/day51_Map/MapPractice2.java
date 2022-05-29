package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        //  1 who has the maximum and minimum salary?
        String nameMax="";
        String nameMin="";
        int minSalary=Integer.MAX_VALUE;
        int maxSalary=Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxSalary){
                maxSalary=entry.getValue();
                nameMax=entry.getKey();
            }
            if(entry.getValue() < minSalary){
                minSalary=entry.getValue();
                nameMin=entry.getKey();
            }
        }
        System.out.println("maxSalary = " +nameMax + " : " + maxSalary);
        System.out.println("minSalary = " +nameMin + " : "  + minSalary);

//        1.3 how many employees has the salary between 120k ~ 150K?

        int count = 0;
        for (Integer eachValue : map.values()) {
            if(eachValue >= 120000 && eachValue <= 150000){
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println("-----------------------------------");

//        1.4 display the names of the employees who are making less than 118k?
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() < 118000){
                System.out.println(entry.getKey());
            }
        }

        System.out.println("----------------------------");

//        1.5 increase the salary of each employee by 10K if the current salary of employee is less than 120k
        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() < 120000){
                entry.setValue(entry.getValue()+10000);
            }
        }
        System.out.println(map);






    }
}
/*
1. Given the following map that contains the employee name and thier salary:
     Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);
    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
 */