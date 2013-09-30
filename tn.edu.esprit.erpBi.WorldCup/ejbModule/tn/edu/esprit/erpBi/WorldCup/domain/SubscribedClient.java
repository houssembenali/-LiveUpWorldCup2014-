package tn.edu.esprit.erpBi.WorldCup.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubscribedClient implements Serializable{

	public SubscribedClient() {

	}

	private int clientId;
	private String clientName;
	private String clientLastName;
	private String clientEmail;
	private String clientBirthDate;
	private String clientSex;
	private String clientLogin;
	private String clientPassword;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientLastName() {
		return clientLastName;
	}

	public void setClientLastName(String clientLastName) {
		this.clientLastName = clientLastName;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientBirthDate() {
		return clientBirthDate;
	}

	public void setClientBirthDate(String clientBirthDate) {
		this.clientBirthDate = clientBirthDate;
	}

	public String getClientSex() {
		return clientSex;
	}

	public void setClientSex(String clientSex) {
		this.clientSex = clientSex;
	}

	public String getClientLogin() {
		return clientLogin;
	}

	public void setClientLogin(String clientLogin) {
		this.clientLogin = clientLogin;
	}

	public String getClientPassword() {
		return clientPassword;
	}

	public void setClientPassword(String clientPassword) {
		this.clientPassword = clientPassword;
	}

	public SubscribedClient(String clientName, String clientLastName,
			String clientEmail, String clientBirthDate, String clientSex,
			String clientLogin, String clientPassword) {
		super();
		this.clientName = clientName;
		this.clientLastName = clientLastName;
		this.clientEmail = clientEmail;
		this.clientBirthDate = clientBirthDate;
		this.clientSex = clientSex;
		this.clientLogin = clientLogin;
		this.clientPassword = clientPassword;
	}
	
	

}
