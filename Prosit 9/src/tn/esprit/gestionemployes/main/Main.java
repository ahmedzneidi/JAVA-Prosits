package tn.esprit.gestionemployes.main;

import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.implementation.SocieteArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        System.out.println("=== Ajout des employés ===");
        societe.ajouterEmploye(new Employe(3, "Ben Ali", "Mohamed", "IT", 2));
        societe.ajouterEmploye(new Employe(1, "Trabelsi", "Leila", "RH", 3));
        societe.ajouterEmploye(new Employe(2, "Slim", "Ahmed", "IT", 1));
        societe.ajouterEmploye(new Employe(4, "Masmoudi", "Fatma", "Finance", 2));
        societe.ajouterEmploye(new Employe(5, "Karray", "Hichem", "IT", 3));

        System.out.println("Nombre d'employés: " + societe.getNombreEmployes());
        System.out.println();

        System.out.println("=== Affichage initial ===");
        societe.displayEmploye();
        System.out.println();

        System.out.println("=== Recherche par nom ===");
        System.out.println("Recherche 'Slim': " + societe.rechercherEmploye("Slim"));
        System.out.println("Recherche 'Unknown': " + societe.rechercherEmploye("Unknown"));
        System.out.println();

        System.out.println("=== Tri par ID (Comparable) ===");
        societe.trierEmployeParId();
        societe.displayEmploye();
        System.out.println();

        System.out.println("=== Tri par Département, Grade, Nom (Comparator) ===");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();
        System.out.println();

        System.out.println("=== Recherche avancée par département ===");
        List<Employe> employesIT = societe.rechercherParDepartement("IT");
        System.out.println("Employés du département IT:");
        for (Employe emp : employesIT) {
            System.out.println(emp);
        }
        System.out.println();

        System.out.println("=== Suppression d'un employé ===");
        Employe empASupprimer = new Employe(2, "Slim", "Ahmed", "IT", 1);
        societe.supprimerEmploye(empASupprimer);
        System.out.println("Après suppression:");
        societe.displayEmploye();
    }
}