package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.entities.exceptions.ZooFullException;
import tn.esprit.gestionzoo.entities.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Mon Zoo", "Tunis");

        System.out.println("=== Test des exceptions ===");

        Animal lion = new Animal("Félins", "Lion", 5, true);
        Animal tiger = new Animal("Félins", "Tigre", 4, true);
        Animal elephant = new Animal("Éléphantidés", "Éléphant", 10, true);
        Animal giraffe = new Animal("Giraffidés", "Girafe", -2, true);
        Animal zebra = new Animal("Équidés", "Zèbre", 3, true);

        Animal[] testAnimals = {lion, tiger, elephant, giraffe, zebra};

        for (Animal animal : testAnimals) {
            try {
                zoo.addAnimal(animal);
                System.out.println("✅ " + animal.getName() + " ajouté avec succès");
            } catch (ZooFullException e) {
                System.out.println("❌ Erreur: " + e.getMessage());
            } catch (InvalidAgeException e) {
                System.out.println("❌ Erreur: " + e.getMessage() + " pour " + animal.getName());
            } finally {
                System.out.println("Nombre d'animaux dans le zoo: " + zoo.getAnimalCount() + "/" + zoo.getNbrCages());
                System.out.println("---");
            }
        }

        System.out.println("\n=== État final du zoo ===");
        zoo.displayAnimals();

        System.out.println("\n=== Test avec animaux aquatiques ===");
        Dolphin dolphin = new Dolphin("Cétacés", "Dauphin", 8, true, "Mer", 45.5f);
        Penguin penguin = new Penguin("Oiseaux", "Pingouin", 3, true, "Antarctique", 50.0f);

        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(penguin);

        System.out.println("Animaux aquatiques ajoutés directement (sans exceptions)");
        zoo.displayNumberOfAquaticsByType();
    }
}