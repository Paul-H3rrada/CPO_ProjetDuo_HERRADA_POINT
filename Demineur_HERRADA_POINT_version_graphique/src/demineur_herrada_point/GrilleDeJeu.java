package demineur_herrada_point;

import java.util.Random;

/**
 * Classe représentant la grille du jeu Démineur.
 * 
 * @author thomaspoint
 */
public class GrilleDeJeu {
    Cellule[][] grille;
    private int nbLignes;
    private int nbColonnes;
    private int nbBombes;

    // Constructeur
    public GrilleDeJeu(int nbLignes, int nbColonnes, int nbBombes) {
        if (nbBombes > nbLignes * nbColonnes) {
            throw new IllegalArgumentException("Trop de bombes pour la taille de la grille.");
        }
        
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.nbBombes = nbBombes;
        this.grille = new Cellule[nbLignes][nbColonnes];
        
        // Initialisation des cellules
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                grille[i][j] = new Cellule();
            }
        }
    }

    // Getters
    public int getNbLignes() {
        return nbLignes;
    }

    public int getNbColonnes() {
        return nbColonnes;
    }

    public int getNbBombes() {
        return nbBombes;
    }

    // Placement des bombes aléatoirement
    public void placerBombesAleatoirement() {
        Random rand = new Random();
        int bombesPlacees = 0;

        // Placement des bombes
        while (bombesPlacees < nbBombes) {
            int ligne = rand.nextInt(nbLignes);
            int colonne = rand.nextInt(nbColonnes);

            if (!grille[ligne][colonne].getPresenceBombe()) {
                grille[ligne][colonne].placerBombe();
                bombesPlacees++;
            }
        }

        // Calcul des bombes adjacentes pour chaque cellule
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!grille[i][j].getPresenceBombe()) {
                    int nbBombesAdjacentes = 0;
                    for (int x = -1; x <= 1; x++) {
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

    // Révéler une cellule
    public void revelerCellule(int ligne, int colonne) {
        // Vérification des indices
        if (ligne < 0 || ligne >= nbLignes || colonne < 0 || colonne >= nbColonnes) {
            return;
        }

        Cellule cellule = grille[ligne][colonne];

        // Si la cellule est déjà dévoilée, on ne fait rien
        if (cellule.devoilee) {
            return;
        }

        // Révéler la cellule
        cellule.revelerCellule();

        // Si la cellule n'a pas de bombes adjacentes, révéler les cellules voisines
        if (cellule.getNbBombesAdjacentes() == 0 && !cellule.getPresenceBombe()) {
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (i != 0 || j != 0) { // Éviter de révéler la cellule elle-même
                        revelerCellule(ligne + i, colonne + j);
                    }
                }
            }
        }
    }

    // Vérifie si toutes les cellules sans bombe sont dévoilées
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

    // Vérifie la présence d'une bombe à une position donnée
    public boolean getPresenceBombe(int i, int j) {
        if (i >= 0 && i < nbLignes && j >= 0 && j < nbColonnes) {
            return grille[i][j].getPresenceBombe();
        }
        return false;
    }

    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();

    // Construction de la ligne de bordure supérieure
    sb.append("+");
    for (int j = 0; j < nbColonnes; j++) {
        sb.append("---+"); // Largeur de 3 pour chaque cellule
    }
    sb.append("\n");

    // Construction de chaque ligne de la grille
    for (int i = 0; i < nbLignes; i++) {
        sb.append("|"); // Début de la ligne

        for (int j = 0; j < nbColonnes; j++) {
            // Ajoute la cellule suivie d'un séparateur
            sb.append(" ").append(grille[i][j].toString()).append(" |");
        }
        sb.append("\n");

        // Ligne de séparation entre les lignes de la grille
        sb.append("+");
        for (int j = 0; j < nbColonnes; j++) {
            sb.append("---+"); // Assure que la bordure est de la même taille que les cellules
        }
        sb.append("\n");
    }

    return sb.toString();
}

    Cellule getCellule(int ligne, int colonne) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}