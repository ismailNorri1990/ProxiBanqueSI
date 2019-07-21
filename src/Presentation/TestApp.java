package Presentation;

import java.util.ArrayList;
import java.util.Scanner;

import Service.ServiceClient;
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
		ConseillerClient cClient = new ConseillerClient(1,"Hamza", "Laarichi",list);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nom Du Client");
		String nom = sc.nextLine();
		
		System.out.println("Prenom Du Client");
		String prenom = sc.nextLine();
		
		System.out.println("Adresse Du Client");
		String adresse = sc.nextLine();
		
		System.out.println("Ville Du Client");
		String ville = sc.nextLine();
		
		System.out.println("Code postal Du Client");
		int codePostal = sc.nextInt();
		
		System.out.println("Téléphone Du Client");
		int numero = sc.nextInt();
		
		Client client1 = new Client(1,nom,prenom,numero,adresse,codePostal,ville,cBancaire.getCodebanque());
		
		sClient.ajouter(client1, cClient.getId());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
