/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_herrada;

/**
 *
 * @author herra
 */
import Personnages.Personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Baton;
import Armes.Epee;
import Armes.Arme;
import java.util.ArrayList;

public class TP3_Heroic_Fantasy_HERRADA {
  public static void main(String[] args) {
        ArrayList<Arme> armes = new ArrayList<Arme>();
      
        Epee Exalibur = new Epee("Excalibur", 7, 5);
        Epee Durandal = new Epee("Durandal",4,7);
        Baton Chêne = new Baton("Chêne",4,5);
        Baton Charme = new Baton("Charme",5,6);
        
        
        
        
        armes.add(Chêne);
        armes.add(Exalibur);
        armes.add(Durandal);
        armes.add(Charme);
        
         System.out.println("Liste des armes :");
        for (int i = 0; i < armes.size(); i++) {
            Arme arme = armes.get(i);
            System.out.println("Arme " + (i + 1) + ": " + arme);
        }
        
        ArrayList<Personnage>personnages = new ArrayList<Personnage>();
        
        Magicien Gandalf = new Magicien("Gandald",65,true);
        Magicien Garcimore = new Magicien("Garcimore",44,false);
        Guerrier Conan = new Guerrier("Conan",78,false);
        Guerrier Lannister = new Guerrier("Lannister",45,true);
        
        personnages.add(Gandalf);
        personnages.add(Garcimore);
        personnages.add(Conan);
        personnages.add(Lannister);
        
         System.out.println("Liste des personnages :");
        for (int j = 0; j < personnages.size(); j++) {
         Personnage personnage = personnages.get(j);
         System.out.println("Personnage" + (j + 1) + ": " + personnage);
  }       
        ArrayList<Arme> weapon = new ArrayList<Arme>();
        
        
    }
    
}
