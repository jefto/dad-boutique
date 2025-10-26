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
public abstract class GenericService <T> {
    
    protected List<T> elements = new ArrayList<>();

    public void ajouter(T objet) {
        elements.add(objet);
        System.out.println(" Ajouté avec succès !");
    }

    
   
    public void modifier(T objet) {
        
        
    }
    
    
    public void supprimer(Integer id) {
        
        T t = elements.get(id);
        this.elements.remove(t);    
    }

    
    public T trouver(Integer id) {
        
        T t = elements.get(id);
        return t;
    }

    
    public List<T> lister() {
        return elements;
    }

    
    public int compter() {
        return elements.size();
    }

}
