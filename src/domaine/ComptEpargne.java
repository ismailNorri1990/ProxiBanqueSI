package domaine;

import java.time.LocalDate;

public class ComptEpargne extends CompteBancaire {
	
	private int taux;

	

	public ComptEpargne(int codebanque, double solde, LocalDate dateouverture, int codecarte) {
		super(codebanque, solde, dateouverture, codecarte);
		// TODO Auto-generated constructor stub
	}

	public int getTaux() {
		return taux;
	}

	public void setTaux(int taux) {
		this.taux = taux;
	}

	

}
