package Assignment07.fourth;

public class Main {

    public static void main(String[] args) {
        Cycle unicycle =CycleFactory.getCycleOfType("Unicycle");
        unicycle.countTyres();
        Cycle bicycle = CycleFactory.getCycleOfType("bicycle");
        bicycle.countTyres();
        Cycle tricycle = CycleFactory.getCycleOfType("tricycle");
        tricycle.countTyres();
    }
}
