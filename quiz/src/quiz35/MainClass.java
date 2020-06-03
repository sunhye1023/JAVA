package quiz35;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * 1. List, Set, Map을 이용해서 간단한 관리 프로그램을 정합니다
		 *    (도서관리, 회원관리, 예약관리, 물품관리 등 ...)
		 * 2. 인터페이스를 반드시 하나 이상 사용합니다
		 * 3. 기능은 3개 이상 생성합니다
		 * 4. 클래스를 사용하면됩니다 
		 */

		Scanner scan = new Scanner(System.in);
		
		Set<Person> set = new HashSet<>();
		Person p = new Person();
		
		while(true) {
			System.out.println("[1.등록  2.회원정보 확인  3.회원정보 검색  4.비밀번호 찾기  5.종료]");
			System.out.print("메뉴를 입력하세요> ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.println("===== 회원가입 =====");
				System.out.print("회원아이디 > ");
				String perId = scan.next();
				System.out.print("비밀번호 > ");
				String perPw = scan.next();
				System.out.print("이름 > ");
				String name = scan.next();
				System.out.print("이메일 > ");
				String email = scan.next();
				
				Person person = new Person(perId, perPw, name, email);
				person.info();
				
				
				break;
			case 2:
				System.out.println("===== 회원 정보 =====");
				
				break;
			case 3:
				System.out.println("회원정보를 검색합니다");
				System.out.print("검색할 회원이름을 입력하세요> ");
				String sname = scan.next();
				if(p.getName().equals(sname)) {
					System.out.println();
				} else {
					System.out.println("해당 회원이 없습니다");
				}
				break;
			case 4:
				System.out.println("비밀번호를 찾습니다");
				
				break;
			case 5:
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				break;
			default:
				break;
			}

		}


	}
}
