/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.service;

import tg.univlome.epl.dad.boutique.entite.Achat;

/**
 *
 * @author manus
 */
public class AchatService extends GenericService<Achat, Long>{
    
    private static AchatService instance;

    private AchatService() { }

    public static AchatService getInstance() {
        if (instance == null) {
            instance = new AchatService();
        }
        return instance;
    }
    
    
    @Override
    public void modifier(Achat objet) {
        long newId = objet.getId();

        for (int i = 0; i < elements.size(); i++) {
            Achat t = elements.get(i);
            long oldId = t.getId();

            if (newId == oldId) {
                elements.set(i, objet);
                System.out.println("Mise à jour réussie");
                return; 
            }
        }
        
        System.out.println("Objet non trouvé !");
    }

    @Override
    public void supprimer (Long id){
        
        for(int i = 0; i < elements.size(); i++){
            
            Achat t = elements.get(i);
            Long listId = t.getId();
            if(listId == id){
                elements.remove(t);
                System.out.println("Elément suprimé avec succès");
            }
            
        }
        
    }
    
    @Override
    public Achat trouver(Long id){
        for(int i = 0; i < elements.size(); i++){
            
            Achat t = elements.get(i);
            Long listId = t.getId();
            if(listId == id){
                return t;
            }
        }
        return null;
    }
}
