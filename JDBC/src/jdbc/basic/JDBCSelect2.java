package jdbc.basic;

import java.sql.*;
import java.util.Scanner;

public class JDBCSelect2 {

	public static void main(String[] args) {
		
		/*
		 * 회원 ID를 입력받아서 해당 ID의 회원정보를 모두 출력하는 JDBC코드를 작성
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("조회ID>");
		String id1 = scan.next();
		
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";
		
		String sql = "select * from member01 where id = ?"; //?=전달할 값
		//String sql = "select * from member01 where id ='" +id1+"'";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id1); //?에 id1을 넣겠습니다
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) { //다음 행이 있다는 것은 조회 결과가 있다는 뜻
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				
				System.out.println("아이디 : " + id);
				System.out.println("비밀번호 : " + pw);
				System.out.println("이름 : " + name);
				System.out.println("이메일 : " + email);
				System.out.println("주소 : " + address);
				
			} else { //조회한 아이디가 없는 경우
				System.out.println(id1 + "는 없는 ID입니다");
			}
			
			
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
