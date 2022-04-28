/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.event.ActionEvent;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import model.Depense;
import model.RegistreDepense;

import model.Utilisateur;

/**
 *
 * @author yacine-pc
 */
public class Utilitaire {
    public static void lireFichier(String fichier){
          ObjectInputStream lecture;
        try {
            lecture = new ObjectInputStream (
                    new BufferedInputStream (
                            new FileInputStream (
                                    new File (fichier))));
 
             
             
            
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println ("Aucun utilisateur enregistré !");
        } catch (IOException e) {
            e.printStackTrace();
        }
}
    public static void fermerFichier(String fichier){
        
    }
    
    
    
    public static boolean isPasswordCorrect(String motDePasse,String confirmation){
        if( motDePasse.equals(confirmation)){
            return true;
        }
        return false;
    }
    
    
    
    
   public static boolean verifierNomUtilisateur(String recherche,String path){//la methode qui verifie si le nom d'utilisateur est existant dans le fichier ou pas 
       String line = null;  
 
     //path est le fichier qu'on utilise pour sauvegarder les utilisateurs
 
try
  {
  BufferedReader br = new BufferedReader
    (new FileReader(path));
 
int i = 1; //initialisation du numero de ligne 
while ((line = br.readLine()) != null)
  {
    if ( line.indexOf(recherche) != -1){
        JOptionPane.showMessageDialog(null, "le nom d'utilisateur existe deja,veillez en choisir un autre SVP","erreur nom utilisateur",JOptionPane.ERROR_MESSAGE);
     i++;
     return false;
    }
    
  }
br.close();

  }
catch(FileNotFoundException exc) { System.out.println("File not found" );  }
catch(IOException ioe) { System.out.println("Erreur IO" ); }

return true;
    }
       
   
   
         public static void saveUser(Utilisateur u,String path,String msg){
     FileWriter fw = null;
        try {
            fw = new FileWriter(path,true);
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
     BufferedWriter bw = new BufferedWriter(fw);
   String  line = u.toString();
        try {
            bw.write(line);
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bw.newLine();
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    JOptionPane.showMessageDialog(null, msg,"Bravo",JOptionPane.INFORMATION_MESSAGE);
        try {
            //  System.out.println(u.toString()+ r.toString());
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fw.close();
           
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
        
    
         
         
     public static void verifierChapm(String a,String b,String c,String d,String e){
         if (a==""){
             JOptionPane.showMessageDialog(null, "le"+a+"est obligatoire pour l'escription","erreur de saisie",JOptionPane.ERROR_MESSAGE);
         }
           if (b==""){
             JOptionPane.showMessageDialog(null, "le"+b+"est obligatoire pour l'escription","erreur de saisie",JOptionPane.ERROR_MESSAGE);
         }
             if (c==""){
             JOptionPane.showMessageDialog(null, "le"+c+"est obligatoire pour l'escription","erreur de saisie",JOptionPane.ERROR_MESSAGE);
         }
               if (d==""){
             JOptionPane.showMessageDialog(null, "le"+d+"est obligatoire pour l'escription","erreur de saisie",JOptionPane.ERROR_MESSAGE);
         }
                 if (e==""){
             JOptionPane.showMessageDialog(null, "le"+e+"est obligatoire pour l'escription","erreur de saisie",JOptionPane.ERROR_MESSAGE);
         }
     }
     
     
            public static void saveUserPersonnel(Utilisateur u,String path,String msg){
     FileWriter fw = null;
        try {
            fw = new FileWriter(path);
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
     BufferedWriter bw = new BufferedWriter(fw);
   String  line = u.toString();
        try {
            bw.write(line);
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bw.newLine();
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    JOptionPane.showMessageDialog(null, msg,"Bravo",JOptionPane.INFORMATION_MESSAGE);
   
        try {
            //  System.out.println(u.toString()+ r.toString());
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
 }

    public static void ecrirefichierAppend(String path) {
             FileWriter fw = null;
        try {
            fw = new FileWriter(path);
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
     BufferedWriter bw = new BufferedWriter(fw);
   String  line = "";
        try {for (int i = 0;i<200;i++){
          bw.write(line);  
        }
            
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bw.newLine();
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    JOptionPane.showMessageDialog(null, "votre dossier maintenant est di de tout depot","Bravo",JOptionPane.INFORMATION_MESSAGE);
        try {
            //  System.out.println(u.toString()+ r.toString());
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Utilitaire.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
}
         
     
         
        
     


