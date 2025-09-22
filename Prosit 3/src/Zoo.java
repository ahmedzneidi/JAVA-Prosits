public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages=25;
     int animalCount;
    Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;    }


     void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println((i + 1) + ". " + animals[i]);
        }
    }
 void displayZoo() {
        System.out.println("Nom du zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
    boolean addAnimal(Animal animal) {
        if (animalCount >= nbrCages || searchAnimal(animal)!=-1) {
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }
    void displayAnimal(){
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);

        }

    }
    int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
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
     int getAnimalCount() { return animalCount; }
    String getName() { return name; }
    }
