package jdbc.basic;

import java.sql.*;
import java.util.Scanner;

public class JDBCDelete {

	public static void main(String[] args) {
		
		//회원 ID를 받아서 해당 ID를 삭제하는 JDBC코드를 작성
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 ID를 입력하세요 > ");
		String id = scan.next();
		
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";
		
		String sql = "delete from member01 where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("회원이 탈퇴했습니다");
			} else {
				System.out.println(id + "를 확인하세요");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				
			}
		}
		
		
	}
}
