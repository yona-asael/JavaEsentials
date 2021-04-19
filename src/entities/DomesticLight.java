package entities;

public class DomesticLight extends Light {

    public DomesticLight(String intensity) {
        super(intensity);
        
    }

    @Override
    public void turnOnTheLight() {
        System.out.println(String.format("The intensity of the domestic light is %s", this.intensity));
        
    }
    
}
