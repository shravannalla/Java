package Assignment07.fifth;

public class Main {
    public static void main(String[] args) {
        Outer2 oc2 = new Outer2();
        Outer2.InnerClass2 innerClass2 = oc2.new InnerClass2("from main method");
    }
}
