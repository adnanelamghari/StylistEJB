package ma.stylist.eshopping.dal.stateless;

import java.util.List;
import javax.ejb.Remote;
import ma.stylist.eshopping.persistance.Product;

@Remote
public interface ProductsDAORemote {

	public void addProduct(Product product);

	public void deleteProduct(Product product);

	public void updateProduct(Product product);

	public Product getProduct(Long idProduct);

	public List<Product> getProducts();
	
}
