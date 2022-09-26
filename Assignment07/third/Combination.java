package Assignment07.third;

public class Combination extends Concrete implements NewInterface{

    @Override
    public void method1() {
        System.out.println("Implemented method1 in combination class");
    }

    @Override
    public void method2() {
        System.out.println("Implemented method2 in combination class");
    }

    @Override
    public void method3() {
        System.out.println("Implemented method3 in combination class");
    }

    @Override
    public void method4() {
        System.out.println("Implemented method4 in combination class");
    }

    @Override
    public void method5() {
        System.out.println("Implemented method5 in combination class");
    }

    @Override
    public void method6() {
        System.out.println("Implemented method6 in combination class");
    }

    @Override
    public void method7() {
        System.out.println("Implemented method7 in combination class");
    }

    @Override
    public void method8(){
        System.out.println("In combination concrete class");
    }

    public void method9(Interface1 I){
        I.method1();
        I.method2();
    }
    public void method10(Interface2 I){
        I.method3();
        I.method4();
    }

    public void method11(Interface3 I){
        I.method5();
        I.method6();
    }

    public void method12(NewInterface I){
        I.method1();
        I.method2();
        I.method3();
        I.method4();
        I.method5();
        I.method6();
        I.method7();
    }
}