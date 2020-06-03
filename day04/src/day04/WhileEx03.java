package day04;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //바깥에 만드는 편이 좋다
		
		int i = 1;
		//int num = 0; while안에 num을 바깥에서 선언하고 안에서 사용할 수 있다
		int sum = 0;
		while(i <= 10) {
			
			System.out.print("정수입력> ");
			int num = scan.nextInt();
			sum += num;
			
			
			i++;
		}
		System.out.println("입력받은 수의 합 : " + sum);
		
	}
}
