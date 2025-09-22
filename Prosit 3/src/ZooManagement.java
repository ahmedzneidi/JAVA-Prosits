public class ZooManagement {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Zoo National", "Tunis", 10);
        Zoo zoo2 = new Zoo("Zoo Municipal", "Sousse",15);

        Animal lion = new Animal("Félins", "Lion", 5, true);
        Animal elephant = new Animal("Éléphantidés", "Éléphant", 10, true);
        Animal giraffe = new Animal("Giraffidés", "Girafe", 7, true);
        Animal crocodile = new Animal("Crocodilidés", "Crocodile", 3, false);
        Animal lion2 = new Animal("Félins", "Lion", 8, true);


        System.out.println("=== Instruction 10: Ajout d'animaux ===");
        System.out.println("Ajout Lion: " + zoo1.addAnimal(lion));
        System.out.println("Ajout Éléphant: " + zoo1.addAnimal(elephant));
        System.out.println("Ajout Girafe: " + zoo1.addAnimal(giraffe));
        System.out.println("Ajout Crocodile: " + zoo1.addAnimal(crocodile));

        for (int i = 0; i < 30; i++) {
            Animal temp = new Animal("Test", "Animal" + i, 1, true);
            if (!zoo1.addAnimal(temp)) {
                System.out.println("Échec ajout Animal" + i + " - Zoo plein ou doublon");
                break;
            }
        }

        System.out.println("\n=== Instruction 11: Affichage et recherche ===");
        zoo1.displayAnimals();

        System.out.println("\nRecherche Lion: " + zoo1.searchAnimal(lion));
        System.out.println("Recherche Lion2 (doublon): " + zoo1.searchAnimal(lion2));


        System.out.println("\n=== Instruction 12: Test unicité ===");
        System.out.println("Ajout Lion (doublon): " + zoo1.addAnimal(lion));


        System.out.println("\n=== Instruction 13: Suppression d'animal ===");
        System.out.println("Suppression Girafe: " + zoo1.removeAnimal(giraffe));
        zoo1.displayAnimals();

        System.out.println("\n=== Instruction 15: Vérification zoo plein ===");
        System.out.println("Zoo plein: " + zoo1.isZooFull());

        System.out.println("\n=== Instruction 16: Comparaison de zoos ===");
        zoo2.addAnimal(new Animal("Oiseaux", "Aigle", 3, true));
        zoo2.addAnimal(new Animal("Reptiles", "Serpent", 2, false));


        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Zoo avec le plus d'animaux: " + plusGrand.getName());
    }}