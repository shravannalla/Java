package Assignment08;

public class LimitException extends Exception{
    LimitException(){
        super("The per day limit exceeded");
    }
    LimitException(String message){
        super(message);
    }
}
