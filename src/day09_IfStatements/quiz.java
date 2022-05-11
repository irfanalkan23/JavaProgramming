package day09_IfStatements;

public class quiz {
    public static void main(String[] args) {
        int num=9;
        if(num++ == 10) {
            System.out.println("Hello World " + num);
        } else {
            System.out.println("Hello Universe " + num);
        }

        boolean A= true, B = !false;
        if(B) {
            System.out.println("B");
        } else if(A) {
            System.out.println("C");
        } else {
            System.out.println("aaaa");
        }


        int x=10;
        int y=x++;
        System.out.println(y++ + " " + x++ + " " + y);

        boolean result = true;
        if(result) {
            System.out.println("it's true");
        }else {
            System.out.println("it's false");
//        }else if(result) {
//            System.out.println("None of the above");
        }
        // RESULT IS COMPILE ERROR!!!



    }

}
