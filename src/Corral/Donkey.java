package Corral;

public class Donkey extends FarmAnimal {
    public Donkey() {
        super("Doby",  Double.valueOf("200"));
    }

    public void nameDonkey() {
        System.out.println(this.name);
    }

    public void weightDonkey() {
        System.out.println(this.weight);
    }

    @Override
    public void details() {
        System.out.println("his name is %s and his weight is %double the type of animal is Donkey");
    }
}
