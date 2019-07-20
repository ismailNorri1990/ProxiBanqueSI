package Service;

import dao.ClientDao;
import domaine.Client;
import domaine.CompteBancaire;

public class ServiceClient {

	public void virement(int id1, int id2, double montant) {
		ClientDao clientDao = new ClientDao();
		Client envoyeur = clientDao.select(id1);
		Client receveur = clientDao.select(id2);
		CompteBancaire compte1 = new CompteBancaire(envoyeur.getCodebanque());
		double soldeEnvoyeur = compte1.getSolde();
		CompteBancaire compte2 = new CompteBancaire(receveur.getCodebanque());
		double soldeReceveur = compte2.getSolde();
		if(soldeEnvoyeur >= montant) {
			soldeEnvoyeur = soldeEnvoyeur - montant;
			soldeReceveur = soldeReceveur + montant;
		}else
			System.out.println("Votre solde est insufisant pour effectuer cette opération");

	}
	
	public void ajouter() {
		
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
