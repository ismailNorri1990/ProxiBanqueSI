package Service;

import dao.ClientDao;
import dao.ConseillerDao;
import domaine.Client;
import domaine.CompteBancaire;
import domaine.ConseillerClient;

/**
 * @author Hamza Laarichi 
 * @authorMustafa Kachaf 
 * @authorIsmail Norri
 */
public class ServiceClient {

	/**
	 * @param id1     : Repr�sente l'id du client envoyeur
	 * @param id2     : Repr�sente l'id du client receveur
	 * @param montant : Repr�sente le montant � transf�rer
	 */

	public void virement(int id1, int id2, double montant) {
		ClientDao clientDao1 = new ClientDao();
		ClientDao clientDao2 = new ClientDao();
		Client envoyeur = clientDao1.select(id1);
		Client receveur = clientDao2.select(id2);
		CompteBancaire compte1 = new CompteBancaire(envoyeur.getCodebanque());
		double soldeEnvoyeur = compte1.getSolde();
		CompteBancaire compte2 = new CompteBancaire(receveur.getCodebanque());
		double soldeReceveur = compte2.getSolde();
		if (soldeEnvoyeur >= montant) {
			soldeEnvoyeur = soldeEnvoyeur - montant;
			soldeReceveur = soldeReceveur + montant;
			System.out.println("Le virement a �t� bien effectu�");
		} else
			System.out.println("Votre solde est insufisant pour effectuer cette op�ration");

	}

	/**
	 * @param client         : Repr�sente le client � ajouter
	 * @param codeConseiller : : Repr�sente le conseiller client qui fait l'ajout
	 * 
	 */
	
	public void ajouter(Client client, int codeConseiller) {
		//ConseillerDao conseillerDao = new ConseillerDao();
		ClientDao clientDao = new ClientDao();
		//ConseillerClient conseillerClient = conseillerDao.selectConseiller(codeConseiller);
		int taille = 10;
		//taille = conseillerClient.getClients().size();

		if (taille < 10) {
			clientDao.ajouterClient(client);
			System.out.println("L'ajout a �t� bien �ffectu�.");
		} else
			System.out.println("Le conseiller a atteint le maximum de client.");
	}

	/**
	 * @param client : Repr�sente le client � modifier
	 * @param id : Repr�sente l'ID du client � modifier
	 */
	public void modifier(Client client, int i) {
		ClientDao clientDao = new ClientDao();
		clientDao.modifierClient(i, client);
	}

	/**
	 * @param id : Repr�sente l'ID du client � modifier
	 */
	
	public void supprimer(int id) {
		ClientDao clientDao = new ClientDao();
		clientDao.supprimerClient(id);
	}
	
	/**
	 * @param id : Repr�sente l'ID du client � modifier
	 */
	
	public void consulter(int id) {
		ClientDao clientDao = new ClientDao();
		clientDao.consulterClient(id);
	}

	public void simuler() {

	}

}
