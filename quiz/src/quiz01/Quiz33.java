package quiz01;

import java.util.Scanner;

public class Quiz33 {

	public static void main(String[] args) {

		/*
		 * up down 게임
		 * 
		 * 1~100까지의 임의 숫자를 생성합니다
		 * 스캐너를 통해서 값을 입력받습니다
		 * 랜덤 수가 입력받은 값보다 작으면 "더 작은 수를 입력하세요"
		 * 랜덤 수가 입력받은 값보다 크면 "더 큰 수를 입력하세요"
		 * 
		 * 정답이면 시도횟수 : x회를 출력하고 종료
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()*100)+1;

		int count = 0;
		while(true) {
			System.out.print("b값 > ");
			int b = sc.nextInt();
			count++;
			if(a==b) {
				System.out.println("정답입니다");
				break;
			} else if(a<b) {
				System.out.println("더 작은 수를 입력하세요");
			} else {
				System.out.println("더 큰 수를 입력하세요");
			}

		}
		System.out.println("정답시도횟수 : " + count);

	}
}
