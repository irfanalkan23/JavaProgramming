package day11_Switch_Scanner;

public class CalculatorIrfan {
    public static void main(String[] args) {

        double n1 = 200.5,
                n2 = 10.5;

        char operator = '$';

            switch (operator){

                case '+':
                    System.out.println(n1 + n2);
                    break;

                case '-':
                    System.out.println(n1 - n2);
                    break;

                case '*':
                    System.out.println(n1 * n2);
                    break;

                case '/':
                    System.out.println(n1 /2);
                    break;

                default:
                    System.out.println("Invalid Operator: "+operator);

            }
    }
}
