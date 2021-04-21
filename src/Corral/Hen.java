package Corral;

public class Hen extends FarmAnimal {
    public Hen() {
        super("Martha", 10);
    }

    public void nameHen() {
        System.out.println(this.name);
    }

    public void weightHen() {
        System.out.println(this.weight);
    }

    @Override
    public void details() {
        System.out.println("his name is %s and his weight is %double the type of animal is Hen");
    }
}
