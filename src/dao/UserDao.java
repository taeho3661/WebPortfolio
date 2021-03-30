package dao;

import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import dto.UserDto;
import webPortfolio.DBConnection;


public class UserDao {
	
	public static ArrayList<UserDto> list(){
		
		ArrayList<UserDto> list = new ArrayList<UserDto>();
		
		Connection conn = null;	// 데이터 접근을 위한 객체
		Statement stmt = null;	// 쿼리문 실행을 위한 객체
		//PreparedStatement pstmt = null; // 매개변수 입력을 고려한 state 클래스
		ResultSet rs = null;	// 데이터를 가져와 결과값을 얻기 위한 객체
				
		try 
		{
			conn = DBConnection.getConnection();	// DB커넥션 객체
	        stmt = conn.createStatement();			// 쿼리문 객체 가져오기
			
	        String query = "select * from tb_user order by user_no desc"; // 정렬시켜놓음	        
			rs = stmt.executeQuery(query);			// 쿼리문 실행
						
			while( rs.next() ) 
			{				
	        	int user_no = rs.getInt("user_no");
	            String user_id = rs.getString("user_id");
	            String user_pw = rs.getString("user_pw");
	            String user_nm = rs.getString("user_nm");
	            int post = rs.getInt("post");
	            String adr1 = rs.getString("adr1");
	            String adr2 = rs.getString("adr2");
	            String phone1 = rs.getString("phone1");
	            int phone2 = rs.getInt("phone2");
	            int phone3 = rs.getInt("phone3");
	            String email = rs.getString("email");
	            int email_yn = rs.getInt("email_yn");
	            int score = rs.getInt("score");
	            int rank = rs.getInt("rank");
	            int login_type = rs.getInt("login_type");
	            int del_yn = rs.getInt("del_yn");
	            
	            // 디버깅용
	            System.out.println("user_id :" + user_id);
	            System.out.println("user_pw :" + user_pw);
	            System.out.println("user_nm :" + user_nm);
	            
	            UserDto dto = new UserDto(user_no, user_id, user_pw, user_nm, post, adr1, adr2,
	    			phone1, phone2, phone3, email, email_yn, score, rank, login_type, del_yn);
	            list.add(dto);
	        }
			
		}catch(Exception e) 
		{			
		}
		return list;
	}

//	// (String user_no) 인자로 들어온값으로 검색해서 보여주는기능
//	public static UserDto view(String user_no)
//	{
//		UserDto dto = null;
//		
//		Connection conn = null;
//		PreparedStatement pstmt = null; // 매개변수 입력 편하게 함.
//		ResultSet rs = null;
//		
//		try {
//			conn = DBConnection.getConnection();
//			String query = "select * from tb_user where user_no=?";
//			pstmt = conn.prepareStatement( query );
//			pstmt.setInt(1, Integer.parseInt(user_no)); // 첫번째 인자(물음표)
//			rs = pstmt.executeQuery(); // selete
//	
//			while(rs.next())
//			{
//	        	int user_no_int = rs.getInt("user_no");
//	            String user_id = rs.getString("user_id");
//	            String user_pw = rs.getString("user_pw");
//	            String user_nm = rs.getString("user_nm");
//	            int post = rs.getInt("post");
//	            String adr1 = rs.getString("adr1");
//	            String adr2 = rs.getString("adr2");
//	            int phone1 = rs.getInt("phone1");
//	            int phone2 = rs.getInt("phone2");
//	            int phone3 = rs.getInt("phone3");
//	            String email = rs.getString("email");
//	            int email_yn = rs.getInt("email_yn");
//	            int score = rs.getInt("score");
//	            int rank = rs.getInt("rank");
//	            int login_type = rs.getInt("login_type");
//	            int del_yn = rs.getInt("del_yn");
//	            
//	            dto = new UserDto(user_no_int, user_id, user_pw, user_nm, post, adr1, adr2,
//	    			phone1, phone2, phone3, email, email_yn, score, rank, login_type, del_yn);
//			}
//			
//		} catch (Exception e) {
//		}
//		
//		
//		return dto;		
//	}

}
