/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.service;
import tg.univlome.epl.dad.boutique.entite.ProduitAchete;
/**
 *
 * @author manus
 */
public class ProduitAcheteService extends GenericService <ProduitAchete>{
    
    private static ProduitAcheteService instance;

    private ProduitAcheteService() { }

    public static ProduitAcheteService getInstance() {
        if (instance == null) {
            instance = new ProduitAcheteService();
        }
        return instance;
    }
    
}
