public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Félins", "Lion", 5, true);

        Zoo myZoo = new Zoo("Mon Zoo", "Tunis", 20);

        Animal elephant = new Animal("Éléphantidés", "Éléphant", 10, true);
        Animal giraffe = new Animal("Giraffidés", "Girafe", 7, true);
        Animal crocodile = new Animal("Crocodilidés", "Crocodile", 3, false);

        Zoo myNewZoo = new Zoo("Esprit Zoo", "Ariana", 25);

        System.out.println("=== Affichage avec displayZoo() ===");
        myNewZoo.displayZoo();

        System.out.println("\n=== Affichage après implémentation de toString() ===");
        System.out.println(myNewZoo);
        System.out.println(elephant);
        System.out.println(giraffe);
        System.out.println(crocodile);
    }
}