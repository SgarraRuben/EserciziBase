package objectmethod2;

public class Article {
	private Integer id;
	private String code;
	private String description;
	private int quantity;
	public Article(Integer id, String code, String description, int quantity) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", codice=" + code + ", descrizione=" + description + ", quantita=" + quantity + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



}





