package quiz01;

import java.util.Scanner;

public class Quiz22 {
	
	public static void main(String[] args) {
		
		//Math.random()을 써서 2~9까지 랜덤수를 발생시키고
		//구구단 출력(for문)
		
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*8)+2;
		System.out.println("랜덤수 : " + num);
		
		for(int i = 1; i <= 9; i++) {
		
			//System.out.println(num + " x " + i + " = " + (num*i));
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
		
	}

}
