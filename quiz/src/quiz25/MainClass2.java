package quiz25;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		int count=0;
		
		while(true) {
			try {
				System.out.print("1과 100사이의 값을 입력하세요> ");
				int num = sc.nextInt();
				if(num==random) {	
					System.out.println("정답입니다");
					System.out.println("시도횟수 : " + count);	
					break;
				} else if(num<random) {
					System.out.println("더 큰 수 를 입력하세요");
				} else {
					System.out.println("더 작은 수를 입력하세요");
				}
				count++;
				
			} catch (Exception e) {
				System.out.println("잘못입력했습니다 숫자를 입력하세요");
				sc.nextLine();
				count++;
			}

		}

	}
}
