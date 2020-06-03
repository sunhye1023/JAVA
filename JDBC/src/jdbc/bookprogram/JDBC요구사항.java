package jdbc.bookprogram;


public class JDBC요구사항 {

	public static void main(String[] args) {
		
		/*
		 * 회원관리 프로그램, 도서관리, 음악관리, 데이터관리 등등 하나의 주제를 선택해서
		 * JDBC프로그램을 작성합니다.
		 * 
		 * 단, 테이블은 5개 이상 관계형 데이터베이스 설계
		 * 인터페이스를 반드시 사용합니다.
		 * ArrayList, Map중 하나이상을 반드시 사용합니다
		 * 메서드는 8개 이상, 짝궁과 협업
		 * 
		 * --자유주제--
		 */
		
		
		
		//1. sql join
		//2. sql 스칼라쿼리
		//3. 생성자
		
		
		InterMember member = new Member();
		
		//회원테이블
		//member.minsert();
		//member.minfo();
		//member.mupdate();
		//member.mdelete();
		
		InterBook book = new Book();
		
		//도서테이블
		//book.binsert();
		//book.binfo();
		//book.bupdate();
		//book.budelete();
		
		//member.lendapplication();
		//member.lendinfo();
		
		//관리자테이블
		member.managerinsert();
		
		
	}
}
