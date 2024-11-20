/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_herrada;

/**
 *
 * @author herra
 */
public class Voiture {
    private String modele;
    private String marque;
    private int puissanceCV;
    private Personne proprietaire; // Propriétaire de la voiture

    // Constructeur
    public Voiture(String modele, String marque, int puissanceCV) {
        this.modele = modele;
        this.marque = marque;
        this.puissanceCV = puissanceCV;
        this.proprietaire = null; // Propriétaire non défini au départ
    }

    // Getter pour le propriétaire
    public Personne getProprietaire() {
        return proprietaire;
    }

    // Setter pour le propriétaire
    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }

    // Méthode toString pour afficher les informations de la voiture sans récursion
    @Override
    public String toString() {
        String info = "Voiture [Marque: " + marque + ", Modèle: " + modele + ", Puissance: " + puissanceCV + " CV";
        if (proprietaire != null) {
            info += ", Propriétaire: " + proprietaire.getPrenom() + " " + proprietaire.getNom(); // Évite la récursion
        }
        info += "]";
        return info;
    }
}





