package produit;

public abstract class Produit {
	private String nom;
	private Unite unite;
	
	public String getNom() {
		return nom;
	}
	
	public abstract String decrireProduit(String nom, Unite unite);
	
}
