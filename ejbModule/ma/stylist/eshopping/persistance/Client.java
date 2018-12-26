package ma.stylist.eshopping.persistance;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.medistock.app.beans.Request;

@Entity
@Table(name="CLIENTS")
public class Client {

	@Id
	@Column(name="client_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idClient;

	@Column(name="address")
	private String address;

	@Column(name="name")
	private String name;

	@Column(name="username")
	private String username;

	@Column(name="password")
	private String password;

	@Column(name="picture")
	private String picture;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch=FetchType.EAGER )
	@JoinTable(name = "client_purchase", 
			   joinColumns = { @JoinColumn(name = "client_id") }, 
			   inverseJoinColumns = { @JoinColumn(name = "purchase_id") })
	private Set<Purchase> purchases=new HashSet<Purchase>();

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Set<Purchase> getPurchases() {
		return purchases;
	}

	public void setPurchases(Set<Purchase> purchases) {
		this.purchases = purchases;
	}
	

}
