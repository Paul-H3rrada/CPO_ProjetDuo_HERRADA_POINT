/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demineur_herrada_point;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

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
       
    public InterfaceJeu() {
        initComponents();
        int nbLignes = 12;
        int nbColonnes = 12;
        int nbBombes = 12;
        this.grilleDeJeu = new GrilleDeJeu(nbLignes, nbColonnes, nbBombes);
        this.initialiserPartie();
        
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
      for (int i = 0; i < nbLignes; i++) {
        for (int j = 0; j < nbColonnes; j++) {
        BoutonCellule bouton = new BoutonCellule(i, j, grilleDeJeu.grille[i][j]);
         bouton.addMouseListener(new MouseAdapter() {
             
            @Override 
            
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    // Clic gauche : gérer le dévoilement
                    gererClicBouton(bouton);
                } else if (SwingUtilities.isRightMouseButton(e)) {
                    // Clic droit : marquer ou dé-marquer la case
                    if (!bouton.getCelluleAssociee().devoilee) {
                        bouton.setMarquee(!bouton.estMarquee());
                    }
                }
            }
        });

        PanneauGrille.add(bouton);
    }
}

    
}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1940, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(204, 204, 255));
        PanneauGrille.setPreferredSize(new java.awt.Dimension(1940, 1080));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 740, 500));

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
                InterfaceJeu f = new InterfaceJeu();
                new InterfaceJeu().setVisible(true);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                f.setExtendedState(f.MAXIMIZED_BOTH);
                f.pack();
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

    if (cellule.devoilee || bouton.estMarquee()) {
        return; // Ne rien faire si déjà dévoilée ou marquée
    }

    grilleDeJeu.revelerCellule(ligne, colonne);
    PanneauGrille.repaint();

    if (cellule.getPresenceBombe()) {
        JOptionPane.showMessageDialog(this, "Boom ! Vous avez perdu !");
        partieTerminee = true;
        desactiverTousLesBoutons();
        afficherEcranFin(); 
    } else {
        if (grilleDeJeu.toutesCellulesRevelees()) {
            JOptionPane.showMessageDialog(this, "Félicitations, vous avez gagné !");
            partieTerminee = true;
            desactiverTousLesBoutons();
            afficherEcranFin();
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



    private void afficherEcranFin() {
    new EcranFin(this).setVisible(true); // Affiche l'écran de fin
   }
}

