package tn.esprit.gestionbibliotheque.main;

import tn.esprit.gestionbibliotheque.entities.Auteur;
import tn.esprit.gestionbibliotheque.entities.Livre;
import tn.esprit.gestionbibliotheque.implementation.Bibliotheque;

public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque("Bibliothèque Nationale");

        System.out.println("=== Création des auteurs ===");
        Auteur auteur1 = new Auteur(1, "Camus", "Albert", "Française");
        Auteur auteur2 = new Auteur(2, "Hemingway", "Ernest", "Américaine");
        Auteur auteur3 = new Auteur(3, "Orwell", "George", "Britannique");

        System.out.println("=== Ajout des livres ===");
        bibliotheque.ajouterLivre(new Livre(9782070360021, "L'Étranger", auteur1, "Roman", 1942));
        bibliotheque.ajouterLivre(new Livre(9782070368225, "Le Mythe de Sisyphe", auteur1, "Philosophie", 1942));
        bibliotheque.ajouterLivre(new Livre(9780684801223, "Le Vieil Homme et la Mer", auteur2, "Roman", 1952));
        bibliotheque.ajouterLivre(new Livre(9780451524935, "1984", auteur3, "Science-Fiction", 1949));
        bibliotheque.ajouterLivre(new Livre(9780451526342, "La Ferme des Animaux", auteur3, "Satire", 1945));

        System.out.println("Nombre de livres: " + bibliotheque.getNombreLivres());
        System.out.println();

        System.out.println("=== Affichage initial ===");
        bibliotheque.afficherLivres();
        System.out.println();

        System.out.println("=== Recherche de livres ===");
        System.out.println("Recherche '1984': " + bibliotheque.rechercherLivre("1984"));
        System.out.println("Recherche 'Harry Potter': " + bibliotheque.rechercherLivre("Harry Potter"));
        System.out.println();

        System.out.println("=== Tri par ISBN (Comparable) ===");
        bibliotheque.trierLivresParIsbn();
        bibliotheque.afficherLivres();
        System.out.println();

        System.out.println("=== Tri par Titre et Catégorie (Comparator) ===");
        bibliotheque.trierLivresParTitreEtCategorie();
        bibliotheque.afficherLivres();
        System.out.println();

        System.out.println("=== Statistiques par catégorie ===");
        System.out.println("Livres de Roman: " + bibliotheque.compterLivresParCategorie("Roman"));
        System.out.println("Livres de Science-Fiction: " + bibliotheque.compterLivresParCategorie("Science-Fiction"));
        System.out.println("Livres de Philosophie: " + bibliotheque.compterLivresParCategorie("Philosophie"));
        System.out.println();

        System.out.println("=== Suppression d'un livre ===");
        Livre livreASupprimer = new Livre(9780451524935, "1984", auteur3, "Science-Fiction", 1949);
        bibliotheque.supprimerLivre(livreASupprimer);
        System.out.println("Après suppression:");
        bibliotheque.afficherLivres();
    }
}