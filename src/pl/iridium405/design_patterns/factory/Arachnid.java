package pl.iridium405.design_patterns.factory;

public class Arachnid extends Lifeform {

    private String species;
    private int age;
    private double height;

    public Arachnid(String species, int age, double height) {
        this.species = species;
        this.age = age;
        this.height = height;
    }

    @Override
    public String getSpecies() {
        return this.species;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public double getHeight() {
        return this.height;
    }
}
