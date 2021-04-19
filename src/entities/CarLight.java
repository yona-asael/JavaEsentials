package entities;

public class CarLight extends Light {

    public CarLight(String intensity) {
        super(intensity);
    }

    @Override
    public void turnOnTheLight() {
        System.out.println(String.format("The car light intensity is: %s", this.intensity));
    }
    
}
