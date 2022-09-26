package Assignment08;

public class ExceptionExample {
    public static void main(String[] args) {
        UserAccount account = new UserAccount();
        account.setBal(10000);
        try {
            account.withdraw(12000);
            throw new NullPointerException("its a null pointer exception");
        } catch (AccountException  | NullPointerException e ) {
            e.printStackTrace();
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
        }

        finally {
            System.out.println("thank you for choosing our payment services");
        }


    }
}