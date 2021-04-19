package entities;

import interfaces.Action;

public class Animal implements Action {
    protected String sound;
    protected String type;

    public Animal(String sound, String type) {
        this.sound = sound;
        this.setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }
    
    @Override
    public String toString() {
        return String.format("The animal is %s and the sound do is: %s", this.type, this.sound);
    }

}
