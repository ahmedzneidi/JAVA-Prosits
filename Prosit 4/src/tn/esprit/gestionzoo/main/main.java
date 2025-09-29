package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

class ZooManagement {
    static void main(String[] args) {



        System.out.println("=== Instruction 18: Test encapsulation ===");

        try {

            Animal animalInvalide;
            animalInvalide = new Animal("Test", "AnimalTest", -5, true);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur âge: " + e.getMessage());
        }

        try {

            Zoo zooInvalide = new Zoo("", "VilleTest");
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur nom zoo: " + e.getMessage());
        }


        Zoo zoo1 = new Zoo("Zoo National", "Tunis");
        Zoo zoo2 = new Zoo("Zoo Municipal", "Sousse");

        Animal lion;
        lion = new Animal("Félins", "Lion", 5, true);
        Animal elephant;
        elephant = new Animal("Éléphantidés", "Éléphant", 10, true);
        Animal giraffe;
        giraffe = new Animal("Giraffidés", "Girafe", 7, true);


        System.out.println("\n=== Instruction 17: Test addAnimal avec isZooFull() ===");

        System.out.println("Ajout Lion: " + zoo1.addAnimal(lion));
        System.out.println("Ajout Éléphant: " + zoo1.addAnimal(elephant));
        System.out.println("Ajout Girafe: " + zoo1.addAnimal(giraffe));

        System.out.println("Zoo plein? " + zoo1.isZooFull());


        System.out.println("\n=== Test des setters avec validation ===");




        try {

            lion.setAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur modification âge: " + e.getMessage());
        }

        try {

            zoo1.setName("");
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur modification nom zoo: " + e.getMessage());
        }


        System.out.println("\n=== État final ===");
        zoo1.displayZoo();
        zoo1.displayAnimals();
    }
}