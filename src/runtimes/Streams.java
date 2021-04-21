package runtimes;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import Corral.FarmAnimal;
import Corral.Hen;
import streams.PredicateTest;


public class Streams {
    
    public static void run(boolean run) {
        if(run) {}
        System.out.println("--------streams-------");
        List<Integer> lIntegers = List.of(0, 10 ,20,30,40,50);
        lIntegers.stream().filter(new PredicateTest()).forEach(System.out::println);
        lIntegers.stream().filter((value) -> value == 50 ).forEach(System.out::println);

        List<FarmAnimal> lFarmAnimals = List.of(
            new Hen("Martha", 10),
            new Hen("Tere", 20),
            new Hen("Camila", 30),
            new Hen("Jenny", 40),
            new Hen("Lucy", 50)
            // new Donkey()
        );

        // lFarmAnimals.stream().map(Hen::getName).forEach(System.out::println);
        lFarmAnimals.stream().filter((hen)-> hen.getName() == "Camila").map(FarmAnimal::getWeight).forEach(System.out::println);
        lFarmAnimals.stream().map(FarmAnimal::getWeight).forEach(System.out::println);

        new Predicate<Hen>() {

            @Override
            public boolean test(Hen t) {
                return t instanceof Hen;
            }

        };
        
        /**
         *  0 : if value of this BigDecimal is equal to that of BigDecimal object passed as parameter.
         *  1 : if value of this BigDecimal is greater than that of BigDecimal object passed as parameter.
         *  -1 : if value of this BigDecimal is less than that of BigDecimal object passed as parameter.
         */
        Boolean fal =  lFarmAnimals.stream().allMatch((value) ->( value.getWeight().compareTo(new BigDecimal(30)) == -1));
        System.out.println("All items match " + fal);
        Boolean fal2 =  lFarmAnimals.stream().allMatch((value) -> value.getName().equals("Camila"));
        System.out.println("All items match: " + fal2);

        Boolean fal3 =  lFarmAnimals.stream().anyMatch((value) -> value.getName().equals("Camila"));
        System.out.println("One item match: " + fal3);
        Boolean fal4 =  lFarmAnimals.stream().anyMatch((value) -> ( value.getWeight().compareTo(new BigDecimal(30)) == -1));
        System.out.println("One item match: " + fal4);

        Function<FarmAnimal, Integer> function = (value) ->  {
            return value.getWeight().compareTo(new BigDecimal(30));
        };


        Integer optint= lFarmAnimals.stream()
        .map(function)
        .filter((value) -> value == 1)
        .reduce( (accumulator, number) -> accumulator += number)
        .filter((value ) -> value == 2 )
        .orElseThrow(NullPointerException::new);
        System.out.println(optint);
    }
}
