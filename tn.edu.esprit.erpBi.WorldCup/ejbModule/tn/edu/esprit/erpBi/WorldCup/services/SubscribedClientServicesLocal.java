package tn.edu.esprit.erpBi.WorldCup.services;

import java.util.List;

import javax.ejb.Local;

import tn.edu.esprit.erpBi.WorldCup.domain.SubscribedClient;

@Local
public interface SubscribedClientServicesLocal {
	public void createSubscribedClient(SubscribedClient subscribedClient );
	public void updateSubscribedClient(SubscribedClient subscribedClient);
	public void deleteSubscribedClient(SubscribedClient subscribedClient);
	public SubscribedClient getSubscribedClientById(int clienId);
	public List<SubscribedClient> getAllSubscribedClient();
}
