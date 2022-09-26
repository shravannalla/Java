package Assignment08;

public class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(){
        super("insufficient balance");
    }
    InsufficientBalanceException(String message){
        super(message);
    }
}
