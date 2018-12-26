package ma.stylist.eshopping.dal.stateless;

import java.util.List;
import javax.ejb.Local;
import ma.stylist.eshopping.persistance.Product;

@Local
public interface ProductsDAOLocal {

	public void addProduct(Product product);

	public void deleteProduct(Product product);

	public void updateProduct(Product product);

	public Product getProduct(Long idProduct);

	public List<Product> getProducts();
}
