package dto;

public class CartDto {
	private int cart_id;
    private String user_id;
    private int item_id;
    private int amount;
    private int bil_id;
    
    //생성자
    public CartDto() {}

	public CartDto(int cart_id, String user_id, int item_id, int amount, int bil_id) {
		super();
		this.cart_id = cart_id;
		this.user_id = user_id;
		this.item_id = item_id;
		this.amount = amount;
		this.bil_id = bil_id;
	}

	//Get, Set
	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getBil_id() {
		return bil_id;
	}

	public void setBil_id(int bil_id) {
		this.bil_id = bil_id;
	}
	
	
}
