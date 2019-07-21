package domaine;

/**
 * @author Mustafa Kachaf
 * @author Ismail Norri
 * @author Hamza Laarichi
 */
import java.time.LocalDate;

public class CompteBancaire {

	//Déclarartion des propriétés
	
	private int codebanque;
	private double solde;
	private LocalDate dateouverture;
	private int codecarte;

	//Getters & Setters
	
	public int getCodebanque() {
		return codebanque;
	}

	public void setCodebanque(int codebanque) {
		this.codebanque = codebanque;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public LocalDate getDateouverture() {
		return dateouverture;
	}

	public void setDateouverture(LocalDate dateouverture) {
		this.dateouverture = dateouverture;
	}

	public int getCodecarte() {
		return codecarte;
	}

	public void setCodecarte(int codecarte) {
		this.codecarte = codecarte;
	}
	
	//Constructeur
	
	public CompteBancaire(int codebanque) {
		super();
		this.codebanque = codebanque;
	}

	public CompteBancaire(int codebanque, double solde, LocalDate dateouverture, int codecarte) {
		super();
		this.codebanque = codebanque;
		this.solde = solde;
		this.dateouverture = dateouverture;
		this.codecarte = codecarte;
	}

}
