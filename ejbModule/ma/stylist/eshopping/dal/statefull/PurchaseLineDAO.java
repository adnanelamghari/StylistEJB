package ma.stylist.eshopping.dal.statefull;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import ma.stylist.eshopping.dal.AbstractDAO;
import ma.stylist.eshopping.persistance.Purchase;
import ma.stylist.eshopping.persistance.PurchaseLine;

/**
 * Session Bean implementation class PurchaseLineDAO
 */
@Stateless
@LocalBean
public class PurchaseLineDAO extends AbstractDAO<Long, PurchaseLine> implements PurchaseLineDAORemote, PurchaseLineDAOLocal {
       
	public void addPurchaseLine(PurchaseLine purchaseLine) {
		persist(purchaseLine);
	}

	public void deletePurchase(PurchaseLine purchaseLine) {
		delete(purchaseLine);	
	}

	public void updatePurchaseLine(PurchaseLine purchaseLine) {
		update(purchaseLine);
	}

	public PurchaseLine getPurchaseLine(Long idPurchaseLine) {
		return getByKey(idPurchaseLine); 
	}

	public List<PurchaseLine> getPurchaseLines() {
		return getAll();
	}
}
