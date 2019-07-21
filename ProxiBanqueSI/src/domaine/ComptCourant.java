package domaine;

import java.time.LocalDate;

/**
 * @author Mustafa Kachaf
 * @author Ismail Norri
 * @author Hamza Laarichi
 */

public class ComptCourant extends CompteBancaire{

	//D�claration des attributs
	
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
