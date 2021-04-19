package entities;

import interfaces.Jump;

public class Dog extends Animal implements Jump{

    public Dog() {
        super("Guau", "Dog");
    }

    public void doGuau() {
        System.out.println(this.sound);
    }

    @Override
    public void doJump() {
        System.out.println(String.format("The %s jumps", this.type));
    }
    
}
