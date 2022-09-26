package Assignment07.first;

public class Hamster  extends Rodent{
    public void Hamster(){
        System.out.println("I am Hamster");
    }

    @Override
    public void eats() {
        System.out.println("I eat greens and vegetables");
    }
}
