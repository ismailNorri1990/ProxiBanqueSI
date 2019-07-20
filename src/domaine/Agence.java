package domaine;

import java.sql.Date;

/**
 * @author Mustafa Kachaf
 * @author Ismail Norri
 * @author Hamza
 */

public class Agence {
	
	//Déclaration des Attributs 
	
	private long codeagence;
	private Date datecreation;
	private Client codeclient;
	private Gerant codegerant;
	
	//Getters & Setters
	
	public long getCodeagence() {
		return codeagence;
	}

	public void setCodeagence(long codeagence) {
		this.codeagence = codeagence;
	}

	public Date getDatecreation() {
		return datecreation;
	}

	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}

	public Client getCodeclient() {
		return codeclient;
	}

	public void setCodeclient(Client codeclient) {
		this.codeclient = codeclient;
	}

	public Gerant getCodegerant() {
		return codegerant;
	}

	public void setCodegerant(Gerant codegerant) {
		this.codegerant = codegerant;
	}
	
	//Constructeurs
	
	public Agence(long codeagence, Date datecreation, Client codeclient, Gerant codegerant) {
		super();
		this.codeagence = codeagence;
		this.datecreation = datecreation;
		this.codeclient = codeclient;
		this.codegerant = codegerant;
	}

}
