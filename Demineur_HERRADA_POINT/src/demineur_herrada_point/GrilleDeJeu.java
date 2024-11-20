package demineur_herrada_point;

import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author thomaspoint
 */
public class GrilleDeJeu {
    private Cellule[][] grille;
    private int nbLignes;
    private int nbColonnes;
    private int nbBombes;
    
    public GrilleDeJeu(int nbLignes, int nbColonnes, int nbBombes){
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.nbBombes = nbBombes;
        this.grille = new Cellule[nbLignes][nbColonnes];
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                grille[i][j] = new Cellule();
            }
        }
    }
    public int getNbLignes() {
        return nbLignes;
    }

    public int getNbColonnes() {
        return nbColonnes;
    }

    public int getNbBombes() {
        return nbBombes;
    }
    
    public void placerBombesAleatoirement() {
        Random rand = new Random();
        int bombesPlacees = 0;
    }
    
}

