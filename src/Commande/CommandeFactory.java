package Commande;

import java.sql.Date;

public class CommandeFactory {
	public Commande creerCommande(int idUtilisateur, int idVehicule, float montant, String etat, Date dateDeCommande) {
        return new CommandeConcrète(idUtilisateur, idVehicule, montant, etat, dateDeCommande);
    }

}
