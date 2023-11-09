package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;
	private String nom;
	
	public Sanglier() {
		this.poids = poids;
		this.chasseur= chasseur;
		this.nom = nom;
	}
	
	@Override
	public String decrireProduit(String nom,Unite unite) {
		String description = nom + " de " + poids + "" + unite + " chassé par " + chasseur;
		return description;
	}

}
