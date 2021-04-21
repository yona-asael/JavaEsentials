package Corral;

import java.math.BigDecimal;
import java.util.Optional;

public class Corral {
    private FarmAnimal[] animals = new FarmAnimal[3];
    private BigDecimal suma = new BigDecimal(0);
    private boolean isFound = false;

    public Corral(FarmAnimal[] animals) {
        this.animals = animals;
    }

    public void allWeight() {
        for (FarmAnimal farmAnimal : this.animals) {
            Optional<FarmAnimal> optional = Optional.ofNullable(farmAnimal);
            optional.ifPresent((value) -> this.suma = this.suma.add(value.getWeight()));
        }
        System.out.println("The all watighs  of the animal is: " + suma.toString());
    }

    public void allNames() {
        for (FarmAnimal farmAnimal : this.animals) {
            Optional<FarmAnimal> optional = Optional.ofNullable(farmAnimal);
            optional.ifPresent((value) -> System.out.println("The name of the animal is" + value.getName() ) );
        }
    }

    public boolean findAnimal(String name) {
        this.isFound = false;
        for (FarmAnimal farmAnimal: this.animals){
            Optional<FarmAnimal> optional = Optional.ofNullable(farmAnimal);
            optional.ifPresent((value) ->  {
                if(value.getName() == name)  this.isFound = true;
            });
        }
        return  this.isFound;
    }
}
