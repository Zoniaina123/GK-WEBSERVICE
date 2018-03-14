package fr.gkj.tp1.business;

public enum Devise {
	
	EURO("EUR","Euro"),
	Dollar("USD", "Dollar américain");
	
	private final String code;
	private final String libelle;
	
	private Devise(String code, String libelle){
		this.code=code;
		this.libelle=libelle;
	}

	public String getCode() {
		return code;
	}

	public String getLibelle() {
		return libelle;
	}
	
	
}
