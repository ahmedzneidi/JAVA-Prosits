package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Mon Zoo", "Tunis");

        Dolphin dolphin1 = new Dolphin("Cétacés", "Dauphin1", 8, true, "Mer", 45.5f);
        Dolphin dolphin2 = new Dolphin("Cétacés", "Dauphin2", 6, true, "Océan", 50.0f);
        Penguin penguin1 = new Penguin("Oiseaux", "Pingouin1", 3, true, "Antarctique", 50.0f);
        Penguin penguin2 = new Penguin("Oiseaux", "Pingouin2", 4, true, "Arctique", 60.0f);
        Penguin penguin3 = new Penguin("Oiseaux", "Pingouin3", 5, true, "Antarctique", 70.0f);

        zoo.addAquaticAnimal(dolphin1);
        zoo.addAquaticAnimal(dolphin2);
        zoo.addAquaticAnimal(penguin1);
        zoo.addAquaticAnimal(penguin2);
        zoo.addAquaticAnimal(penguin3);

        System.out.println("=== Instruction 26: Appel de swim() ===");
        zoo.swimAllAquatics();

        System.out.println("\n=== Instruction 27: Profondeur maximale ===");
        System.out.println("Profondeur maximale: " + zoo.maxPenguinSwimmingDepth() + " meters");

        System.out.println("\n=== Instruction 28: Nombre par type ===");
        zoo.displayNumberOfAquaticsByType();

        System.out.println("\n=== Instruction 31: Test equals() ===");
        Aquatic aquatic1 = new Dolphin("Cétacés", "Dauphin", 5, true, "Mer", 40.0f);
        Aquatic aquatic2 = new Dolphin("Cétacés", "Dauphin", 5, true, "Mer", 45.0f);
        Aquatic aquatic3 = new Penguin("Oiseaux", "Pingouin", 3, true, "Mer", 30.0f);

        System.out.println("aquatic1 equals aquatic2: " + aquatic1.equals(aquatic2));
        System.out.println("aquatic1 equals aquatic3: " + aquatic1.equals(aquatic3));
    }
}