package ma.stylist.eshopping.dal.stateless;

import java.util.List;

import javax.ejb.Remote;

import ma.stylist.eshopping.persistance.Addition;

@Remote
public interface AddionsDAORemote {

	public void addAddition(Addition addition);

	public void deleteAddition(Addition addition);

	public void updateAddition(Addition addition);

	public Addition getAddition(Long idAddition);

	public List<Addition> getAdditions();
}
