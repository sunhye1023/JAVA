package quiz01;

import java.util.Scanner;

public class Quiz17 {

		public static void main(String[] args) {
		
		//1. 입력받은 정수에서 3의 배수이거나, 4의 배수일 경우만 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		int num = scan.nextInt();
		
		int a = 1;
		while(a<=num) {
			if(a % 3 == 0 || a % 4 == 0)
				System.out.println(a);
			a++;
		}
		
		System.out.println("----------------------");
		
		//2. 입력받은 정수에서 6의 배수의 합
		
		Scanner sca = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		int nu = sca.nextInt();
		
		int sum = 0;
		int b = 1;
		while(b<=nu) {
			if(b % 6 == 0) {
				sum += b;
			}
			b++;
		}
		System.out.println("6의 배수의 합:" + sum);
		
		System.out.println("---------------------");
		
		//3. 1~100까지 정수 중에서 4의 배수이면서 8의 배수가 아닌 수가 개수
		
		int result = 0;
		int c = 1;
		while(c<=100) {
			if(c % 4 == 0 && c % 8 != 0) {
				result ++;
			}
			c++;
		}
		System.out.println("개수:" + result);
		
		System.out.println("--------------------------");
		
		//4. 1000의 약수의 개수를 구하세요
		int add = 0;
		int count = 0;
		int i = 1000;
		int d = 1;
		while(d<=i) {
			if(i % d == 0) {
				add += d;
				count ++;
			}
			d++;
		}
		System.out.println("1000의 약수의 개수:" + count);
		
		
		
		
		
		
		
	}
}
