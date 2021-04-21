package Corral;

import java.math.BigDecimal;
import java.util.Optional;

public class Corral {
    private FarmAnimal[] animals  = new FarmAnimal[3];

    public Corral(FarmAnimal[] animals){
       this.animals = animals;
    }

    public void allWeight(){
        BigDecimal suma = new BigDecimal("0");
        for (FarmAnimal farmAnimal : animals) {
            Optional<FarmAnimal> optional = Optional.ofNullable(farmAnimal);
            optional.ifPresent((value)->  suma.add(BigDecimal.valueOf(value.getWeight())));
        }
        System.out.println("The all watighs  of the animal is: "  + suma.toString());
    }

    public void allNames(){

    }
}
