package quiz01;

import java.util.Scanner;

public class Quiz30 {

	public static void main(String[] args) {
		//quiz14
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 > ");
		int num = sc.nextInt();
		
		int sum = 0; //합계
		int count = 0; //나누어떨어지는 수의 개수
		 for(int i=1;i<=num;i++) {
			 count = 0; //소수판별하기전에 count값을 초기화
			 //소수판별을 위한 for문
			 for(int j=1;j<=i;j++) {
				 if(i%j==0) {
					 count++;
				 }
			 }
			 
			 if(count==2)
				 sum+=i;
			 
		 }
		System.out.println("1에서" + num + "까지의합 : " + sum);
		
		
	}
}
