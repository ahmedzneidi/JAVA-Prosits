import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println("question I");
        System.out.println(zooName + " comporte " + nbrCages + " cages");
        System.out.println();

        System.out.println("question II : Saisie utilisateur:");

        String nomZoo = "";
        while (nomZoo.isEmpty()) {
            System.out.print("Entrez le nom du zoo: ");
            nomZoo = scanner.nextLine().trim();
            if (nomZoo.isEmpty()) {
                System.out.println("Erreur: Le nom du zoo ne peut pas être vide!");
            }
        }

        int nombreCages = -1;
        while (nombreCages <= 0) {
            System.out.print("Entrez le nombre de cages: ");

            if (scanner.hasNextInt()) {
                nombreCages = scanner.nextInt();
                scanner.nextLine();

                if (nombreCages <= 0) {
                    System.out.println("Erreur: Le nombre de cages doit être positif!");
                }
            } else {
                System.out.println("Erreur: Veuillez entrer un nombre entier valide!");
                scanner.nextLine();
            }
        }

        zooName = nomZoo;
        nbrCages = nombreCages;

        System.out.println();

        System.out.println("Question III");
        System.out.println(zooName + " comporte " + nbrCages + " cages" + " :) ");

        scanner.close();
    }

}
