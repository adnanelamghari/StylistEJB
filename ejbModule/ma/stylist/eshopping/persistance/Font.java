package ma.stylist.eshopping.persistance;

@Entity
@Table(name="FONTS")
public class Font {

	@Id
	@Column(name="font_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idFont;

	@Column(name="prview")
	private String preview;

	@Column(name="file")
	private String file;

	public Long getIdFont() {
		return idFont;
	}

	public void setIdFont(Long idFont) {
		this.idFont = idFont;
	}

	public String getPreview() {
		return preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}
	
	
}
