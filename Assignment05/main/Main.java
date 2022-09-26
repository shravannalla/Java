package Assignment05.main;

import Assignment05.data.FirstClass;
import Assignment05.singleton.SecondClass;

public class Main {
    public static void main(String[] args) {
        FirstClass first=new FirstClass();
        first.printInstance();
        first.printThis(); //This is not possible
        SecondClass second=SecondClass.doThis("shravan");
        second.printString();
    }
}
