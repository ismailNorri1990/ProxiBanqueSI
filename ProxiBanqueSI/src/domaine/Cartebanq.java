package domaine;

/**
 * @author Mustafa Kachaf
 * @author Ismail Norri
 * @author Hamza
 *
 */

public class Cartebanq {

	//	Déclaration des attributs

	private int codecarte;
	private boolean statut;

	// getters & Setters

	public int getCodecarte() {
		return codecarte;
	}

	public void setCodecarte(int codecarte) {
		this.codecarte = codecarte;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	// Constructeur

	public Cartebanq(int codecarte, boolean statut) {
		super();
		this.codecarte = codecarte;
		this.statut = statut;

	}

}
