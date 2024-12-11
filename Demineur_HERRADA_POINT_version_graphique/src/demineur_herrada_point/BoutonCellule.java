/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_herrada_point;

import java.awt.Graphics;
import javax.swing.JButton;

public class BoutonCellule extends JButton {
    int ligne;
    int colonne;
    Cellule celluleAssocie; // permet de relier une Cellule à un bouton sur la grille grâce à la ligne 
    // et la colonne

    public BoutonCellule(int ligne, int colonne, Cellule celluleAssocie) {
        this.ligne = ligne;
        this.colonne = colonne;
        this.celluleAssocie = celluleAssocie;
        this.setText("?"); // Permet de rendre toutes les cases en "?" au départ du jeu 
    }

    public Cellule getCelluleAssociee() {
        return celluleAssocie;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    if (celluleAssocie.devoilee) {
                if (celluleAssocie.getPresenceBombe()) {
                    this.setText("B");
                } else if (celluleAssocie.getNbBombesAdjacentes() > 0) {
                    this.setText(String.valueOf(celluleAssocie.getNbBombesAdjacentes()));
                } else {
                    this.setText(" ");
                }
            }
    
    }
    
    
    
}
