package week15_Exceptions_Git.customExceptions;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException(String message){
        super(message); // call the constructor of RunTimeException class
    }
}
