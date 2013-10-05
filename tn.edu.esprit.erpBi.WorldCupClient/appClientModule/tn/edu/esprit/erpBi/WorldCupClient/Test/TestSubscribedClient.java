package tn.edu.esprit.erpBi.WorldCupClient.Test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.WorldCup.domain.SubscribedClient;
import tn.edu.esprit.erpBi.WorldCup.services.SubscribedClientServices;

public class TestSubscribedClient {

	public TestSubscribedClient() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SubscribedClientServices clientServices = null;
		try {
			Context context = new InitialContext();
			Object o = context.lookup("ejb:/tn.edu.esprit.erpBi.WorldCup/SubscribedClientServices!tn.edu.esprit.erpBi.WorldCup.services.SubscribedClientServicesRemote");
			clientServices =  (SubscribedClientServices) o;
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		createSubscribedClient(clientServices);
		
		
		
	}
	
	public static void createSubscribedClient(SubscribedClientServices clientServices){
		SubscribedClient client = new SubscribedClient("Houssem", "Ben Ali", "houssem.benali@esprit.tn", "25/03/1990", "H", "hoos", "azerty");
		clientServices.createSubscribedClient(client);
		
	}

}
