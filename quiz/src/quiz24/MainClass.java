package quiz24;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		IBag bag = new Bag();

		while(true) {
			System.out.println("[ 1.추가 2.출력 3.검색 4.삭제 ]");
			System.out.print("메뉴선택 > ");
			String menu = sc.next();
			
			switch (menu) {
			case "1":
				System.out.print("메뉴추가> ");
				String item = sc.next();
				bag.insert(item);
				break;
			case "2":
				bag.print();
				break;
			case "3":
				System.out.println("찾을 아이템");
				String find = sc.next();
				int index = bag.search(find);
				System.out.println(index);
				break;
			case "4":
				System.out.println("삭제할 아이템");
				String del = sc.next();
				boolean bool = bag.delete(del);
				System.out.println(bool);
				break;
			default:
				break;
			}
			
		}
		
		
		
	}
}
