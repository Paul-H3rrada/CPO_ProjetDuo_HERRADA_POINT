/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_herrada;

/**
 *
 * @author herra
 */
public class TP2_Bieres_HERRADA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson") ; 
        uneBiere.nom = "Cuvée des trolls"; 
        uneBiere.degreAlcool = (float) 7.0 ;  
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = true;
        uneBiere.lireEtiquette(); 
       
        BouteilleBiere Leffe = new BouteilleBiere("Leffe", (float) 6.6, "Abbaye de Leffe");
        Leffe.nom = "Leffe";
        Leffe.degreAlcool= (float) 6.6;
        Leffe.brasserie = "Abbaye de Leffe";
        Leffe.ouverte = false;
        Leffe.lireEtiquette();
        
        BouteilleBiere Pelican = new BouteilleBiere("Pelican", (float) 6.1, "Novelty");
        BouteilleBiere Jonquerettois = new BouteilleBiere("Jonquerettois", (float) 5.0, "Bois de Saint Jean");
        BouteilleBiere Despe = new BouteilleBiere("Desperado", (float) 7.8, "Angouleme");
       Pelican.lireEtiquette();
       Jonquerettois.lireEtiquette();
       Despe.lireEtiquette();
       
       uneBiere.Decapsuler();
       System.out.println(uneBiere);
       System.out.println(Leffe);
               
        
       
    }
    
}
