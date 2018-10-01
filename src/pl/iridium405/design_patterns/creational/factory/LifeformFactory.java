package pl.iridium405.design_patterns.creational.factory;

public class LifeformFactory {

    public static Lifeform getForm(String species, int age, double height) {
        if("Human".equalsIgnoreCase(species)) {
            return new Human(species, age, height);
        } else if("Dog".equalsIgnoreCase(species)) {
            return new Dog(species, age, height);
        } else if("Arachnid".equalsIgnoreCase(species)) {
            return new Arachnid(species, age, height);
        } else {
            return null;
        }
    }
}
