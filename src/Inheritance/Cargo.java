package Inheritance;

public class Cargo {
    String name;
    float weight;

    public Cargo() {
    }

    public Cargo(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.name +", " + this.weight + "kg";
    }
}
