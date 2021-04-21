package runtimes;

import java.util.List;

import Corral.FarmAnimal;
import Corral.Hen;
import streams.PredicateTest;


public class Streams {
    
    public static void run() {
        List<Integer> lIntegers = List.of(0, 10 ,20,30,40,50);
        lIntegers.stream().filter(new PredicateTest()).forEach(System.out::println);
        lIntegers.stream().filter((value) -> value == 50 ).forEach(System.out::println);

        List<Hen> lFarmAnimals = List.of(
            new Hen("Matha", 10),
            new Hen("Tere", 20),
            new Hen("Camila", 30),
            new Hen("Jenny", 40),
            new Hen("Lucy", 50)
        );

        lFarmAnimals.stream().map(Hen::getName).forEach(System.out::println);
    }
}
