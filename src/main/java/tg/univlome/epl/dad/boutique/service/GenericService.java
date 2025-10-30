/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manus
 */
public abstract class GenericService <T, id> {
    
    protected List<T> elements = new ArrayList<>();

    public void ajouter(T objet) {
        elements.add(objet);
        System.out.println(" Ajouté avec succès !");
    }  
   
    public abstract void modifier(T objet); 
    
    public abstract void supprimer(id id);
    
    public abstract T trouver(id id) ;
       
    public List<T> lister() {
        return elements;
    }
   
    public int compter() {
        return elements.size();
    }

}
