/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.service;

import tg.univlome.epl.dad.boutique.entite.Client;

/**
 *
 * @author manus
 */
public class ClientService extends GenericService <Client, Long>{
    
    private static ClientService instance;

    private ClientService() { }

    public static ClientService getInstance() {
        if (instance == null) {
            instance = new ClientService();
        }
        return instance;
    }
    
     @Override
    public void modifier(Client objet) {
        long newId = objet.getId();

        for (int i = 0; i < elements.size(); i++) {
            Client t = elements.get(i);
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
            
            Client t = elements.get(i);
            Long listId = t.getId();
            if(listId == id){
                elements.remove(t);
                System.out.println("Elément suprimé avec succès");
            }
            
        }
        
    }
    
    @Override
    public Client trouver(Long id){
        for(int i = 0; i < elements.size(); i++){
            
            Client t = elements.get(i);
            Long listId = t.getId();
            if(listId == id){
                return t;
            }
        }
        return null;
    }
}
