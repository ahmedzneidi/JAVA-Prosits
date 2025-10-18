package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
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

    boolean addAnimal(Animal animal) {
        if (isZooFull() || searchAnimal(animal) != -1) {
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
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

    void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println((i + 1) + ". " + animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }

    boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount > z2.animalCount) ? z1 : z2;
    }

    void displayZoo() {
        System.out.println("Zoo: " + name + ", Ville: " + city + ", Cages: " + nbrCages + ", Animaux: " + animalCount);
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + ", animalCount=" + animalCount + "}";
    }

    int getAnimalCount() { return animalCount; }
    String getName() { return name; }
    String getCity() { return city; }
    int getNbrCages() { return nbrCages; }

    void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide");
        }
        this.name = name;
    }

    void setCity(String city) { this.city = city; }
}