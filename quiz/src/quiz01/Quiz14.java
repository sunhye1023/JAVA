package quiz01;

import java.util.Scanner;

public class Quiz14 {
	//IfEx02와 구문이 동일하게 실행되도록 switch구문으로 변경
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 > ");
		int point = scan.nextInt();
		
		
		switch (point / 10) {
		case 9:
			if(point >= 95) {
				System.out.print("A+학점");
			} else {
				System.out.print("A학점");
			}
			break;
		case 8:
			if(point >= 85) {
				System.out.print("B+학점");
			} else {
				System.out.print("B학점");
			}
			break;
		case 7:
			if(point >= 75) {
				System.out.print("C+학점");
			} else {
				System.out.print("C학점");
			}
			break;
		case 6:
			if(point >= 65) {
				System.out.print("D+학점");
			} else {
				System.out.print("D학점");
			}
			break;
		default:
			if(point == 100) {
				System.out.println("A+학점");
			} else {
				System.out.println("다시 시험보세요");
				
			}
			break;
		}
		
	}
	
}
