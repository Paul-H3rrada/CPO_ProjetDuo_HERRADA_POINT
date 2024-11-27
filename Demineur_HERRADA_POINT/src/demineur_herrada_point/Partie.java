/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_herrada_point;

/**
 *
 * @author thomaspoint
 */
import java.util.Scanner;

public class Partie {
    private GrilleDeJeu grilleDeJeu;
    private int vies;
    private boolean partieTerminee;

    public Partie(int nbLignes, int nbColonnes, int nbBombes) {
        this.grilleDeJeu = new GrilleDeJeu(nbLignes, nbColonnes, nbBombes);
        this.vies = 1; // Une vie par défaut, ajustable si nécessaire
        this.partieTerminee = false;
    }

    public void initialiserPartie() {
        grilleDeJeu.placerBombesAleatoirement();
        System.out.println("Partie crée et initialisée!");
        System.out.println(grilleDeJeu);
    }

public void tourDeJeu(int ligne, int colonne) {
    // Vérification si les indices sont valides
    if (ligne < 0 || ligne >= grilleDeJeu.getNbLignes() || colonne < 0 || colonne >= grilleDeJeu.getNbColonnes()) {
        System.out.println("Coordonnées invalides ! Les indices doivent être dans la plage de la grille.");
        return; // Rien ne se passe si les indices sont invalides
    }

    // Si les coordonnées sont valides
    if (grilleDeJeu.getPresenceBombe(ligne, colonne)) {
        System.out.println("Boom ! Vous avez touché une bombe. Partie terminée !");
        partieTerminee = true; // Fin de la partie
    } else {
        grilleDeJeu.revelerCellule(ligne, colonne); // Révéler la cellule
        if (grilleDeJeu.toutesCellulesRevelees()) {
            System.out.println("Félicitations, vous avez gagné !");
            partieTerminee = true; // Fin de la partie
        }
    }
    System.out.println(grilleDeJeu); // Affiche la grille mise à jour
}




    public void verifierVictoire() {
        if (grilleDeJeu.toutesCellulesRevelees()) {
            System.out.println("Félicitations, vous avez révélé toutes les cellules sûres !");
            partieTerminee = true;
        }
    }

  public void demarrerPartie() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bienvenue dans notre Démineur !");
    initialiserPartie();

    while (!partieTerminee) {
        System.out.println("Choisissez une action :");
        System.out.println("1. Révéler une cellule");
        System.out.println("2. Quitter");

        int choix = scanner.nextInt();
        if (choix == 1) {
            System.out.print("Entrez la ligne : ");
            int ligne = scanner.nextInt();
            System.out.print("Entrez la colonne : ");
            int colonne = scanner.nextInt();
            tourDeJeu(ligne, colonne); // Appel de la méthode qui gère les indices invalides
        } else if (choix == 2) {
            System.out.println("Merci d'avoir joué !");
            partieTerminee = true;
        } else {
            System.out.println("Choix invalide. Veuillez réessayer.");
        }
    }

    scanner.close();
}

}

    
    

