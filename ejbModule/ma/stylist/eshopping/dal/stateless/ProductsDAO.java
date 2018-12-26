package ma.stylist.eshopping.dal.stateless;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.List;
import ma.stylist.eshopping.persistance.Product;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import ma.stylist.eshopping.dal.AbstractDAO;
/**
 * Session Bean implementation class ProductsDAO
 */
@Stateless
@LocalBean
public class ProductsDAO extends AbstractDAO<Long, Product> implements ProductsDAORemote, ProductsDAOLocal {

	public void addProduct(Product product) {
		persist(product);
	}

	public void deleteProduct(Product product) {
		delete(product);	
	}

	public void updateProduct(Product product) {
		update(product);
	}

	public Product getProduct(Long idProduct) {
		return getByKey(idProduct); 
	}

	public List<Product> getProducts() {
		return getAll();
	}
}
