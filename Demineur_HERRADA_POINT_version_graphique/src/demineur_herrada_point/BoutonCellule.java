/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_herrada_point;

import javax.swing.JButton;

public class BoutonCellule extends JButton {
    int ligne;
    int colonne;
    Cellule celluleAssocie;

    public BoutonCellule(int ligne, int colonne) {
        this.ligne = ligne;
        this.colonne = colonne;
        Cellule bouton = null;
        celluleAssocie= bouton;
    }
    
    
}
