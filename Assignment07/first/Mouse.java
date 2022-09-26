package Assignment07.first;

public class Mouse extends Rodent{
    public void Mouse(){
        System.out.println("I am Mouse");
    }
    @Override
    public void eats() {
        System.out.println("I eat grains, fruits, seeds");
    }
}
