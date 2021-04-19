package entities;

public abstract class Light {
    protected String intensity;

    public Light(String intensity) {
        this.intensity = intensity;
    }

    public abstract void turnOnTheLight();

    public String getIntensity() {
        return this.intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

}
