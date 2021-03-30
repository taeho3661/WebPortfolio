package dto;

public class ItemDto {
	private int item_id;
    private String item_nm;
    private int price;
    private int stock;
    private String item_img;
    private int de_fee ;
    private String con_img;
    
    //생성자
    public ItemDto() {}

	public ItemDto(int item_id, String item_nm, int price, int stock, String item_img, int de_fee, String con_img) {
		super();
		this.item_id = item_id;
		this.item_nm = item_nm;
		this.price = price;
		this.stock = stock;
		this.item_img = item_img;
		this.de_fee = de_fee;
		this.con_img = con_img;
	}
	
	//Get, Set
	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_nm() {
		return item_nm;
	}

	public void setItem_nm(String item_nm) {
		this.item_nm = item_nm;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getItem_img() {
		return item_img;
	}

	public void setItem_img(String item_img) {
		this.item_img = item_img;
	}

	public int getDe_fee() {
		return de_fee;
	}

	public void setDe_fee(int de_fee) {
		this.de_fee = de_fee;
	}

	public String getCon_img() {
		return con_img;
	}

	public void setCon_img(String con_img) {
		this.con_img = con_img;
	}
	
}
