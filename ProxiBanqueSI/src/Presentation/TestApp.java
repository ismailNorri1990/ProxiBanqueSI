package Presentation;

import java.util.ArrayList;

import Service.ServiceClient;
import dao.ClientDao;
import dao.ConseillerDao;
import domaine.Client;
import domaine.CompteBancaire;
import domaine.ConseillerClient;

/**
 * @author Mustafa Kachaf
 * @author Ismail Norri
 * @author Hamza Laarichi
 *
 */

public class TestApp {

	public static void main(String[] args) {

		// Fonctionalité ajouter client

		ArrayList<Client> list = new ArrayList<Client>();
		ServiceClient sClient = new ServiceClient();
		CompteBancaire cBancaire = new CompteBancaire(123);
		ConseillerClient cClient = new ConseillerClient(1, "Hamza", "Laarichi", list);
		ConseillerDao cDao = new ConseillerDao();
		ClientDao cltDao = new ClientDao();
			
		Client client2 = new Client(1,"laarbaoui","mustafa",12233,"hay mohamadie",12222,"ville",cBancaire.getCodebanque());
		Client client3 = new Client(1,"laarbaoui","mustafa",12233,"hay mohamadie",12222,"ville",cBancaire.getCodebanque());
		
		//cDao.ajouterConseiller(cClient);
		cltDao.ajouterClient(client2);
		cltDao.ajouterClient(client3);
		cltDao.afficher();
	}

}
