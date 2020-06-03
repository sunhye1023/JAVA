package quiz01;

import java.util.Scanner;

public class Practice {

	
	public static void main(String[] args) {
		
		print();
		int a = input();
		int b = input();
		int result = add(a,b);
		showResult(result);
	}
	


	static void print() {
		System.out.println("정수2개를 입력하세요");
	}
	
	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		int num = sc.nextInt(); 
		return num;
	}

	static int add(int a, int b) {
		return a+b;
	}
	
	static void showResult(int result) {
		System.out.println("결과 : " + result);
	}
	
}
