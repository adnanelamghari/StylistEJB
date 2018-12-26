package ma.stylist.eshopping.dal.stateless;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import ma.stylist.eshopping.dal.AbstractDAO;
import ma.stylist.eshopping.persistance.Addition;
import ma.stylist.eshopping.persistance.Client;

/**
 * Session Bean implementation class AddionsDAO
 */
@Stateless
@LocalBean
public class AddionsDAO extends AbstractDAO<Long, Addition> implements AddionsDAORemote, AddionsDAOLocal {
       
	public void addAddition(Addition addition) {
		persist(addition);
	}

	public void deleteAddition(Addition addition) {
		delete(addition);	
	}

	public void updateAddition(Addition addition) {
		update(addition);
	}

	public Addition getAddition(Long idAddition) {
		return getByKey(idAddition); 
	}

	public List<Addition> getAdditions() {
		return getAll();
	}
	

}
