package week03;

public class DivisionAndRemainderPractice {
    public static void main(String[] args) {
        int inputSeconds = 35000;
        int hours, minutes, seconds;

        hours = inputSeconds / 3600;
        minutes = (inputSeconds % 3600) / 60;
        seconds = inputSeconds % 60;

        System.out.println(inputSeconds + " = " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
