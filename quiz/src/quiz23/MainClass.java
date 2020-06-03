package quiz23;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * 인터페이스형으로 선언하고 무한반복문 안에서
		 * 음악을 추가하는 기능,
		 * 재생기능,
		 * 종료기능
		 */

		SongList sl = new MelonMusic();


		end:while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("[0.음악 종료, 1.음악 추가, 2.음악 재생]");
			System.out.print("> ");
			int num = sc.nextInt();

			switch(num) {
			case 0:
				System.out.println("음악을 종료합니다");
				break end;
			case 1:
				System.out.println("음악을 추가합니다");				
				System.out.print("> ");
				String song = sc.next();
				sl.insertList(song);
				System.out.println("음악이 추가되었습니다");
				break;
			case 2:
				System.out.println("음악을 재생합니다");
				sl.playList();
				break;
			}
		}

	}
}
