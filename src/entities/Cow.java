package entities;

import interfaces.Walk;

public class Cow extends Animal implements Walk {

    public Cow() {
        super("Mu", "Cow");
    }

    public void doMu() {
        System.out.println(this.sound);
    }

    @Override
    public void doWalk() {
        System.out.println(String.format("The %s walks in the prade", this.type) );
    }
    
}