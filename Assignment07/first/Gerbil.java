package Assignment07.first;

import Assignment07.first.Rodent;

public class Gerbil extends Rodent {
    public void Rodent(){
        System.out.println("I am Gerbil");
    }
    @Override
    public void eats() {
        System.out.println("I eat vegetables which include brocolli, cabbage, etc");
    }
}
