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
	 * @param id1     : Représente l'id du client envoyeur
	 * @param id2     : Représente l'id du client receveur
	 * @param montant : Représente le montant à transférer
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
			System.out.println("Le virement a été bien effectué");
		} else
			System.out.println("Votre solde est insufisant pour effectuer cette opération");

	}

	/**
	 * @param client         : Représente le client à ajouter
	 * @param codeConseiller : : Représente le conseiller client qui fait l'ajout
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
			System.out.println("L'ajout a été bien éffectué.");
		} else
			System.out.println("Le conseiller a atteint le maximum de client.");
	}

	/**
	 * @param client : Représente le client à modifier
	 * @param id : Représente l'ID du client à modifier
	 */
	public void modifier(Client client, int i) {
		ClientDao clientDao = new ClientDao();
		clientDao.modifierClient(i, client);
	}

	/**
	 * @param id : Représente l'ID du client à modifier
	 */
	
	public void supprimer(int id) {
		ClientDao clientDao = new ClientDao();
		clientDao.supprimerClient(id);
	}
	
	/**
	 * @param id : Représente l'ID du client à modifier
	 */
	
	public void consulter(int id) {
		ClientDao clientDao = new ClientDao();
		clientDao.consulterClient(id);
	}

	public void simuler() {

	}

}
