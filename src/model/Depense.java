package model;


import java.io.Serializable;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yacine-pc
 */
public class Depense  implements Serializable{
    private String nomDepense;
    private double montantDepense,totalDepense;
    private String date;

    public Depense() {
    }

    public Depense(String nomDepense, double montantDepense, double totalDepense, String date) {
        this.nomDepense = nomDepense;
        this.montantDepense = montantDepense;
        this.totalDepense = totalDepense;
        this.date = date;
    }

 

    public String getNomDepense() {
        return nomDepense;
    }

    public void setNomDepense(String nomDepense) {
        this.nomDepense = nomDepense;
    }

    public double getMontantDepense() {
        return montantDepense;
    }

    public void setMontantDepense(double montantDepense) {
        this.montantDepense = montantDepense;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Depense{" + "nomDepense=" + nomDepense + ", montantDepense=" + montantDepense + ", date=" + date + '}';
    }
    
    
}
