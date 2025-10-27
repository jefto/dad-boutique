/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.entite;

import java.util.Date;
import java.util.List;

/**
 *
 * @author manus
 */
public class Achat {

    private long id;
    private Date dateAchat;
    private double remise;
    private Employe employe;
    private Client client;
    private List<ProduitAchete> produitAchete;

    public Achat() {

    }

    public Achat(long id, Date dateAchat, double remise, Employe employe, Client client) {
        this.id = id;
        this.dateAchat = dateAchat;
        this.remise = remise;
        this.employe = employe;
        this.client = client;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<ProduitAchete> getProduitAchete() {
        return produitAchete;
    }

    public void setProduitAchete(List<ProduitAchete> produitAchete) {
        this.produitAchete = produitAchete;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Achat other = (Achat) obj;
        return this.id == other.id;
    }

    public double getRemiseTotale() {
        double remiseTotal = 0;
        remiseTotal = remiseTotal + remise;
        
        for (ProduitAchete produitAchete1 : produitAchete) {
            remiseTotal = remiseTotal + produitAchete1.getRemise();

        }

        return remiseTotal;
    }

    public double getTotalAPayer() {
        double totalAPayer;
        double totalPrix = 0;
        
        for(ProduitAchete prixProduitAchete1 : produitAchete){
           totalPrix = totalPrix + prixProduitAchete1.getProduit().getPrixUnitaire();
        }
           
        totalAPayer = totalPrix -  getRemiseTotale();
        
        return totalAPayer;
    }

}
