/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demineur_herrada_point;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author thomaspoint
 */
public class InterfaceJeu extends javax.swing.JFrame {

    GrilleDeJeu grilleDeJeu;
    int vies;
    boolean partieTerminee;
    
       public void initialiserPartie() {
        grilleDeJeu.placerBombesAleatoirement();
        System.out.println("Partie crée et initialisée!");
        System.out.println(grilleDeJeu);
    }
    
    /**
     * Creates new form InterfaceJeu
     */
    Partie partie = new Partie(10, 10, 12);
       
    public InterfaceJeu() {
        initComponents();
        int nbLignes = 20;
        int nbColonnes = 20;
        int nbBombes = 15;
        this.grilleDeJeu = new GrilleDeJeu(nbLignes, nbColonnes, nbBombes);
        this.initialiserPartie();
        
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i = 0; i < nbLignes; i++) {
          for (int j = 0; j < nbColonnes; j++) {
             BoutonCellule bouton = new BoutonCellule(i, j, grilleDeJeu.grille[i][j]);
             bouton.addActionListener(e -> gererClicBouton(bouton)); 
             PanneauGrille.add(bouton);
    }
}
    
}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanneauGrille.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 831, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceJeu().setVisible(true);;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauGrille;
    // End of variables declaration//GEN-END:variables

    private void DebutBouton(BoutonCellule bouton) {
        bouton.setText("?");
    }
   private void gererClicBouton(BoutonCellule bouton) {
    int ligne = bouton.ligne;
    int colonne = bouton.colonne;
    Cellule cellule = bouton.getCelluleAssociee();

    if (cellule.devoilee) {
        return; 
    }
    grilleDeJeu.revelerCellule(ligne, colonne); 
    PanneauGrille.repaint();
    if (cellule.getPresenceBombe()) {
    JOptionPane.showMessageDialog(this, "Boom ! Vous avez perdu !");
    partieTerminee = true;
    desactiverTousLesBoutons();
    afficherEcranFin(); // Affiche l'écran de fin
    } else {
        if (grilleDeJeu.toutesCellulesRevelees()) {
            JOptionPane.showMessageDialog(this, "Félicitations, vous avez gagné !");
            partieTerminee = true;
        }
    }
}

    // Désactiver tous les boutons après la fin de la partie
private void desactiverTousLesBoutons() {
    for (int i = 0; i < PanneauGrille.getComponentCount(); i++) {
        if (PanneauGrille.getComponent(i) instanceof JButton) {
            PanneauGrille.getComponent(i).setEnabled(false);
        }
    }
}
void reactiverTousLesBoutons() {
    for (int i = 0; i < PanneauGrille.getComponentCount(); i++) {
        if (PanneauGrille.getComponent(i) instanceof JButton) {
            PanneauGrille.getComponent(i).setEnabled(true);
        }
    }
}

        // Mettre à jour l'affichage des boutons selon l'état des cellules
private void mettreAJourAffichage() {
    for (int i = 0; i < grilleDeJeu.getNbLignes(); i++) {
        for (int j = 0; j < grilleDeJeu.getNbColonnes(); j++) {
            Cellule cellule = grilleDeJeu.grille[i][j];
            BoutonCellule bouton = (BoutonCellule) PanneauGrille.getComponent(i * grilleDeJeu.getNbColonnes() + j);
            if (cellule.devoilee) {
                if (cellule.getPresenceBombe()) {
                    bouton.setText("B");
                } else if (cellule.getNbBombesAdjacentes() > 0) {
                    bouton.setText(String.valueOf(cellule.getNbBombesAdjacentes()));
                } else {
                    bouton.setText(" ");
                }
            }
        }
    }
}

    private void afficherEcranFin() {
    new EcranFin(this).setVisible(true); // Affiche l'écran de fin
   }
}

