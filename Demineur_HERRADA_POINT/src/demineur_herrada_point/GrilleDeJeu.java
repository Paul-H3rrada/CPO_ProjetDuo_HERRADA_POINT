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
        for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            if (!grille[i][j].getPresenceBombe()) {
               int nbBombesAdjacentes = 0;
               for (int x = -1; x <= 1; x++){
                   for (int y = -1; y <= 1; y++) {
                        int newI = i + x;
                        int newJ = j + y;
                        if (newI >= 0 && newI < nbLignes && newJ >= 0 && newJ < nbColonnes) {
                            if (grille[newI][newJ].getPresenceBombe()) {
                                nbBombesAdjacentes++;
                            }
                        }
                    }
                }
               grille[i][j].setNbBombesAdjacentes(nbBombesAdjacentes);
            }
        }
    }
}
    public void revelerCellule(int ligne, int colonne) {
    if (ligne < 0 || ligne >= nbLignes || colonne < 0 || colonne >= nbColonnes) {
        return; // Vérification que les indices sont dans les limites de la grille
    }
    
    Cellule cellule = grille[ligne][colonne];
    if (cellule.getPresenceBombe() || cellule.getNbBombesAdjacentes() > 0) {
        cellule.revelerCellule();
    }
 
    if (cellule.getNbBombesAdjacentes() == 0) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i != 0 || j != 0) {
                    revelerCellule(ligne + i, colonne + j); 
                }
            }
        }
    }
}
public boolean getPresenceBombe(int i, int j) {
    if (i >= 0 && i < nbLignes && j >= 0 && j < nbColonnes) {
        return grille[i][j].getPresenceBombe();
    }
    return false;
}
public boolean toutesCellulesRevelees() {
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            if (!grille[i][j].getPresenceBombe() && !grille[i][j].devoilee) {
                return false;
            }
        }
    }
    return true;
}
@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
            sb.append(grille[i][j].toString()).append(" ");
        }
        sb.append("\n");
    }
    
    return sb.toString();
}

}
