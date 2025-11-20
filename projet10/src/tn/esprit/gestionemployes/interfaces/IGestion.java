package tn.esprit.gestionemployes.interfaces;

public interface IGestion<T> {
    void ajouterEmploye(T t);
    boolean rechercherEmploye(String nom);
    boolean rechercherEmploye(T t);
    void supprimerEmploye(T t);
    void displayEmploye();
    void trierEmployeParId(); // Comparable (Prosit 8)
    void trierEmployeParNomDepartementEtGrade(); // Comparator (Prosit 8)
}