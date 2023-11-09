package produit;

public enum Unite {
	LITRE("l"), 
	GRAMME("g"),
	KILOGRAMME("kg"),
	CENTILITRE("cm"), 
	MILLILITRE("mm"),
	PIECE("pièce");

	  private final String unite;
	
	  private Unite(String unite) {
	    this.unite = unite;
	  }

}
