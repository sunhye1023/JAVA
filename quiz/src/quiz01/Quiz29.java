package quiz01;

import java.util.Scanner;

public class Quiz29 {

	public static void main(String[] args) {

		//가로, 세로를 입력 받습니다
		//가로길이, 세로길이의 사각형을 출력하면 됩니다
		//단, 윤곽만 나타나도록 처리를 합니다

		Scanner scan = new Scanner(System.in);
		System.out.print("가로 > ");
		int a = scan.nextInt();
		System.out.print("세로 > ");
		int b = scan.nextInt();

		for(int i=1;i<=b;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print("*");
				if(i==1 || i==b) 
					System.out.print("*"); 
				else {
					if(j==1 || j==a)	
						System.out.print("*");
					else
						System.out.print(" ");
				}

			}
			System.out.println();

		}			

	}		
}