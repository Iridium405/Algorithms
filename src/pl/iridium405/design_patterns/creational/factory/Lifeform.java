package pl.iridium405.design_patterns.creational.factory;

public abstract class Lifeform {

    public abstract String getSpecies();
    public abstract int getAge();
    public abstract double getHeight();

    @Override
    public String toString() {
        return "This particular species is " +
                this.getSpecies() + ". It already lives for " +
                this.getAge() + " year(s) and is " +
                this.getHeight() + " tall.";
    }
}
