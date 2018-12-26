package ma.stylist.eshopping.dal.stateless;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import ma.stylist.eshopping.dal.AbstractDAO;
import ma.stylist.eshopping.persistance.Client;

/**
 * Session Bean implementation class ClientDAO
 */
@Stateless
@LocalBean
public class ClientDAO extends AbstractDAO<Long, Client> implements ClientDAORemote, ClientDAOLocal {

	public void addClient(Client client) {
		persist(client);
	}

	public void deleteClient(Client client) {
		delete(client);	
	}

	public void updateClient(Client client) {
		update(client);
	}

	public Client getClient(Long idClient) {
		return getByKey(idClient); 
	}

	public List<Client> getClients() {
		return getAll();
	}
	
}
