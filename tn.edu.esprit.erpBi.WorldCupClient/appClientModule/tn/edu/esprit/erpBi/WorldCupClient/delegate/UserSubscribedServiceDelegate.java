package tn.edu.esprit.erpBi.WorldCupClient.delegate;

import tn.edu.esprit.erpBi.WorldCup.domain.SubscribedClient;
import tn.edu.esprit.erpBi.WorldCup.services.SubscribedClientServicesRemote;
import tn.edu.esprit.erpBi.WorldCupClient.locator.ServiceLocator;

public class UserSubscribedServiceDelegate {
	
	private static final String jndiName = "ejb:/tn.edu.esprit.erpBi.WorldCup/SubscribedClientServices!tn.edu.esprit.erpBi.WorldCup.services.SubscribedClientServicesRemote";

	
	private static SubscribedClientServicesRemote getProxy() {
		return (SubscribedClientServicesRemote) ServiceLocator.getInstance()
				.getProxy(jndiName);
	}
	public static void create(SubscribedClient client){
		getProxy().createSubscribedClient(client);
	}
	
	public static void delete(SubscribedClient client){
		getProxy().deleteSubscribedClient(client);
	}
}
