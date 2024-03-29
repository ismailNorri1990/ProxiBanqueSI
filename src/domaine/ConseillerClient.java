package domaine;

/**
 * @author Mustafa Kachaf
 * @author Ismail Norri
 * @author Hamza
 *
 */

import java.util.Collection;


public class ConseillerClient extends Personne { 
	
	//Déclaration attributs
	
	private Collection<Client> clients;

	//Getter & Setters
	
	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}
	
	//Constructeurs

	public ConseillerClient() {
		super();
	}
	
	public ConseillerClient(Collection<Client> clients) {
		super();
		this.clients = clients;
	}
	

}
