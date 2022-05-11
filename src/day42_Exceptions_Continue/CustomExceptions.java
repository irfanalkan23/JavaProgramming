package day42_Exceptions_Continue;

class FadyException extends RuntimeException{   // it is a custom unchecked exception

    public FadyException(){
        super("Time for a short break");
    }

    public FadyException(String message) {
        super(message);
    }
}


class NoBreakException extends Exception{   // custom checked exception !!!

}

public class CustomExceptions {

    public static void main(String[] args) {

//        throw new FadyException();

//        throw new FadyException("It is time for lunch break");


        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }

    }


}
