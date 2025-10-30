/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.service;
import tg.univlome.epl.dad.boutique.entite.Categorie;
/**
 *
 * @author manus
 */
public class CategorieService extends GenericService <Categorie, Integer> {
    
    private static CategorieService instance;

    private CategorieService() { }

    public static CategorieService getInstance() {
        if (instance == null) {
            instance = new CategorieService();
        }
        return instance;
    }
    
    @Override
    public void modifier(Categorie objet) {
        Integer newId = objet.getId();

        for (int i = 0; i < elements.size(); i++) {
            Categorie t = elements.get(i);
            Integer oldId = t.getId(); 

            if (newId == oldId) {
                elements.set(i, objet);
                System.out.println("Mise à jour réussie");
                return; 
            }
        }
        
        System.out.println("Objet non trouvé !");
    }

    @Override
    public void supprimer (Integer id){
        
        for(int i = 0; i < elements.size(); i++){
            
            Categorie t = elements.get(i);
            Integer listId = t.getId();
            if(listId == id){
                elements.remove(t);
                System.out.println("Elément suprimé avec succès");
            }
            
        }
        
    }
    
    @Override
    public Categorie trouver(Integer id){
        for(int i = 0; i < elements.size(); i++){
            
            Categorie t = elements.get(i);
            Integer listId = t.getId();
            if(listId == id){
                return t;
            }
        }
        return null;
    }
}
