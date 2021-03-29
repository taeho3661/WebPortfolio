package dto;

public class UserDto {
	
	private int user_no;
    private String user_id;
    private String user_pw;
    private String user_nm;
    private int post;
    private String adr1 ;
    private String adr2;
    private String phone1;
    private int phone2;
    private int phone3;
    private String email;
    private int email_yn;
    private int score;
    private int rank;
    private int login_type;
    private int del_yn;
    
    //생성자
    public UserDto() {}

	public UserDto(int user_no, String user_id, String user_pw, String user_nm, int post, String adr1, String adr2,
			String phone1, int phone2, int phone3, String email, int email_yn, int score, int rank, int login_type,
			int del_yn) {
		super();
		this.user_no = user_no;
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_nm = user_nm;
		this.post = post;
		this.adr1 = adr1;
		this.adr2 = adr2;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.email = email;
		this.email_yn = email_yn;
		this.score = score;
		this.rank = rank;
		this.login_type = login_type;
		this.del_yn = del_yn;
	}
	
	//Get, Set
	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_nm() {
		return user_nm;
	}

	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
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

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public int getPhone2() {
		return phone2;
	}

	public void setPhone2(int phone2) {
		this.phone2 = phone2;
	}

	public int getPhone3() {
		return phone3;
	}

	public void setPhone3(int phone3) {
		this.phone3 = phone3;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEmail_yn() {
		return email_yn;
	}

	public void setEmail_yn(int email_yn) {
		this.email_yn = email_yn;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getLogin_type() {
		return login_type;
	}

	public void setLogin_type(int login_type) {
		this.login_type = login_type;
	}

	public int getDel_yn() {
		return del_yn;
	}

	public void setDel_yn(int del_yn) {
		this.del_yn = del_yn;
	}
    
    

}
