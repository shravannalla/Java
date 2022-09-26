package Assignment08;

public class UserAccount {
    private int balance;
    final int LIMIT = 10000;
    public  void withdraw(int value) throws AccountException {
        if(value>LIMIT){
            LimitException le = new LimitException();
            AccountException ae = new AccountException();
            ae.initCause(le);
            throw ae;
        }
        if(balance<value){
            throw new AccountException(new InsufficientBalanceException());
        }
    }

    public void setBal(int balance) {
        this.balance = balance;
    }
}