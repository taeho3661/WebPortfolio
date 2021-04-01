package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import dto.AdminQnaDto;
import webPortfolio.DBConnection;

public class BoardDao {
	
	public static ArrayList<AdminQnaDto> list(){
		
		ArrayList<AdminQnaDto> list = new ArrayList<AdminQnaDto>();
		
		Connection conn = null;	// 데이터 접근을 위한 객체
		Statement stmt = null;	// 쿼리문 실행을 위한 객체
		//PreparedStatement pstmt = null; // 매개변수 입력을 고려한 state 클래스
		ResultSet rs = null;	// 데이터를 가져와 결과값을 얻기 위한 객체
				//문의제목 문의자 날짜
		try 
		{
			conn = DBConnection.getConnection();	// DB커넥션 객체
	        stmt = conn.createStatement();			// 쿼리문 객체 가져오기
			
	        String query = "select i.item_nm, q.board_nm, q.writer, q.write_date, q.board_no "
	        		+ "from tb_item i, tb_board q "
	        		+ "where i.item_id = q.item_id"; //
			rs = stmt.executeQuery(query);			// 쿼리문 실행
			
			while( rs.next() ) 
			{				
				String item_nm = rs.getString("item_nm");
				String board_nm = rs.getString("board_nm");
				String writer = rs.getString("writer");
	            Date write_date = rs.getTimestamp("write_date");
	            int board_no = rs.getInt("board_no");
	            
	            // 디버깅용
	            System.out.println("item_nm :" + item_nm);
	            System.out.println("board_nm :" + board_nm);
	            System.out.println("writer :" + writer);
	            System.out.println("write_date :" + write_date);
	            System.out.println("board_no :" + board_no);
	            
	            AdminQnaDto dto = new AdminQnaDto(item_nm, board_nm, writer, write_date, board_no);
	            list.add(dto);
	        }
			
		}catch(Exception e) 
		{
		}
		return list;
	}

}
