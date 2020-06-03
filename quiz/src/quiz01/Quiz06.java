package quiz01;

import java.util.Scanner;

public class Quiz06 {
	//quiz04
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("키를 입력하세요 > ");
		double cm = scan.nextDouble();
		System.out.print("나이를 입력하세요 > ");
		int age = scan.nextInt();
		
		if(cm >= 140 && age >= 8) {
			System.out.println("놀이기구 탑승가능");
		} else {
			System.out.println("놀이기구 탑승불가");
		}
		
	}
	
	
}
