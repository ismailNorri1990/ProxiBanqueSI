package domaine;

import java.time.LocalDate;

public class CompteBancaire {

	private int codebanque;
	private double solde;

	public CompteBancaire(int codebanque) {
		super();
		this.codebanque = codebanque;
	}

	private LocalDate dateouverture;
	private int codecarte;

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

	public CompteBancaire(int codebanque, double solde, LocalDate dateouverture, int codecarte) {
		super();
		this.codebanque = codebanque;
		this.solde = solde;
		this.dateouverture = dateouverture;
		this.codecarte = codecarte;
	}

}
