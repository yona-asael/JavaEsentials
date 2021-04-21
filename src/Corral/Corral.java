import java.util.Optional;

public abstract class Corral {
    private Optional<FarmAnimal>[] animals;

    public Corral(FarmAnimal[] animals){
        Array.push= new nameDonkey();
        Array.push= new nameHen();
        Array.push= new nameHorse();
        Array.push= new weightDonkey();
        Array.push= new weightHen();
        Array.push new weightHorse();
    }

    public Double allWeight(){
        double suma= weightDonkey() + weightHen() + weightHorse();
        System.out.println(suma);
    }

    public String allNames(){
        String nombres= nameDonkey() + ", " + nameHen() + ", " + nameHorse();
        System.out.println(nombres);
    }
}
