package dao;

import java.util.ArrayList;

import domaine.Client;

public class ClientDao {

	ArrayList<Client> listclient = new ArrayList<Client>();

	public void ajouterClient(Client clnt) {
		listclient.add(clnt);

	}

	public void modifierClient(int i, Client clnt) {
		listclient.set(i, clnt);

	}

	public void supprimerClient(int i) {
		listclient.remove(i);

	}

	public void visualiserClient(int i) {
		listclient.get(i);
	}

	public Client select(int id) {

		Client clientFound = new Client();

		for (Client client : listclient) {

			if (client.getId() == id) {
				clientFound = new Client (client.getCodebanque());
			}
			else
				System.out.println("Veuillez vérifier l'id saisi");
		}

		return clientFound;

	}
	
	

}