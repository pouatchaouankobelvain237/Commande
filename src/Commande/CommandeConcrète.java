package Commande;

import java.sql.Date;

public class CommandeConcrète extends Commande {
	public CommandeConcrète(int idUtilisateur, int idVehicule, float montant, String etat, Date dateDeCommande) {
        super(idUtilisateur, idVehicule, montant, etat, dateDeCommande);
    }

    @Override
    public void afficher() {
        // Implémentation spécifique pour afficher la commande
        System.out.println("Affichage de la commande : " + getIdUtilisateur() + " - " + getIdVehicule());
    }

    @Override
    public void modifier() {
        // Implémentation spécifique pour modifier la commande
        System.out.println("Modification de la commande : " + getIdUtilisateur() + " - " + getIdVehicule());
    }

    @Override
    public void supprimer() {
        // Implémentation spécifique pour supprimer la commande
        System.out.println("Suppression de la commande : " + getIdUtilisateur() + " - " + getIdVehicule());
    }

}
