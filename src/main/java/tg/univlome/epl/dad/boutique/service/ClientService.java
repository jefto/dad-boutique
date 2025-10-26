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
public class ClientService extends GenericService <Client>{
    
     @Override
    public void modifier(Client objet) {
        long newId = objet.getId();

        for (int i = 0; i < elements.size(); i++) {
            Client t = elements.get(i);
            long oldId = t.getId(); // ID de l'élément EXISTANT dans la liste

            if (newId == oldId) {
                elements.set(i, objet);
                System.out.println("Mise à jour réussie");
                return; // Important : sortir de la méthode après la mise à jour
            }
        }
        // Ce message s'affiche seulement si aucun élément n'a été trouvé
        System.out.println("Objet non trouvé !");
    }
}
