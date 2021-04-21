package streams;

import java.util.function.Predicate;

public class PredicateTest implements Predicate<Integer> {

    @Override
    public boolean test(Integer t) {
        return 10 == t;
    } 
    
}
