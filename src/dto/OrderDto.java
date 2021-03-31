package dto;

import java.util.Date;

public class OrderDto {
    private int 	bil_id;
    private Date 	order_date;
    private String 	user_id;
    private String 	item_nm;
    private String 	order_state;    
    
    //생성자
    public OrderDto() {}
    
	public OrderDto(int bil_id, Date order_date, String user_id, String item_nm, String order_state) {
		super();
		this.bil_id = bil_id;
		this.order_date = order_date;
		this.user_id = user_id;
		this.item_nm = item_nm;
		this.order_state = order_state;
	}

    //G,S
	public int getBil_id() {
		return bil_id;
	}

	public void setBil_id(int bil_id) {
		this.bil_id = bil_id;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getItem_nm() {
		return item_nm;
	}

	public void setItem_nm(String item_nm) {
		this.item_nm = item_nm;
	}

	public String getOrder_state() {
		return order_state;
	}

	public void setOrder_state(String order_state) {
		this.order_state = order_state;
	}
    

}
