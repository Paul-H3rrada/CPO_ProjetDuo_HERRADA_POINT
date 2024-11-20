package demineur_herrada_point;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author herra
 */
public class Cellule {
    private boolean PresenceBombe;
    private boolean devoilee;
    private int nbBombesAdjacentes;
    
        public Cellule() {
        this.PresenceBombe = false;
        this.devoilee = false;
        this.nbBombesAdjacentes = 0;
    }

    
    
    public boolean getPresenceBombe() {
        return PresenceBombe;
    }
    
    public int getNbBombesAdjacentes() {
        return nbBombesAdjacentes;
    }
    
     public void placerBombe() {
        this.PresenceBombe = true;
    }
     
     public void revelerCellule() {
        this.devoilee = true;
    }
    
     public void setNbBombesAdjacentes(int nbBombesAdjacentes) {
        this.nbBombesAdjacentes = nbBombesAdjacentes;
    }
     
     @Override
    public String toString() {
        if (!devoilee) {
            return "?"; // La cellule n'est pas dévoilée
        } else if (PresenceBombe) {
            return "B"; // La cellule contient une bombe
        } else if (nbBombesAdjacentes > 0) {
            return String.valueOf(nbBombesAdjacentes); // Nombre de bombes adjacentes
        } else {
            return " "; // Aucune bombe et aucune bombe adjacente
        }
    }
}

