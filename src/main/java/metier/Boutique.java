package metier;

public class Boutique {
	

	private String nom;
	private Adresse adresse;

	public Boutique(Adresse adresse, String nom) {
		this.nom = nom;
		this.adresse = adresse;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", adresse=" + adresse + "]";
	}

	

	
	

	
}