package ma.stylist.eshopping.dal.stateless;

import java.util.List;

import javax.ejb.Local;

import ma.stylist.eshopping.persistance.Client;

@Local
public interface ClientDAOLocal {

	public void addClient(Client client);

	public void deleteClient(Client client);

	public void updateClient(Client client);

	public Client getClient(Long idClient);

	public List<Client> getClients();
	
}
