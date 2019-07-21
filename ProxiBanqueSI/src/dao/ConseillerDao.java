package dao;

/**
 * @author Mustafa Kachaf
 * @author Ismail Norri
 * @author Hamza Laarichi
 */

import java.util.ArrayList;
import java.util.Collection;

import domaine.Client;

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
	
	public void ajouterConseiller(ConseillerClient conseiller) {
		listconseiller.add(conseiller);
	}
	
	
	/**
	 * @param id : Représente l'id  du conseiller.
	 * @return : retourne le conseiller client une fois retrouvé.
	 */
	public Collection<Client> selectConseiller (int id) {
		
		ArrayList<Client> list = new ArrayList<Client>();
		
		for (ConseillerClient conseiller : listconseiller) {

			if (conseiller.getId() == id) {
			
				list = (ArrayList<Client>) conseiller.getClients();
				
			}
			
			else
				System.out.println(" Le conseiller n'existe pas !");
		}

		return list;

	}
		
	//Constructeur

		public ConseillerDao() {
	}
	
	

}
