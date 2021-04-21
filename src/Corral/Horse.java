package Corral;

import java.math.BigDecimal;

public class Horse extends FarmAnimal {
    public Horse() {
        super("Spirit",  BigDecimal.valueOf(500));
    }

    public void nameHorse() {
        System.out.println(this.name);
    }

    public void weightHorse() {
        System.out.println(this.weight);
    }

    @Override
    public void details() {
        System.out.println("his name is %s and his weight is %double the type of animal is Horse");
    }
}
