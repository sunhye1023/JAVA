package quiz01;

import java.util.Scanner;

public class Quiz08 {
	//quiz06
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 > ");
		int num = scan.nextInt();
		
		if(num == 0) {
			System.out.println("0입니다");
		} else if(num < 0) {
			System.out.println("음수입니다");	
		} else if(num % 2 == 0) {
			System.out.println(num + "은 짝수입니다");
		} else if(num % 2== 1) {
			System.out.println(num + "은 홀수입니다");	
		} else if(num < 0) {
			System.out.println("음수입니다");
		}
		
		scan.close();
		
	}
	
}
