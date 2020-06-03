package jdbc.bookprogram;


import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Member implements InterMember {

	Scanner scan = new Scanner(System.in);

	public void minsert() {
		System.out.println("===========회원등록===========");
		System.out.print("아이디를 입력하세요> ");
		String id = scan.next();
		System.out.print("비밀번호를 입력하세요 > ");
		String pw = scan.next();
		System.out.print("이름을 입력하세요 > ");
		String name = scan.next();
		System.out.print("나이를 입력하세요 > ");
		int age = scan.nextInt();
		System.out.print("이메일을 입력하세요 > ");
		String email = scan.next();
		System.out.print("연락처를 입력하세요 > ");
		String phone = scan.next();
		System.out.print("주소를 입력하세요 > ");
		String address = scan.next();
		System.out.print("등급을 입력하세요 > ");
		String grade = scan.next();

		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";

		String sql = "insert into members values (?, ?, ?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setInt(4, age);
			pstmt.setString(5, email);
			pstmt.setString(6, phone);
			pstmt.setString(7, address);
			pstmt.setString(8, grade);

			int result = pstmt.executeUpdate();

			if(result == 1) {
				System.out.println("DB회원정보 입력 성공");
			} else {
				System.out.println("DB회원정보 입력 실패");
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

	public void minfo() {
		System.out.print("정보를 조회할 아이디를 입력하세요 > ");
		String sid = scan.next();

		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";

		String sql = "select * from members where member_id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sid);

			rs = pstmt.executeQuery();

			if(rs.next()) {
				String id = rs.getString("MEMBER_ID");
				String pw = rs.getString("MEMBER_PW");
				String name = rs.getString("MEMBER_NAME");
				int age = rs.getInt("MEMBER_AGE");
				String email = rs.getString("MEMBER_EMAIL");
				String phone = rs.getString("MEMBER_PHONE");
				String address = rs.getString("MEMBER_ADDRESS");
				String grade = rs.getString("MANAGER_GRADE");

				System.out.println("아이디 : " + id);
				System.out.println("비밀번호 : " + pw);
				System.out.println("이름 : " + name);
				System.out.println("나이 : " + age);
				System.out.println("이메일 : " + email);
				System.out.println("연락처 : " + phone);
				System.out.println("주소 : " + address);
				System.out.println("등급 : " + grade);

			} else {
				System.out.println(sid + "님의 아이디가 존재하지 않습니다");
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

	public void mupdate() {
		System.out.print("정보를 수정할 회원님의 아이디를 입력하세요 > ");
		String mid = scan.next();

		System.out.print("수정할 이름을 입력하세요 > ");
		String name = scan.next();
		System.out.print("수정할 비밀번호를 입력하세요 > ");
		String pw = scan.next();
		System.out.print("수정할 이메일을 입력하세요 > ");
		String email = scan.next();
		System.out.print("수정할 연락처를 입력하세요 > ");
		String phone = scan.next();
		System.out.print("수정할 주소를 입력하세요 > ");
		String address = scan.next();
		System.out.print("수정할 등급을 입력하세요 > ");
		String grade = scan.next();

		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";

		String sql = "update members set member_name = ?, member_pw = ?, member_email = ?, member_phone = ?, member_address = ? where member_id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pw);
			pstmt.setString(3, email);
			pstmt.setString(4, phone);
			pstmt.setString(5, address);
			pstmt.setString(6, mid);

			int result = pstmt.executeUpdate();

			if(result == 1) {
				System.out.println("회원님의 정보가 수정되었습니다");
			} else {
				System.out.println(mid + "님의 아이디가 존재하지 않습니다");
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

	public void mdelete() {
		System.out.print("삭제할 회원님의 아이디를 입력하세요 > ");
		String did = scan.next();

		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";

		String sql = "delete from members where member_id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,did);

			int result = pstmt.executeUpdate();

			if(result ==1) {
				System.out.println(did + "님이 탈퇴하셨습니다");
			} else {
				System.out.println(did + "님의 아이디가 존재하지 않습니다");
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


	public void lendapplication() {
		System.out.println("===========도서대여신청===========");
		System.out.print("회원아이디를 입력하세요 > ");
		String id = scan.next();
		System.out.print("대여할 도서이름을 입력하세요 > ");
		String book_name = scan.next();
		System.out.print("대여날짜를 입력하세요 > ");
		String lend_date = scan.next();
		System.out.print("대여할 도서의 수량을 입력하세요 > ");
		int lend_count = scan.nextInt();

		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";

		String sql = "insert into book_lend values (?, ?, book_lend_seq.nextval, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, book_name);
			pstmt.setString(3, lend_date);
			pstmt.setInt(4, lend_count);

			int result = pstmt.executeUpdate();

			if(result == 1) {
				System.out.println("도서대여가 신청되었습니다");
			} else {
				System.out.println("도서를 대여할 수 없습니다");
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


	public void lendinfo() {
		ArrayList<BookLA> list = new ArrayList<>();
		MemberVO mv = new MemberVO();

		System.out.print("도서대여 정보를 확인 할 회원의 아이디를 입력하세요 > ");
		String sid = scan.next();

		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";

		String sql = "select  m.member_id,\r\n" + 
				"        member_name,\r\n" + 
				"        member_age,\r\n" + 
				"        book_name, \r\n" + 
				"        book_lend_no, \r\n" + 
				"        book_lend_date,\r\n" + 
				"        book_lend_count\r\n" + 
				"from members m\r\n" + 
				"JOIN book_lend b\r\n" + 
				"ON m.member_id=b.member_id\r\n" + 
				"where m.member_id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sid);

			rs = pstmt.executeQuery();

			while(rs.next()) {

				String id = rs.getString("MEMBER_ID");
				String name = rs.getString("MEMBER_NAME");
				int age = rs.getInt("MEMBER_AGE");

				String book_name = rs.getString("BOOK_NAME");
				int lend_no = rs.getInt("BOOK_LEND_NO");
				String lend_date = rs.getString("BOOK_LEND_DATE");
				int lend_count = rs.getInt("BOOK_LEND_COUNT");
				
				mv.setId(id);
				mv.setName(name);
				mv.setAge(age);

				
				BookLA bv = new BookLA();
				bv.setName(book_name);
				bv.setLend_no(lend_no);
				bv.setLend_date(lend_date);
				bv.setLend_count(lend_count);
				
				list.add(bv);
				
			}
			
			mv.setList2(list);
			System.out.println("아이디 : " + mv.getId());
			System.out.println("이름 : " + mv.getName());
			System.out.println("나이 : " + mv.getAge());
			mv.getList2().forEach((bl)->{
			System.out.println("도서이름 : " + bl.getName());
			System.out.println("도서대여번호 : " + bl.getLend_no());
			System.out.println("도서대여일 : " + bl.getLend_date());
			System.out.println("도서대여수 : " + bl.getLend_count());
			});
			

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


	public void retu() {
		System.out.println("===========도서반납신청===========");
		System.out.print("회원아이디를 입력하세요 > ");
		String id = scan.next();
		System.out.print("반납할 도서이름을 입력하세요 > ");
		String book_name = scan.next();
		System.out.print("반납날짜를 입력하세요 > ");
		String retu_date = scan.next();

		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";

		String sql = "insert into book_lend values (?, book_lend_seq.nextval, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, book_name);
			pstmt.setString(3, retu_date);

			int result = pstmt.executeUpdate();

			if(result == 1) {
				System.out.println("도서가 반납되었습니다");
			} else {
				System.out.println(id + "님의 아이디는 존재하지 않습니다");
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


	public void managerinsert() {
		System.out.println("===========관리자등록===========");
		System.out.print("아이디를 입력하세요> ");
		String id = scan.next();
		System.out.print("이름을 입력하세요 > ");
		String name = scan.next();
		System.out.print("등급을 입력하세요 > ");
		String grade = scan.next();

		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";

		String sql = "insert into manager values (?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, grade);

			int result = pstmt.executeUpdate();

			if(result == 1) {
				System.out.println("관리자정보 입력 성공");
			} else {
				System.out.println("관리자정보 입력 실패");
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


	public void managerinfo() {
		ArrayList<ManagerVO> list1 = new ArrayList<>();
		MemberVO mvo = new MemberVO();

		System.out.print("회원정보를 확인할 회원님의 아이디를 입력하세요 > ");
		String sid = scan.next();

		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";

		String sql = "select member_id,member_name,member_age,\r\n" + 
				"    manager_name,manager_id,ma.manager_grade\r\n" + 
				"from members me\r\n" + 
				"JOIN manager ma\r\n" + 
				"ON me.manager_grade=ma.manager_grade;";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sid);

			rs = pstmt.executeQuery();

			while(rs.next()) {

				String id = rs.getString("MEMBER_ID");
				String name = rs.getString("MEMBER_NAME");
				int age = rs.getInt("MEMBER_AGE");

				String manager_name = rs.getString("MANAGER_NAME");
				String manager_id = rs.getString("MANAGER_ID");
				String manager_grade = rs.getString("MANAGER_GRADE");
				
				mvo.setId(id);
				mvo.setName(name);
				

				
				ManagerVO ma = new ManagerVO();
				ma.setName(manager_name);
				ma.setId(manager_id);
				ma.setGrade(manager_grade);
				
				list1.add(ma);
				
			}
			
			mvo.li
			System.out.println("아이디 : " + mvo.getId());
			System.out.println("이름 : " + mvo.getName());
			System.out.println("나이 : " + mvo.getAge());
			mv.getList2().forEach((bl)->{
			System.out.println("도서이름 : " + bl.getName());
			System.out.println("도서대여번호 : " + bl.getLend_no());
			System.out.println("도서대여일 : " + bl.getLend_date());
			System.out.println("도서대여수 : " + bl.getLend_count());
			});
			

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


	public void managerupdate() {
		System.out.print("정보를 수정할 관리자님의 아이디를 입력하세요 > ");
		String mid = scan.next();

		System.out.print("수정할 등급을 입력하세요 > ");
		String grade = scan.next();

		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";

		String sql = "update manager set manager_grade = ? where manager_id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			pstmt.setString(2, grade);

			int result = pstmt.executeUpdate();

			if(result == 1) {
				System.out.println("관리자님의 정보가 수정되었습니다");
			} else {
				System.out.println(mid + "관리자님의 아이디가 존재하지 않습니다");
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


	public void managerdelete() {
		System.out.print("삭제할 관리자님의 아이디를 입력하세요 > ");
		String did = scan.next();

		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";

		String sql = "delete from manager where manager_id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,did);

			int result = pstmt.executeUpdate();

			if(result ==1) {
				System.out.println(did + "관리자님이 탈퇴하셨습니다");
			} else {
				System.out.println(did + "관리자님의 아이디가 존재하지 않습니다");
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
