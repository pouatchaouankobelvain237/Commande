package Commande;

import java.sql.Date;

public class Principale {

	public static void main(String[] args) {
		CommandeFactory commandeFactory = new CommandeFactory();
		int idUtilisateur = 0;
		String etat = null;
		float montant = 0;
		int idVehicule = 0;
		Date dateDeCommande = null;
		Commande commande = commandeFactory.creerCommande(idUtilisateur, idVehicule, montant, etat, dateDeCommande);
		commande.afficher(); // Appel de la méthode afficher() sur la commande créée
		commande.modifier(); // Appel de la méthode modifier() sur la commande créée
		commande.supprimer(); // Appel de la méthode supprimer() sur la commande créée

	}

}
