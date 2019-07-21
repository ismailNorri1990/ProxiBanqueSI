package domaine;

/**
 * @author Mustafa Kachaf
 * @author Ismail Norri
 * @author Hamza Laarichi
 *
 */

public class Personne {

	//	Déclaration des propriétés

	private static int id;
	private String nom;
	private String prenom;
	private int telephone;

	// getters & Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
	}
	
	// Constructeur

	public Personne() {
		super();
	}
	
	public Personne(int id, String nom, String prenom) {
		super();
		id++;
		this.nom = nom;
		this.prenom = prenom;
	}
	

	public Personne(int id, String nom, String prenom, int telephone) {
		super();
		id++;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
	}
}
