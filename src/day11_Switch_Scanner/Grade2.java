package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {

        char ch = 'A';
        String result = "";

        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;
            default:
                result = "Failed";
        }

        System.out.println(result);
    }
}
/*
if the grade is A or B or C or D  ==> "Passed"
otherwise ==> "Failed"
 */