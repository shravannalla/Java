package Assignment07.fifth;

public class Outer2 {
    class InnerClass2 extends Outer1.InnerClass1 {


        InnerClass2(String name) {
            new Outer1().super(name);
        }
    }
}