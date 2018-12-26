package ma.stylist.eshopping.persistance;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="PURCHASESLINES")
public class PurchaseLine {

	@Id
	@Column(name="purchase_line_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPurchaseLine;

	@Column(name="purchase_date")
	private int quantity;
	   
	@ManyToOne
	private Product product;
	   
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Addition> addtions = new HashSet<Addition>();

	public Long getIdPurchaseLine() {
		return idPurchaseLine;
	}

	public void setIdPurchaseLine(Long idPurchaseLine) {
		this.idPurchaseLine = idPurchaseLine;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Set<Addition> getAddtions() {
		return addtions;
	}

	public void setAddtions(Set<Addition> addtions) {
		this.addtions = addtions;
	}
	
	
}
