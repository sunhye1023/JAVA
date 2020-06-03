package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1> ");
		int num1 = scan.nextInt();
		System.out.print("연산을 선택하세요[+, -, *, /]> ");
		String m = scan.next();
		System.out.print("정수2> ");
		int num2 = scan.nextInt();
		
		int a = num1 + num2;
		int b = num1 - num2;
		int c = num1 * num2;
		int d = num1 / num2;
		
		switch(m) {
		case "+":
			System.out.println("두 수의 덧셈은:" + a);
			break;
		case "-":
			System.out.println("두 수의 뺄셈은:" + b);
			break;
		case "*":
			System.out.println("두 수의 곱셈은:" + c);
			break;
		case "/":
			System.out.println("두 수의 나누기는:" + d);
			break;
		}
		
		
	}
}
