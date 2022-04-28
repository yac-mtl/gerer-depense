/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author yacine-pc
 */
public class RegistreDepense implements Serializable{
    private ArrayList<Depense>registre;

    public RegistreDepense() {
        this.registre = new ArrayList<>();
    }
    
    
    public void ajouterDepense(Depense d){
        registre.add(d);
    }
    public void supprimerToutDepense(Depense d){
        registre.removeAll( registre);
    }

    public RegistreDepense(ArrayList<Depense> registre) {
        this.registre = registre;
    }

    @Override
    public String toString() {
        return   "registre" + registre ;
    }

   

    

    
    
    
}
