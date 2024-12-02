/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_herrada_point;

import javax.swing.JButton;

public class BoutonCellule extends JButton {
    private int ligne;
    private int colonne;
    private boolean devoile;

    public BoutonCellule(int ligne, int colonne) {
        this.ligne = ligne;
        this.colonne = colonne;
        this.devoile = false; // Par défaut, la cellule n'est pas dévoilée
    }

    public int getLigne() {
        return ligne;
    }

    public int getColonne() {
        return colonne;
    }

    public boolean isDevoile() {
        return devoile;
    }

    public void setDevoile(boolean devoile) {
        this.devoile = devoile;
    }
}
