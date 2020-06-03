package jdbc.bookprogram;


import java.sql.*;
import java.util.Scanner;

public class Book implements InterBook {
	
	Scanner scan = new Scanner(System.in);
	
	public void binsert() {
		System.out.println("===========도서등록===========");
		//System.out.print("도서번호를 입력하세요> ");
		//int no = scan.nextInt();
		System.out.print("도서유형을 입력하세요 > ");
		String type = scan.next();
		System.out.print("도서위치를 입력하세요 > ");
		String position = scan.next();
		System.out.print("도서이름을 입력하세요 > ");
		String name = scan.next();
		System.out.print("도서저자를 입력하세요 > ");
		String writer = scan.next();
		System.out.print("도서출판사를 입력하세요 > ");
		String publisher = scan.next();
		System.out.print("도서상태를 입력하세요 > ");
		String state = scan.next();
		System.out.print("도서수량을 입력하세요 > ");
		int count = scan.nextInt();
		
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";
		
		String sql = "insert into book values(book_seq.nextval, ?,?,?,?,?,?,?)";
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, type);
			pstmt.setString(2, position);
			pstmt.setString(3, name);
			pstmt.setString(4, writer);
			pstmt.setString(5, publisher);
			pstmt.setString(6, state);
			pstmt.setInt(7, count);

			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("DB도서정보 입력 성공");
			} else {
				System.out.println("DB도서정보 입력 실패");
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

	public void binfo() {
		System.out.print("검색할 도서를 입력하세요> ");
		String sbook = scan.next();
		
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";
		
		String sql = "select * from book where book_name = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sbook);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String no = rs.getString("BOOK_NO");
				String type = rs.getString("BOOK_TYPE");
				String position = rs.getString("BOOK_POSITION");
				String name = rs.getString("BOOK_NAME");
				String writer = rs.getString("BOOK_WRITER");
				String publisher = rs.getString("BOOK_PUBLISHER");
				String state = rs.getString("BOOK_STATE");
				String count = rs.getString("BOOK_COUNT");
				
				System.out.println("도서번호 : " + no);
				System.out.println("도서유형 : " + type);
				System.out.println("도서위치 : " + position);
				System.out.println("도서이름 : " + name);
				System.out.println("도서저자 : " + writer);
				System.out.println("도서출판사 : " + publisher);
				System.out.println("도서상태 : " + state);
				System.out.println("도서수량 : " + count);
				
			} else {
				System.out.println(sbook + "이 존재하지 않습니다");
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

	public void bupdate() {
		System.out.print("정보를 수정할 도서이름을 입력하세요 > ");
		String mbook = scan.next();
		
		System.out.print("수정할 도서위치를 입력하세요 > ");
		String position = scan.next();
		System.out.print("수정할 도서상태를 입력하세요 > ");
		String state = scan.next();
		System.out.print("수정할 도서수량을 입력하세요 > ");
		int count = scan.nextInt();
		
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";
		
		String sql = "update book set book_position = ?, book_state = ?, book_count = ? where book_name = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, position);
			pstmt.setString(2, state);
			pstmt.setInt(3, count);
			pstmt.setString(4, mbook);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println(mbook + "의 도서정보가 수정되었습니다");
			} else {
				System.out.println(mbook + "이 존재하지 않습니다");
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

	public void budelete() {
		System.out.print("삭제할 도서이름을 입력하세요 > ");
		String dbook = scan.next();
		
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";
		
		String sql = "delete from book where book_name = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,dbook);
			
			int result = pstmt.executeUpdate();
			
			if(result ==1) {
				System.out.println(dbook + "도서정보가 삭제되었습니다");
			} else {
				System.out.println(dbook + "도서정보가 존재하지 않습니다");
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
