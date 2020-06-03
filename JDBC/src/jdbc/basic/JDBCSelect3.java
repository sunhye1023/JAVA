package jdbc.basic;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.command.Board01;

public class JDBCSelect3 {

	public static void main(String[] args) {
		
		ArrayList<Board01> list = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 시작 데이터 : ");
		String start = scan.next();
		System.out.print("조회할 끝 데이터 : ");
		String end = scan.next();
		
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";
		
		String sql = "select  *       \r\n" + 
						"from(select  rownum as rnum,\r\n" + 
						"        num,\r\n" + 
						"        id,\r\n" + 
						"        title,\r\n" + 
						"        content\r\n" + 
						"    from(select num,\r\n" + 
						"            id,\r\n" + 
						"            title,\r\n" + 
						"            content\r\n" + 
						"         from board01\r\n" + 
						"         order by num desc)\r\n" + 
						"     )\r\n" + 
						"where rnum between ? and ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			/*
			 * 조회한 데이터를 출력, Board01클래스를 생성해서 순서대로 저장하는 JDBC코드를 작성
			 * ArrayList는 순서대로 저장할 때 사용한다
			 */
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(start));
			pstmt.setInt(2, Integer.parseInt(end));
			//pstmt.setString(1, start);
			//pstmt.setString(2, end);
			//데이터베이스는 문자와 숫자가 자동형변환한다(int, String 둘 다 사용해도 된다)
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int rnum = rs.getInt("rnum");
				int num = rs.getInt("num");
				String id = rs.getString("id");
				String title = rs.getString("title");
				String content = rs.getString("content");
				
				System.out.println(rnum+" "+num+ " "+id+" "+title+" "+content);
				
				Board01 board = new Board01(num, id, title, content);
				list.add(board);
				
			}
			
			System.out.println("list크기:" + list.size());
			System.out.println(list.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				
			}
		
		}

		}
}
