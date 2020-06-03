package quiz31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuiz03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>();
//		boolean b = false;

		while(true) {

			System.out.println("1.등록 | 2.회원정보확인 | 3.회원정보검색 | 4.회원정보삭제 | 5.종료");
			System.out.print("메뉴를 입력> ");
			int menu = scan.nextInt();

			if(menu == 1) {
				//스캐너로 이름, 나이를 입력받고 User에 저장, list에 추가
				System.out.print("이름을 입력하세요 > ");
				String name = scan.next();
				System.out.print("나이를 입력하세요 > ");
				int age = scan.nextInt();
				User u = new User(name, age);
				list.add(u);
			} else if(menu == 2) {
				//list에 길이만큼 회전하면서 User객체의 이름, 나이를 순서대로 출력
				for(int i=0;i<list.size();i++) {
					System.out.println("이름: " + list.get(i).getName() + ", 나이: " + list.get(i).getAge() );
				}
			} else if(menu == 3) {
				//찾을 이름을 입력받습니다 (이름이 있다면, 이름과 나이를 출력)
				//찾는 이름이 없다면 "~~님은 목록에 없습니다"
				System.out.print("검색할 이름을 입력하세요> ");
				String sname = scan.next();
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(sname)) {					
						System.out.println("이름: " + list.get(i).getName() + ", 나이: " + list.get(i).getAge());
						//b=true;
						break;
					}
					if(i==list.size()-1) {
						System.out.println(sname + "님은 목록에 없습니다");
					}
//					if(b=false) {
//						System.out.println(sname + "님은 목록에 없습니다");
//					}
				}
			} else if(menu == 4) {
				//삭제할 이름을 입력받습니다 (입력받은 이름과 동일하다면 User객체를 삭제)
				System.out.print("삭제할 이름을 입력하세요> ");
				String dname = scan.next();
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(dname)) {
						list.remove(i);
						System.out.println(dname + "님은 목록에서 삭제되었습니다");
					}
				}
			} else if(menu == 5) {
				System.out.println("종료합니다");
				System.exit(0); //종료
			} else {
				System.out.println("다시 입력하세요");
			}


		}

	}
}
