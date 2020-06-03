package day04;

public class DoWhileEx01 {

	public static void main(String[] args) {
		
		int k = 1;
		int sum1 = 0;
		while(k <= 10) { //조건식이 거짓이면 실행되지 않는다
			
			sum1 += k;
			
			k++;
		}
		
		System.out.println("1~10까지의 합 : " + sum1);
		
		int i = 1;
		int sum2 = 0;
		do {
			
			sum2 += i;
			
			i++;
		} while(i <= 10); //조건식이 거짓이면 한번은 실행된다
		
		System.out.println("1~10까지의 합 : " + sum2);
		
	}
}
