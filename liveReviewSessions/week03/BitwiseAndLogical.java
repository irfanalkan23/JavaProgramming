package week03;

public class BitwiseAndLogical {
    public static void main(String[] args) {
        System.out.println(true | false);  // checks both sides
        System.out.println(true || false);  // checks first, if it is true, does not check the second part

        int i1 = 5;
        int i2 = 10;
        System.out.println(i2>i1 | i1>12);  // true

        System.out.println(i2>i1 || ++i1>12);  //  true. does not see second part: ++i1 not processed!
        System.out.println("i1 = " + i1);  // 5 --> because ++i1 is not processed above
    }
}
