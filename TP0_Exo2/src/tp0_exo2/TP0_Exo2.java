/*
 Nom:Herrada
TDC
TP0_Exo2
17/09/2024
 */
package tp0_exo2;

import java.util.Scanner;

/**
 *
 * @author herra
 */
public class TP0_Exo2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
 //Declaration des variables
 int nb; // nombre dentiers a additionner
 int result; // resultat
 int ind; //indice
 //nb=5;
 Scanner sc = new Scanner(System.in);
 System.out.println("\n Entrer le nombre :");
 nb=sc.nextInt(); // On demande a sc de donner le prochain entier
 result=0;
 // Addition des nb premiers entiers
 ind=1;
 while (ind < nb) {
     ind+=1;
 result=result+ind;
 }
 result+=1;
 // Affichage du resultat
 System.out.println();
 System.out.println("La somme des "+ nb + "entiers est: "+result);
 }
    
}
