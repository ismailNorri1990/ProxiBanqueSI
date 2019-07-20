package domaine;

import java.time.LocalDate;

/**
 * Hamza Laarichi
 * Mustafa Kachaf
 * Ismail Norri
 */

public class ComptCourant extends CompteBancaire{

	//Déclaration des attributs
	
	private double decouvert;
	
	//Getters & Setters

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	//Constructeur
	
	public ComptCourant(int codebanque, double solde, LocalDate dateouverture, int codecarte) {
		super(codebanque, solde, dateouverture, codecarte);
		
	}

	

}
