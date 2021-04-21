package Corral;

import java.math.BigDecimal;

public class Hen extends FarmAnimal {
    
    public Hen() {
        super("Martha", BigDecimal.valueOf(10));
    }

    public Hen(String name, BigDecimal value) {
        super(name, value);
    }

    public Hen(String name, Integer value) {
        super(name, new BigDecimal(value));
    }

    public void nameHen() {
        System.out.println(this.name);
    }
    
    public void nameHen(boolean death) {
        System.out.println("The he is " + (death ? "alive" : "death")) ;
    }

    public void weightHen() {
        System.out.println(this.weight);
    }

    @Override
    public void details() {
        System.out.println("his name is %s and his weight is %double the type of animal is Hen");
    }
}
