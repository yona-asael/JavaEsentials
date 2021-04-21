package Corral;

public abstract class FarmAnimal {
    protected String name;
    protected Double weight;
    protected abstract String details(); 

    public void Animals(String name, Double weight, String details) {
        this.setName(name);
        this.setWeight(weight);
        this.details();
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
