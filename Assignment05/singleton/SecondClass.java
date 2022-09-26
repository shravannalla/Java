package Assignment05.singleton;

public class SecondClass {
    String member;
    public static SecondClass doThis(String member){
        SecondClass obj=new SecondClass();
        obj.member=member;
        return obj;
    }
    public void printString(){
        System.out.println(member);
    }
}
