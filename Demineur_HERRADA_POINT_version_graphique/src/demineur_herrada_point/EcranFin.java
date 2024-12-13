package demineur_herrada_point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcranFin extends JFrame {

    public EcranFin(InterfaceJeu jeu) {
        setTitle("Fin de Partie");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Fin de partie. Que souhaitez-vous faire ?", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        JPanel panelBoutons = new JPanel();
        panelBoutons.setLayout(new FlowLayout());

        JButton boutonRejouer = new JButton("Rejouer");
        JButton boutonQuitter = new JButton("Quitter");

        // Action pour rejouer
        boutonRejouer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jeu.setVisible(false);
                InterfaceJeu nouveauJeu = new InterfaceJeu();
                nouveauJeu.setVisible(true);  // Réinitialise la partie
                
                
                dispose(); // Ferme la fenêtre actuelle
            }
        });

        // Action pour quitter
        boutonQuitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Ferme l'application
            }
        });

        panelBoutons.add(boutonRejouer);
        panelBoutons.add(boutonQuitter);

        add(panelBoutons, BorderLayout.SOUTH);
    }
}