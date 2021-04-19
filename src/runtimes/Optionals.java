package runtimes;

import java.util.NoSuchElementException;
import java.util.Optional;

import entities.Cow;
import entities.Dog;

public class Optionals {
    
    public static void run(boolean run) {
        if(run) {
            System.out.println("----Optionals----");
            Optional<Long> lOptional = Optional.of(1L);
            if(lOptional.isPresent()) {
                System.out.println(" The value is" + lOptional.get());
            } else {
                System.out.println( "The value is not present");
            }
    
            Optional<Long> optional = Optional.ofNullable(null);
            if(optional.isPresent()) {
                System.out.println(" The value is" + optional.get());
            } else {
                System.out.println( "The value is not present");
            }
    
            Long orElse = (Long)Optional.ofNullable(null).orElse(2L);
            System.out.println("The value is " + orElse);
    
            Optional<String> ifPresent = Optional.ofNullable(null);
            ifPresent.ifPresent( (log) -> {System.out.println(log);});
            ifPresent.ifPresentOrElse((value) -> System.out.println(value), () -> System.out.println(" The value is no present"));
            
            String orElseGet = (String)Optional.ofNullable(null).orElseGet( () -> "value");
            System.out.println(orElseGet);
    
            Optional.ofNullable("").orElseThrow();
            Optional.ofNullable("").orElseThrow(() -> new NoSuchElementException("The element not extis"));
            
            if(Optional.ofNullable(null).isEmpty()) {
                System.out.println("Is empty");
            } else {
                System.out.println("In not empty");
            }
    
            Optional<Cow> cow = Optional.ofNullable(new Cow());
            cow.ifPresent( (log) -> log.doMu());
            cow.ifPresentOrElse((log) -> System.out.println(log.getType()), () -> System.out.println("No existe") );
    
            Optional.ofNullable(new Dog()).orElseThrow(() -> new NoSuchElementException("Dog not exists") );
            Optional<Dog> doge = Optional.ofNullable(null);
            if(doge.isEmpty()) {
                System.out.println("Is empty");
            } else {
                System.out.println("In not empty");
            }
        }

    }

}
