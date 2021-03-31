package dto;

import java.util.Date;

public class BilDto {
	private int 	bil_id;
    private String 	user_id;
    private String 	order_state;
    private String 	receive_nm;
    private int 	receive_tel;
	private int 	post;
    private String 	adr1;
    private String 	adr2;
    private String 	ship_memo;
    private int 	total_price;
	private Date 	order_date;
	
	
    //생성자
    public BilDto() {}
    
	public BilDto(int bil_id, String user_id, String order_state, String receive_nm, int receive_tel, int post,
			String adr1, String adr2, String ship_memo, int total_price, Date order_date) {
		super();
		this.bil_id = bil_id;
		this.user_id = user_id;
		this.order_state = order_state;
		this.receive_nm = receive_nm;
		this.receive_tel = receive_tel;
		this.post = post;
		this.adr1 = adr1;
		this.adr2 = adr2;
		this.ship_memo = ship_memo;
		this.total_price = total_price;
		this.order_date = order_date;
	}


	//Get, Set
	public int getBil_id() {
		return bil_id;
	}

	public void setBil_id(int bil_id) {
		this.bil_id = bil_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getOrder_state() {
		return order_state;
	}

	public void setOrder_state(String order_state) {
		this.order_state = order_state;
	}

	public String getReceive_nm() {
		return receive_nm;
	}

	public void setReceive_nm(String receive_nm) {
		this.receive_nm = receive_nm;
	}

	public int getReceive_tel() {
		return receive_tel;
	}

	public void setReceive_tel(int receive_tel) {
		this.receive_tel = receive_tel;
	}

	public int getPost() {
		return post;
	}

	public void setPost(int post) {
		this.post = post;
	}

	public String getAdr1() {
		return adr1;
	}

	public void setAdr1(String adr1) {
		this.adr1 = adr1;
	}

	public String getAdr2() {
		return adr2;
	}

	public void setAdr2(String adr2) {
		this.adr2 = adr2;
	}

	public String getShip_memo() {
		return ship_memo;
	}

	public void setShip_memo(String ship_memo) {
		this.ship_memo = ship_memo;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}	
	
}
