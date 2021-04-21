package runtimes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Corral.Corral;
import Corral.Donkey;
import Corral.FarmAnimal;
import Corral.Hen;
import Corral.Horse;

public class HomeWork {

    public static void run(boolean run) {
        if(run) {
            System.out.println("---------Home Work 1: The farm---------");
            List<Optional<FarmAnimal>> farmAnimals = new ArrayList<>();
            farmAnimals.add(Optional.ofNullable(new Hen()));
            farmAnimals.add(Optional.ofNullable(new Horse()));
            farmAnimals.add(Optional.ofNullable(new Donkey()));
            Corral corral = new Corral( farmAnimals);
            corral.allWeight(); 
            corral.allNames();
            corral.findAnimal("Martha");
            corral.anyAnimal("Camila");

            /**
             *  0 : if value of this BigDecimal is equal to that of BigDecimal object passed as parameter.
             *  1 : if value of this BigDecimal is greater than that of BigDecimal object passed as parameter.
             *  -1 : if value of this BigDecimal is less than that of BigDecimal object passed as parameter.
            */
            corral.countAnimalsByWeight(new BigDecimal(150), 1);
        }
    }
}
