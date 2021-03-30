package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import dto.ItemDto;
import webPortfolio.DBConnection;

public class ItemDao {
	
	public static ArrayList<ItemDto> list(){
		
		ArrayList<ItemDto> list = new ArrayList<ItemDto>();
		
		Connection conn = null;	// 데이터 접근을 위한 객체
		Statement stmt = null;	// 쿼리문 실행을 위한 객체
		//PreparedStatement pstmt = null; // 매개변수 입력을 고려한 state 클래스
		ResultSet rs = null;	// 데이터를 가져와 결과값을 얻기 위한 객체
				
		try 
		{
			conn = DBConnection.getConnection();	// DB커넥션 객체
	        stmt = conn.createStatement();			// 쿼리문 객체 가져오기
			
	        String query = "select * from tb_item"; // 정렬시켜놓음	        
			rs = stmt.executeQuery(query);			// 쿼리문 실행
			
			while( rs.next() ) 
			{				
	        	int item_id = rs.getInt("item_id");
	            String item_nm = rs.getString("item_nm");
	            int price = rs.getInt("price");
	            int stock = rs.getInt("stock");
	            String item_img = rs.getString("item_img");
	            int de_fee = rs.getInt("de_fee");
	            String con_img = rs.getString("con_img");
	            
	            // 디버깅용
	            System.out.println("item_id :" + item_id);
	            System.out.println("user_pw :" + item_nm);
	            System.out.println("price :" + price);
	            System.out.println("stock :" + stock);
	            System.out.println("item_img :" + item_img);
	            System.out.println("de_fee :" + de_fee);
	            System.out.println("con_img :" + con_img);
	            
	            ItemDto dto = new ItemDto(item_id, item_nm, price, stock, item_img, de_fee, con_img);
	            list.add(dto);
	        }
			
		}catch(Exception e) 
		{			
		}
		return list;
	}
	
	public static void add(String item_id, int price, int stock, String con_img)
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBConnection.getConnection();
			String query = "INSERT INTO tb_item(item_id, item_nm, price, stock, item_img, de_fee, con_img) "
					+ "values (tb_item_seq.nextval, ?, ?, ?, null, null, ?)";
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, item_id);
			pstmt.setInt(2, price);
			pstmt.setInt(3, stock);
			pstmt.setString(4, con_img);
			
			int result = pstmt.executeUpdate(); // insert, update, delete
			System.out.println("insert result :" + result); // 0 결과없음, 1이상 수정된 열갯수
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
