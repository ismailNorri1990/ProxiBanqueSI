package Service;

import dao.ClientDao;
import dao.ConseillerDao;
import domaine.Client;
import domaine.CompteBancaire;
import domaine.ConseillerClient;

public class ServiceClient {

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

	public void ajouter(Client client, int codeConseiller) {
		ConseillerDao conseillerDao = new ConseillerDao();
		ClientDao clientDao = new ClientDao();
		ConseillerClient conseillerClient = conseillerDao.selectConseiller(codeConseiller);
		int taille = conseillerClient.getClients().size();
		
		if(taille<10) {
			clientDao.ajouterClient(client);
			System.out.println("L'ajout a été bien éffectué.");
		}else
			System.out.println("Le conseiller a atteint le maximum de client.");	
	}

	public void modifier() {

	}

	public void supprimer() {

	}

	public void consulter() {

	}

	public void simuler() {

	}

}
