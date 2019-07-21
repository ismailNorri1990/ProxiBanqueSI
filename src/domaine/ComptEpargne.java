package domaine;

import java.time.LocalDate;

/**
 * @author Mustafa Kachaf
 * @author Ismail Norri
 * @author Hamza Laarichi
 */

public class ComptEpargne extends CompteBancaire {
	
	//Déclaration des propriétés
	
	private int taux;
	
	//Getters & Setters
	
	public int getTaux() {
		return taux;
	}

	public void setTaux(int taux) {
		this.taux = taux;
	}
	
	//Constructeur
	
	public ComptEpargne(int codebanque, double solde, LocalDate dateouverture, int codecarte) {
		super(codebanque, solde, dateouverture, codecarte);
	}

	

}
