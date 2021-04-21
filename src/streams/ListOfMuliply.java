package streams;

import java.util.Iterator;

public class ListOfMuliply implements Iterable<Integer> {

    private int posistion;
    private int size;
    private int value;

    public ListOfMuliply(int size, int vale) {
        this.size = size;
        this.value = vale;
    }

    @Override
    public Iterator<Integer> iterator() {
        int size = this.size;
        Iterator<Integer> i =  new Iterator<Integer>(){

            @Override
            public boolean hasNext() {
               if(posistion < size) {
                return true;
               } else {
                return false;
               }
            }

            @Override
            public Integer next() {
                return value*posistion++;
            }
            
        };
        return i;
    }
        
}
