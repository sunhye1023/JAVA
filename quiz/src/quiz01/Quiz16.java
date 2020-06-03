package quiz01;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		int num = scan.nextInt();
		
		System.out.println("구구단:" + num + "단");
		
		int g = 1;
		while(g <= 9) {
			g++;
			System.out.println(num + "x" + g + "=" + (g*num));
			
			
			
		}
		
		
	}
}
