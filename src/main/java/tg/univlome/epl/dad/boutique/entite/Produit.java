/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.entite;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author manus
 */
public class Produit {
    private long id;
    private String libelle;
    private double prixUnitaire;
    private LocalDate datePeremption;
    private Categorie categorie;
    
    public Produit(){
        
    }

    public Produit(long id, String libelle, double prixUnitaire, LocalDate datePeremption, Categorie categorie) {
        this.id = id;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.datePeremption = datePeremption;
        this.categorie = categorie;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public LocalDate getDatePeremption() {
        return datePeremption;
    }

    public void setDatePeremption(LocalDate datePeremption) {
        this.datePeremption = datePeremption;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produit other = (Produit) obj;
        return this.id == other.id;
    }


    public Boolean estPerime() {
        if (datePeremption.isBefore(LocalDate.now()) || datePeremption.isEqual(LocalDate.now())) {
            System.out.println("Votre produit est périmé");
            return true;
        } else {
            System.out.println("Votre produit n'est pas périmé");
            return false;
        }
    }
    
    public Boolean estPerime (LocalDate dateReference){
        if (datePeremption.isBefore(dateReference) || datePeremption.isEqual(dateReference)) {
            System.out.println("Votre produit est périmé");
            return true;
        } else {
            System.out.println("Votre produit n'est pas périmé");
            return false;
        }
    }
    




}
