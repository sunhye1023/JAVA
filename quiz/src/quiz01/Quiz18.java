package quiz01;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		
		//1~부터 입력받은 수 까지의 약수들의 합
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		int num = scan.nextInt();
		
		int sum = 0;
		int count = 0;
		int d = 1;
		while(d<=num) {
			if(num % d == 0) {
				sum += d;
				count ++;
			}
			d++;
		}
		System.out.println("약수의 합:" + sum);
		
		scan.close();
	}
}
