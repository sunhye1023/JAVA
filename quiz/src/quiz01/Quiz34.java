package quiz01;

import java.util.Scanner;

public class Quiz34 {
	//quiz16
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 투입해주세요 > ");
		int money = sc.nextInt();

		end : while(true) {
			System.out.println("남은 금액 : " + money + "원");
			System.out.println("[1]뎀이소다 : 400원, [2]밀키스 : 500원, [3]코카콜라 : 600원, [4] : 잔돈받기");
			System.out.print("음료수 선택 > ");
			int menu = sc.nextInt();

			switch(menu) {
			case 1 :
				if(money>=400) {
					System.out.println("뎀이소다를 받았습니다");
					money -= 400;
				} else {
					System.out.println("금액이 부족합니다");
				}
				break;
			case 2 :
				if(money>=500) {
					System.out.println("밀키스를 받았습니다");
					money -= 500;
				} else {
					System.out.println("금액이 부족합니다");
				}
				break;
			case 3 :
				if(money>=600) {
					System.out.println("코카콜라를 받았습니다");
					money -= 600;
				} else {
					System.out.println("금액이 부족합니다");
				}
				break;
			default :
				System.out.println("남은금액 " + money +"원을 반환합니다");
				break end;
			}

		}

	}
}
