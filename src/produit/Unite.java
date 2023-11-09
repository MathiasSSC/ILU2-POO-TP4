package produit;

public enum Unite {
	LITRE("l"), 
	GRAMME("g"),
	KILOGRAMME("kg"),
	CENTILITRE("cm"), 
	MILLILITRE("mm"),
	PIECE("pi�ce");

	  private final String unite;
	
	  private Unite(String unite) {
	    this.unite = unite;
	  }

}
