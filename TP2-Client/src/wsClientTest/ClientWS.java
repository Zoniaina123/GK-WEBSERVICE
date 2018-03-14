package wsClientTest;

import java.util.List;

import ws.BanqueService;
import ws.BanqueWS;
import ws.Compte;

public class ClientWS {

	public static void main(String[] args) {
		BanqueService stub =  new BanqueWS().getBanqueServicePort();
		
		//Conversion de 900€ en dollar
		System.out.println("Conversion");
		System.out.println(stub.conversionEuroToD(9000));
		
		//Consultation de compte N°5
		System.out.println("Consultation un compte");
		Compte cp = stub.getCompte(5);
		System.out.println("Solde= "+ cp.getSolde());
		
		//affichage de tous les comptes
		System.out.println("Liste des Comptes");
		List<Compte> cptes = stub.getComptes();
		for (Compte c : cptes) {
			System.out.println(c.getCode()+ "-----------" + c.getSolde());
		}
		

	}

}
