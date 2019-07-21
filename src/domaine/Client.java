package domaine;

/**
 * @author Hamza Laarichi
 * @author Mustafa Kachaf
 * @author Ismail Norri
 */

public class Client extends Personne {
	
	//Déclarations des propriétés
	
	private String adresse;
	private int codepostale;
	private String ville;
	private int codebanque;
	
	//Getters & Setters
	
	public int getCodebanque() {
		return codebanque;
	}

	public void setCodebanque(int codebanque) {
		this.codebanque = codebanque;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodepostale() {
		return codepostale;
	}

	public void setCodepostale(int codepostale) {
		this.codepostale = codepostale;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Client(int codebanque) {
		this.codebanque = codebanque;
	}
	
	//Constructeurs

	public Client() {
		super();
	}

	public Client(int id, String nom, String prenom, int telephone) {
		super(id, nom, prenom, telephone);
	}
	
	public Client(int id, String nom, String prenom, int telephone, String adresse, int codepostale, String ville,
			int codebanque) {
		super(id, nom, prenom, telephone);
		this.adresse = adresse;
		this.codepostale = codepostale;
		this.ville = ville;
		this.codebanque = codebanque;
	}


	
}
