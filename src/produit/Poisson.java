package produit;

import personnages.Gaulois;

public class Poisson extends Produit{
	
	private String date;
	private String nom;
	
	public Poisson() {
		this.date = date;
		this.nom = nom;
	}
	
	@Override
	public String decrireProduit(String nom,Unite unite) {
		String description = nom + " pêchés " + date;
		return description;
	}

}
