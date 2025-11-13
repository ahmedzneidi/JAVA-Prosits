package tn.esprit.gestionemployes.implementation;

import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.interfaces.IGestion;
import tn.esprit.gestionemployes.interfaces.IRechercheAvancee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
    private List<Employe> employes;

    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe emp : employes) {
            if (emp.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        System.out.println("Liste des employés:");
        for (Employe emp : employes) {
            System.out.println(emp);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int deptCompare = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (deptCompare != 0) {
                    return deptCompare;
                }
                int gradeCompare = Integer.compare(e1.getGrade(), e2.getGrade());
                if (gradeCompare != 0) {
                    return gradeCompare;
                }
                return e1.getNom().compareTo(e2.getNom());
            }
        });
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> result = new ArrayList<>();
        for (Employe emp : employes) {
            if (emp.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                result.add(emp);
            }
        }
        return result;
    }

    public int getNombreEmployes() {
        return employes.size();
    }
}