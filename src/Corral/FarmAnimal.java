package Corral;

public abstract class FarmAnimal {
    protected String name;
    protected Double weight;

    public abstract void details();

    public FarmAnimal(String name, Double weight) {
        this.setName(name);
        this.setWeight(weight);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
