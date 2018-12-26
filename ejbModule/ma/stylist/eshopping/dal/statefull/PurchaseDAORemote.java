package ma.stylist.eshopping.dal.statefull;

import java.util.List;

import javax.ejb.Remote;

import ma.stylist.eshopping.persistance.Purchase;

@Remote
public interface PurchaseDAORemote {

	public void addPurchase(Purchase purchase);
	
	public void deletePurchase(Purchase purchase);

	public void updatePurchase(Purchase purchase);

	public Purchase getPurchase(Long idPurchase);

	public List<Purchase> getPurchases();
	
}
