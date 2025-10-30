/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.service;

import tg.univlome.epl.dad.boutique.entite.Employe;

/**
 *
 * @author manus
 */
public class EmployeService extends GenericService <Employe, Long>{
    
    private static EmployeService instance;

    private EmployeService() { }

    public static EmployeService getInstance() {
        if (instance == null) {
            instance = new EmployeService();
        }
        return instance;
    }
    
    
    @Override
    public void modifier(Employe objet) {
        long newId = objet.getId();

        for (int i = 0; i < elements.size(); i++) {
            Employe t = elements.get(i);
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
            
            Employe t = elements.get(i);
            Long listId = t.getId();
            if(listId == id){
                elements.remove(t);
                System.out.println("Elément suprimé avec succès");
            }
            
        }
        
    }
    
    @Override
    public Employe trouver(Long id){
        for(int i = 0; i < elements.size(); i++){
            
            Employe t = elements.get(i);
            Long listId = t.getId();
            if(listId == id){
                return t;
            }
        }
        return null;
    }
}
