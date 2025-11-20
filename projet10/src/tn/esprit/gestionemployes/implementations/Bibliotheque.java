package tn.esprit.gestionbibliotheque.implementation;

import tn.esprit.gestionbibliotheque.entities.Livre;
import tn.esprit.gestionbibliotheque.interfaces.IGestionBibliotheque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bibliotheque implements IGestionBibliotheque<Livre> {
    private List<Livre> livres;
    private String nomBibliotheque;

    public Bibliotheque(String nomBibliotheque) {
        this.nomBibliotheque = nomBibliotheque;
        this.livres = new ArrayList<>();
    }

    @Override
    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    @Override
    public boolean rechercherLivre(String titre) {
        for (Livre livre : livres) {
            if (livre.getTitre().equalsIgnoreCase(titre)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherLivre(Livre livre) {
        return livres.contains(livre);
    }

    @Override
    public void supprimerLivre(Livre livre) {
        livres.remove(livre);
    }

    @Override
    public void afficherLivres() {
        System.out.println("Livres dans la bibliothèque '" + nomBibliotheque + "':");
        for (Livre livre : livres) {
            System.out.println(livre);
        }
    }

    @Override
    public void trierLivresParIsbn() {
        Collections.sort(livres);
    }

    @Override
    public void trierLivresParTitreEtCategorie() {
        Collections.sort(livres, new Comparator<Livre>() {
            @Override
            public int compare(Livre l1, Livre l2) {
                int titreCompare = l1.getTitre().compareTo(l2.getTitre());
                if (titreCompare != 0) {
                    return titreCompare;
                }
                return l1.getCategorie().compareTo(l2.getCategorie());
            }
        });
    }

    @Override
    public int compterLivresParCategorie(String categorie) {
        int count = 0;
        for (Livre livre : livres) {
            if (livre.getCategorie().equalsIgnoreCase(categorie)) {
                count++;
            }
        }
        return count;
    }

    public String getNomBibliotheque() { return nomBibliotheque; }
    public void setNomBibliotheque(String nomBibliotheque) { this.nomBibliotheque = nomBibliotheque; }
    public int getNombreLivres() { return livres.size(); }
}