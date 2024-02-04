package Commande;

import java.sql.Date;

public abstract class Commande {
	private int idUtilisateur;
    private int idVehicule;
    private float montant;
    private String etat;
    private Date dateDeCommande;

    public Commande(int idUtilisateur, int idVehicule, float montant, String etat, Date dateDeCommande) {
        this.idUtilisateur = idUtilisateur;
        this.idVehicule = idVehicule;
        this.montant = montant;
        this.etat = etat;
        this.dateDeCommande = dateDeCommande;
    }

    public abstract void afficher();
    public abstract void modifier();
    public abstract void supprimer();

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public int getIdVehicule() {
        return idVehicule;
    }

    public float getMontant() {
        return montant;
    }

    public String getEtat() {
        return etat;
    }

    public Date getDateDeCommande() {
        return dateDeCommande;
    }

}
