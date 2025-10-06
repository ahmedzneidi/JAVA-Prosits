package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

class Main {
    public static void main(String[] args) {


        System.out.println("=== Instruction 21: Instanciation avec constructeurs par défaut ===");
        Aquatic aquatic1 = new Aquatic();
        Terrestrial terrestrial1 = new Terrestrial();
        Dolphin dolphin1 = new Dolphin();
        Penguin penguin1 = new Penguin();

        System.out.println("Objets créés avec succès avec constructeurs par défaut");
        System.out.println();


        System.out.println("=== Instruction 22: Instanciation avec constructeurs paramétrés ===");
        Aquatic aquatic2 = new Aquatic("Poissons", "Poisson-clown", 2, false, "Océan");
        Terrestrial terrestrial2 = new Terrestrial("Félins", "Lion", 5, true, 4);
        Dolphin dolphin2 = new Dolphin("Cétacés", "Dauphin", 8, true, "Mer", 45.5f);
        Penguin penguin2 = new Penguin("Oiseaux", "Pingouin", 3, true, "Antarctique", 50.0f);

        System.out.println("Objets créés avec succès avec constructeurs paramétrés");
        System.out.println();


        System.out.println("=== Instruction 23: Test des méthodes toString() ===");
        System.out.println("Aquatic: " + aquatic2);
        System.out.println("Terrestrial: " + terrestrial2);
        System.out.println("Dolphin: " + dolphin2);
        System.out.println("Penguin: " + penguin2);
        System.out.println();


        System.out.println("=== Instruction 24: Test du comportement de nage ===");
        System.out.print("Aquatic: ");
        aquatic2.swim();

        System.out.print("Dolphin: ");
        dolphin2.swim();

        System.out.print("Penguin: ");
        penguin2.swim();
    }
}