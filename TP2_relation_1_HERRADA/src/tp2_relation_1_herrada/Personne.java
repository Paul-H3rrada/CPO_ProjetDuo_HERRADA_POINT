/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_herrada;

/**
 *
 * @author herra
 */
public class Personne {
    private String nom;
    private String prenom;
    public Voiture[] liste_voitures; // Liste des voitures
    public int nbVoitures; // Compteur de voitures possédées

    // Constructeur
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.liste_voitures = new Voiture[3]; // Allocation pour 3 voitures max
        this.nbVoitures = 0;
    }

    // Getters pour nom et prénom
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    // Méthode pour ajouter une voiture
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        // Vérifier si la voiture a déjà un propriétaire
        if (voiture_a_ajouter.getProprietaire() != null) { // Utiliser le getter ici
            return false; // La voiture est déjà possédée, ajout échoué
        }

        // Vérifier si le propriétaire a déjà 3 voitures
        if (nbVoitures >= liste_voitures.length) {
            return false; // Pas de place pour une nouvelle voiture, ajout échoué
        }

        // Ajouter la voiture à la liste
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++; // Incrémenter le compteur de voitures

        // Définir le nouveau propriétaire de la voiture
        voiture_a_ajouter.setProprietaire(this);

        return true; // Ajout réussi
    }

    // Méthode toString pour afficher les informations de la personne
    @Override
    public String toString() {
        return prenom + " " + nom;
    }
}
