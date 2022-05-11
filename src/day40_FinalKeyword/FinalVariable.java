package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static{
        name = "Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }



    public final static void main(String[] args) {

        final double pi = 3.14;

//        pi = 3;   // compile error

        final String name;

        name = "Java";

//        name = "Wooden Spoon";    // compile error

        System.out.println(name);

        System.out.println("--------------------------");

        FinalVariable obj = new FinalVariable("May/01");

//        obj.birthDay = "June/01";   // compile error

        System.out.println(obj.birthDay);

        System.out.println("--------------------------");

//        FinalVariable.name = "Phyton";      // compile error
        System.out.println(FinalVariable.name);




    }
}
