package dao;

import java.util.ArrayList;

import domaine.ConseillerClient;

public class ConseillerDao {
	
	ArrayList <ConseillerClient> listconseiller = new ArrayList<ConseillerClient>();
	
	
	public ConseillerClient selectConseiller (int id) {

		ConseillerClient conseillerFound = new ConseillerClient();

		for (ConseillerClient conseiller : listconseiller) {

			if (conseiller.getId() == id) {
				conseillerFound = new ConseillerClient (conseiller.getClients());
			}
			
			else
				System.out.println(" Le conseiller n'existe pas !");
		}

		return conseillerFound;

	}
	

}
