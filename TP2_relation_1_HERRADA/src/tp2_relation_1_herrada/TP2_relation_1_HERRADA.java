/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_herrada;

/**
 *
 * @author herra
 */
public class TP2_relation_1_HERRADA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Création des voitures
    Voiture uneClio = new Voiture("Clio", "Renault", 5);
    Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
    Voiture une2008 = new Voiture("2008", "Peugeot", 6);
    Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

    // Création des personnes
    Personne bob = new Personne("Bobby", "Sixkiller");
    Personne reno = new Personne("Reno", "Raines");

    // Affichage des voitures disponibles
    System.out.println("Liste des voitures disponibles :\n" + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

    // Ajout de la relation : Bob est propriétaire de la Clio
    if (bob.ajouter_voiture(uneClio)) {
        System.out.println("Bob a ajouté la Clio.");
    } else {
        System.out.println("Échec de l'ajout de la Clio à Bob.");
    }

    // Ajout de la deuxième voiture à Bob
    if (bob.ajouter_voiture(uneAutreClio)) {
        System.out.println("Bob a ajouté une autre Clio.");
    } else {
        System.out.println("Échec de l'ajout de la seconde Clio à Bob.");
    }

    // Ajout de deux voitures à Reno
    if (reno.ajouter_voiture(une2008)) {
        System.out.println("Reno a ajouté la 2008.");
    } else {
        System.out.println("Échec de l'ajout de la 2008 à Reno.");
    }

    if (reno.ajouter_voiture(uneMicra)) {
        System.out.println("Reno a ajouté la Micra.");
    } else {
        System.out.println("Échec de l'ajout de la Micra à Reno.");
    }

    // Affichage des informations de Bob
    System.out.println("\nLes voitures de Bob :");
    for (int i = 0; i < bob.nbVoitures; i++) {
        System.out.println("Voiture " + (i + 1) + ": " + bob.liste_voitures[i]);
    }

    // Affichage des informations de Reno
    System.out.println("\nLes voitures de Reno :");
    for (int i = 0; i < reno.nbVoitures; i++) {
        System.out.println("Voiture " + (i + 1) + ": " + reno.liste_voitures[i]);
    }
}

}
