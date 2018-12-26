package ma.stylist.eshopping.dal.statefull;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import ma.stylist.eshopping.dal.AbstractDAO;
import ma.stylist.eshopping.persistance.Product;
import ma.stylist.eshopping.persistance.Purchase;

/**
 * Session Bean implementation class PurchaseDAO
 */
@Stateless
@LocalBean
public class PurchaseDAO extends AbstractDAO<Long, Purchase> implements PurchaseDAORemote, PurchaseDAOLocal {

	public void addPurchase(Purchase purchase) {
		persist(purchase);
	}

	public void deletePurchase(Purchase purchase) {
		delete(purchase);	
	}

	public void updatePurchase(Purchase purchase) {
		update(purchase);
	}

	public Purchase getPurchase(Long idPurchase) {
		return getByKey(idPurchase); 
	}

	public List<Purchase> getPurchases() {
		return getAll();
	}
	
}
