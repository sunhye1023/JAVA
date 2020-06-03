package quiz01;

import java.util.Scanner;

public class Quiz27 {

	public static void main(String[] args) {
		//2~9단까지 모든 구구단을 출력
		
		Scanner scan = new Scanner(System.in);
		
		
		
		for(int i=1;i<=9;i++) {
			System.out.println("------");
			System.out.println("구구단 " + i + "단");
			for(int j=1;j<=9;j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
				
			}
		}
		
		
		
	}
}
