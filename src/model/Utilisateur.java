/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author yacine-pc
 */
public class Utilisateur implements Serializable{
    private String nomUtilisateur,motDePasse,nom,prenom,dateDepot;  //dateDepot c'est bien la date du dernier sauvegarde
    private double budget,balance,somme;
  
    
    
    public Utilisateur() {
       
    }

    public Utilisateur(String nomUtilisateur, String motDePasse, String nom, String prenom, String dateDepot, double budget, double balance, double somme) {
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDepot = dateDepot;
        this.budget = budget;
        this.balance = balance;
        this.somme = somme;
    }

    public Utilisateur(String nomUtilisateur, String motDePasse, String nom, String prenom, String dateDepot, double budget, double balance) {
        this.nomUtilisateur = nomUtilisateur;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDepot = dateDepot;
        this.budget = budget;
        this.balance = balance;
    }
    

  

   

 

            
    
    

  

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget+somme;
    }



    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getSomme() {
        return somme;
    }

    public void setSomme(double somme) {
        this.somme = somme;
    }

 



  

 

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nom);
        hash = 17 * hash + Objects.hashCode(this.prenom);
        hash = 17 * hash + Objects.hashCode(this.nomUtilisateur);
        hash = 17 * hash + Objects.hashCode(this.motDePasse);
        return hash;
    }

    
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utilisateur other = (Utilisateur) obj;
        if (!Objects.equals(this.nomUtilisateur, other.nomUtilisateur)) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return   nom + ", " + prenom + ", " + nomUtilisateur + ", " + motDePasse + ", " + budget +  ", " + balance + " ,"+ dateDepot;
//    }

     
//    @Override
//    public String toString() {
//        return  "nomUtilisateur, " + nomUtilisateur + ", motDePasse ," + motDePasse + ", nom, " + nom + ", prenom, " + prenom + ", budget, " + budget + ", balance, " + balance + ",date, " + dateDepot;
//    }

    @Override
    public String toString() {
       return  "nom," + nom + ",prenom," + prenom + ",nomUtilisateur," + nomUtilisateur + ",motDePasse," + motDePasse +",budget,"+budget+",balance,"+balance+",totalDepense,"+somme+",date,"+dateDepot;
    }

  
    

  
 

   
    
    
    
    
    
}
