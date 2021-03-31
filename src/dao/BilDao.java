package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import dto.OrderDto;
import webPortfolio.DBConnection;

public class BilDao {
	
	public static ArrayList<OrderDto> list(){
		
		ArrayList<OrderDto> list = new ArrayList<OrderDto>();
		
		Connection conn = null;	// 데이터 접근을 위한 객체
		Statement stmt = null;	// 쿼리문 실행을 위한 객체
		//PreparedStatement pstmt = null; // 매개변수 입력을 고려한 state 클래스
		ResultSet rs = null;	// 데이터를 가져와 결과값을 얻기 위한 객체
				
		try 
		{
			conn = DBConnection.getConnection();	// DB커넥션 객체
	        stmt = conn.createStatement();			// 쿼리문 객체 가져오기
			
	        String query = "select b.bil_id, b.order_date, b.user_id, i.item_nm, b.order_state "
	        		+ "from tb_bil b, tb_cart c, tb_item i "
	        		+ "where b.bil_id = c.bil_id and c.item_id = i.item_id"; //
	        rs = stmt.executeQuery(query);			// 쿼리문 실행
			
	        System.out.println("while 전");
			while( rs.next() ) 
			{
				System.out.println("while 후");
				
	        	int bil_id = rs.getInt("bil_id");
	            Date order_date = rs.getTimestamp("order_date");
	            String user_id = rs.getString("user_id");
	            String item_nm = rs.getString("item_nm");
	            
	            //String order_state = rs.getString("order_state");
	            String order_state = null;
	            
	            if(rs.getString("order_state").equals("1"))
	            {
	            	order_state = "결제중";
	            }
	            else if(rs.getString("order_state").equals("2"))
	            {
	            	order_state = "결제완료";
	            }
	            else if(rs.getString("order_state").equals("3"))
	            {
	            	order_state = "배송중";
	            }
	            
	            
	            // 디버깅용
	            System.out.println("bil_id :" + bil_id);
	            System.out.println("order_date :" + order_date);
	            System.out.println("user_id :" + user_id);
	            System.out.println("item_nm :" + item_nm);
	            System.out.println("order_state :" + order_state);
	            
	            OrderDto dto = new OrderDto(bil_id, order_date, user_id, item_nm, order_state);
	            list.add(dto);
	        }
			
		}catch(Exception e) 
		{
			System.out.println("orderDto 에러");
		}
		return list;
	}

}
