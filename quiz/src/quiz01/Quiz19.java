package quiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int i = 1;
		int sum = 0;
		while(i!=0) {
			System.out.print("정수입력 > ");
			i = scan.nextInt();
			sum += i;
			

		}
		System.out.print("입력한 정수의 합 : " + sum);
		
		
	}
}
