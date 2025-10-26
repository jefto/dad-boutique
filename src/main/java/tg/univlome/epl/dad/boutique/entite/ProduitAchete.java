/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.entite;

/**
 *
 * @author manus
 */
public class ProduitAchete {
    private double remise;
    private Produit produit;
    private Achat achat;
    
    public ProduitAchete(){
        
    }

    public ProduitAchete(double remise, Produit produit, Achat achat) {
        this.remise = remise;
        this.produit = produit;
        this.achat = achat;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Achat getAchat() {
        return achat;
    }

    public void setAchat(Achat achat) {
        this.achat = achat;
    }
    
    
    
}
