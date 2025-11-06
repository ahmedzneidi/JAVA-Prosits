package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.exceptions.ZooFullException;
import tn.esprit.gestionzoo.entities.exceptions.InvalidAgeException;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 3;
    private int animalCount;
    private Aquatic[] aquaticAnimals;
    private int aquaticCount;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
        this.aquaticAnimals = new Aquatic[10];
        this.aquaticCount = 0;
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animalCount >= nbrCages) {
            throw new ZooFullException();
        }

        if (animal.getAge() < 0) {
            throw new InvalidAgeException();
        }

        animals[animalCount] = animal;
        animalCount++;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < 10) {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
        }
    }

    public void swimAllAquatics() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.swimmingDepth > maxDepth) {
                    maxDepth = penguin.swimmingDepth;
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Dolphins: " + dolphinCount + ", Penguins: " + penguinCount);
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println((i + 1) + ". " + animals[i]);
        }
    }

    public int getAnimalCount() { return animalCount; }
    public String getName() { return name; }
    public String getCity() { return city; }
    public int getNbrCages() { return nbrCages; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide");
        }
        this.name = name;
    }

    public void setCity(String city) { this.city = city; }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + ", animalCount=" + animalCount + "}";
    }
}