package dao;

/**
 * @author Mustafa Kachaf
 * @author Ismail Norri
 * @author Hamza Laarichi
 */

import java.util.ArrayList;

/**
 * @author Mustafa Kachaf
 * @author Ismail Norri
 * @author Hamza
 *
 */

import domaine.ConseillerClient;

public class ConseillerDao {
	
	//liste des conseiller
	ArrayList <ConseillerClient> listconseiller = new ArrayList<ConseillerClient>();
	
	
	/**
	 * @param id : Représente l'id  du conseiller.
	 * @return : retourne le conseiller client une fois retrouvé.
	 */
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
