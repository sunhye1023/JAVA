package quiz34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MenuManager {

	public static void main(String[] args) {

		//map을 이용 key:메뉴이름, value:가격

		Scanner scan = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<>(); 
		
		
		while(true) {

			System.out.println("=====음식 메뉴 관리=====");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료

			System.out.print("메뉴 입력> ");
			int menu = scan.nextInt();

			
			switch (menu) {
			case 1:
				System.out.print("신규 메뉴 등록> ");
				String food = scan.next();
				System.out.print("신규 메뉴 가격> ");
				int price = scan.nextInt();
				if(map.containsKey(food)) {
					System.out.println("메뉴를 등록할 수 없습니다");
				} else {
					map.put(food, price);					
				}
				break;
			case 2:
//				Set<Entry<String, Integer>> entry = map.entrySet();
//				for(Entry<String, Integer> s : entry) {
//					System.out.println(s.getKey() + s.getValue());
//				}
				
				Set<Entry<String, Integer>> set = map.entrySet();
				Iterator<Entry<String, Integer>> iter = set.iterator();
				while(iter.hasNext()) {
					String key = iter.next().getKey();
					System.out.println(key + map.get(key));
				}
				break;
			case 3:
				System.out.print("수정할 메뉴> ");
				String f = scan.next();
				if(map.containsKey(f)) {
					System.out.print("가격 수정> ");
					int p = scan.nextInt();			
					map.put(f, p);
				} else {
					System.out.println("메뉴가 없습니다");
				}
				break;
			case 4:
				System.out.print("삭제할 메뉴> ");
				String d = scan.next();
				if(map.containsKey(d)) {
					map.remove(d);
				}
				break;
			case 5:
				System.out.println("프로그램 종료");
				System.exit(0);
			default:
				System.out.println("다시 입력해주세요");
				break;
			}

		}

	}
}
