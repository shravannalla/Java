package Assignment07.first;

public class RodentMain {
    public static void main(String[] args) {
        Rodent[] rodents=new Rodent[3];
        rodents[0]=new Gerbil();
        rodents[0].eats();
        rodents[1]=new Mouse();
        rodents[1].eats();
        rodents[2]=new Hamster();
        rodents[2].eats();
    }
}
