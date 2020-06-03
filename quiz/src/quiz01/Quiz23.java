package quiz01;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		//1. 7~100까지 정수 중 7의 배수를 가로로 출력
		
		int i=0;
		for(i=7;i<=100;i++) {
			if(i%7==0)
			System.out.print(i + " ");
		}
		
		System.out.println();

		//2. 1~100까지 정수 중 12의 배수를 가로로 출력
		int k=0;
		for(k=1;k<=100;k++) {
			if(k%12==0)
				System.out.printf(k + " ");
		}
		
		System.out.println();
		
		//3. 1~200까지 정수 중 9의 배수의 개수를 출력
		int g=0;
		int count=0;
		for(g=1;g<=200;g++) {
			if(g%9==0) {
				count++;
				
			}
		}
		System.out.print("9의 배수의 개수 : " + count);

		System.out.println();
		
		//4. 50~100까지 두 수 사이의 합
		int f=50;
		int sum=0;
		for(f=50;f<=100;f++) {
			sum += f;
		}
		
		System.out.print("50~100까지 두 수 사이의 합 : " + sum);
		
		System.out.println();
		
		//5. A~Z까지 출력	A=65 ~ Z=90
		for(char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		//6. 입력받은 정수까지 팩토리얼값을 구하세요 [(팩토리얼) 5! = 5 x 4 x 3 x 2 x 1]
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력 > ");
		int num = scan.nextInt();
		int fac=1;
		for(int o=1;o<=num;o++) {
			fac *= o;
		}
		System.out.print(fac);	
		
		
	}
}
