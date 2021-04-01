package dto;

import java.util.Date;

public class AdminQnaDto {
    private String 	item_nm;
    private String 	board_nm;
    private String 	writer;
	private Date 	write_date;
	private int		board_no;
	
	
	//생성자
	public AdminQnaDto() {
		
	}
	
	public AdminQnaDto(String item_nm, String board_nm, String writer, Date write_date, int board_no) {
		super();
		this.item_nm = item_nm;
		this.board_nm = board_nm;
		this.writer = writer;
		this.write_date = write_date;
		this.board_no = board_no;
	}

	
	//G,S	
	public String getItem_nm() {
		return item_nm;
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	public void setItem_nm(String item_nm) {
		this.item_nm = item_nm;
	}

	public String getBoard_nm() {
		return board_nm;
	}

	public void setBoard_nm(String board_nm) {
		this.board_nm = board_nm;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getWrite_date() {
		return write_date;
	}

	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	
	
	

}
