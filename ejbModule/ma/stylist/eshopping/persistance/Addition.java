package ma.stylist.eshopping.persistance;

@Entity
@Table(name="ADDITIONS")
public class Addition {
	

	@Id
	@Column(name="purchase_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAddition;

	@Column(name="picture")
	private String picture;

	@Column(name="text")
	private String text;

	@ManyToOne
	private Font font;
	
	public Long getIdAddition() {
		return idAddition;
	}

	public void setIdAddition(Long idAddition) {
		this.idAddition = idAddition;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}
	
	
}
