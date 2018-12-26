package ma.stylist.eshopping.persistance;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="PURCHASES")
public class Purchase {

	@Id
	@Column(name="purchase_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPurchase;

	@Column(name="address")
	private String adress;

	@Column(name="purchase_date")
	private String datePurchase;

	@Column(name="delevred")
	private boolean delevred;

	@Column(name="purchase_id")
	private boolean revieved;
	   
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<PurchaseLine> purchaseLines = new HashSet<PurchaseLine>();

	public Long getIdPurchase() {
		return idPurchase;
	}

	public void setIdPurchase(Long idPurchase) {
		this.idPurchase = idPurchase;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getDatePurchase() {
		return datePurchase;
	}

	public void setDatePurchase(String datePurchase) {
		this.datePurchase = datePurchase;
	}

	public boolean isDelevred() {
		return delevred;
	}

	public void setDelevred(boolean delevred) {
		this.delevred = delevred;
	}

	public boolean isRevieved() {
		return revieved;
	}

	public void setRevieved(boolean revieved) {
		this.revieved = revieved;
	}

	public Set<PurchaseLine> getPurchaseLines() {
		return purchaseLines;
	}

	public void setPurchaseLines(Set<PurchaseLine> purchaseLines) {
		this.purchaseLines = purchaseLines;
	}
	
	
}
