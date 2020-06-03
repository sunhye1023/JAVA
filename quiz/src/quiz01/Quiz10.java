package quiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		/*
		 * 정수 3개를 입력 받습니다
		 * 가장 큰값, 가장 작은값, 중간값을 구해서 출력 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		int mid = 0;
		int min = 0;
	
		System.out.println("정수 3개를 입력하세요 >");
		System.out.print(">");
		int a = scan.nextInt();
		System.out.print(">");
		int b = scan.nextInt();
		System.out.print(">");
		int c = scan.nextInt();

		if(a>b && a>c) {
			max = a;
			if(b>c) {
				mid = b;
				min = c;
			} else {
				mid = c;
				min = b;
			}
		} else if(b>a && b>c ) {
			max = b;
			if(a>c) {
				mid = a;
				min = c;
			} else {
				mid = c;
				min = a;
			}
		} else if(c>a && c>b) {
			max = c;
			if(a>b) {
				mid = a;
				min = b;
			} else {
				mid = b;
				min = a;
			}
		}
		
		System.out.println("가장 큰값 : " + max);
		System.out.println("중간값 : " + mid);
		System.out.println("가장 작은값 : " + min);
		scan.close();
	}
}
