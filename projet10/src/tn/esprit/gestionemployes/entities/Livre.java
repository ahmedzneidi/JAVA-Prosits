package tn.esprit.gestionbibliotheque.entities;

public class Livre implements Comparable<Livre> {
    private int isbn;
    private String titre;
    private Auteur auteur;
    private String categorie;
    private int anneePublication;

    public Livre() {}

    public Livre(int isbn, String titre, Auteur auteur, String categorie, int anneePublication) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.categorie = categorie;
        this.anneePublication = anneePublication;
    }

    public int getIsbn() { return isbn; }
    public void setIsbn(int isbn) { this.isbn = isbn; }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public Auteur getAuteur() { return auteur; }
    public void setAuteur(Auteur auteur) { this.auteur = auteur; }

    public String getCategorie() { return categorie; }
    public void setCategorie(String categorie) { this.categorie = categorie; }

    public int getAnneePublication() { return anneePublication; }
    public void setAnneePublication(int anneePublication) { this.anneePublication = anneePublication; }

    @Override
    public String toString() {
        return "Livre{" +
                "isbn=" + isbn +
                ", titre='" + titre + '\'' +
                ", auteur=" + auteur.getNom() + " " + auteur.getPrenom() +
                ", categorie='" + categorie + '\'' +
                ", anneePublication=" + anneePublication +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Livre livre = (Livre) obj;
        return isbn == livre.isbn && titre.equals(livre.titre);
    }

    @Override
    public int compareTo(Livre other) {
        return Integer.compare(this.isbn, other.isbn);
    }
}