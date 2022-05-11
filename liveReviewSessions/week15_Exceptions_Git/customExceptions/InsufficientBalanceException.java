package week15_Exceptions_Git.customExceptions;

public class InsufficientBalanceException extends RuntimeException{

    public InsufficientBalanceException(){super();}

    public InsufficientBalanceException(String message){super(message);}

}