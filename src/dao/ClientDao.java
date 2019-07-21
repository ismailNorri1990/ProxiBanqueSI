package dao;

import java.util.ArrayList;

import domaine.Client;

/**
 * @author Mustafa Kachaf
 * @author Ismail Norri
 * @author Hamza Laarichi
 *
 */
public class ClientDao {

	ArrayList<Client> listclient = new ArrayList<Client>();

	
	/**
	 * @param client repr�sente l'objet client qui sera ajout�.
	 */
	public void ajouterClient(Client client) {
		listclient.add(client);
	}
	
	/**
	 * @param i repr�sente l'index du client dans la collection
	 */

	public void modifierClient(int i, Client client) {
		listclient.set(i, client);

	}
	
	public ArrayList<Client> afficher() {
		return listclient;

	}
	
	
	/**
	 * @param i repr�sente l'index du client dans la collection
	 */
	public void supprimerClient(int i) {
		listclient.remove(i);

	}

	/**
	 * @param i repr�sente l'index du client dans la collection
	 */
	public void consulterClient(int i) {
		listclient.get(i);
	}

	/**
	 * @param id : Repr�sente l'ID Client 
	 * @return : Retourne le client s'il existe dans la base
	 */
	public Client select(int id) {

		Client clientFound = new Client();

		for (Client client : listclient) {

			if (client.getId() == id) {
				clientFound = new Client (client.getCodebanque());
			}
			else
				System.out.println("Veuillez v�rifier l'id saisi");
		}

		return clientFound;

	}
	
	

}