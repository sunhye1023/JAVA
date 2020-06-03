package quiz01;

import java.util.Scanner;

public class Quiz32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int count1 = 0;
		int count2 = 0;
		
		while(true) {
			int num1 = (int)(Math.random()*100)+1;
			int num2 = (int)(Math.random()*100)+1;
			
			int add = num1+num2;
			
			System.out.println(num1+"+"+num2+"= ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
			System.out.print("> ");
			int a = sc.nextInt();
			if(a==0) {
				break;
			}
			if(add == a) {
				count1++;
				System.out.println("정답입니다");
			}else {
				count2++;
				System.out.println("틀렸는데요?");	
			}
		}
			System.out.println("프로그램을 종료합니다");
			System.out.println("정답횟수 : " + count1 + "회");
			System.out.println("틀린횟수 : " + count2 + "회");
		
	}
}
