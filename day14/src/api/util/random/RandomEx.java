package api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int x = ran.nextInt();
		System.out.println(x); //int가 표현하는 범위까지 랜덤 수
		
		int x1 = ran.nextInt(10)+1; //1~10까지 랜덤 수
		System.out.println(x1);
		
		Double y = ran.nextDouble();
		System.out.println(y); //0 ~ 1.0까지 실수 범위
		
		
	}
}
