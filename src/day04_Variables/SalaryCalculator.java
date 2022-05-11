package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {

        // hourlyRate, weeklyHours

        int hourlyRate = 50;
        int weeklyHours = 40;
        int salary = hourlyRate * weeklyHours * 52;

        System.out.println("salary = $" + salary);
    }


}
