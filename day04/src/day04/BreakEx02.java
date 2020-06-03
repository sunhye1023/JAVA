package day04;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
	
			System.out.println("4 x 6 = ?");
			System.out.print(">");
			int num = sc.nextInt();
			
			if(num==24) {
				System.out.println("정답입니다");
				break;
			} else {
				System.out.println("삑!");
			}
			
			
		}
		
		sc.close();
		
	}
}
