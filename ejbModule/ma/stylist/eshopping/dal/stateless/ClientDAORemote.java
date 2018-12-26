package ma.stylist.eshopping.dal.stateless;

import java.util.List;

import javax.ejb.Remote;

import ma.stylist.eshopping.persistance.Client;

@Remote
public interface ClientDAORemote {

	public void addClient(Client client);

	public void deleteClient(Client client);

	public void updateClient(Client client);

	public Client getClient(Long idClient);

	public List<Client> getClients();
	
}
