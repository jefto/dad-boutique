/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tg.univlome.epl.dad.boutique;

import java.time.LocalDate;
import tg.univlome.epl.dad.boutique.entite.Employe;
import tg.univlome.epl.dad.boutique.service.EmployeService;

/**
 *
 * @author manus
 */
public class Boutique {

    public static void main(String[] args) {
        
        Employe employe = new Employe(1,"A4", "Beatrix", LocalDate.now());
        Employe employe2 = new Employe(1,"A5", "Bea", LocalDate.now());
        Employe employe3 = new Employe(2,"A4", "Alice", LocalDate.now());
        
        EmployeService service =  EmployeService.getInstance();
        service.ajouter(employe);
        service.ajouter(employe3);
        
        for (Employe arg : service.lister()) {
            System.out.println(arg);
        }
        
        System.out.println("Nombre d'éléments dans la liste : " + service.compter());
        
        System.out.println("Eléments trouvé : " + service.trouver(2L));
        
        
        service.supprimer(2L);
        service.modifier(employe2);
        
        for (Employe arg : service.lister()) {
            System.out.println(arg);
        }
        
    }
}
