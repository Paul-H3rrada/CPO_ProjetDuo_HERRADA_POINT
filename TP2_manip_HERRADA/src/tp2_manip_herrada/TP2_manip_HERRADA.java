/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_herrada;

/**
 *
 * @author herra
 */
public class TP2_manip_HERRADA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Tartiflette assiette1 = new Tartiflette(500) ; 
     Tartiflette assiette2 = new Tartiflette(600) ; 
     Tartiflette assiette3 = assiette2 ;
     System.out.println("nb de calories de Assiette 1 : " + assiette2.nbCalories) ; 
     System.out.println("nb de calories de Assiette 2 : " + assiette1.nbCalories) ; 
     System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ; 
     
   /** Q6: ces deux lignes ne sont pas correctes puisqu'on essaie de référence un objet en fonction d'un autre, alors qu'ici les deux n'ont pas de liens direct
    * 
    */
        // Création d'un tableau de 10 références de Moussaka
        Moussaka[] moussakas = new Moussaka[10];

        // Boucle pour créer 10 objets Moussaka
        for (int i = 0; i < moussakas.length; i++) {
            moussakas[i] = new Moussaka(i * 100); // Ici on a chaque objet a 100 calories en fonction de son i 
        }

        // Affichage pour vérifier les objets créés
        for (int i = 0; i < moussakas.length; i++) {
            System.out.println("Moussaka " + i + " a " + moussakas[i].nbCalories + " calories.");
        }
        /* Question 7 : Je suppose qu'il est possible d'avoir un lien entre 2 objets, cela faciliterai beaucoup
        la création d'outils plus utiles dans la programmation et j'imagine que cela est beaucoup utilisé (par exemple un objet personnage puis un objet
        classe attribué dans un rpg etc...) 
        */
    }
}

    

