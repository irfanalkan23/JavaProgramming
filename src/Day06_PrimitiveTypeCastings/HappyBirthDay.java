package Day06_PrimitiveTypeCastings;

import java.time.LocalDate;

public class HappyBirthDay {
    public static void main(String[] args) {
        happyBirthDay(1975, 2, 14);
    }

    public static void happyBirthDay(int year, int month, int day) {
        LocalDate birthDay = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        if(birthDay.getMonth() == birthDay.getMonth() && birthDay.getDayOfMonth() == today.getDayOfMonth()) {
            System.out.println("Happy Birth Day to you !!!");
        } else {
            System.out.println("Today is not your birthday yet.");
            System.out.println("Your birthday is " + (birthDay.getMonthValue() - today.getMonthValue()) + " months and " +
                    (birthDay.getDayOfMonth() - today.getDayOfMonth()) + " days later.");
        }
    }
}
