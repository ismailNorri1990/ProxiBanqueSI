package domaine;

import java.time.LocalDate;

public class ComptCourant extends CompteBancaire{
	


	public ComptCourant(int codebanque, double solde, LocalDate dateouverture, int codecarte) {
		super(codebanque, solde, dateouverture, codecarte);
		// TODO Auto-generated constructor stub
	}

	private double decouvert;

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	

}
